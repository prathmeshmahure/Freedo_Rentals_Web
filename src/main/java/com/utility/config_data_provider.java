package com.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class config_data_provider {
	Properties pro;
	
		public config_data_provider() throws Exception {
			String path="C:\\Users\\P M\\Documents\\GitHub\\My_life\\config_data\\config.properties";
			
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

}
