package controlPractise;

import java.time.Duration;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class controlsPractise {

	@Test
	public void control_practise() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sivas\\eclipse-workspace\\streamsExcersise\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("autosuggest")).sendKeys("IND");
		Thread.sleep(3000);
		List<WebElement> countries = driver.findElements(By.id("ui-id-1"));

		// countries.stream().filter(s->s.getText().contains("India")).forEach(s->s.click());

		for (WebElement e : countries) {
			if (e.getText().contains("India")) {
				e.click();
				break;
			}
		}
		System.out.println(driver.findElement(By.id("autosuggest")).getText());

		System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
		// driver.close();

		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		// Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select currency_DropDown = new Select(staticDropdown);
		currency_DropDown.selectByIndex(1);
		System.out.println(currency_DropDown.getFirstSelectedOption().getText());
		currency_DropDown.selectByValue("AED");
		System.out.println(currency_DropDown.getFirstSelectedOption().getText());
		currency_DropDown.selectByVisibleText("USD");
		System.out.println(currency_DropDown.getFirstSelectedOption().getText());
		// currency_DropDown.ge

		driver.findElement(By.id("divpaxinfo")).click();
		int adult = 4;
		int child = 2;
		int infant = 2;

		for (int i = 1; i <= adult; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		int i = 1;
		while (i <= child) {
			driver.findElement(By.id("hrefIncChd")).click();
			i++;

		}

		int j = 1;
		while (j <= infant) {
			driver.findElement(By.id("hrefIncInf")).click();
			j++;
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		Assert.assertEquals("5 Adult, 2 Child, 2 Infant", driver.findElement(By.id("divpaxinfo")).getText());

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='HYD']"))
				.click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BLR']"))
				.click();

	}

	// driver.find

}
