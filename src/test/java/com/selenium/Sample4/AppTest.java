package com.selenium.Sample4;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   @Test(priority = 2)
    public void f1()
    {	//driver setup
        WebDriverManager.chromedriver().setup();
        //browser object
        WebDriver driver=new ChromeDriver();
        //Open Google
        driver.get("https://www.google.com");
        //Search Hello and hit ENTER
        driver.findElement(By.name("q")).sendKeys("Hello",Keys.ENTER);
       //Verify the Actual and Expected title are same
        Assert.assertNotEquals(driver.getTitle(), "gogle vs Search");
      
}
   @Test
   public void f2()
   {	//driver setup
       WebDriverManager.chromedriver().setup();
       //browser object
       WebDriver driver=new ChromeDriver();
       //Open Google
       driver.get("https://www.bing.com");

     
}
   @Test
   public void f3()
   {	//driver setup
       WebDriverManager.chromedriver().setup();
       //browser object
       WebDriver driver=new ChromeDriver();
       //Open Google
       driver.get("https://www.demoblaze.com");

     
}
   
}
