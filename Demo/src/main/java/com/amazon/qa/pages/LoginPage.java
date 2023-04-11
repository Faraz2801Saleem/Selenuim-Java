package com.amazon.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.testbase.TestBase;

public class LoginPage extends TestBase{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[@class='nav-logo-link nav-progressive-attribute']")
	private WebElement verifyLogo;
	
	public String  verifyTitle() {
		return driver.getTitle();
	}
	
	public boolean validateLogo() {
		return verifyLogo.isDisplayed();
	}
	

}
