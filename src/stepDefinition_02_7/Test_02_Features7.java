package stepDefinition_02_7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_02_Features7 {
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

	@When("I enter valid username and valid password")
	public void i_enter_valid_username_and_valid_password() {
		driver.findElement(By.id("login_field")).sendKeys("kelompok02test");
	    driver.findElement(By.id("password")).sendKeys("kelompokpkpl02");
	}
	
	@Then("I can login successfully")
	public void i_can_login_successfully() {
		driver.findElement(By.name("commit")).click();
	}
	
	@Then("I click profile")
	public void i_click_profile() throws InterruptedException {
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[7]/details")).click();
		Thread.sleep(1000);
	}
	
	@Then("I click your projects")
	public void i_click_your_projects() {
		js.executeScript("document.querySelector(\"body > div.position-relative.js-header-wrapper > header > div.Header-item.position-relative.mr-0.d-none.d-md-flex > details > details-menu > a:nth-child(8)\").click();");
	}
	
	@Then("I click button new project")
	public void i_click_button_new_project() {
		driver.findElement(By.xpath("//*[@id=\"projects-results\"]/div/div[1]/a")).click();
	}
	
	@Then("I fill project name")
	public void i_fill_project_name() {
		driver.findElement(By.xpath("//*[@id=\"project_name\"]")).sendKeys("Kelompok02pkpl");
	}
	
	@Then("I click create project")
	public void i_click_create_project() {
		driver.findElement(By.xpath("/html/body/div[5]/main/div/form/div[4]/button")).click();
	}

}

