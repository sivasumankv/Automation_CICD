package controlPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractise {

	@Test
	public void actionsPractise()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@title='Login']"))).build().perform();
		//input[@class='Pke_EE']
		a.moveToElement(driver.findElement(By.xpath("//input[@class='Pke_EE']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
	
		a.moveToElement(driver.findElement(By.xpath("//a[@title='Login']"))).contextClick().build().perform();
	}
}
