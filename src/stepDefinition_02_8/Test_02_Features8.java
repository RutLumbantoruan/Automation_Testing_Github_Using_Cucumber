package stepDefinition_02_8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_02_Features8 {
	WebDriver driver;
	JavascriptExecutor js;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
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
	
	@Then("I click appearance")
	public void i_click_appearance() {
		driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[2]/div[1]/div/action-list/nav/ul/li[3]/a")).click();
	}
	
	@Then("I click dropdown")
	public void i_click_dropdown() {
		js.executeScript("document.querySelector(\"#color_mode_type_select\").click()");
	}
	@Then("I choose single theme")
	public void i_choose_single_theme() {
	    driver.findElement(By.xpath("//*[@id=\"color_mode_type_select\"]/option[1]")).click();
	}
	@Then("I choose the theme")
	public void i_choose_the_theme() {
		js.executeScript("document.querySelector(\"#js-pjax-container > div > div.Layout.Layout--flowRow-until-md.Layout--sidebarPosition-start.Layout--sidebarPosition-flowRow-start > div.Layout-main > div > div > appearance-form > div:nth-child(5) > form > div > div:nth-child(6) > label\").click()");
	}

}
