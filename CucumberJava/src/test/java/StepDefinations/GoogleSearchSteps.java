package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver=null;
	@Given("browser is open")
	public void browser_is_open() {
	  System.out.println("inside step - browser is open");
	  
	  String projPath = System.getProperty("user.dir");
	  System.out.println("Project path is :"+projPath);
	  
	  System.getProperty("webdriver.chrome.driver",projPath+"/src/test/resources/Driver/chromedriver.exe");
	  
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	  
	}

	@Given("user is on google search page")
	public void user_is_on_google_serch_page() throws InterruptedException {
		System.out.println("inside step - user is on google search page");
		driver.navigate().to("https://www.google.co.in/");
		Thread.sleep(3000);
	}

	@When("user enters text in search box")
	public void user_enters_text_in_search_box() throws InterruptedException {
		System.out.println("inside step - user enters text in search page");
		
			driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
			Thread.sleep(3000);
			
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		System.out.println("inside step - user hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() throws InterruptedException {
		System.out.println("inside step - user is navigated to search results");
		driver.getPageSource().contains("Online Courses");
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
		
	}

}
