package controlPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FramesPractise {
	
	@Test
	public void testPractise()
	{
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		driver.findElement(By.id("draggable")).click();
		Actions act = new Actions(driver);
		
		act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		
		System.out.println(driver.findElement(By.id("droppable")).getText());
		
	}

}
