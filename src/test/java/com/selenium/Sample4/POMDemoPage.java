package com.selenium.Sample4;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class POMDemoPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		POMGmailLogin gmailLogin=new POMGmailLogin(driver);
		gmailLogin.enterEmail("Admin");
		gmailLogin.enterPassword("admin123");
		gmailLogin.clickSubmit();
		
		

	}

}
