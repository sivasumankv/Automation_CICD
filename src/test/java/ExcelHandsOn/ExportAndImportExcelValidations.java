package ExcelHandsOn;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExportAndImportExcelValidations {
	
	
	@Test
	public void ExcelPractise() 
	{
		
		
		//
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sivas\\eclipse-workspace\\streamsExcersise\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("downloadButton")));
		driver.findElement(By.id("downloadButton")).click();
		
		driver.findElement(By.id("fileinput")).sendKeys("C:\\Users\\sivas\\Downloads\\download.xlsx");
		
		
		
	}

}
