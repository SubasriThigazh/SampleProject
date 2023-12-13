package com.adactin.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.utils.BaseClass;

public class NewUserRegisterLocators extends BaseClass {
	public NewUserRegisterLocators()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText ="New User Register Here")
	private WebElement register;
	
	@FindBy(id="username")
	private WebElement usr;
	
	@FindBy(id="password")
	private WebElement pass;

	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement repass;
	
	@FindBy(xpath="(//*[@oninput='validate(this)'])[1]")
	private WebElement fullname;
	
	@FindBy(xpath="(//*[starts-with(@oninput, 'val')])[2]")
	private WebElement email;

	public WebElement getRegister() {
		return register;
	}

	public WebElement getUsr() {
		return usr;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getRepass() {
		return repass;
	}

	public WebElement getFullname() {
		return fullname;
	}

	public WebElement getEmail() {
		return email;
	}
	
	

}
