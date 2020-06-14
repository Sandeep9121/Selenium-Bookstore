package com.bridgelabz.bookstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bridgelabz.webdriver.AbstractChromeWebDriver;

public class CostumerRegister extends AbstractChromeWebDriver{
	
	
	@DataProvider(name="costumer-register-email-pass-confirmpass-phoneNumber-type")
	public Object[][] emailPasswordDataProvider(){
		return new Object[][]{
			{"sa","sand@gmai"," ","jkaa","9909209383"},
			{"sandeep","sand1234@gmail.com","pass","pass",""},
			{"Sandeep Rayala","sandeepkumarrayala@gmail.com","sandeep9999","sandeep9999","9909209383"}
				
		};
//		return ExcelSheetReader.readExcelInto2DArray("./src/test/resources/","Sheet1",4);
		
	}
  @Test(dataProvider="costumer-register-email-pass-confirmpass-phoneNumber-type")
  public static void register(String username,String email,String password,String confirmpassword,String phoneNumber) throws InterruptedException {
	  
	  driver.get("http://localhost:4200/register");
		Thread.sleep(3000);
		driver.findElement(By.id("mat-input-0")).sendKeys(username);
		 Thread.sleep(2800);
//	Assert.assertEquals("http://localhost:4200/registration", driver.getCurrentUrl());
	
	    driver.findElement(By.id("mat-input-1")).sendKeys(email);
	    Thread.sleep(1500);
	    driver.findElement(By.id("mat-input-2")).sendKeys(password);
	    Thread.sleep(1500);
	    driver.findElement(By.id("mat-input-3")).sendKeys(confirmpassword);
	    Thread.sleep(1500);
	    WebElement ele= driver.findElement(By.id("mat-input-4"));
	    ele.sendKeys(phoneNumber);
	    driver.findElement(By.className("mat-button-wrapper")).click();
	 
  }
}  
