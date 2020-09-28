package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidAddPage {
	WebDriver driver;
	@Given("^user is on the book management website$")
	public void user_is_on_the_book_management_website() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium Software\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.get("http://localhost:4200/");
		driver.manage().window().maximize();
	}

	@When("^user clicks on the Add new book$")
	public void user_clicks_on_the_Add_new_book() throws Throwable {
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	}

	@Then("^user see the add new book page$")
	public void user_see_the_add_new_book_page() throws Throwable {
		System.out.println("Add new book page came successfully");
		driver.close();
	}


}
