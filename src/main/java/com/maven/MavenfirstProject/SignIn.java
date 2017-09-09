package com.maven.MavenfirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {
	WebDriver driver;
	public SignIn(WebDriver driver2){
		
		driver=driver2;
		
	}

	public void Signi() {
		
		
		driver.findElement(By.xpath("//*[@id='navbar-collapse']/ul/li[6]/a")).click();

		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("anant");

		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("27@gmail.com");

		driver.findElement(By.xpath("//*[@id='mobile']")).sendKeys("1000000007");
		driver.findElement(By.xpath("//*[@id='sub_btn_signup']")).click();

		
	}
	}
