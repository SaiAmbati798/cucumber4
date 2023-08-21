package dataTables;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import helper.PropertyUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef1 {
	public static WebDriver driver;
	// public static Properties prop = new Properties();
	PropertyUtils pro = new PropertyUtils("locators.properties");

	@Before
	public void config() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Given("user is entering {string}")
	public void user_is_entering(String string) {
		driver.get(string);
	}

	@When("user enters the given credentials below")
	public void user_enters_the_given_credentials_below(io.cucumber.datatable.DataTable dataTable) {
		List<String> creden = dataTable.asList(String.class);
		String user = creden.get(0);
		String pwd = creden.get(1);
		// DataTablePageObj.uname.sendKeys(uname);
		driver.findElement(pro.getLocator("uname")).sendKeys(user);
		// driver.findElement(By.id("user-name")).sendKeys(uname);
		driver.findElement(pro.getLocator("pwd")).sendKeys(pwd);
	}

	@When("the user clicks  And gets login")
	public void the_user_clicks_And_gets_login() throws IOException, AWTException {
		driver.findElement(By.id("login-button")).click();
		ExtentCucumberAdapter.addTestStepLog(Status.PASS + "Login Clicked");

		String st = helper.ScreenshotPrac.sct();
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(st);
	}

	@Then("close the browser window")
	public void close_the_browser_window() {

		System.out.println("Browser is closed");
	}

	@After
	public void tear_down() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

}
