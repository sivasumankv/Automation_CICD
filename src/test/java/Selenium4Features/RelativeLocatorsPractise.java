package Selenium4Features;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocatorsPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice//");
		
		WebElement nameEdit = driver.findElement(By.name("name"));
		
		JavascriptExecutor  js =  (JavascriptExecutor)driver;
		
		
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEdit)).getText());
		driver.findElement(with(By.tagName("input")).below(nameEdit)).sendKeys("Hello");
		driver.findElement(with(By.tagName("input")).below(nameEdit)).sendKeys("Hey");
		//driver.findElement(with(By.tagName("input")).below(nameEdit))args.type;
	//	$x("//div[@class='form-check']//label[@class='form-check-label']")
		
	//	js.executeScript(null, args)	
		
		WebElement labelIceCream = driver.findElement(By.xpath("//div[@class='form-check']//label[@class='form-check-label']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(labelIceCream)).click();
		
		System.out.println(driver.findElements(By.name("name1")).size());
		System.out.println(driver.findElement(By.name("name1")).getText());
				
	}

}
