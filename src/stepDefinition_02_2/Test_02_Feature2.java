package stepDefinition_02_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_02_Feature2 {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
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
		driver.findElement(By.name("commit")).click();
	}

	@Then("I click search bar")
	public void i_click_search_bar() {
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div/div/form/label/input[1]")).click();
	}
	@Then("I type the keyword")
	public void i_type_the_keyword() {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div/div/form/label/input[1]")).sendKeys("Java");
	}
	@Then("I click button")
	public void i_click_button() {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div/div/form/label/input[1]")).sendKeys(Keys.RETURN);
	}

}
