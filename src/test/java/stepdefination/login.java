package stepdefination;


import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login 
{
	@Before
	public void	setting_up_broswer()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ics\\Downloads\\chromedriver_win32_10\\"+"chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	WebDriver driver;
	@Given("^the website is hit$")
	public void hitwebsite()
	{
		driver.get("http://newtours.demoaut.com/mercurysignon.php");

	}
	//	@Given("the username and password is")
	//	public void the_username_and_password_is(io.cucumber.datatable.DataTable dataTable) {
	//		HashMap<String,String> hm=new HashMap<String,String>();  
	//		for(Map.Entry entry:hm.entrySet()){
	//			System.out.print(entry.getKey() + " : " + entry.getValue());
	//			driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(String.valueOf(entry.getKey()));
	//			driver.findElement(By.xpath("//input[@name='userName']//following::input[1]")).sendKeys(String.valueOf(entry.getValue()));
	//		}	
	//	}

	@And("^the username is entered$")
	public void enteruserame()
	{
		WebElement a=driver.findElement(By.xpath("//input[@name='userName']"));
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("batman");;
	}
	@And("^the password is entered$")
	public void passwordenter()
	{
		WebElement b=driver.findElement(By.xpath("//input[@name='userName']//following::input[1]"));
		driver.findElement(By.xpath("//input[@name='userName']//following::input[1]")).sendKeys("batman");

	}
	//	@And("^the username is (\\w+)$")
	//	public void enteruserame_1(String username)
	//	{
	//		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(username);
	//	}
	//	@And("^the password is (\\w+)$")
	//	public void enterpassword_1(String password)
	//	{
	//		driver.findElement(By.xpath("//input[@name='userName']//following::input[1]")).sendKeys(password);
	//	}
	@Given("the username is username")
	public void the_username_is_username(DataTable dt) 
	{
		List<String> a=	dt.asList();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(String.valueOf(a.get(0)));
	}

	@Given("the password is password")
	public void the_password_is_password(DataTable dt1) 
	{
		List<String> a=	dt1.asList();
		driver.findElement(By.xpath("//input[@name='userName']//following::input[1]")).sendKeys(a.get(0));


	}

	@When("^i click the login button$")
	public void clicklogin()
	{
		driver.findElement(By.xpath("//input[@name='userName']//following::input[2]")).click();
	}

	@Then("^the landing page is opened$")
	public void landingpage()
	{
		driver.findElement(By.xpath("//a[contains(text(),'SIGN-OFF')]")).isDisplayed();

	}
   @After
   public void	closing_the_browser()
	{
		driver.close();
	}
	
}
