package Examples;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefwithHeader1 {
	public static WebDriver driver;
	@Before
	public void config()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@Given("user enter {string}")
	public void user_enter(String string) {
	    driver.get(string);
	    }

	@When("user enters the  values below")
	public void user_enters_the_values_below(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String,String>>creden=dataTable.asMaps(String.class,String.class);
	    String uname,pwd;
	    uname=creden.get(0).get("Username");
	    pwd=creden.get(0).get("Password");
	    driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	    
	}

	@When("the user clicks  And gets login in to website")
	public void the_user_clicks_And_gets_login_in_to_website() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("exit the browser window")
	public void exit_the_browser_window() {
	    driver.quit();
	}


}
