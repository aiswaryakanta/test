
package com.hrms.TestScripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;


public class TC003_EditEmp {
@Test
	public void tc003() throws Exception{
	DOMConfigurator.configure("log4j.xml");
		// TODO Auto-generated method stub
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.edit();
		obj.logout();

	}

}