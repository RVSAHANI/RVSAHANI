package com.vtiger.stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vtiger.pages.LoginPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinations extends BaseDefination{
	



@When("user should be on login page.")
public void user_should_be_on_login_page() {
	driver = new ChromeDriver();
	driver.get("http://localhost:100");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	
    lp = new LoginPage(driver);
	
}
@Then("user enters the valid login credential")
public void user_enters_the_valid_login_credential() {
	//driver.findElement(By.name("user_name")).sendKeys("admin");
	//driver.findElement(By.name("user_password")).sendKeys("admin");
	
	lp.set_user_name("admin");
	lp.set_user_pass("admin");
}

@Then("user click on login button")
public void Click_on_login() {
	//driver.findElement(By.name("Login")).click();
	lp.click_login();
}

@Then("user navigate the Home page")
public void user_navigate_the_home_page() {
	driver.findElement(By.linkText("Home")).isDisplayed();
}
@Then("user can click on logout link")
public void user_can_click_on_logout_link() {
	driver.findElement(By.linkText("Logout")).click();
}



@Then("user enters the invalid login credential")
public void user_enters_the_invalid_login_credential() {
	
	//driver.findElement(By.name("user_name")).sendKeys("admin1");
	//driver.findElement(By.name("user_password")).sendKeys("admin1");
	lp.set_user_name("admin1");
	lp.set_user_pass("admin1");
    
}
@Then("user get the error message on login page")
public void user_get_the_error_message_on_login_page() {
	driver.findElement(By.xpath("//*[contains(text(),'You must specify a valid username and password.')]")).isDisplayed();
}

@Then("user enters the invalid userid as {string} and password as {string}")
public void user_enters_the_invalid_userid_as_and_password_as(String userid, String password) {
	//driver.findElement(By.name("user_name")).sendKeys(userid);
	//driver.findElement(By.name("user_password")).sendKeys(password);
	lp.set_user_name(userid);
	lp.set_user_pass(password);
	
}



}
