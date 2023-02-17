package sample;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", home.getSettings());
		
		
		
	//	driver.findElement(By.xpath("//li[@id='reports_side_menu']")).click();
	//	log.info("report click");
	//	library.Custom_click(home.getReports(), "Report");
		//library.Custom_click(home.getReports(), "Report");
		Thread.sleep(5000);
	}
//=========================================================================================================	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
