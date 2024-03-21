package controlPractise;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageScroll {

	@Test
	public void testPractise() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		
		List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='tableFixHead']//tbody/tr/td[4]"));
		
		List<String> prices = priceList.stream().map(s->s.getText()).collect(Collectors.toList());
		int sum = 0;
		for (String s : prices)
		{
			sum=sum+Integer.parseInt(s);
		}
		System.out.println(sum);
		System.out.println(driver.findElement(By.cssSelector("div.totalAmount")).getText());
		//String dispTotal = driver.findElement(By.cssSelector("div.totalAmount")).getText().replace("Total Amount Collected: ", "");
		String dispTotal = driver.findElement(By.cssSelector("div.totalAmount")).getText().split(":")[1].trim();
		//if(sum == Integer.parseInt(dispTotal))
			Assert.assertEquals(sum, Integer.parseInt(dispTotal));
	}
	
	
	
	
	
}
