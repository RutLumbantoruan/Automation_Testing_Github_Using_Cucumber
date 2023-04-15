package stepDefinition_02_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_02_Feature1 {
	WebDriver driver;
	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	    
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://github.com/login");
	    
	}

	@When("I enter valid username and valid password")
	public void i_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.id("login_field")).sendKeys("kelompok02test");
	    driver.findElement(By.id("password")).sendKeys("kelompokpkpl02");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.name("commit")).click();
	}
}
