package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
	String siteUrl = "https://www.swiggy.com/";
	WebDriver driver =new ChromeDriver();
	
	@Given("User opened the swiggy homepage")
	public void user_opened_the_swiggy_homepage() {
		//instantiating driver and running the url
	    driver.get(siteUrl);
	}
	@Given("Clicked on Signup")
	public void clicked_on_signup() {
	    //opening signup using elements
		driver.findElement(By.linkText("Sign up")).click();
		
	}
	@When("User entered the {string} , {string}, {string} and {string}")
	public void user_entered_the_and(String phonenumber, String user, String email, String password) {

	    //inserting login credentials
		driver.findElement(By.id("mobile")).sendKeys(phonenumber);
		driver.findElement(By.id("name")).sendKeys(user);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		
	}
	@When("Clicked on continue to get the otp")
	public void clicked_on_continue_to_get_the_otp() {
	    driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/div[2]/form/div[2]/a")).click();
	}
	@Then("User entered the otp and clicked verify otp")
	public void user_entered_the_otp_and_clicked_verify_otp() {
	    System.out.println("Please enter the otp manually");
	}
	@Then("User successfully registered to the swiggy account")
	public void user_successfully_registered_to_the_swiggy_account() {
		driver.close();
	    System.out.println("User successfully registered to the swiggy account");
	}
	
	
	@Given("User is registered on swiggy")
	public void user_is_registered_on_swiggy() {
		driver.get(siteUrl);
	}
	@Given("Clicked on Login")
	public void clicked_on_login() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/div/a[1]")).click(); //finding the login option
	}
	@When("User entered the {string} to login")
	public void user_entered_the_to_login(String phonenumber) {
	    driver.findElement(By.id("mobile")).sendKeys(phonenumber);	//entering the phone number to login
	}
	@When("Clicked on login to get the otp")
	public void clicked_on_login_to_get_the_otp() {
	    driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/form/div[2]/a")).click(); //click login
	    System.out.println("Please enter the otp");
	}
	@Then("User successfully logged in to the swiggy account")
	public void user_successfully_logged_in_to_the_swiggy_account() {
	    System.out.println("User is able to check the menu now");
	    driver.close();
	}
}
