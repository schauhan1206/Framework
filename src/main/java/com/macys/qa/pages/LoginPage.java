package com.macys.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.macys.qa.base.TestBase;

public class LoginPage extends TestBase {


// page factory or :
	@FindBy(xpath= "/html/body/header/div/div/div/section[1]/div/div/div[3]/nav/ul/li/div/div/div/a/span[1]")
	WebElement signin;
	
	@FindBy(id ="pw-input")
	WebElement password;
	
	@FindBy(xpath ="//input[@type='submit']")	
	WebElement LoginButton;
	
	@FindBy(id = "standard-sign-up")
	WebElement SignUpPage;
	
	@FindBy(id = "Layer_1")
	WebElement MacysLogo;
	initializing page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	Actions
	Public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	public boolean validateMacysLogo() {
		return MacysLogo.isDisplayed();
	}
	public HomePage Login(String un, String pwd){
		signin.sendKeys(un);
		password.sendKeys(pwd);
		LoginButton.click();
		return new HomePage();
	}
	
	
	




}
