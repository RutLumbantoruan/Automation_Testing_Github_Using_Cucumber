package stepDefinition_02_5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_02_Features5 {
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
		driver.findElement(By.xpath("/html/body/div[1]/header/div[7]/details")).click();
		Thread.sleep(1000);
	}
	
	@Then("I choose set status")
	public void i_choose_set_status() {
		js.executeScript("document.querySelector(\"body > div.position-relative.js-header-wrapper > header > div.Header-item.position-relative.mr-0.d-none.d-md-flex > details > details-menu > div.pl-3.pr-3.f6.user-status-container.js-user-status-context.lh-condensed > div > details > summary\").click()");
	}
		
	@Then("I click button clear status")
	public void i_click_button_clear_status() {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/details-menu/div[3]/div/details/details-dialog/form/div[3]/button[2]")).click();
	}
}
