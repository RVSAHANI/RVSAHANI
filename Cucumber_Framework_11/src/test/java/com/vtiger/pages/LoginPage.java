package com.vtiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v122.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.common.Page_Action;


public class LoginPage extends Page_Action {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);  // this = LoginPage.class. this represent the current class.
		
		
	}
	
	@FindBy(name="user_name")
	WebElement tb_uid;
	
	@FindBy(name="user_password")
	WebElement tb_pwd;
	
	
	@FindBy(name="Login")
	WebElement btn_login;

	@FindBy(name="login_theme")
	WebElement dd_theme;
	
	
	/* seprate the locators
	String uid = "user_name";
	String pwd = "user_password";
	String login = "Login";
	
	*/
	
	/*  seprate the locator class:
	 * 
	 * By uid = By.name("user_name");
	 * By pwd = By.name("user_password");
	 * By login = By.name("Login");
	 * 
	 * 
	 */
	

	//Page Factory :
	
	
	
	
	public boolean verify_Title(String Expected_Title)
	{
		if(driver.getTitle().equals(Expected_Title));
		{
		return true;
		}

	} 
	
	
	public void login(String uid, String pwd)
	{
		set_user_name(uid);
		set_user_pass(pwd);
		click_login();
	}
	
	public void login(String uid, String pwd, String theme)
	{
		set_user_name(uid);
		set_user_pass(pwd);
		select_theme(theme);
		click_login();
	}
	
	/*
	 * 
	 * public void set_user_name(String uid)
	{
		driver.findElement(By.name("user_name")).clear();
		driver.findElement(By.name("user_name")).sendKeys(uid);
	}
	
	public void set_user_pass(String pwd)
	{
		driver.findElement(By.name("user_password")).clear();
		driver.findElement(By.name("user_password")).sendKeys(pwd);
	}
	
	public void click_login()
	{
		driver.findElement(By.name("Login")).click();
	}
	*/
	//Separate the locator method:
	
	
	public void set_user_name(String uid)
	{
		//tb_uid.clear();
		//tb_uid.sendKeys(uid);
		
		SetText(tb_uid,uid);
	}
	
	public void set_user_pass(String pwd)
	{
		//tb_pwd.clear();
		//tb_pwd.sendKeys(pwd);
		
		SetText(tb_pwd, pwd);
	}
	
	public void click_login()
	{
		//btn_login.click();
		clickElemnt(btn_login);
	}
	



public void select_theme(String theme)
{
	//btn_login.click();
	SelectText(dd_theme, theme);
}

}



