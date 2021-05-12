package com.cjc.mtreg.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	WebDriver driver;
	@Given("^user navigate to mercury tour page and user clicks on Register button$")
	public void user_navigate_to_mercury_tour_page_and_user_clicks_on_Register_button() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "F:\\TestingSoft\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
	}

	@When("^user enters register information \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_enters_register_information(String FirstName, String LastName, String Phone, String Email, String Address, String City, String State, String PostalCode, String Country, String UserName, String Password, String ConfirmPassword) throws Throwable {
		driver.findElement(By.name("firstName")).sendKeys(FirstName);
		driver.findElement(By.name("lastName")).sendKeys(LastName);
		
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(Phone);
	
		driver.findElement(By.id("userName")).sendKeys(Email);
		
		driver.findElement(By.name("address1")).sendKeys(Address);
		
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(City);
	
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(State);
		
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(PostalCode);

		WebElement countryselect=driver.findElement(By.xpath("//option[@value='INDIA']/parent::select"));
		Select s1=new Select(countryselect);
		s1.selectByVisibleText(Country);
	
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(UserName);
		
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys(Password);

		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(ConfirmPassword);
				

	}

	@Then("^user click on submit button$")
	public void user_click_on_submit_button() throws Throwable {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}
}
