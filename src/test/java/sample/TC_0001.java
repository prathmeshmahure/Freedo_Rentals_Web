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
	public void TC_0077_Verify_valid_vehicle_search_from_Search_by_Vehicle_Type() throws Exception {
		log.info("=========== TC_0077_Verify_valid_vehicle_search_from_Search_by_Vehicle_Type Starts");
		home = PageFactory.initElements(driver, home_page.class);
		
		Thread.sleep(2000);
		library.Custom_click(home.getVehicle_Management(), "Vehicle management");
		library.Custom_click(home.getVm_select_by_vehicle_type_dropdown(), "select_by_vehicle_type_dropdown");
		library.Custom_click(home.getVm_3rd_drop_Bike(), "Bike");
	
		library.visible(home.getVm_table_location_1stR(), "Location is = "+home.getVm_table_location_1stR().getText());
		library.visible(home.getVm_table_model_1stR() , "Model is = "+home.getVm_table_model_1stR().getText());		
		library.visible(home.getVm_table_vehicle_type_1stR() , "vehicle type is = "+home.getVm_table_vehicle_type_1stR().getText());
		library.visible(home.getVm_table_color_1stR() , "color is ="+home.getVm_table_color_1stR().getText());
		library.visible(home.getVm_table_vehicle_number_1stR() , "Vehicle number is = "+home.getVm_table_vehicle_number_1stR().getText());		
		library.visible(home.getVm_table_Booking_Frequency_1stR() , "booking frequency is = "+home.getVm_table_Booking_Frequency_1stR().getText());
		library.visible(home.getVm_table_Service_Frequency_1stR() , "Service frequency is = "+home.getVm_table_Service_Frequency_1stR().getText());
		library.visible(home.getVm_table_Status_1stR() , "Status is = "+home.getVm_table_Status_1stR().getText());
		library.visible(home.getVm_table_view_action_1stR() , "View action ");
		library.visible(home.getVm_table_update_action_1stR() , "Update action");		
		library.visible(home.getVm_table_delete_action_1stR() , "delete action");
		library.visible(home.getVm_table_view_calendar_action_1stR() , "View calendar action");
		
	}
}