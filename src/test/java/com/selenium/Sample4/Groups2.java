package com.selenium.Sample4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Groups2 {
	
	WebDriver driver;
  @Test(groups = "G1")
  public void f1() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://google.com");
  }
  
  @Test(groups = "G2" ,dependsOnGroups = "G1")
  public void f2() {
	 driver.findElement(By.name("q1")).sendKeys("Selenium",Keys.ENTER);
  }
  
  @Test(groups = "G2",dependsOnGroups = "G1" )
  public void f3() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	 driver.navigate().back();
  }
  
  @Test(groups = "G3",dependsOnGroups = {"G1","G2"} )
  public void f4() {
	  driver.quit();
  }
  
}
