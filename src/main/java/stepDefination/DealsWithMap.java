package stepDefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealsWithMap {
	
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

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials)  {

		for(Map<String ,String> data: credentials.asMaps(String.class, String.class)) {
			
			driver.findElement(By.name("username")).sendKeys(data.get("username"));
			driver.findElement(By.name("password")).sendKeys(data.get("password"));
		}
		

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

	@Then("^user moves to new Deal page$")
	public void user_move_to_new_contact_page() {

		driver.switchTo().frame("mainpanel");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();

	}
	
	@Then("^user enters deal details$")
	public void user_enters_contacts_details(DataTable dealData) {

		for (Map<String, String> data : dealData.asMaps(String.class, String.class)) {

			driver.findElement(By.id("title")).sendKeys(data.get("title"));
			driver.findElement(By.id("amount")).sendKeys(data.get("amount"));
			driver.findElement(By.id("probability")).sendKeys(data.get("probability"));
			driver.findElement(By.id("commission")).sendKeys(data.get("commission"));
			
			driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click(); //save button
			
			//move to new deal page:
		Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();

		}

	}
	
	@Then("^close the browser$")
	public void Close_browser() {
     
		driver.close();
}
}
