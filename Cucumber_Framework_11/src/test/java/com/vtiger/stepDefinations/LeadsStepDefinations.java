package com.vtiger.stepDefinations;

import java.sql.Driver;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.When;




public class LeadsStepDefinations extends BaseDefination{
	
	@When("user click on new lead link")
	public void new_Lead_link() {
		driver.findElement(By.linkText("New Lead")).click();


	}
	@When("then fill all mandatory fields and click on save button")
	public void fill_mandatory_fields() {
		
		driver.findElement(By.name("lastname")).sendKeys("Modi");
		driver.findElement(By.name("company")).sendKeys("BJP");
		driver.findElement(By.name("button")).click();
		
	}

	@When("lead should be created succesfully")
	public void validate_lead_creation() {
		driver.findElement(By.xpath("//td[contains(text(),'Last Name:')]/following::td[1]")).getText().equals("Modi");
		driver.findElement(By.xpath("//td[contains(text(),'Company:')]/following::td[1]")).getText().equals("BJP");

	}

	@When("user creates multiple leads with {string} and {string} and verified")
	public void h(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
	    List<Map<String, String>> dt = dataTable.asMaps();
	    for(Map<String, String> m : dt)
	    {
		driver.findElement(By.linkText("New Lead")).click();
		driver.findElement(By.name("lastname")).sendKeys(m.get("lastname"));
		driver.findElement(By.name("company")).sendKeys(m.get("company"));
		driver.findElement(By.name("button")).click();
		driver.findElement(By.xpath("//td[contains(text(),'Last Name:')]/following::td[1]")).getText().equals(m.get("lastname"));
		driver.findElement(By.xpath("//td[contains(text(),'Company:')]/following::td[1]")).getText().equals(m.get("company"));
	    }
		
	}

	
}