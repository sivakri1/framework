package com.defaultframework.Maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.defaultframework.Maven.generic.WebActionUtil;

public class BasePage
{
	WebDriver driver;
	WebActionUtil webActionUtil;
	public BasePage(WebDriver driver, WebActionUtil webActionUtil) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		this.webActionUtil = webActionUtil;
	}
}
