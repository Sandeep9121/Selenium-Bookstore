package com.bridgelabz.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class AbstractChromeWebDriver {

	protected static WebDriver driver;

	public AbstractChromeWebDriver() {
		super();
	}

	@BeforeTest
	public void runSetup() {
	//		  ChromeDriverManager.getInstance().setup();
	//		  driver=new ChromeDriver(); 
//String   loginUrl="http://localhost:4200";
			//chrome Driver manager is giving latest chromeDriver 83 so i downloaded in my system 81 hardcoded the path below
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mr Sandeep\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		driver =new ChromeDriver();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		//getting protected driver  from webDriver abstracted class in com.fundoo.webdriver
		driver.manage().window().maximize();
		// driver.get("http://localhost:4200");	 
		 
		 
		 try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			  
		}

	@AfterTest
	public void exitDriver() throws InterruptedException {
	
	Thread.sleep(3000);
		
		  driver.quit();
  }

}