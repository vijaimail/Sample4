package com.selenium.Sample4;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class POMGmailLogin {
 private WebDriver driver;
 @FindBy(xpath="//input[@name='username']")
 private WebElement emailElement;
 
 @FindBy(xpath="//input[@name='password']")
 private WebElement passwordElement;
 
 @FindBy(xpath="//button[@type='submit']")
 private WebElement submitbtn;
 
 //constructor for page factory
 public POMGmailLogin(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
} 
 
 public void enterEmail(String email)
 {emailElement.sendKeys(email);	 
 }
 public void enterPassword(String password)
 {passwordElement.sendKeys(password);	 
 }
 public void clickSubmit()
 {submitbtn.click();	 
 }
}
