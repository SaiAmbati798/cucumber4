package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefWithExample
{
	public static WebDriver driver;
	@Before
	public void config()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}

@Given("user launches {string}")
public void user_launches(String string) {
    
driver.get(string);
}

@When("user enters the  credential values {string} and {string}")
public void user_enters_the_credential_values_and(String uname, String pwd) {
	driver.findElement(By.id("username")).sendKeys(uname);
	driver.findElement(By.id("password")).sendKeys(pwd);
}

@When("the user clicks  And gets admitted in to website")
public void the_user_clicks_And_gets_admitted_in_to_website() {
	driver.findElement(By.id("login-button")).click();
}

@After
public void tear_down()
{
	driver.close();
}

@Then("close the browser window and quit")
public void close_the_browser_window_and_quit() {
    
System.out.println("Browser is closed");
}



}