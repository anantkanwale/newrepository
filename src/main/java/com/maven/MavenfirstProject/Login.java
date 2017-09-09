package com.maven.MavenfirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	
		WebDriver driver;
		public Login(WebDriver driver2){
			
			driver=driver2;
			
	}
		
		
		public void loginin() throws InterruptedException
		{
			System.out.println("Weare in login page");
			Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='otp']")).sendKeys("123456");

		driver.findElement(By.xpath("//*[@id='sub_btn_verify']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Anant2409");
		driver.findElement(By.xpath("//*[@id='repassword']")).sendKeys("Anant2409");
		driver.findElement(By.xpath("//*[@id='sub_btn_setpass']")).click();
		}
}
