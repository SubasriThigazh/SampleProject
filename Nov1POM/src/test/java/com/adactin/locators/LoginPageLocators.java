  
package com.adactin.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.utils.BaseClass;

public class LoginPageLocators extends BaseClass{

	public LoginPageLocators() {
		PageFactory.initElements(driver, this);
	}
	
	//Methods are called explicitly for execution 
	//but, Constructor executed implicitly when we create an object
	// Return type --> void 
	
	//WebDriver driver = new ChromeDriver();
	//driver.get("");
	//driver.findElement(By.id(""))
	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(className="login_button")
	private WebElement login;
	
	public WebElement getUser() {
		return user;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLogin() {
		return login;
	}
}
