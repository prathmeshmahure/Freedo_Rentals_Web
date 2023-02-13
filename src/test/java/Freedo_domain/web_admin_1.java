package Freedo_domain;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.page_object.home_page;
import com.page_object.login_page;
import com.utility.base_class;
import com.utility.library;

public class web_admin_1 extends base_class {
	
	public static login_page login;
	public static home_page home;
	
//===================================================================================================================	
	@Test
	public void TC_001_verify_valid_launch_of_web_application()  {
		log.info("=========== TC_001_verify_valid_launch_of_web_application Starts");
		login = PageFactory.initElements(driver, login_page.class);
		
		library.msg("Using valid admin url = "+config.getstageurl());
		String title=driver.getTitle();
		Assert.assertEquals(title, "Hero Rentals");
	}
//===================================================================================================================	
	@Test
	public void TC_002_verify_invalid_launch_of_web_application()  {
		log.info("=========== TC_002_verify_invalid_launch_of_web_application Starts");

		library.msg("Using invalid admin url = "+config.getliveurl());
		driver.navigate().to(config.getliveurl());
		driver.navigate().back();	
	}
//===================================================================================================================
	@Test
	public void TC_003_verify_invalid_Login_functionality() throws Exception {
		log.info("=========== TC_003_verify__invalid_Login_functionality Starts");
		
		Robot r = new Robot();
		for(int i=0; i<4; i++) {
			r.keyPress(KeyEvent.VK_CONTROL);r.keyPress(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_CONTROL);
		}
		
		driver.navigate().refresh();
		library.custom_sendkeys(login.getusername(), config.getinvalidusername(), "Username");
		library.custom_sendkeys(login.getPassword(), config.getinvalidusername()+"11", "Invalid password");
		library.Custom_click(login.getClick_submit_Button(), "Submit Button");
		Assert.assertTrue(login.getpopup_invalid_Password().isDisplayed());
		library.Custom_click(login.getpopup_close(), "Close popup");
	}
//=====================================================================================================================
	@Test(enabled=false)
	public void TC_004_verify_max_invalid_Login_attempt() {
		log.info("=========== TC_004_verify_max_invalid_Login_attempt Starts");
		
		driver.navigate().refresh();
		library.custom_sendkeys(login.getusername(), config.getinvalidusername(), "Username");
		library.custom_sendkeys(login.getPassword(), config.getinvalidusername()+"11", "Invalid password");
		library.Custom_click(login.getClick_submit_Button(), "Submit Button");
		library.Custom_click(login.getpopup_close(), "Close popup");
		library.Custom_click(login.getClick_submit_Button(), "Submit Button");
		Assert.assertTrue(login.getpopup_error().isDisplayed());
	}
//===================================================================================================================
	@Test 
	public void TC_005_verify_valid_Login_funcationality(){
		log.info("=========== TC_005_verify_valid_Login_funcationality Starts");
		
		driver.navigate().refresh();
		library.custom_sendkeys(login.getusername(), config.getusername(), "Username");
		library.custom_sendkeys(login.getPassword(), config.getusername(), "password");
		library.Custom_click(login.getClick_submit_Button(), "Submit Button");
		Assert.assertTrue(login.getpopup_login_successfully().isDisplayed());
	}
//====================================================================================================================	
	@Test
	public void TC_006_verify_content_Home_page_of_Admin() throws Exception {
		log.info("=========== TC_006_verify_content_Home_page_of_Admin Starts");
		home = PageFactory.initElements(driver, home_page.class);
		
		Thread.sleep(2000);
		library.visible_and_click(home.getDashboard(), "Dashboard");
		library.visible(home.gettxt_Dashboard_Management(), "Right side page");
		library.visible_and_click(home.getStatistics(), "Statics");
		library.visible(home.gettxt_Statistics(), "Right side page");
		library.visible_and_click(home.getRole_Management(), "Role management");
		library.visible(home.gettxt_Roles(), "Right side page");
		library.visible_and_click(home.getWarehouse_Management(), "Warehouse management");
		library.visible(home.gettxt_Warehouse_Management(), "Right side page");
		library.visible_and_click(home.getUser_Management(), "User Management");
		library.visible(home.gettxt_Users(), "Right side page");
		library.visible_and_click(home.getInventory(), "Inventory");
		library.visible(home.gettxt_Vehicle_Inventory_Management(), "Right side page");
		library.visible_and_click(home.getVehicle_Management(), "Vehicle Management");
		library.visible(home.gettxt_Vehicle_Management(), "Right side page");
		library.visible_and_click(home.getRental_Plans(), "Rental plan");
		library.visible(home.gettxt_Rental_Plans(), "Right side page");
		library.visible_and_click(home.getPackage_Management(), "Package management");
		library.visible(home.gettxt_Packages(), "Right side page");
		library.visible_and_click(home.getBooking_Management(), "Booking Management");
		library.visible(home.gettxt_Bookings_Management(), "Right side page");
		library.visible_and_click(home.getLocation_Management(), "Location management");
		library.visible(home.gettxt_Location_Management(), "Right side page");
		library.visible_and_click(home.getFeedback_Management(), "Feedback management");
		library.visible(home.gettxt_Feedback_Management(), "Right side page");
		library.visible_and_click(home.getManual_Booking(), "Manual Booking");
		library.visible(home.gettxt_New_Booking(), "Right side page");
		library.visible_and_click(home.getPromotions(), "Promotions");
		library.visible(home.gettxt_Promotions(), "Right side page");
		library.visible_and_click(home.getSlot_Pause(), "Slot pause");
		library.visible(home.gettxt_Slot_Pause(), "Right side page");
		library.visible_and_click(home.getPayment_Management(), "Payment Management");
		library.visible(home.gettxt_Payment_Management(), "Right side page");
		
		boolean s=home.getReports().isDisplayed();
		boolean a=home.getReports().isEnabled();
		System.out.println(s +""+ a);
		
		Thread.sleep(3000);
		library.visible_and_click(home.getReports(), "Reports");
		library.Custom_click(home.getClick_User_Reports(), "User report");
		library.visible(home.gettxt_User_Reports(), "Right side page");
		library.visible_and_click(home.getMaster_Management(), "Master management");
		library.Custom_click(home.getClick_City(), "City");
		library.visible(home.gettxt_City_Management(), "Right side page");
		library.visible_and_click(home.getBussiness_Management(), "Business management");
		library.visible(home.gettxt_Business_Management(), "Right side page");
		library.visible_and_click(home.getSettings(), "Setting");
		library.visible(home.gettxt_Update_Secondary_Email_And_Mobile_Number(), "Right side page");
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
