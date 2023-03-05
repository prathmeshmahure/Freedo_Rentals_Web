package Freedo_domain;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.page_object.home_page;
import com.page_object.login_page;
import com.page_object.uat_url_booking;
import com.utility.base_class;
import com.utility.library;
@Listeners(com.utility.listner.class)
public class web_admin_2 extends base_class {
	public static login_page login;
	public static home_page home;
	public static ExtentTest test;
	public static uat_url_booking uat;

//===================================================================================================
	@Test
	public void TC_0074_Verify_Component_Vehicle_management() throws Exception  {
		log.info("=========== TC_0074_Verify_Component_Vehicle_management Starts");
		home = PageFactory.initElements(driver, home_page.class);
		
		Thread.sleep(2000);
		library.Custom_click(home.getVehicle_Management(), "Vehicle management");
		library.visible(home.getVm_search_by_city_dropdown(), " search by city ");
		Assert.assertTrue(home.getVm_search_by_city_dropdown().isDisplayed());
		library.visible(home.getVm_search_by_location_dropdown(), " search by location ");
		library.visible(home.getVm_select_by_vehicle_type_dropdown(), " select by vehicle dropdown");
		library.visible(home.getVm_Search_By_Vehicle_Number(), " Search_By_Vehicle_Number");
		library.visible(home.getVm_search_by_model_dropdown(), " search_by_model_dropdown");
		library.visible(home.getVm_search_by_status_dropdown(), " Vm_search_by_status_dropdown");
		// tabel header check
		library.visible(home.getVm_location(), " location");
		library.visible(home.getVm_model(), " Model");
		library.visible(home.getVm_vehicle_type(), " vehicle_type");
		library.visible(home.getVm_color(), " vehicle color");
		library.visible(home.getVm_vehicle_number(), " vehicle_number");
		library.visible(home.getVm_booking_frequency(), " booking_frequency");
		library.visible(home.getVm_service_frequency(), " service_frequency");
		library.visible(home.getVm_status(), " status");
		library.visible(home.getVm_action(), " action");
		// check heading available button
		library.visible(home.getVm_refresh_button(), " Refresh_button");
		library.visible(home.getVm_add_vehicle_button(), " add_vehicle_button");
		library.visible(home.getVm_block_vehicle_button(), " block_vehicle_button");
		library.visible(home.getVm_unblock_vehicle_button(), " unblock_vehicle_button");
		library.visible(home.getVm_csv_download_button(), " csv_download_button");			
	}
//================================================================================================================	
	@Test
	public void TC_0075_Verify_valid_vehicle_search_from_Search_by_City() {
		log.info("=========== TC_0075_Verify_valid_vehicle_search_from_Search_by_City Starts");
		
		library.Custom_click(home.getVehicle_Management(), "Vehicle management");
		library.Custom_click(home.getVm_search_by_city_dropdown(), "search by city");
		library.Custom_click(home.getVm_1st_drop_delhi(), "delhi");
		library.visible(home.getVm_table_location_1stR(), "Location is = "+home.getVm_table_location_1stR().getText());
		library.visible(home.getVm_table_model_1stR() , "Model is = "+home.getVm_table_model_1stR().getText());		
		library.visible(home.getVm_table_vehicle_type_1stR() , "vehicle type is = "+home.getVm_table_vehicle_type_1stR().getText());
		library.visible(home.getVm_table_color_1stR() , "color is = "+home.getVm_table_color_1stR().getText());
		library.visible(home.getVm_table_vehicle_number_1stR() , "Vehicle number is = "+home.getVm_table_vehicle_number_1stR().getText());		
		library.visible(home.getVm_table_Booking_Frequency_1stR() , "booking frequency is = "+home.getVm_table_Booking_Frequency_1stR().getText());
		library.visible(home.getVm_table_Service_Frequency_1stR() , "Service frequency is = "+home.getVm_table_Service_Frequency_1stR().getText());
		library.visible(home.getVm_table_Status_1stR() , "Status is = "+home.getVm_table_Status_1stR().getText());
		library.visible(home.getVm_table_view_action_1stR() , "View action ");
		library.visible(home.getVm_table_update_action_1stR() , "Update action");		
		library.visible(home.getVm_table_delete_action_1stR() , "delete action");
		library.visible(home.getVm_table_view_calendar_action_1stR() , "View calendar action");
		
	}
//===================================================================================================================	
	@Test
	public void TC_0076_Verify_valid_vehicle_search_from_Search_by_Location() throws Exception {
		log.info("=========== TC_0076_Verify_valid_vehicle_search_from_Search_by_Location Starts");
		home = PageFactory.initElements(driver, home_page.class);
		
		library.Custom_click(home.getVehicle_Management(), "Vehicle management");
		library.Custom_click(home.getVm_reset_button(), "Reset button");
		library.Custom_click(home.getVm_search_by_city_dropdown(), "search by city dropdown");
		library.Custom_click(home.getVm_1st_drop_delhi(), "delhi");
		library.Custom_click(home.getVm_search_by_location_dropdown(), "Search by location dropdown");
		library.Custom_click(home.getVm_2nd_drop_Metro_Hospital_Sector_12(), " Metro_Hospital_Sector_12");
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
//=======================================================================================================================	
	@Test
	public void TC_0077_Verify_valid_vehicle_search_from_Search_by_Vehicle_Type() throws Exception {
		log.info("=========== TC_0077_Verify_valid_vehicle_search_from_Search_by_Vehicle_Type Starts");
		home = PageFactory.initElements(driver, home_page.class);
		
		library.Custom_click(home.getVehicle_Management(), "Vehicle management");
		library.Custom_click(home.getVm_reset_button(), "Reset button");
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
//===================================================================================================================================
	
	
	
	
	
	
	

}
