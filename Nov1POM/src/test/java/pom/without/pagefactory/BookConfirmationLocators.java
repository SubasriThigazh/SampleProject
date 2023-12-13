package pom.without.pagefactory;

import org.openqa.selenium.By;

import com.base.utils.BaseClass;

public class BookConfirmationLocators extends BaseClass {
	public static By user = By.id("username");
	public static By pwd = By.name("password");
	public static By login = By.className("login_button");
    public static By options=By.name("location");
	public static By search=By.id("Submit");
	public static By radio=By.name("radiobutton_2");
	public static By con=By.name("continue");
	public static By firstname = By.id("first_name");
	public static By lastname=By.name("last_name");
	public static By address= By.id("address");
	public static By cardnum=By.id("cc_num");
	public static By cardtype=By.name("cc_type");
	public static  By cardmon=By.xpath("//select[@name='cc_exp_month']");
	public static  By cardyear=By.xpath("//select[@name='cc_exp_year']");
	public static By cvv=By.name("cc_cvv");
	public static By submit=By.name("book_now");
	
	
	
	
}
