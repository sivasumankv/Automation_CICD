package controlPractise;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WindowsHandling {

	//@Test
	public void WindowsHandlingFirst()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.xpath("//*[@class='blinkingText']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> w = windows.iterator();
		String first = w.next();
		String second = w.next();
		driver.switchTo().window(second);
		String email = driver.findElement(By.xpath("//div/p[2]")).getText().split("at ")[1].split(" ")[0];
		driver.switchTo().window(first);
		driver.findElement(By.id("username")).sendKeys(email);
	}
	
	
	@Test
	public void GetAllLinks() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/prop_win_parent.asp");
		WebElement footer = driver.findElement(By.xpath("//div[@class='footerlinks_2'][1]"));
		List<WebElement> allLinks = footer.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		for(WebElement a: allLinks)
		{
			//a.click();
			act.moveToElement(a).keyDown(Keys.CONTROL).click().build().perform();
			
			Thread.sleep(2000);
		}
		
		Set<String> allLinksHandles = driver.getWindowHandles();
		Iterator<String> links = allLinksHandles.iterator();
		
		while(links.hasNext())
		{
			//String link = links.next();
			driver.switchTo().window(links.next());
			
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
			//driver.quit();
			driver.close();
			
			
		}
		
	
	}
}
