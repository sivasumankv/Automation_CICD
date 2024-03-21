package controlPractise;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpeningLinks {

	@Test
	public void testPractise() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement footer = driver.findElement(By.xpath("//div[@id='gf-BIG']//tr/td[1]"));
		
		List<WebElement> links = footer.findElements(By.tagName("a"));
		
		String openLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		System.out.println(links.size());
		
		for( WebElement link : links)
		{
			link.sendKeys(openLink);
			Thread.sleep(5000);
		}
		
		Set<String> openedLinks = driver.getWindowHandles();
		Iterator<String> i = openedLinks.iterator();
		
		while(i.hasNext())
		{
			driver.switchTo().window(i.next());
			System.out.println(driver.getTitle());
			//driver.close();
			}
		
	}
}
