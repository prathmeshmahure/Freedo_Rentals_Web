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
	@Test
	public void Login_Account() throws Exception  {
		login = PageFactory.initElements(driver, login_page.class);
		vm = PageFactory.initElements(driver, vehicle_management.class);
		
		library.custom_sendkeys(login.getusername(), config.getusername(), "Username");
		library.custom_sendkeys(login.getPassword(), config.getpassword(), "Password");
		library.Custom_click(login.getClick_submit_Button(), "Submit button");
		library.zoomin();
	}
//==============================================================================================================
	@Test(enabled=false)
	public void TC_0020_Verify_KYC_Status_drop_down_All_tab() throws Exception {
		log.info("=========== TC_0020_Verify_KYC_Status_drop_down_All_tab Starts");
		um = PageFactory.initElements(driver, user_management.class);
		
		library.Custom_click(um.getUser_Management(), "User management");
		library.Custom_click(um.getUm_Reset_button(), "Reset button");
		library.Custom_click(um.getUm_2nd_drop_KYC_Status(), "Select KYC status drop down");
		library.Custom_click(um.getUm_2nd_drop_All(), " All ");
		Thread.sleep(2000);
		library.Custom_click(um.getUm_click_10_user_list(), "click 10 user list");
		library.Custom_click(um.getUm_select_100_user_list(), "Select 100 user list");
		LinkedList<String> Verified=new LinkedList<String>();
		LinkedList<String> UnVerified=new LinkedList<String>();
		for(int i=0;i<um.getUm_2nd_dropdown_all_common().size();i++) {
				if(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon").equalsIgnoreCase("circle-check")) {
					Verified.add(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon"));
					
				}
				else if(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon").equalsIgnoreCase("circle-xmark")) {
					UnVerified.add(um.getUm_2nd_dropdown_all_common().get(i).getAttribute("data-icon"));
					
				}
		}
		library.msg("  KYC verified User = ",""+Verified.size());
		library.msg("  KYC UnVerified User = ",""+UnVerified.size());
		// total user
		String size =um.getUm_table_totaldata_size().getText();
		String all[]=size.split(" "); //////
		library.msg("  Total user = ", all[2]);	
	}
//====================================================================================================================	
	
	
	
	
	
	
	
	
}