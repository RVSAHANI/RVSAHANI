package com.vtiger.stepDefinations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.time.Duration;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.vtiger.pages.LoginPage;

public class BaseDefination {
	
	public  static WebDriver driver;
	public LoginPage lp;
	public Properties  prop;
	
	
	public void initiation()
	{
		launchApp();
		readProperties();
	}
	
	public void launchApp()
	{
		if(prop.getProperty("browser").equals("firefox"))
		{
			//WebDriverManager
			driver = new FirefoxDriver();
			
		}
		
		
		else if(prop.getProperty("browser").equals("edge"))
		{
			//WebDriverManager
			driver = new EdgeDriver();
			
		}
		else if(prop.getProperty("headless").equals("headless"))
		{
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--headless=new");
			driver = new ChromeDriver(option);
		}
		else
		{
	
			driver = new ChromeDriver();
		}
		
		driver.get("http://localhost:100");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(prop.getProperty("implicitWait"))));		
	}
	
     public void readProperties() 
     {
    	 prop = new Properties();
    	 try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir","/src/test/resources/config/setting.properties"));
		    prop.load(fis);
    	 } catch (Exception e) 
    	 {
			e.printStackTrace();
		}
     
     } 

     public void readExcelData(String file, String Sheet)
     {
    	 try
    	 {
    	// Fillo fillo = new Fillo();
    	/// Connection connection = fillo.getConnection(file);   	 
    	 
    	 
    	 }
    	 
    	 catch(Exception e)
    	 {
    		 
    	 }
     
     
     }
	
	
	
}
