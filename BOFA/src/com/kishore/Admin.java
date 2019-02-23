package com.kishore;

import org.openqa.selenium.support.PageFactory;

import com.qshore.CRM_LoginPage;
import com.qshore.Methods;

public class Admin {
	
	public Methods m;
	
	// Test Case Name : CRM_Admin_Login
	// Test Script Name : CRM_Admin_Login
	// Module Name : Admin
	// project Name : CRM
	// Author : Kishore Kanumalli
	// date Created : 02/03/2019
	//********************************************************************************
	public void CRM_Admin_Login() throws Exception {
		
		// Importing Methods Class
		m=new Methods();
		
		// Importing ExcelCon Method
		m.excelCon("C:\\Users\\Kishore Kumar\\Desktop\\Hybrid\\Test Data\\Kishore\\CRM_Admin_Login_test1.xls", "Sheet1");
		
		//Launching Application
		m.launchApp(m.s.getCell(0, 0).getContents(), "C:\\Users\\Kishore Kumar\\Desktop\\Hybrid\\Test Results\\Kishore\\Amin\\CRM_Admin_Login\\launchApp.png");
		
		// Importing Page Objects using page factory
		CRM_LoginPage loginpage=PageFactory.initElements(m.driver, CRM_LoginPage.class);
		
		// Verifying UID, PWD and Login availability
		m.elementAvailable(loginpage.uid, true, "C:\\Users\\Kishore Kumar\\Desktop\\Hybrid\\Test Results\\Kishore\\Amin\\CRM_Admin_Login\\uidavailable.png");
		m.elementAvailable(loginpage.pwd, true, "C:\\Users\\Kishore Kumar\\Desktop\\Hybrid\\Test Results\\Kishore\\Amin\\CRM_Admin_Login\\pwdavailable.png");
		m.elementAvailable(loginpage.loginbutton, true, "C:\\Users\\Kishore Kumar\\Desktop\\Hybrid\\Test Results\\Kishore\\Amin\\CRM_Admin_Login\\loginbuttonavailable.png");
		
		// Verifying UID and pwd enabled or not
		m.elementEnabled(loginpage.uid, true, "C:\\Users\\Kishore Kumar\\Desktop\\Hybrid\\Test Results\\Kishore\\Amin\\CRM_Admin_Login\\uidEnabled.png");
		m.elementEnabled(loginpage.pwd, true, "C:\\Users\\Kishore Kumar\\Desktop\\Hybrid\\Test Results\\Kishore\\Amin\\CRM_Admin_Login\\PwdEnabled.png");
		
		// Entering UID
		loginpage.uid.sendKeys(m.s.getCell(0, 1).getContents());
		
		// Verifying Number of Links
		m.elementsCount("a", 20, "C:\\Users\\Kishore Kumar\\Desktop\\Hybrid\\Test Results\\Kishore\\Amin\\CRM_Admin_Login\\linkscount.png");
		
		// Verifying Login not enabled
		m.elementEnabled(loginpage.loginbutton, false, "C:\\Users\\Kishore Kumar\\Desktop\\Hybrid\\Test Results\\Kishore\\Amin\\CRM_Admin_Login\\loginbuttonnotenabled.png");
		
		m.closeApp();
	}
	//***************************************************************
public void CRM_Admin_Login1() throws Exception {
		
		// Importing Methods Class
		m=new Methods();
		
		// Importing ExcelCon Method
		m.excelCon("C:\\Users\\Kishore Kumar\\Desktop\\Hybrid\\Test Data\\Kishore\\CRM_Admin_Login_test1.xls", "Sheet1");
		
		//Launching Application
		m.launchApp(m.s.getCell(0, 0).getContents(), "C:\\Users\\Kishore Kumar\\Desktop\\Hybrid\\Test Results\\Kishore\\Amin\\CRM_Admin_Login\\launchApp.png");
		
		// Importing Page Objects using page factory
		CRM_LoginPage loginpage=PageFactory.initElements(m.driver, CRM_LoginPage.class);
		
		// Verifying UID, PWD and Login availability
		m.elementAvailable(loginpage.uid, true, "C:\\Users\\Kishore Kumar\\Desktop\\Hybrid\\Test Results\\Kishore\\Amin\\CRM_Admin_Login\\uidavailable.png");
		m.elementAvailable(loginpage.pwd, true, "C:\\Users\\Kishore Kumar\\Desktop\\Hybrid\\Test Results\\Kishore\\Amin\\CRM_Admin_Login\\pwdavailable.png");
		m.elementAvailable(loginpage.loginbutton, true, "C:\\Users\\Kishore Kumar\\Desktop\\Hybrid\\Test Results\\Kishore\\Amin\\CRM_Admin_Login\\loginbuttonavailable.png");
		
		// Verifying UID and pwd enabled or not
		m.elementEnabled(loginpage.uid, true, "C:\\Users\\Kishore Kumar\\Desktop\\Hybrid\\Test Results\\Kishore\\Amin\\CRM_Admin_Login\\uidEnabled.png");
		m.elementEnabled(loginpage.pwd, true, "C:\\Users\\Kishore Kumar\\Desktop\\Hybrid\\Test Results\\Kishore\\Amin\\CRM_Admin_Login\\PwdEnabled.png");
		
		// Entering UID
		loginpage.uid.sendKeys(m.s.getCell(0, 1).getContents());
		
		// Verifying Number of Links hghjghjgggyugyu
		m.elementsCount("a", 20, "C:\\Users\\Kishore Kumar\\Desktop\\Hybrid\\Test Results\\Kishore\\Amin\\CRM_Admin_Login\\linkscount.png");
		
		// Verifying Login not enabled
		m.elementEnabled(loginpage.loginbutton, false, "C:\\Users\\Kishore Kumar\\Desktop\\Hybrid\\Test Results\\Kishore\\Amin\\CRM_Admin_Login\\loginbuttonnotenabled.png");
		
		m.closeApp();
	}
//*************************************************************************************
	

}
