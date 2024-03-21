package streamsExcersise;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class waitsPractise {

	@Test

	public void purchase() throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\sivas\\eclipse-workspace\\streamsExcersise\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();

		String[] Veggies = { "Cucumber", "Beetroot", "Tomato", "Brocolli" };

		List<WebElement> namesList = driver.findElements(By.xpath("//h4[@class='product-name']"));
		List<WebElement> addBtnList = driver.findElements(By.xpath("//div[@class='products']/div/div/button"));

//	List<String> vegNamesList = namesList.stream().map(s->s.getText()).collect(Collectors.toList());

		List<String> vegNamesList = namesList.stream().map(s -> s.getText().split(" - ")[0])
				.collect(Collectors.toList());

		System.out.println(vegNamesList);

		for (int i = 0; i < Veggies.length; i++) {
			int j = vegNamesList.indexOf(Veggies[i]);
			if (j >= 0) {
				addBtnList.get(j).click();
				Thread.sleep(7000);
			} else
				System.out.println(Veggies[i] + " is NOT FOUND");
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		System.out.print("Items added in cart sucessfully");

		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));

		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));

		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());

		List<String> names = driver.findElements(By.xpath("//tbody/tr/td[2]")).stream().map(s -> s.getText())
				.collect(Collectors.toList());
		System.out.println(names);
	}
}
