package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extent_reports_generator {
	public static ExtentSparkReporter report;
	public static ExtentReports extent;
	
	public static ExtentReports getreports() {
		
		String path="C:\\Users\\PM\\eclipse-workspace\\My_life\\Report\\index.html";
		report=new ExtentSparkReporter(path);
		report.config().setDocumentTitle("Automation Test Report");
		report.config().setReportName("Merlin.net");
		report.config().setTheme(Theme.DARK);
		report.config().setTimelineEnabled(true);
		
		extent=new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Lenovo", "Hospital Domain");
		extent.setSystemInfo("QA", "Prathmesh");
		extent.setSystemInfo("Operating system", "Windows 10");
		return extent;
	}

}
