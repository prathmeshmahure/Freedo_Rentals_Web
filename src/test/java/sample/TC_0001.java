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
	@Test(priority=32)
	public void TC_0032_verify_the_Delete_icon_by_clicking_on_it_under_Action() throws Exception {
		log.info("=========== TC_0032_verify_the_Delete_icon_by_clicking_on_it_under_Action Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");		
		library.Custom_click(um.getUm_Reset_button(), "Reset Button");
		library.custom_sendkeys(um.getClick_UM_Search_user(), config.getname(), "Prathmesh");
		Thread.sleep(1000);
		library.Custom_click(um.getUm_table_row_delete_action(), "Delete action");
		library.Custom_click(um.getUm_delete_action_yes_button(), "popup Yes Button ");
		Assert.assertTrue(um.getUm_delete_successfull_popup().isDisplayed(),"Popup alert");
		Assert.assertEquals("Deleted", um.getUm_table_row_status_active_delete().getText(),"Check delete status is reflect or not");
		library.Custom_click(um.getUm_table_row_update_action(), "Update button");
		Thread.sleep(2000);
		library.Custom_click(um.getUm_view_status(), "Status");
		library.Custom_click(um.getUm_1st_drop_Active(), "Active tab");
		library.Custom_click(um.getUm_updateAction_update_button(), "Update button");
		
	}
//===============================================================================================================	
	
	
	
	
	
	
}