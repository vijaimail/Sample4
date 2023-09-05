package com.selenium.Sample4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Groupby1 {
  WebDriver driver;
	@Test(groups = "G1")
  public void f1() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://google.com");
	  driver.findElement(By.name("q")).sendKeys("G1f1",Keys.ENTER);
  }
	@Test(groups = "G1")
	  public void f2() {
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.get("https://google.com");
		  driver.findElement(By.name("q")).sendKeys("G1f2",Keys.ENTER);
	  }
	@Test(groups = "G2")
	  public void f3() {
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.get("https://google.com");
		  driver.findElement(By.name("q")).sendKeys("G2f3",Keys.ENTER);
	  }
	@Test(groups = "G2")
	  public void f4() {
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.get("https://google.com");
		  driver.findElement(By.name("q")).sendKeys("G2f4",Keys.ENTER);
	  }
	@Test(groups = "G3")
	  public void f5() {
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.get("https://google.com");
		  driver.findElement(By.name("q")).sendKeys("G3f5",Keys.ENTER);
	  }
}

