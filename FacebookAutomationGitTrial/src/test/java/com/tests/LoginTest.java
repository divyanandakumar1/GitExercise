package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	//created for git testing
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void titleTest() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
	}
	
	@Test
	public void fieldTest() {
		driver.findElement(By.id("email")).isDisplayed();
		driver.findElement(By.id("pass")).isDisplayed();
		driver.findElement(By.id("loginbutton")).isDisplayed();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
