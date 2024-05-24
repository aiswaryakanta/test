package com.hrms.lib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Global {
	public WebDriver driver = new ChromeDriver();
		// testdata and objects related to the whole application
		//test data
		public String url ="http://183.82.103.245/nareshit/login.php";
		public String un = "nareshit";
		public String pw = "nareshit"; 
		//objects
		public String txt_loginname = "txtUserName";
		public String txt_password = "txtPassword";
		public String btn_login = "Submit";
		public String btn_logout = "Logout";

	}


