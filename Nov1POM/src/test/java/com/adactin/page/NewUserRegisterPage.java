package com.adactin.page;

import com.adactin.locators.NewUserRegisterLocators;
import com.base.utils.BaseClass;

public class NewUserRegisterPage extends BaseClass {
	public  static void registerpage()
	{
		try
		{
			browserOpen("chrome");
			loadUrl("https://adactinhotelapp.com/");
			NewUserRegisterLocators ur=new NewUserRegisterLocators();
			click(ur.getRegister());
			dataSend(ur.getUsr(),"Subasri");
			dataSend(ur.getPass(),"Subasri@3004");
			dataSend(ur.getRepass(),"Subasri@3004");
			dataSend(ur.getFullname(),"Subasri");
			dataSend(ur.getEmail(),"nirmisri2gmail.com");
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
