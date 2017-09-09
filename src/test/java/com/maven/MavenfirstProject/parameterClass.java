package com.maven.MavenfirstProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


public class parameterClass {
	WebDriver driver;

	@Test(priority=1)
	public void f() throws InterruptedException {
		//System.out.println("Test Class");
		
		SignIn ref =new SignIn(driver);
		ref.Signi();
		
	Login log =new Login(driver);
        log.loginin();
        }
	@Parameters("browser")
	@BeforeTest
	public void beforeTest(String bro) {
		
		System.out.println("Before Test"+bro);
		if//Chrome
		(bro.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","Resource/chromedriver.exe");
			driver= new ChromeDriver();
			driver. manage(). window().maximize();
		}
		else if (bro.equals("firefox")){
			System.setProperty("webdriver.gecko.driver","Resource/geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else if (bro.equals("IE")){
			System.setProperty("webdriver.ie.driver","Resource/IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
			 driver. manage(). window().maximize();
		}
		else
		{
			System.out.println("No Browser");
		}
		
		driver.get("https://dev.tracko.co.in/");
		

	}


	@AfterTest
	public void afterTest() {
		
		System.out.println("After class");
		driver.quit();
	}

}
