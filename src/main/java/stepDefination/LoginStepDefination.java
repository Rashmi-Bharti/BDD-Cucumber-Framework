/*package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefination {

	WebDriver driver;

	@Given("^user is already on Login Page$")
	public void user_on_LoginPage() {

		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://classic.crmpro.com/");	

	}

    @When("^title of login page is FreeCRM$")
	public void title_of_login_page_is_FreeCRM() {

     String title=driver.getTitle();
     System.out.println("Title of the page is::"+title);
	}

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username , String password)  {
     
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);

	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		
    driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("^user is on HomePage$")
	public void user_is_on_HomePage() {
		
		String homepagetitle=driver.getTitle();
		System.out.println("home page title is::"+homepagetitle);
		Assert.assertEquals("CRMPRO", homepagetitle);
    
	}
	
	@Then("^user move to new contact page$")
	public void user_move_to_new_contact_page() {
	    
		driver.switchTo().frame("mainpanel");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
		
	}
	
	@Then("^^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
    public void user_enter_contactDetails(String firstname, String lastname, String position) {
		
		 driver.findElement(By.id("first_name")).sendKeys(firstname);
		 driver.findElement(By.id("surname")).sendKeys(lastname);
		 driver.findElement(By.id("company_position")).sendKeys(position);
		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
		
	}
	
	@Then("^close the browser$")
	public void Close_browser() {
     
		driver.close();

}
}
*/