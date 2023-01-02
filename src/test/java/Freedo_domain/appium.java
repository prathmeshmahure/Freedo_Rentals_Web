package Freedo_domain;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class appium {

	public static void main(String[] args) {
		
		  DesiredCapabilities dcap=new DesiredCapabilities();
	        dcap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	        dcap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2XL");
	        dcap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	        dcap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
	        dcap.setCapability("avd","Pixel_5" );
	        dcap.setCapability("avdLaunchTimeout", 180000);
	        dcap.setCapability("readyTimeout", 180000);
	        String appURL ="C:\\Users\\chitr\\Desktop\\apk\\Hero Sales App.apk";
	        dcap.setCapability(MobileCapabilityType.APP, appURL);
	        //dcap.setCapability("appPackage", "com.hero.customerapp");
	        //dcap.setCapability("appActivity", "com.hero.customerapp.views.activity.splash.SplashActivity");
	    
//	    URL url= new URL("http://127.0.0.1:4723/");
	    
//	    AppiumDriver ad= new AppiumDriver(url, dcap);
	}

}
