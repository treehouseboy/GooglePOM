package com.qa.quickshot.GooglePOM;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class GoogleTestWithAjax {
	
	WebDriver driver;
	WebElement checkElement;
	String url;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDev\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		url = "http://www.google.com/";
		driver.manage().window().maximize();
	}
	
	@Test
	public void testGoogleSearch() {
		driver.get(url);
		GoogleLandingPageWithAjax page = PageFactory.initElements(driver, GoogleLandingPageWithAjax.class);
		page.searchFor("pink socks");
		assertEquals("pink socks - Google Search", driver.getTitle());
		
	}
	
	
	@After
	public void teardown() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}