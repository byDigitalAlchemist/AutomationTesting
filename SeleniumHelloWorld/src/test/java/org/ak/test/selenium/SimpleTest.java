package org.ak.test.selenium;

import java.io.File;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.thoughtworks.selenium.webdriven.Timer;

public class SimpleTest {
	/**
	 * IE Driver 		: http://selenium-release.storage.googleapis.com/index.html
	 * Chrome Driver 	: http://chromedriver.storage.googleapis.com/index.html
	 */
	@Test
	public void justTest(){
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.google.com");
		
		WebElement searchBox = driver.findElement(By.id("gbqfq"));
		searchBox.sendKeys("anwaarlabs.wordpress.com");
		searchBox.submit();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement linkButton = driver.findElements(By.linkText("Newer posts")).get(0);
		linkButton.click();
		
		
		driver.close();
	}
	
	
	//@Test
	public void ieTesting(){
		File file = new File("H:/Warez/Libraries/SeleniumDrivers/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		
		WebDriver ieDriver = new InternetExplorerDriver();
		ieDriver.navigate().to("http://www.yahoo.com");
		ieDriver.close();
	}
	
	//@Test
	public void chromeTesting(){
		File file = new File("H:/Warez/Libraries/SeleniumDrivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		WebDriver ieDriver = new ChromeDriver();
		ieDriver.navigate().to("http://www.yahoo.com");
		ieDriver.close();
	}
}
