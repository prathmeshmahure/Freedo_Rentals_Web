package Freedo_domain;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.page_object.home_page;
import com.page_object.login_page;
import com.page_object.uat_url_booking;
import com.utility.base_class;
import com.utility.library;
@Listeners(com.utility.listner.class)
public class web_admin_1 extends base_class {
	
	public static login_page login;
	public static home_page home;
	public static ExtentTest test;
	public static uat_url_booking uat;
	
//===================================================================================================================	
	@Test
	public void TC_001_verify_valid_launch_of_web_application()  {
		log.info("=========== TC_001_verify_valid_launch_of_web_application Starts");
		login = PageFactory.initElements(driver, login_page.class);
		
		library.msg("Using valid admin url = ",config.getstageurl());
		String title=driver.getTitle();
		Assert.assertEquals(title, "Hero Rentals");
	}
//===================================================================================================================	
	@Test
	public void TC_002_verify_invalid_launch_of_web_application()  {
		log.info("=========== TC_002_verify_invalid_launch_of_web_application Starts");

		library.msg("Using invalid admin url = ",config.getliveurl());
		driver.navigate().to(config.getliveurl());
		driver.navigate().back();	
	}
//===================================================================================================================
	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void TC_003_verify_invalid_Login_functionality() throws Exception {
		log.info("=========== TC_003_verify__invalid_Login_functionality Starts");
		
		driver.navigate().refresh();
		library.custom_sendkeys(login.getusername(), config.getinvalidusername(), "Username");
		library.custom_sendkeys(login.getPassword(), config.getinvalidusername()+"11", "Invalid password");
		library.Custom_click(login.getClick_submit_Button(), "Submit Button");
		
		Assert.assertTrue(login.getpopup_invalid_Password().isDisplayed());
		library.Custom_click(login.getpopup_close(), "Close popup");
	}
//=====================================================================================================================
	@SuppressWarnings("unlikely-arg-type")
	@Test(enabled=false)
	public void TC_004_verify_max_invalid_Login_attempt() {
		log.info("=========== TC_004_verify_max_invalid_Login_attempt Starts");
		
		driver.navigate().refresh();
		library.custom_sendkeys(login.getusername(), config.getinvalidusername(), "Username");
		library.custom_sendkeys(login.getPassword(), config.getinvalidusername()+"11", "Invalid password");
		library.Custom_click(login.getClick_submit_Button(), "Submit Button");
		library.Custom_click(login.getpopup_close(), "Close popup");
		library.Custom_click(login.getClick_submit_Button(), "Submit Button");
			if(login.getpopup_error().equals("You have reached max number of attempts! Please try after sometime")) {
				Assert.assertTrue(login.getpopup_error().isDisplayed());
				test.log(Status.PASS, "=Popup is match");
			}else {
			Assert.assertTrue(login.getpopup_error().isDisplayed());
			test.log(Status.FAIL, "=Popup is not match");
			}
	}
//===================================================================================================================
	@Test 
	public void TC_005_verify_valid_Login_funcationality() throws Exception{
		log.info("=========== TC_005_verify_valid_Login_funcationality Starts");
		Robot r = new Robot();
		for(int i=0; i<5; i++) {
			r.keyPress(KeyEvent.VK_CONTROL);r.keyPress(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_CONTROL);
		}
		
		driver.navigate().refresh();
		library.custom_sendkeys(login.getusername(), config.getusername(), "Username");
		library.custom_sendkeys(login.getPassword(), config.getusername(), "password");
		library.Custom_click(login.getClick_submit_Button(), "Submit Button");
		Assert.assertTrue(login.getpopup_login_successfully().isDisplayed());
	}
//====================================================================================================================	
	@Test()
	public void TC_006_verify_content_Home_page_of_Admin() throws Exception {
		log.info("=========== TC_006_verify_content_Home_page_of_Admin Starts");
		home = PageFactory.initElements(driver, home_page.class);
		
		driver.navigate().refresh();
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
		
		driver.findElement(By.xpath("//li[@id='reports_side_menu']")).click();
		library.visible_and_click(home.getReports(), "Reports");
		library.Custom_click(home.getClick_User_Reports(), "User report");
		library.visible(home.gettxt_User_Reports(), "Right side page");
		
		driver.findElement(By.xpath("//li[@id='master-management_side_menu']")).click();
		library.visible_and_click(home.getMaster_Management(), "Master management");
		library.Custom_click(home.getClick_City(), "City");
		library.visible(home.gettxt_City_Management(), "Right side page");
		library.visible_and_click(home.getBussiness_Management(), "Business management");
		library.visible(home.gettxt_Business_Management(), "Right side page");
		library.visible_and_click(home.getSettings(), "Setting");
		library.visible(home.gettxt_Update_Secondary_Email_And_Mobile_Number(), "Right side page");
	}
//=======================================================================================================================
	@Test()
	public void TC_007_verify_content_of_Dashboard () throws Exception {
		log.info("=========== TC_007_verify_content_of_Dashboard Starts");
		home = PageFactory.initElements(driver, home_page.class);
		Thread.sleep(2000);
		
		library.Custom_click(home.getDashboard(), "Dashboard");
		//Vehicle statics
		library.visible(home.getDs_vs_txt_Total_Vehicles(), "Total Vehicle");
		library.msg("Total Vehicle count =",""+ home.getDs_vs_txt_Total_Vehicles().getText());
		library.visible(home.getDs_vs_txt_Available_Vehicles(), "Available Vehicle");
		library.msg("Available Vehicle count =",""+ home.getDs_vs_txt_Available_Vehicles().getText());
		library.visible(home.getDs_vs_txt_Booked_Vehicles(), "Booked vehicles");
		library.msg("Booked vehicles count =",""+ home.getDs_vs_txt_Booked_Vehicles().getText());
		library.visible(home.getDs_vs_txt_InService_Vehicles(), "Inservice vehilce");
		library.msg("Inservice vehilce count =",""+ home.getDs_vs_txt_InService_Vehicles().getText());
		//User statics
		library.visible(home.getDs_us_txt_Registered_Users(), "Register User");
		library.msg("Register User count = ", home.getDs_us_txt_Registered_Users().getText());		
		library.visible(home.getDs_us_txt_Active_Users(), "Active User");
		library.msg("Register User count = ", home.getDs_us_txt_Active_Users().getText());		
		library.visible(home.getDS_us_txt_Pending_KYC(), "Pending KYC");
		library.msg("Pending KYC count = ", home.getDS_us_txt_Pending_KYC().getText());
		//Booking statics
		library.visible(home.getDS_bs_txt_Revenue_Collected(), "Revenue collected");
		library.msg("Revenue collected count = ", home.getDS_bs_txt_Revenue_Collected().getText());		
		library.visible(home.getDS_bs_txt_Total_Bookings(), "Total bookings");
		library.msg("Total bookings count = ", home.getDS_bs_txt_Total_Bookings().getText());		
		library.visible(home.getDs_bs_txt_Completed_Bookings(), "Completed booking");
		library.msg("Completed booking count = ", home.getDs_bs_txt_Completed_Bookings().getText());	
	}
//==================================================================================================================
	@SuppressWarnings("deprecation")
	@Test
	public void TC_008_verify_valid_Vehicle_statistics_count() throws Exception {
		log.info("=========== TC_008_verify_valid_Vehicle_statistics_count Starts");
		home = PageFactory.initElements(driver, home_page.class);
		
		Thread.sleep(2000);	
		library.Custom_click(home.getDashboard(), "Dashboard");
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String currentdate = sdf.format(date);
		String Actualdate=home.getDs_date1().getAttribute("value");
			if(currentdate.equals(Actualdate)) {
				library.msg("Current date ="+currentdate, " Actual date ="+Actualdate+"Date1");
				log.info("date 1 =current and actual date is match");
			}else {
				log.error("date 1 =current and actual date is not match");
				test.log(Status.FAIL, "=current and actual date is not match = date1");
			}
		String Actualdate2=home.getDs_date2().getAttribute("value");
			if(currentdate.equals(Actualdate2)) {
				library.msg("Current date ="+currentdate, " Actual date ="+Actualdate2+"Date2");
				log.info("date 2 =current and actual date is match");
			}else {
				log.error("date 2 =current and actual date is not match");
				test.log(Status.FAIL, "=current and actual date is not match = date2");
			}
		String Actualdate3=home.getDs_date3().getAttribute("value");
			if(currentdate.equals(Actualdate3)) {
				library.msg("Current date ="+currentdate, " Actual date ="+Actualdate3+"Date3");
				log.info("date 3 =current and actual date is match");
			}else {
				log.error("date 3 =current and actual date is not match");
				test.log(Status.FAIL, "=current and actual date is not match = date2");
			}
		///============ date select ========
			library.Custom_click(home.getDs_click_date2(), "calender");
			
			Date d=new Date();
			int  currentdate1=d.getDate();
			int date12=currentdate1+2;			
			List<WebElement> lastday=driver.findElements(By.xpath("//div[@role][4]/parent::div/parent::div/parent::div//following-sibling::div//button"));
			int totaldays=lastday.size();
			int i=date12;
			int nextdate=i-totaldays;
				if(i<=totaldays) {
					WebElement dateselect=driver.findElement(By.xpath("(//button[normalize-space()="+i+"])[1]"));
					library.Custom_click(dateselect, "Select date");
				}else {
					driver.findElement(By.xpath("//button[@title='Next month']")).click();
					WebElement dateselect=driver.findElement(By.xpath("(//button[normalize-space()="+nextdate+"])[1]"));
					library.Custom_click(dateselect, "Select date");
				}
		//======== selected date =============
			Thread.sleep(2000);	
			library.visible(home.getDs_vs_txt_Total_Vehicles(), "Total Vehicle");
			library.msg("Total Vehicle count =",""+ home.getDs_vs_txt_Total_Vehicles().getText());
			library.visible(home.getDs_vs_txt_Available_Vehicles(), "Available Vehicle");
			library.msg("Available Vehicle count =",""+ home.getDs_vs_txt_Available_Vehicles().getText());
			library.visible(home.getDs_vs_txt_Booked_Vehicles(), "Booked vehicles");
			library.msg("Booked vehicles count =",""+ home.getDs_vs_txt_Booked_Vehicles().getText());
			library.visible(home.getDs_vs_txt_InService_Vehicles(), "Inservice vehilce");
			library.msg("Inservice vehilce count =",""+ home.getDs_vs_txt_InService_Vehicles().getText());
	}
//==================================================================================================================
			@Test
			public void TC_009_verify_valid_User_Statistics_count() {
				log.info("=========== TC_009_verify_valid_User_Statistics_count Starts");
			
			//User statics
			library.visible(home.getDs_us_txt_Registered_Users(), "Register User");
			library.msg("Register User count = ", home.getDs_us_txt_Registered_Users().getText());		
			library.visible(home.getDs_us_txt_Active_Users(), "Active User");
			library.msg("Register User count = ", home.getDs_us_txt_Active_Users().getText());		
			library.visible(home.getDS_us_txt_Pending_KYC(), "Pending KYC");
			library.msg("Pending KYC count = ", home.getDS_us_txt_Pending_KYC().getText());
			}
//===================================================================================================================
			@Test 
			public void TC_010_verify_valid_Booking_Statistics_count() {
				log.info("=========== TC_010_verify_valid_Booking_Statistics_count Starts");
			//Booking statics
			library.visible(home.getDS_bs_txt_Revenue_Collected(), "Revenue collected");
			library.msg("Revenue collected count = ", home.getDS_bs_txt_Revenue_Collected().getText());		
			library.visible(home.getDS_bs_txt_Total_Bookings(), "Total bookings");
			library.msg("Total bookings count = ", home.getDS_bs_txt_Total_Bookings().getText());		
			library.visible(home.getDs_bs_txt_Completed_Bookings(), "Completed booking");
			library.msg("Completed booking count = ", home.getDs_bs_txt_Completed_Bookings().getText());			
			}
//=============================================================================================================================
			@Test
			public void TC_011_verify_valid_Booking_list_as_per_booking_tabs() {
				log.info("=========== TC_011_verify_valid_Booking_Statistics_count Starts");
				
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
//===============================================================================================================================
			@Test
			public void TC_012_verify_valid_Action_functionallity() throws Exception {
				log.info("=========== TC_012_verify_valid_Booking_Statistics_count Starts");
				uat = PageFactory.initElements(driver, uat_url_booking.class);
				home = PageFactory.initElements(driver, home_page.class);
				////// bike book start /////
				driver.navigate().to(config.getliveurl());	
				library.zoomin();
				driver.navigate().refresh();
				library.Custom_click(uat.getuat_Automation_city(), "Automation_city");
				library.Custom_click(uat.getuat_login_button(), "Login");
				library.custom_sendkeys(uat.getuat_username(), config.getmobilenu(), "Enter mobile number");
				library.Custom_click(uat.getuat_user_login_button(), "login button");
				Thread.sleep(2000);
				library.custom_sendkeys(uat.getuat_enter_otp(), config.getotp(), "enter otp");		
			//	library.Custom_click(uat.getuat_verify_code(), "Verify code");
				Thread.sleep(1000);   // due to slow performance

				library.Custom_click(uat.getuat_pick_up_point(), "pick-up-point");
				library.Custom_click(uat.getuat_Automation(), "Automation");
				Thread.sleep(2000);
				library.Custom_click(uat.getuat_pick_up_date(), "Pick up date");
				Thread.sleep(2000);
				library.Custom_click(uat.getuat_calendar_nextday(), "calendar next day");
				Thread.sleep(2000);
				library.Custom_click(uat.getuat_click_select_button(), "Select button");
				library.Custom_click(uat.getuat_click_Duration(), "Duration");
				library.Custom_click(uat.getuat_click_1_days(), "1 days");
				library.Custom_click(uat.getuat_search_button(), "Search button");
				library.Custom_click(uat.getuat_book_first_bike(), "Select bike");
				library.Custom_click(uat.getuat_book_vehicle_button(), "Book vehicle button");
				Thread.sleep(2000);
				library.Custom_click(uat.getuat_Continue_button(), "Continue button");
				library.Custom_click(uat.getuat_Continue_button(), "Continue button");
				library.Custom_click(uat.getuat_pay_now_button(), "pay now button");
				String originalWindow = driver.getWindowHandle();
				Thread.sleep(5000);
				try {
				driver.switchTo().frame(0);
				System.out.println("frame found");
				}catch(Exception e) {
					System.out.println("frame not found");
				}
				library.Custom_click(uat.getuat_pay_using_netbanking(), "Pay using netbanking");
				library.Custom_click(uat.getuat_pay_sbi(), "SBI");
				
				library.Custom_click(uat.getuat_pay_button(), "Pay now");
				
				Thread.sleep(5000);
				for (String windowHandle : driver.getWindowHandles()) {
				    if(!originalWindow.contentEquals(windowHandle)) {
				        driver.switchTo().window(windowHandle);
				        break;
				    }
				}
				library.Custom_click(uat.getuat_payment_success(), "Success");
				driver.switchTo().window(originalWindow);
				///// bike book end  ////////////
				driver.navigate().to(config.getstageurl());
				Thread.sleep(3000);
				library.Custom_click(home.getDashboard(), "Dashboard");		
				library.visible(home.getDS_click_view_action(), "View action button");
				library.visible(home.getDS_click_approve_action(), "Approve action");
				library.visible(home.getDs_click_reject_action(), "Reject action");
				library.visible(home.getDs_click_calendar_action(), "Calendar action");		
			}
//=========================================================================================================	
			@Test
			public void TC_013_verify_valid_Action_View_icon_functionallity() throws Exception {
				log.info("=========== TC_013_verify_valid_Action_View_icon_functionallity Starts");
				
				library.Custom_click(home.getDS_click_view_action(), "View action");
				driver.navigate().back();				
				log.info("Navigate to back page");
			}
//=========================================================================================================
			@Test
			public void TC_014_verify_admin_approve_request() throws Exception {
				log.info("=========== TC_014_verify_admin_approve_request Starts");
				SoftAssert soft = new SoftAssert();
				
				library.Custom_click(home.getDS_click_approve_action(), "Approve action");
				library.Custom_click(home.getDs_approve_yes_button(), "Yes button");
				
				library.Custom_click(home.getDS_click_view_action(), "View action");			
				
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
