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
		SoftAssert soft = new SoftAssert();
		
//		library.Custom_click(home.getDS_click_approve_action(), "Approve action");
//		library.Custom_click(home.getDs_approve_yes_button(), "Yes button");
		soft.assertFalse(home.getDS_click_approve_action().isDisplayed(),"Approve action button check ");
		soft.assertFalse(home.getDs_click_calendar_action().isDisplayed(),"Calendar action button check ");
		soft.assertFalse(home.getDs_click_reject_action().isDisplayed(),"Reject action button check");
		library.Custom_click(home.getDS_click_view_action(), "View action");
		soft.assertTrue(home.getBm_upcoming_status().isDisplayed(),"upcoming status check");
		
		soft.assertAll();
		
	}
}