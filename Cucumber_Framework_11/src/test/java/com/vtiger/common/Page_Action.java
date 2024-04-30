package com.vtiger.common;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page_Action {
	private WebDriver driver;
	WebDriverWait wait;
	
	public Page_Action(WebDriver driver)
	{
		this.driver = driver;
		 wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	
	public void SetText(WebElement elm, String value)
	{
		try 
	{
		wait.until(ExpectedConditions.visibilityOf(elm));
		elm.clear();
		elm.sendKeys(value);
	}
	catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	
	public void clickElemnt(WebElement elm)
	{
		try 
	{
		wait.until(ExpectedConditions.elementToBeClickable(elm));
		elm.click();
	}
	catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	
	// element by String value
	public void SetText(String elm, String value)
	{
		try 
	{
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(elm))));
		driver.findElement(By.xpath(elm)).clear();
		driver.findElement(By.xpath(elm)).sendKeys(value);
	}
	catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	
	// element by By class
	public void SetText(By elm, String value)
	{
		try 
	{
		wait.until(ExpectedConditions.visibilityOf(driver.findElement((elm))));
		driver.findElement(elm).clear();
		driver.findElement(elm).sendKeys(value);
	}
	catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	
	public void clickExist(WebElement elm)
	{
		try 
	{
		wait.until(ExpectedConditions.visibilityOf(elm));
		elm.isDisplayed();
	}
	catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	
	public void SelectText(WebElement elm, String value)
	{
		try 
	{
		wait.until(ExpectedConditions.visibilityOf(elm));
		Select sel = new Select(elm);
		sel.selectByVisibleText(value);
		elm.sendKeys(value);
	}
	catch(Exception e)
		{
		e.printStackTrace();
		}
	}

}
