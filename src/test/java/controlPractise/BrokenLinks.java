package controlPractise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	@Test
	public void BrokenLinksTest() throws MalformedURLException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> linkObjects = driver.findElements(By.xpath("//*[@class='gf-li']//a"));
		List<String> links = linkObjects.stream().filter(s->s.getAttribute("href").length()>1).map(s->s.getAttribute("href")).collect(Collectors.toList());
		SoftAssert a = new SoftAssert();
		for (String url : links)
		{
			
			HttpURLConnection con = (HttpURLConnection)new URL(url).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
			int resp = con.getResponseCode();
			System.out.println(url);
			a.assertTrue(resp<400, url + "is not Working with response Code "+resp);
			
			
		}
		a.assertAll();
	}
}
