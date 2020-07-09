package stepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class InputFormStepDefination {
	
	WebDriver driver;
	@Given("^user is already in selenium demo page$")
	public void user_already_Selenium_Demo_Page() {

		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
	}
	
	@Then("^user enters details$")
	public void user_enters_details(DataTable formDetails) {
		List<List<String>> data= formDetails.raw();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(data.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(data.get(0).get(1));
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(data.get(0).get(2));
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(data.get(0).get(3));
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys(data.get(0).get(4));
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(data.get(0).get(5));
		

	}
	
	@Then("^user Select State from the dropdown$")
	public void user_select_state_from_Dropdown() {
		Select select=new Select(driver.findElement(By.xpath("//select[@name='state']")));
		select.selectByVisibleText("California");
	}
	
	@Then("^user enters rest  details$")
	public void user_enters_rest_details(DataTable restDetails) {
		List<List<String>> data= restDetails.raw();
		driver.findElement(By.xpath("//input[@name='zip']")).sendKeys(data.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='website']")).sendKeys(data.get(0).get(1));
	}
	
	@Then("^user Clicks the checkBox$")
	public void user_Clicks_the_checkBox() {
		WebElement option=driver.findElement(By.xpath("//input[@value='yes']"));
		option.click();
	}
	
	@Then("^User enters \"(.*)\"$")
	public void User_enters_ProjectDesc(String ProjectDesc) {
		driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys(ProjectDesc);
	}
	
	@Then("^user Clicks the Send Button$")
	public void user_clicks_the_send_button() {
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	}
	
	@Then("^User Close the browser$")
	public void Close_the_browser() {
		driver.quit();
	}
	
	
}
