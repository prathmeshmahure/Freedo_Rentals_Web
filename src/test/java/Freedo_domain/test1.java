package Freedo_domain;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.page_object.home_page;
import com.utility.base_class;
import com.utility.library;

public class test1 extends base_class {
	public static home_page home;
	@Test 
	public void TC_010_verify_valid_Booking_Statistics_count() {
	//Booking statics
		home = PageFactory.initElements(driver, home_page.class);
	library.visible(home.getDS_bs_txt_Revenue_Collected(), "Revenue collected");
	library.msg("Revenue collected count = ", home.getDS_bs_txt_Revenue_Collected().getText());		
	library.visible(home.getDS_bs_txt_Total_Bookings(), "Total bookings");
	library.msg("Total bookings count = ", home.getDS_bs_txt_Total_Bookings().getText());		
	library.visible(home.getDs_bs_txt_Completed_Bookings(), "Completed booking");
	library.msg("Completed booking count = ", home.getDs_bs_txt_Completed_Bookings().getText());			
}

}
