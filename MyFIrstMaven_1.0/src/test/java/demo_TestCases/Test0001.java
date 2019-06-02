package demo_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.List;
import org.openqa.selenium.Keys;

public class Test0001 {
	WebDriver driver;

	@BeforeClass
	public void setProerty() throws Throwable

	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications"); /* To disable the Notifications */
		driver = new ChromeDriver(ops);

	}

	@Test

	public void verify() throws Throwable {
		driver.get("https://www.paperboy.com");
		driver.manage().window().maximize();
		// Actual title
		String title = driver.getTitle();
		System.out.println("Title is" + title);
		
	}

	@AfterClass
	public void close() throws Throwable

	{
		driver.close();
		
	}

}