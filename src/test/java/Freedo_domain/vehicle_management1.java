package Freedo_domain;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.page_object.login_page;
import com.page_object.uat_url_booking;
import com.page_object.vehicle_management;
import com.utility.base_class;
import com.utility.library;
@Listeners(com.utility.listner.class)
public class vehicle_management1 extends base_class {
	public static vehicle_management vm;
	public static ExtentTest test;

//===================================================================================================
	@Test
	public void TC_0074_Verify_Component_Vehicle_management() throws Exception  {
		log.info("=========== TC_0074_Verify_Component_Vehicle_management Starts");
		vm = PageFactory.initElements(driver, vehicle_management.class);
		
		Thread.sleep(2000);
		library.Custom_click(vm.getVehicle_Management(), "Vehicle management");
		library.visible(vm.getVm_search_by_city_dropdown(), " search by city ");
		Assert.assertTrue(vm.getVm_search_by_city_dropdown().isDisplayed());
		library.visible(vm.getVm_search_by_location_dropdown(), " search by location ");
		library.visible(vm.getVm_select_by_vehicle_type_dropdown(), " select by vehicle dropdown");
		library.visible(vm.getVm_Search_By_Vehicle_Number(), " Search_By_Vehicle_Number");
		library.visible(vm.getVm_search_by_model_dropdown(), " search_by_model_dropdown");
		library.visible(vm.getVm_search_by_status_dropdown(), " Vm_search_by_status_dropdown");
		// tabel header check
		library.visible(vm.getVm_location(), " location");
		library.visible(vm.getVm_model(), " Model");
		library.visible(vm.getVm_vehicle_type(), " vehicle_type");
		library.visible(vm.getVm_color(), " vehicle color");
		library.visible(vm.getVm_vehicle_number(), " vehicle_number");
		library.visible(vm.getVm_booking_frequency(), " booking_frequency");
		library.visible(vm.getVm_service_frequency(), " service_frequency");
		library.visible(vm.getVm_status(), " status");
		library.visible(vm.getVm_action(), " action");
		// check heading available button
		library.visible(vm.getVm_refresh_button(), " Refresh_button");
		library.visible(vm.getVm_add_vehicle_button(), " add_vehicle_button");
		library.visible(vm.getVm_block_vehicle_button(), " block_vehicle_button");
		library.visible(vm.getVm_unblock_vehicle_button(), " unblock_vehicle_button");
		library.visible(vm.getVm_csv_download_button(), " csv_download_button");			
	}
//================================================================================================================	
	@Test
	public void TC_0075_Verify_valid_vehicle_search_from_Search_by_City() {
		log.info("=========== TC_0075_Verify_valid_vehicle_search_from_Search_by_City Starts");
		
		library.Custom_click(vm.getVehicle_Management(), "Vehicle management");
		library.Custom_click(vm.getVm_search_by_city_dropdown(), "search by city");
		library.Custom_click(vm.getVm_1st_drop_delhi(), "delhi");
		library.visible(vm.getVm_table_location_1stR(), "Location is = "+vm.getVm_table_location_1stR().getText());
		library.visible(vm.getVm_table_model_1stR() , "Model is = "+vm.getVm_table_model_1stR().getText());		
		library.visible(vm.getVm_table_vehicle_type_1stR() , "vehicle type is = "+vm.getVm_table_vehicle_type_1stR().getText());
		library.visible(vm.getVm_table_color_1stR() , "color is = "+vm.getVm_table_color_1stR().getText());
		library.visible(vm.getVm_table_vehicle_number_1stR() , "Vehicle number is = "+vm.getVm_table_vehicle_number_1stR().getText());		
		library.visible(vm.getVm_table_Booking_Frequency_1stR() , "booking frequency is = "+vm.getVm_table_Booking_Frequency_1stR().getText());
		library.visible(vm.getVm_table_Service_Frequency_1stR() , "Service frequency is = "+vm.getVm_table_Service_Frequency_1stR().getText());
		library.visible(vm.getVm_table_Status_1stR() , "Status is = "+vm.getVm_table_Status_1stR().getText());
		library.visible(vm.getVm_table_view_action_1stR() , "View action ");
		library.visible(vm.getVm_table_update_action_1stR() , "Update action");		
		library.visible(vm.getVm_table_delete_action_1stR() , "delete action");
		library.visible(vm.getVm_table_view_calendar_action_1stR() , "View calendar action");
		
	}
//===================================================================================================================	
	@Test
	public void TC_0076_Verify_valid_vehicle_search_from_Search_by_Location() throws Exception {
		log.info("=========== TC_0076_Verify_valid_vehicle_search_from_Search_by_Location Starts");
		
		library.Custom_click(vm.getVehicle_Management(), "Vehicle management");
		library.Custom_click(vm.getVm_reset_button(), "Reset button");
		library.Custom_click(vm.getVm_search_by_city_dropdown(), "search by city dropdown");
		library.Custom_click(vm.getVm_1st_drop_delhi(), "delhi");
		library.Custom_click(vm.getVm_search_by_location_dropdown(), "Search by location dropdown");
		library.Custom_click(vm.getVm_2nd_drop_Metro_Hospital_Sector_12(), " Metro_Hospital_Sector_12");
		library.visible(vm.getVm_table_location_1stR(), "Location is = "+vm.getVm_table_location_1stR().getText());
		library.visible(vm.getVm_table_model_1stR() , "Model is = "+vm.getVm_table_model_1stR().getText());		
		library.visible(vm.getVm_table_vehicle_type_1stR() , "vehicle type is = "+vm.getVm_table_vehicle_type_1stR().getText());
		library.visible(vm.getVm_table_color_1stR() , "color is ="+vm.getVm_table_color_1stR().getText());
		library.visible(vm.getVm_table_vehicle_number_1stR() , "Vehicle number is = "+vm.getVm_table_vehicle_number_1stR().getText());		
		library.visible(vm.getVm_table_Booking_Frequency_1stR() , "booking frequency is = "+vm.getVm_table_Booking_Frequency_1stR().getText());
		library.visible(vm.getVm_table_Service_Frequency_1stR() , "Service frequency is = "+vm.getVm_table_Service_Frequency_1stR().getText());
		library.visible(vm.getVm_table_Status_1stR() , "Status is = "+vm.getVm_table_Status_1stR().getText());
		library.visible(vm.getVm_table_view_action_1stR() , "View action ");
		library.visible(vm.getVm_table_update_action_1stR() , "Update action");		
		library.visible(vm.getVm_table_delete_action_1stR() , "delete action");
		library.visible(vm.getVm_table_view_calendar_action_1stR() , "View calendar action");		
	}
//=======================================================================================================================	
	@Test
	public void TC_0077_Verify_valid_vehicle_search_from_Search_by_Vehicle_Type() throws Exception {
		log.info("=========== TC_0077_Verify_valid_vehicle_search_from_Search_by_Vehicle_Type Starts");
		
		library.Custom_click(vm.getVehicle_Management(), "Vehicle management");
		library.Custom_click(vm.getVm_reset_button(), "Reset button");
		library.Custom_click(vm.getVm_select_by_vehicle_type_dropdown(), "select_by_vehicle_type_dropdown");
		library.Custom_click(vm.getVm_3rd_drop_Bike(), "Bike");	
		library.visible(vm.getVm_table_location_1stR(), "Location is = "+vm.getVm_table_location_1stR().getText());
		library.visible(vm.getVm_table_model_1stR() , "Model is = "+vm.getVm_table_model_1stR().getText());		
		library.visible(vm.getVm_table_vehicle_type_1stR() , "vehicle type is = "+vm.getVm_table_vehicle_type_1stR().getText());
		library.visible(vm.getVm_table_color_1stR() , "color is ="+vm.getVm_table_color_1stR().getText());
		library.visible(vm.getVm_table_vehicle_number_1stR() , "Vehicle number is = "+vm.getVm_table_vehicle_number_1stR().getText());		
		library.visible(vm.getVm_table_Booking_Frequency_1stR() , "booking frequency is = "+vm.getVm_table_Booking_Frequency_1stR().getText());
		library.visible(vm.getVm_table_Service_Frequency_1stR() , "Service frequency is = "+vm.getVm_table_Service_Frequency_1stR().getText());
		library.visible(vm.getVm_table_Status_1stR() , "Status is = "+vm.getVm_table_Status_1stR().getText());
		library.visible(vm.getVm_table_view_action_1stR() , "View action ");
		library.visible(vm.getVm_table_update_action_1stR() , "Update action");		
		library.visible(vm.getVm_table_delete_action_1stR() , "delete action");
		library.visible(vm.getVm_table_view_calendar_action_1stR() , "View calendar action");
		
	}
//===================================================================================================================================
	@Test
	public void TC_0078_Verify_valid_vehicle_search_through_Search_by_Vehicle_no() throws Exception {
		log.info("=========== TC_0078_Verify_valid_vehicle_search_through_Search_by_Vehicle_no Starts");
		vm = PageFactory.initElements(driver, vehicle_management.class);
		
		library.Custom_click(vm.getVehicle_Management(), "Vehicle management");
		library.Custom_click(vm.getVm_reset_button(), "Reset button");
		library.custom_sendkeys(vm.getVm_Search_By_Vehicle_Number(), config.getbike_nu(), "search by vehicle number and enter bike number");
		library.visible(vm.getVm_table_location_1stR(), "Location is = "+vm.getVm_table_location_1stR().getText());
		library.visible(vm.getVm_table_model_1stR() , "Model is = "+vm.getVm_table_model_1stR().getText());		
		library.visible(vm.getVm_table_vehicle_type_1stR() , "vehicle type is = "+vm.getVm_table_vehicle_type_1stR().getText());
		library.visible(vm.getVm_table_color_1stR() , "color is = "+vm.getVm_table_color_1stR().getText());
		library.visible(vm.getVm_table_vehicle_number_1stR() , "Vehicle number is = "+vm.getVm_table_vehicle_number_1stR().getText());		
		library.visible(vm.getVm_table_Booking_Frequency_1stR() , "booking frequency is = "+vm.getVm_table_Booking_Frequency_1stR().getText());
		library.visible(vm.getVm_table_Service_Frequency_1stR() , "Service frequency is = "+vm.getVm_table_Service_Frequency_1stR().getText());
		library.visible(vm.getVm_table_Status_1stR() , "Status is = "+vm.getVm_table_Status_1stR().getText());
		library.visible(vm.getVm_table_view_action_1stR() , "View action ");
		library.visible(vm.getVm_table_update_action_1stR() , "Update action");		
		library.visible(vm.getVm_table_delete_action_1stR() , "delete action");
		library.visible(vm.getVm_table_view_calendar_action_1stR() , "View calendar action");	
	}
//===========================================================================================================================
	@Test
	public void TC_0079_Verify_valid_vehicle_search_from_Search_by_Vehicle_Model() throws Exception {
		log.info("=========== TC_0079_Verify_valid_vehicle_search_from_Search_by_Vehicle_Model Starts");
		vm = PageFactory.initElements(driver, vehicle_management.class);
		
		library.Custom_click(vm.getVehicle_Management(), "Vehicle management");
		library.Custom_click(vm.getVm_reset_button(), "Reset button");
		library.Custom_click(vm.getVm_search_by_model_dropdown(), "search_by_model_dropdown");
		library.Custom_click(vm.getVm_4th_drop_HF_Deluxe(), "HF deluxe");
		Thread.sleep(2000);
		library.visible(vm.getVm_table_location_1stR(), "Location is = "+vm.getVm_table_location_1stR().getText());
		library.visible(vm.getVm_table_model_1stR() , "Model is = "+vm.getVm_table_model_1stR().getText());		
		library.visible(vm.getVm_table_vehicle_type_1stR() , "vehicle type is = "+vm.getVm_table_vehicle_type_1stR().getText());
		library.visible(vm.getVm_table_color_1stR() , "color is = "+vm.getVm_table_color_1stR().getText());
		library.visible(vm.getVm_table_vehicle_number_1stR() , "Vehicle number is = "+vm.getVm_table_vehicle_number_1stR().getText());		
		library.visible(vm.getVm_table_Booking_Frequency_1stR() , "booking frequency is = "+vm.getVm_table_Booking_Frequency_1stR().getText());
		library.visible(vm.getVm_table_Service_Frequency_1stR() , "Service frequency is = "+vm.getVm_table_Service_Frequency_1stR().getText());
		library.visible(vm.getVm_table_Status_1stR() , "Status is = "+vm.getVm_table_Status_1stR().getText());
		library.visible(vm.getVm_table_view_action_1stR() , "View action ");
		library.visible(vm.getVm_table_update_action_1stR() , "Update action");		
		library.visible(vm.getVm_table_delete_action_1stR() , "delete action");
		library.visible(vm.getVm_table_view_calendar_action_1stR() , "View calendar action");
	}
//===========================================================================================================================
	
	
	
	
	

}
