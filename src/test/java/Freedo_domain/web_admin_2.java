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
	
	
	
	
	
	
	
	
	
	
	
	
	

}
