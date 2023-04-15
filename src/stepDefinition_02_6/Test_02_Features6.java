package stepDefinition_02_6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_02_Features6 {
	WebDriver driver;
	JavascriptExecutor js;
	
	@Given("open chrome and start application")
	public void open_chrome_and_start_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
	}
	
	@When("I enter valid email or number phone and valid password")
	public void i_enter_valid_email_or_number_phone_and_valid_password() {
		driver.findElement(By.id("login_field")).sendKeys("kelompok02test");
	    driver.findElement(By.id("password")).sendKeys("kelompokpkpl02");
	}
	
	@Then("I can login successfully")
	public void i_can_login_successfully() {
		driver.findElement(By.name("commit")).click();
	}
	
	@Then("I click dropdown menu")
	public void i_click_dropdown_menu() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/summary/span[2]")).click();
		Thread.sleep(10000);
	}
	
	@Then("I choose settings")
	public void i_choose_settings() {
		js.executeScript("document.querySelector(\"body > div.position-relative.js-header-wrapper > header > div.Header-item.position-relative.mr-0.d-none.d-md-flex > details > details-menu > a:nth-child(15)\").click()");
	}
	
	@Then("I click emails")
	public void i_click_emails() {
		driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[2]/div[1]/div/action-list/nav/ul/li[8]/ul/li[2]/a")).click();
	}
	
	@When("I enter an email")
	public void i_enter_an_email() {
		driver.findElement(By.id("email")).sendKeys("kelompokmantap@gmail.com");
	}
	
	@Then("I click add")
	public void i_click_add() {
		driver.findElement(By.xpath("//*[@id=\"new_user_email\"]/dl/dd/button")).click();
	}
}
