package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginSteps {
	String siteUrl = "https://www.swiggy.com/";
	WebDriver driver =new ChromeDriver();
	
	//Login Feature
	
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
	
	//Location Feature
	
	WebElement loc;
	
	@Given("User is on the swiggy homepage")
	public void user_is_on_the_swiggy_homepage() {
		//instantiating driver and running the url
	    driver.get(siteUrl);
	}
	@Given("Clicked on delivery location")
	public void clicked_on_delivery_location() {
	    //finding location element
		loc = driver.findElement(By.id("location"));
		
	}
	@When("User entered the location name")
	public void user_entered_the_location_name() throws InterruptedException {
	    loc.sendKeys("Chennai");
	    Thread.sleep(2000);
	}
	@When("Selected the current location from drop down")
	public void selected_the_current_location_from_drop_down() {
	    driver.findElement(By.cssSelector("#root > div._3arMG > div.nDVxx > div > div._1TWur > div._2COmU > div > div._3mZgT > div > div._1oLDb > div:nth-child(3)")).click();
	}
	@Then("User can check the nearby restaurants")
	public void user_can_check_the_nearby_restaurants() {
		driver.close();
	    System.out.println("User can check the nearby restaurants");
	}
	
	
//	RESTAURANT SELECTION
	

    String restaurant;
	String item;
	String quantity;
	
	@Given("User registered and logged in to Swiggy")
	public void user_registered_and_logged_in_to_swiggy() {
	    driver.get("https://www.swiggy.com/restaurants");
	    driver.manage().window().maximize();
	    
	}
	@Given("User selected the current location")
	public void user_selected_the_current_location() throws InterruptedException {
		driver.findElement(By.id("location")).sendKeys("Chennai airport");
	    Thread.sleep(2000);
	    
	}

	@When("User read the restaurant from the given list")
	public void user_read_the_restaurant_from_excel_the_given_list() {
		driver.findElement(By.cssSelector("#root > div._3arMG > div.nDVxx > div > div._1TWur > div._2COmU > div > div._3mZgT > div > div._1oLDb > div:nth-child(2)")).click();
	      
	}
	@When("Selected the correct restaurant name")
	public void selected_the_correct_restaurant_name() throws InterruptedException {
		
	}
	@Then("User can view the list of Items from that restaturant")
	public void user_can_view_the_list_of_items_from_that_restaturant() {
		driver.close();
	    System.out.println("User can view the list of Items from that restaturant");;
	}
	
	
//	//ADD TO CART
//	
//	
//	@Given("User is on the restaturant page")
//	public void user_is_on_the_restaturant_page() {
//		driver.get("https://www.swiggy.com/restaurants");
//	    driver.manage().window().maximize();
//	}
//	@Given("User able to view the items available")
//	public void user_able_to_view_the_items_available() throws InterruptedException {
//		driver.findElement(By.id("location")).sendKeys("Chennai airport");
//	    Thread.sleep(2000);
//	    driver.findElement(By.cssSelector("#root > div._3arMG > div.nDVxx > div > div._1TWur > div._2COmU > div > div._3mZgT > div > div._1oLDb > div:nth-child(2)")).click();
//	    Thread.sleep(2000);
//	}
//	@When("User selected the required food")
//	public void user_selected_the_required_food() throws InterruptedException {
//	    WebElement search = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/ul/li[5]/div"));
//	    search.click();
////	    search.sendKeys("Dindigul Thalappakatti");
//	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div/input")).sendKeys("Dindigul Thalappakatti");
//	    Thread.sleep(2000);
//	    driver.findElement(By.cssSelector("#root > div._3arMG > div > div > div > div._3eNnq._26AYU > div:nth-child(2) > div._3sbqM > div._34T1N.Mpmtv > div._720-1")).click();
//	    driver.findElement(By.cssSelector("#root > div._3arMG > div.nDVxx > div > div > div._23oa6 > div.EiD4d > div > div:nth-child(1) > div > div > div._3XX_A > a > div > div > div.efp8s")).click();
//	    
//	}
//	@When("Clicked on add")
//	public void clicked_on_add() {
//		driver.findElement(By.cssSelector("#menu-content > div._1okhE > div._1srfG > div > div > div.nh_z0 > div > a:nth-child(2) > div")).click();
//		driver.findElement(By.cssSelector("#h-1962575829 > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div > div.styles_itemImageContainer__3_3Ig > div.styles_itemAddButton__20ACm > div > div._1RPOp")).click();
//		
//	    
//	}
//	@Then("Clicked on checkout to order the food")
//	public void clicked_on_checkout_to_order_the_food() throws InterruptedException {
//	    driver.findElement(By.cssSelector("#menu-content > div._5ZwHn > div > div.EEeV3 > div._1gPB7")).click();
//	    Thread.sleep(2000);
//		driver.close();
//	}
}
