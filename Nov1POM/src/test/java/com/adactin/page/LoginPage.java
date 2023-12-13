

package com.adactin.page;

import com.adactin.locators.LoginPageLocators;
import com.base.utils.BaseClass;

public class LoginPage extends BaseClass{

	//In Jave execution we used main method
	//In framework, have to use @Test
	
	public static void login() {
		try {
			browserOpen("chrome");
			loadUrl("https://adactinhotelapp.com/");
			
			//new LoginPageLocators() -> used to trigger the Constructor 
			 						 //  for searching WebElements in WebPage
			//getUser() -> used to return the WebElement value
			
			LoginPageLocators lp = new LoginPageLocators();
			dataSend(lp.getUser(), "Muthulakshmi07");
			dataSend(lp.getPwd(), "Test@123");
			click(lp.getLogin());
			
//			dataSend(new LoginPageLocators().getUser(), "Muthulakshmi07");
//			dataSend(new LoginPageLocators().getPwd(), "Test@123");
//			click(new LoginPageLocators().getLogin());
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
