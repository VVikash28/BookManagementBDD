package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddedNewBook {
	WebDriver driver;
	@Given("^Add new book page shown$")
	public void add_new_book_page_shown() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium Software\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.get("http://localhost:4200/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	}

	@When("^give details of book$")
	public void give_details_of_book() throws Throwable {
		driver.findElement(By.id("bookId")).sendKeys("BOOK10");
		driver.findElement(By.id("author")).sendKeys("vikash");
		driver.findElement(By.id("title")).sendKeys("the war");
		driver.findElement(By.id("description")).sendKeys("story based");
		driver.findElement(By.id("isbn")).sendKeys("9883036487");
		driver.findElement(By.id("price")).sendKeys("127");
		driver.findElement(By.id("bookcategory")).sendKeys("the gaming");
		driver.findElement(By.xpath("//input[@id='publishDate']")).sendKeys("08/09/2018");
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		
	}

	@Then("^user seen the book added successfully in the list$")
	public void user_seen_the_book_added_successfully_in_the_list() throws Throwable {
	    System.out.println("Added Successfully");
	    driver.close();
	  
	}


}
