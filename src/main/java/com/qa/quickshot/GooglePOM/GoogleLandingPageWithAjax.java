package com.qa.quickshot.GooglePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class GoogleLandingPageWithAjax {
	
	public GoogleLandingPageWithAjax(WebDriver driver) {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
	}
	
	@FindBy(xpath = "//*[@id=\"lst-ib\"]")
	private WebElement searchBox;
	
	public void searchFor(String text) {
		searchBox.sendKeys(text);
		searchBox.submit();
	}

}

