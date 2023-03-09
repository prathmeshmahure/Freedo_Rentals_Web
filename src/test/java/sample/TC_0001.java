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
import com.page_object.user_management;
import com.page_object.vehicle_management;
import com.utility.base_class;
import com.utility.library;

public class TC_0001 extends base_class{
	public static login_page login;
	public static uat_url_booking uat;
	public static user_management um;
	public static vehicle_management vm;
	@Test
	public void Login_Account()  {
		login = PageFactory.initElements(driver, login_page.class);
		vm = PageFactory.initElements(driver, vehicle_management.class);
		
		library.custom_sendkeys(login.getusername(), config.getusername(), "Username");
		library.custom_sendkeys(login.getPassword(), config.getpassword(), "Password");
		library.Custom_click(login.getClick_submit_Button(), "Submit button");	
	}
//========================================================================================================
	@Test()
	public void TC_008_Verify_all_elements_of_the_Select_status_drop_down() throws Exception {
		log.info("=========== TC_008_Verify_all_elements_of_the_Select_status_drop_down Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		Thread.sleep(2000);
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.Custom_click(um.getUm_Select_Status_dropdown(), "Select status drop down");
		library.visible(um.getUm_1st_drop_All(), "All");
		library.visible(um.getUm_1st_drop_Active(), "Active");
		library.visible(um.getUm_1st_drop_InActive(), "InActive");
		library.visible(um.getUm_1st_drop_Deleted(), "Deleted");
		library.visible(um.getUm_1st_drop_Blocked(), "Blocked");
	}
}