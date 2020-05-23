package com.loginpojo;

import org.libglobal.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJOClass extends HelperClass{

	public LoginPOJOClass() {
		
		PageFactory.initElements(driver, this);		
	}
	@FindBy(xpath="(//button[@aria-label='Close this modal'])[1]")
	private WebElement popup;
	
	@FindBy(xpath="//button[text()='Log In']")
	private WebElement login;
	
	@FindBy(id="emailAddress_0")
	private WebElement username;
	
	@FindBy(id="password_1")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement signin;
	
	@FindBy(xpath="//input[contains(@id,'combobox_')]")
	private WebElement search;
	
	public WebElement getPopup() {
		return popup;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getSearch() {
		return search;
	}
	
	
}
