package com.qa.quickshot.GooglePOM;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;


public class GoogleTest {
	
	WebDriver driver;
	WebElement checkElement;
	String url;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDev\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
//		System.setProperty("webdriver.ie.driver", "C:\\WebDev\\Drivers\\IEDriverServer.exe");
//		driver = new InternetExplorerDriver();
		url = "http://www.google.com/";
		driver.manage().window().maximize();
	}
	
	@Test
	public void testGoogleSearch() {
		driver.get(url);
		GoogleLandingPage page = PageFactory.initElements(driver, GoogleLandingPage.class);
		page.searchFor("pink socks");
		assertEquals("pink socks - Google Search", driver.getTitle());
		
	}
	
	@Test
	public void testLuckySearch() {
		driver.get(url);
		GoogleLandingPage page = PageFactory.initElements(driver, GoogleLandingPage.class);
		page.luckySearch();
		assertEquals("Google Doodles", driver.getTitle());
		
	}
	
	
	@After
	public void teardown() {
		driver.quit();
	}

}
