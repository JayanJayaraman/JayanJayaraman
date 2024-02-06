package org.cls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\AutomationTesting\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions s= new Actions(driver);
		Thread.sleep(2000);
		WebElement source = driver.findElement(By.xpath("//li[@class='block14 ui-draggable']"));
		
		WebElement des = driver.findElement(By.xpath("//div[@class='ui-widget-content']/child::ol/child::li[@class='placeholder'][1]"));
		Thread.sleep(2000);
		//s.dragAndDrop(source, des).perform();
		s.clickAndHold(source).moveToElement(des).release(des).perform();
		Thread.sleep(2000);
		driver.quit();
	}
	
}
