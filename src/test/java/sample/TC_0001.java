package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
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
	@Test(dependsOnMethods="Login_Account")
	public void verify_manual_bike_booking() throws Exception {
		home = PageFactory.initElements(driver,home_page.class);
		
		Thread.sleep(3000);
		library.Custom_click(home.getClick_Manual_Booking(), "manual booking");
		library.custom_sendkeys(home.getClick_Mobile_Number(), config.getmobilenu(), "enter number");
		library.Custom_click(home.getClick_Search_User(), "search user");
		library.Custom_click(home.getClick_Select_Package(), "select package");
		library.Custom_click(home.getClick_1_days_package(), "package selected");
		library.Custom_click(home.getClick_Select_City(), "select city");
		library.Custom_click(home.getClick_select_city_Noida(), "City selected");
		library.Custom_click(home.getClick_Search_Vehicle(), "search vehicle");
		library.Custom_click(home.getClick_Select_Vehicle(),"select vehicle");
		library.Custom_click(home.getClick_Select_random_1st_Vehicle(),"random bike selected");
		library.Custom_click(home.getClick_Select_Location(), "select location");
		library.Custom_click(home.getClick_Noida_Uttar_Pradesh(), "location selected");
		library.Custom_click(home.getClick_Create_Booking(),"create booking");
	}
//=========================================================================================================	
	@Test(dependsOnMethods="verify_manual_bike_booking")
	public void Verify_user_Management_process() throws Exception {
		home = PageFactory.initElements(driver,home_page.class);
		Thread.sleep(3000);
		library.Custom_click(home.getClick_Booking_Management(), "booking management");
		
		library.custom_sendkeys(home.getClick_UM_Search_user(),config.getmobilenu(),"search user");
		library.Custom_click(home.getClick_view_action(),"view button");
		library.Custom_click(home.getClick_Bookings_button(), "Booking button");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
