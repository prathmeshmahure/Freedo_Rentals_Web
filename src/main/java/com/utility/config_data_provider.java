package com.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class config_data_provider {
	Properties pro;
	
		public config_data_provider() throws Exception {
			String path=System.getProperty("user.dir")+"\\config_data\\config.properties";
			
			FileInputStream fis=new FileInputStream(path); 
			pro=new Properties();
			pro.load(fis);
		}

				public  String getstageurl() {
					return pro.getProperty("stageurl");
				}
				public  String getliveurl() {
					return pro.getProperty("liveurl");
				}	
				public  String getusername() {
					return pro.getProperty("username");
				}
				public  String getpassword() {
					return pro.getProperty("password");
				}	
				public  String getmobilenu() {
					return pro.getProperty("mobilenu");
				}	
				public  String getname() {
					return pro.getProperty("name");
				}	
				public  String getinvalidurl() {
					return pro.getProperty("invalidurl");
				}	
				public  String getinvalidusername() {
					return pro.getProperty("invalidusername");
				}	
				public  String getotp() {
					return pro.getProperty("otp");
				}	
				public  String getbike_nu() {
					return pro.getProperty("bike_nu");
				}	
				public  String getemail() {
					return pro.getProperty("email");//
				}	
				public  String getinvalid_name() {
					return pro.getProperty("invalid_name");
				}	
				public  String getinvalid_email() {
					return pro.getProperty("invalid_email");
				}	
				public  String getinvalid_mobile_no() {
					return pro.getProperty("invalid_mobile_no");
				}
				

}
