package com.selenium.Sample4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotate1 {
  WebDriver driver;
	@Test
  public void f() {
	 driver=new ChromeDriver();
	 driver.get("https://google.com");
  }
	
	@Test
	  public void a() {
		 driver=new ChromeDriver();
		 driver.get("https://bing.com");
	  }	
  @BeforeTest
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup(); 
	  System.out.println("Before test Annotation1");
  }
  
  @BeforeClass
  public void beforeclass() {
	  WebDriverManager.chromedriver().setup(); 
	  System.out.println("Before class Annotation1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Hello");
	  driver.quit();
  }

}


