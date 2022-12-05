package Merlin_domain;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.utility.base_class;

import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_0002  {

	public static void main(String[] args) {
//		DesiredCapabilities des =new DesiredCapabilities();
//		des.setCapability("platformName", "ANDROID");
//		des.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
//		des.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
				
		
		
		
		
	}

}

