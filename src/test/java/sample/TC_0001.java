package sample;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.page_object.home_page;
import com.page_object.login_page;
import com.page_object.uat_url_booking;
import com.page_object.user_management;
import com.page_object.vehicle_management;
import com.utility.base_class;
import com.utility.library;

public class TC_0001 extends base_class{
	public static login_page login;
	public static uat_url_booking uat;
	public static user_management um;
	public static vehicle_management vm;
	@Test(priority=1)
	public void Login_Account() throws Exception  {
		login = PageFactory.initElements(driver, login_page.class);
		vm = PageFactory.initElements(driver, vehicle_management.class);
		
		library.custom_sendkeys(login.getusername(), config.getusername(), "Username");
		library.custom_sendkeys(login.getPassword(), config.getpassword(), "Password");
		library.Custom_click(login.getClick_submit_Button(), "Submit button");
		library.zoomin();
		Thread.sleep(2000);
	}
//==============================================================================================================
	@Test(priority=36)
	public void TC_0036_verify_the_current_booking_details_under_info_and_summary() throws Exception {
		log.info("=========== TC_0036_verify_the_current_booking_details_under_info_and_summary Starts");
		um = PageFactory.initElements(driver, user_management.class);
		SoftAssert soft=new SoftAssert();
		
		library.Custom_click(um.getUser_Management(), "User management");		
		library.Custom_click(um.getUm_Reset_button(), "Reset Button");
		library.custom_sendkeys(um.getClick_UM_Search_user(), config.getname(), "Prathmesh");
		Thread.sleep(1000);
		library.Custom_click(um.getUm_table_row_view_action(), "View action");
		Thread.sleep(2000);
		library.Custom_click(um.getUm_view_info_and_summary_button(), "info_and_summary");
		soft.assertTrue(um.getUm_view_CB_booking_data().isDisplayed(),"Booking Data");					//Assert
		library.msg("  Booking Data = ", um.getUm_view_CB_booking_data().getText());
		soft.assertTrue(um.getUm_view_CB_package_start_date().isDisplayed(),"Package Start Date");		//Assert
		library.msg("  Package Start Date = ", um.getUm_view_CB_package_start_date().getText());
		soft.assertTrue(um.getUm_view_CB_package_start_date().isDisplayed(),"Package End Date");		//Assert
		library.msg("  Package End Date = ", um.getUm_view_CB_package_end_date().getText());	
		soft.assertTrue(um.getUm_view_CB_package_start_date().isDisplayed(),"Vehicle");		//Assert
		library.msg("  Vehicle = ", um.getUm_view_CB_vehicle().getText());
		soft.assertTrue(um.getUm_view_CB_package_start_date().isDisplayed(),"Booking Id");		//Assert
		library.msg("  Booking Id = ", um.getUm_view_CB_booking_id().getText());
		soft.assertTrue(um.getUm_view_CB_package_start_date().isDisplayed(),"Available After ");		//Assert
		library.msg("  Available After = ", um.getUm_view_CB_available_after().getText());
		soft.assertAll();
	}
//===============================================================================================================	
	
	
	
	
	
	
}