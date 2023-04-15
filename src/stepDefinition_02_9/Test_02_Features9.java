package stepDefinition_02_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_02_Features9 {
	WebDriver driver;
	
	@Given("open chrome and start application")
	public void open_chrome_and_start_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
	}
	
	@When("I enter valid email or number phone and valid password")
	public void i_enter_valid_email_or_number_phone_and_valid_password() {
		driver.findElement(By.id("login_field")).sendKeys("kelompok02test");
	    driver.findElement(By.id("password")).sendKeys("kelompokpkpl02");
	}
	
	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[12]")).click();
	}

	@Then("^I open proyek$")
	public void I_open_proyek() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"repos-container\"]/ul/li/div/div/a")).click();
	}
}
