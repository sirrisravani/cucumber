package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login2 {
	WebDriver driver;
	
	@Given("url is lanuched")
	public void url_is_lanuched() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\sravani sandhya\\eclipse-workspace\\Cucumber\\Cucumber\\Webdriver\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://www.stealmylogin.com/demo.html");
	}
	
       @Then("Enter username")
	public void enter_username() {
	    driver.findElement(By.name("username")).sendKeys("sravanis");
	}

	@Then("Enter user password")
	public void enter_user_password() {
	   driver.findElement(By.name("password")).sendKeys("test@123");
	}

	@Then("click login button1")
	public void click_login_button1() {
	   WebElement loginbtn= driver.findElement(By.xpath("/html/body/form/input[3]"));
	   loginbtn.click();
	}


}
