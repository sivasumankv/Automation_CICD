package locatorsPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testLocators {

	@Test
	public void practical1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivas\\eclipse-workspace\\streamsExcersise\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Hello");
		String pwd ;
		pwd = getPwd(driver);
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		driver.findElement(By.name("inputPassword")).sendKeys(pwd);
		driver.findElement(By.cssSelector("button.submit")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class='error']")).getText());
		//driver.findElement(By.xpath("//p[@class='error']")).getText();
		//driver.close();
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Suman");
		driver.findElement(By.xpath("//*[@placeholder='Email']")).sendKeys("HELLO123");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("HHHHHHHHHH");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		//driver.findElement(By.partialLinkText("Go to")).click();
		
		
		
	}

	private String getPwd(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Forgot your password?")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@class='reset-pwd-btn']")).click();
		String s = driver.findElement(By.tagName("p")).getText();
		String[] words = s.split("'");
		String  pwd = words[1];
		System.out.println(pwd);
		return pwd;
		
	}
	
}
