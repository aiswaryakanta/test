package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utility.Log;

public class General extends Global{

		// to provide all re usable functions/ methods related to the application
		public void openApplication() {
			WebDriver driver = new ChromeDriver();
			driver.navigate().to(url);
			System.out.println("Application opened");
			Log.info("Application opened");
			
		}
		public void closeApplication() {
			driver.close();
			System.out.println("Application closed");
			Log.info("Application closed");
			
		}
		public void login() {
			driver.navigate().to(url);
			driver.findElement(By.name(txt_loginname)).sendKeys(un);
			driver.findElement(By.name(txt_password)).sendKeys(pw);
			driver.findElement(By.name(btn_login)).click();
			System.out.println("login completed");
			Log.info("login completed");
		}
		public void logout(){
			driver.findElement(By.linkText(btn_logout)).click();
			System.out.println("logout completed");
			Log.info("logout completed");
		}
		public void add() throws Exception{
			driver.switchTo().frame("rightMenu");
			//click on add btn
			driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("txtEmpFirstName")).sendKeys("Hello");
			driver.findElement(By.name("txtEmpMiddleName")).sendKeys("mother");
			driver.findElement(By.name("txtEmpNickName")).sendKeys("father");
			driver.findElement(By.name("txtEmpLastName")).sendKeys("sister");
			Thread.sleep(2000);
			WebElement fileInput = driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
			fileInput.sendKeys("C:\\Users\\aiswa\\OneDrive\\Pictures\\Screenshots 1\\z.png");
			Thread.sleep(3000);
			driver.findElement(By.id("btnEdit")).click();
			Thread.sleep(3000);
			driver.switchTo().defaultContent();
			
		}
		
		public void del() throws Exception{
			driver.switchTo().frame("rightMenu");
			Select st = new Select(driver.findElement(By.name("loc_code")));
			st.selectByVisibleText("Emp. ID");
			driver.findElement(By.id("loc_name")).sendKeys("0631");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@value='Search']")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("chkLocID[]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@value='Delete']")).click();
			Thread.sleep(3000);
			driver.switchTo().defaultContent();
			
		}
		public void edit() throws Exception{
			driver.switchTo().frame("rightMenu");
			Select st = new Select(driver.findElement(By.name("loc_code")));
			st.selectByVisibleText("Emp. ID");
			driver.findElement(By.id("loc_name")).sendKeys("0633");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@value='Search']")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("sai satya")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("EditMain")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("txtEmpNickName")).sendKeys("luffy");
			Thread.sleep(3000);
			driver.findElement(By.name("EditMain")).click();
			Thread.sleep(3000);
			driver.switchTo().defaultContent();
			
		}



}
