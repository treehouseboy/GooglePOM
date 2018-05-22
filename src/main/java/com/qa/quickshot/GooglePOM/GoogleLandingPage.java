package com.qa.quickshot.GooglePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleLandingPage {

	
	@FindBy(xpath = "//*[@id=\"lst-ib\"]") private WebElement searchBox;
	@FindBy(name = "btnI") private WebElement luckyButton;
	
	
	public void searchFor(String text) {
		searchBox.sendKeys(text);
		searchBox.submit();
	}
	
	public void luckySearch(){
		luckyButton.click();
	}

}
