package com.selenium.Sample4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dependson1 {
  WebDriver driver;
	@Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://google.com");
  }
	@Test(dependsOnMethods = {"f"},description = "Hello")
	  public void f1() {
		  driver.findElement(By.name("q")).sendKeys("Depends on",Keys.ENTER);
	  }
	
	@Test(dependsOnMethods = {"f","f1"})
	  public void f2() {
		  driver.quit();
	  }
}
