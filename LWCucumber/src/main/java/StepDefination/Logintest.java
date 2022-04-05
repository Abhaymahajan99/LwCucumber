package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logintest {

	WebDriver driver;

	@Given("^user is to be on Lw Page$")
	public void user_is_to_be_on_lw_pages() {
		System.setProperty("webdriver.chrome.driver", "/Users/activemac03/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://devstaging.lawyerwangu.com/");
	}

	@When("^Title of LawyerWangu page$")
	public void Title_of_LawyerWangu_page() {

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Homepage - Lawyer Wangu", title);



	}
	
	//Reg Exp:
	 //1. \"([^\"]*)\"
	 //2. \"(.*)\"
	
	@Then("^User Enters \"(.*)\" and \"(.*)\"$")
	
	public void User_Enter_username_and_password(String email, String password) {

		driver.findElement(By.xpath("//a[.=\"Log In\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"login_username\"]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name=\"login_password\"]")).sendKeys(password);


	}
	@Then("^Click on submit button$")
	public void Click_on_submit_button() {
		driver.findElement(By.xpath("//button[.=\"Sign in\"]")).click();

	}

	@And("^User is succesfully Login$")
	public void User_is_succesfully_Login() {
		String PageTitle = driver.getTitle();
		
		
		driver.close();
	}

	}