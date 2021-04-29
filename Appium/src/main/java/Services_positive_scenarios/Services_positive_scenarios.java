package Services_positive_scenarios;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import Reusable_functions.Generic_functions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Services_positive_scenarios extends Generic_functions {
	public static boolean str,str1;
	
	/* Application is launching , user is logging in to the home page and navigating to the services page by clicking Services tab on home page */
	@Given("User is on home page and clicks on Services tab")
	public void app_launch() {
		try {
			App_Launch();
			click("welcome_login");
			page_wait(30);
			driver.findElement(By.xpath(OR_reader("Object_Locator","login_phone_no"))).sendKeys(td_reader("login_phone_no"));
			driver.findElement(By.xpath(OR_reader("Object_Locator","login_password"))).sendKeys(td_reader("login_password"));
			page_wait(20);
			click("login");
			click("services");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    
	/* TC_001 - Validate that the user is navigated to the Services page on clicking Services tab*/
	@Then("User should be navigated to services page")
	public void services_positive_tc_001() throws Exception {
		try {
			str=driver.findElement(By.xpath(OR_reader("Object_Locator","services_title"))).isDisplayed();
			Assert.assertEquals(str, true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("services_positive_tc_001");
		}
	}
	
	/* User is navigating to the services page by clicking Services tab*/
	@Given("User is on Services page")
	public void user_is_on_services_page() {
	    try {
			click("services");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/* TC_002- Validate that the user is navigated to the Second Opinion page on clicking Second Opinions*/
	@Then("User should be navigated to Second opinions page on clicking Second opinions tab")
	public void services_positive_tc_002() throws IOException {
		try {
			click("second_opinions");
			str=driver.findElement(By.xpath(OR_reader("Object_Locator","second_opinions_title"))).isDisplayed();
			Assert.assertEquals(str, true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("services_positive_tc_002");
		}
	}
	
	/* TC_003 - Validate that the user is navigated to the Conditions page on clicking Conditions*/
	@Then("User should be navigated to Conditions page on clicking conditions tab")
	public void services_positive_tc_003() throws IOException {
		try {
			click("conditions");
			str=driver.findElement(By.xpath(OR_reader("Object_Locator","conditions_title"))).isDisplayed();
			Assert.assertEquals(str, true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("services_positive_tc_003");
		}
	}
	
	/* TC_004 - Validate that the user is navigated to the Medications page on clicking Medications*/
	@Then("User should be navigated to Medications page on clicking Medications tab")
	public void services_positive_tc_004() throws IOException {
		try {
			click("medications");
			str=driver.findElement(By.xpath(OR_reader("Object_Locator","Medications_title"))).isDisplayed();
			Assert.assertEquals(str, true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("services_positive_tc_004");
		}
	}
	
	/* TC_011 - Validate that the user is navigated to the Bills page on clicking Bills */
	@Then("User should be navigated to Bills page on clicking Bills tab")
	public void services_positive_tc_011() throws IOException {
		try {
			click("bills");
			str=driver.findElement(By.xpath(OR_reader("Object_Locator","bills_title"))).isDisplayed();
			Assert.assertEquals(str, true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("services_positive_tc_011");
		}
	}

	/* TC_012- Validate that the user is navigated to the Claims page on clicking Claims */
	@Then("User should be navigated to Claims page on clicking Claims tab")
	public void services_positive_tc_012() throws IOException{
		try {
			click("claims");
			page_wait(20);
			str=driver.findElement(By.xpath(OR_reader("Object_Locator","claims_title"))).isDisplayed();
			Assert.assertEquals(str, true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("services_positive_tc_012");
		}
	}
	
	/* TC_016 - Validate that the user is navigated to the your alerts page on clicking your alert in header*/
	@Then("User should be navigated to Your alerts page on clicking your alerts")
	public void services_positive_tc_016() throws IOException {
		try {
			click("menu");
			click("your_alerts");
			str=driver.findElement(By.xpath(OR_reader("Object_Locator","your_alerts_title"))).isDisplayed();
			Assert.assertEquals(str, true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("services_positive_tc_016");
		}
	}
	
	/* TC_017- Validate that the user is navigated to the Log out page on clicking Log out in header*/
	@Then("User should be able to logout successfull")
	public void services_positive_tc_017() throws IOException {
		try {
			click("menu");
			click("logout");
			str=driver.findElement(By.xpath(OR_reader("Object_Locator","welcome_login"))).isDisplayed();
			Assert.assertEquals(str, true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("services_positive_tc_017");
		}
	}
	
	/* TC_018- Validate that user is able to click on the Drop down*/
	@Then("User should be able to view menu options")
	public void services_positive_tc_018() throws IOException {
		try {
			click("welcome_login");
			Thread.sleep(3000);
			click("menu");
			str=driver.findElement(By.xpath(OR_reader("Object_Locator","your_alerts"))).isDisplayed();
			Assert.assertEquals(str, true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("services_positive_tc_018");
		}
	}
	
	/* TC_022- Validate that Medications clicked on by the user in Services tab must reflect on Dashboard in Recent services */
	@Then("User should view medications on home page after clicking medications tab")
	public void services_positive_tc_023() throws InterruptedException, IOException {
		try {
			click("services");
			click("medications");
			page_wait(60);
			click("home");
			str=driver.findElement(By.xpath(OR_reader("Object_Locator","medications"))).isDisplayed();
			Assert.assertEquals(str, true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("services_positive_tc_022");
		}
	}
	
	/* TC_023 -Validate that when multiple services are clicked on, they must be reflected in Recent services on main Dashboard*/
	@Then("User should view medications,conditions tabs on home page after clicking tabs")
	public void services_positive_tc_025() throws IOException {
		try {
			click("medications");
			page_wait(60);
			click("services");
			page_wait(60);
			click("conditions");
			page_wait(50);
			click("home");
			str=driver.findElement(By.xpath(OR_reader("Object_Locator","medications"))).isDisplayed();
			 str1=driver.findElement(By.xpath(OR_reader("Object_Locator","conditions"))).isDisplayed();
			Assert.assertEquals(str, true);
			Assert.assertEquals(str1, true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("services_positive_tc_023");
		}
	}
}
