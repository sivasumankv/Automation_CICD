package streamsExcersise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class webTableSorting {
	
	
	public void verifySort()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivas\\eclipse-workspace\\streamsExcersise\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//driver.close();
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		List<WebElement> vl = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String> ol = vl.stream().map(z->z.getText()).collect(Collectors.toList());
		
		List<String> sl = vl.stream().map(x->x.getText()).sorted().collect(Collectors.toList());
		
		System.out.println(ol);
		Assert.assertEquals(true, sl.equals(ol));
		System.out.println(sl);
		
		
	}
	
	
	
	public void findPrice()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivas\\eclipse-workspace\\streamsExcersise\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		List<String> priceList;
		
		do {
			
		
		List<WebElement> itemList = driver.findElements(By.xpath("//tr/td[1]"));
		priceList= itemList.stream().filter(s->s.getText().contains("Rice")).map(s->getPrice(s)).collect(Collectors.toList());
		
		if (priceList.size()!=1)
		{
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
	
		}while(	priceList.size()<1);
		
		
		priceList.forEach(s->System.out.println(s));
	}

	private String getPrice(WebElement s) {
		// TODO Auto-generated method stub
		String price;
		price = s.findElement(By.xpath("following-sibling::td")).getText();
		return price;
	}
	
	
	@Test
	public void verifyFilter()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivas\\eclipse-workspace\\streamsExcersise\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		String textToFind ="ABC";
		driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys(textToFind);
		
		List<WebElement> resultsTable = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<WebElement> verifyList = resultsTable.stream().filter(s->s.getText().contains(textToFind.toString())).collect(Collectors.toList());
		if (verifyList.size()>0)
		{
			System.out.println(textToFind+" is found ");
			
		}
		else
		{
			System.out.println(textToFind+" is NOT found ");
		}
	}

}
