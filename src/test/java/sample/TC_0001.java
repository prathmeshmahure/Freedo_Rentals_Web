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
	@Test(priority=29)
	public void TC_0029_verify_the_View_icon_by_clicking_on_it_under_Action() throws Exception {
		log.info("=========== TC_0029_verify_the_View_icon_by_clicking_on_it_under_Action Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");		
		library.Custom_click(um.getUm_Reset_button(), "Reset Button");
		library.custom_sendkeys(um.getClick_UM_Search_user(), config.getname(), "Prathmesh");
		Thread.sleep(1000);
		library.Custom_click(um.getUm_table_row_view_action(), "view action");
		library.visible(um.getUm_view_first_name() , "First name ");
		library.visible(um.getUm_view_last_name() , "Last name ");
		library.visible(um.getUm_view_email_id() , "Email-id ");
		library.visible(um.getUm_view_mobile_number() , "Mobile number ");
		library.visible(um.getUm_view_joining_date() , "Joining date ");
		library.visible(um.getUm_view_gender() , "Gender ");
		library.visible(um.getUm_view_status() , "Status ");
		library.visible(um.getUm_view_ED_name() , "Emergency name ");
		library.visible(um.getUm_view_ED_emergency_number() , "Emergency number ");
		library.visible(um.getUm_view_ED_relation() , "Relation ");
		library.visible(um.getUm_view_info_and_summary_button() , "info_and_summary_button ");
		library.visible(um.getUm_view_kyc_details_button() , "kyc_details_button ");
		library.visible(um.getUm_view_bookings_button() , "Bookings button ");
		library.visible(um.getUm_view_booking_info() , "booking_info ");
		library.visible(um.getUm_view_block_button() , "Block_button ");
		library.visible(um.getUm_view_back_button() , "Back_button ");		
	}
//====================================================================================================================	
	
	
	
	
	
	
	
	
}