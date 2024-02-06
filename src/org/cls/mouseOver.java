package org.cls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOver {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\AutomationTesting\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement courses = driver.findElement(By.xpath("//a[contains(text(),'COURSES')]"));
		Actions s = new Actions(driver);
		s.moveToElement(courses).perform();;
		Thread.sleep(3000);
		WebElement btnclick = driver.findElement(By.xpath("//span[contains(text(),'DevOps Training')]"));
		s.click(btnclick).perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
