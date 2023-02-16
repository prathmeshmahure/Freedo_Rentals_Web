package sample;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.page_object.home_page;
import com.page_object.login_page;
import com.utility.base_class;
import com.utility.library;

public class TC_0001 extends base_class{
	public static login_page login;
	public static home_page home;
	
	@Test
	public void Login_Account()  {
		login = PageFactory.initElements(driver, login_page.class);
		
		library.custom_sendkeys(login.getusername(), config.getusername(), "Username");
		library.custom_sendkeys(login.getPassword(), config.getpassword(), "Password");
		library.Custom_click(login.getClick_submit_Button(), "Submit button");	
	}
//========================================================================================================
	@Test(dependsOnMethods="Login_Account")
	public void verify_manual_bike_booking() throws Exception {
		home = PageFactory.initElements(driver,home_page.class);
		Thread.sleep(3000);
		String date2=driver.findElement(By.xpath("(//input[@placeholder=\"dd-mm-yyyy\"])[1]")).getAttribute("value");
		System.out.println(date2);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String formattedDate = sdf.format(date);
		System.out.println(formattedDate);
		Assert.assertEquals(date2, formattedDate);
	}	
//=========================================================================================================	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
