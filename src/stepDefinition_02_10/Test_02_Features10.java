package stepDefinition_02_10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_02_Features10 {
WebDriver driver;
	
	@Given("open chrome and start application")
	public void open_chrome_and_start_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.id("login_field")).sendKeys("kelompok02test");
	    driver.findElement(By.id("password")).sendKeys("kelompokpkpl02");
	   
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[12]")).click();
	    
	}

	@Then("^I click search bar$")
	public void I_click_search_bar() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div/div/form/label/input[1]")).click();
	    
	}

	@Then("^I type the keyword$")
	public void I_type_the_keyword() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div/div/form/label/input[1]")).sendKeys("Java");
	    
	}

	@Then("^I enter for result$")
	public void I_enter_for_result() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div/div/form/label/input[1]")).sendKeys(Keys.RETURN);
	    
	}

	@Then("^I click star icon$")
	public void I_click_star_icon() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[3]/div/div[1]/div/div[2]/form[2]/button")).click();
	    
	}
}
