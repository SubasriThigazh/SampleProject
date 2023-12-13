package pom.without.pagefactory;

import org.openqa.selenium.WebElement;

import com.base.utils.BaseClass;

public class BookConfirmationPage extends BaseClass {
	
	public static void bookconfirmation()
	{
		//BookConfirmationLocators cl=new BookConfirmationLocators();
		browserLaunch("chrome","https://adactinhotelapp.com/");
        WebElement username =findElementAB(BookConfirmationLocators.user);
        username.sendKeys("Muthulakshmi07");
        WebElement password =findElementAB(BookConfirmationLocators.pwd);
        password.sendKeys("Test@123");
        WebElement login1 =findElementAB(BookConfirmationLocators.login);
        login1.click();
        WebElement opt =findElementAB(BookConfirmationLocators.options);
        selectByVisibleText(opt,"London");
        WebElement search1 =findElementAB(BookConfirmationLocators.search);
        search1.click();
        WebElement radio1=findElementAB(BookConfirmationLocators.radio);
        radio1.click();
        WebElement cont =findElementAB(BookConfirmationLocators.con);
        cont.click();
        WebElement firstname1 =findElementAB(BookConfirmationLocators.firstname);
        firstname1.sendKeys("Subasri");
        WebElement lastname1 =findElementAB(BookConfirmationLocators.lastname);
        lastname1.sendKeys("Thigazh");
        WebElement add =findElementAB(BookConfirmationLocators.address);
        add.sendKeys("12,NB Road,Chennai,Tamilnadu");
        WebElement cardnumber =findElementAB(BookConfirmationLocators.cardnum);
        cardnumber.sendKeys("4678258681815654");
        WebElement cardty =findElementAB(BookConfirmationLocators.cardtype);
        selectByIndex(cardty, 1);
        WebElement cardmonth =findElementAB(BookConfirmationLocators.cardmon);
        selectByVisibleText(cardmonth, "April");
        WebElement caryear =findElementAB(BookConfirmationLocators.cardyear);
        selectByVisibleText(caryear, "2030");
        WebElement cardvalue =findElementAB(BookConfirmationLocators.cvv);
        cardvalue.sendKeys("456");
        WebElement finali =findElementAB(BookConfirmationLocators.submit);
        finali.click();
        
        
        
        
        
        
		
	}
	

}
