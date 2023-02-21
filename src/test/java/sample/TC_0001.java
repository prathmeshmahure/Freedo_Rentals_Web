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
	@Test
	public void TC_011_verify_valid_Booking_list_as_per_booking_tabs() {
		log.info("=========== TC_010_verify_valid_Booking_Statistics_count Starts");
		home = PageFactory.initElements(driver, home_page.class);
	library.visible(home.getDS_click_New_Bookings_Received(), "New Bookings Received");
	library.visible(home.getDs_click_Scheduled_Bookings(), "Scheduled Bookings");
	library.visible(home.getDs_click_Near_To_Return_Bookings(), "Near to return bookings");
	library.visible(home.getDs_click_Not_Returned(), "Not returned");
	library.visible(home.getDs_click_Return_Requests_Received(), "Returns Request Received");
	
	library.visible(home.getDs_txt_User_Name(), "User name");
	library.visible(home.getDs_txt_Mobile_Number(), "Mobile number");
	library.visible(home.getDs_txt_Model_Name(), "Model Name");
	library.visible(home.getDs_txt_Vehicle(), "Vehicle");
	library.visible(home.getDs_txt_Booking_from_date(), "Booking from date");
	library.visible(home.getDs_txt_Booking_to_date(), "Booking to date");
	library.visible(home.getDs_txt_Payment_Type(), "Payment type");
	library.visible(home.getDs_txt_COD(), "COD");
	library.visible(home.getDs_txt_Action(), "Action");		
	
	}
//=========================================================================================================	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
