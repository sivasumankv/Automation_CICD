package Selenium4Features;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotForWebElement {

	@Test
	public void TakingWebElementScreenshot() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		File file = driver.findElement(By.xpath("//input[@value='Submit']")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\sivas\\OneDrive\\Desktop\\partial.png"));
		
		WebElement test = driver.findElement(By.id("exampleFormControlSelect1"));
		System.out.println(test.getRect().getDimension().getHeight());
		System.out.print(test.getRect().getDimension().getWidth());
	}
}
