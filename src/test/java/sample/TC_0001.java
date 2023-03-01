package sample;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.page_object.home_page;
import com.page_object.login_page;
import com.page_object.uat_url_booking;
import com.utility.base_class;
import com.utility.library;

public class TC_0001 extends base_class{
	public static login_page login;
	public static uat_url_booking uat;
	public static home_page home;
	@Test
	public void Login_Account()  {
		login = PageFactory.initElements(driver, login_page.class);
		
		library.custom_sendkeys(login.getusername(), config.getusername(), "Username");
		library.custom_sendkeys(login.getPassword(), config.getpassword(), "Password");
		library.Custom_click(login.getClick_submit_Button(), "Submit button");	
	}
//========================================================================================================
	@Test
	public void TC_014_verify_admin_approve_request() throws Exception {
		log.info("=========== TC_014_verify_admin_approve_request Starts");
		home = PageFactory.initElements(driver, home_page.class);
		
		
		
	}
}