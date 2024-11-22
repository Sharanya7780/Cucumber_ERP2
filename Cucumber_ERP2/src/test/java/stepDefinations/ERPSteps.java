package stepDefinations;

import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ERPSteps {
	WebDriver driver;
	@Given("Launch browser as")
	public void launch_browser_as() throws Throwable {
	 driver = FunctionLibrary.startBrowser();  
	}

	@When("launch url")
	public void launch_url() {
	FunctionLibrary.openUrl();    
	}

	@When("wait for username with {string} and {string} and {string}")
	public void wait_for_username_with_and_and(String Ltype, String Lvalue, String MyWait) {
	  FunctionLibrary.waitForElement(Ltype, Lvalue, MyWait);  
	}

	@When("Enter username with {string} and {string} and {string}")
	public void enter_username_with_and_and(String TestData,String Ltype,String Lvalue) {
		 FunctionLibrary.typeAction(Ltype, Lvalue, TestData);
	}

	@When("Enter password with {string} and {string} and {string}")
	public void enter_password_with_and_and(String TestData,String Ltype,String Lvalue) {
		 FunctionLibrary.typeAction(Ltype, Lvalue, TestData);
	}

	@When("click login button with {string} and {string}")
	public void click_login_button_with_and(String Ltype, String Lvalue)throws Throwable {
		Thread.sleep(2000);
		FunctionLibrary.clickAction(Ltype, Lvalue); 
	}

	@When("wait for Supplierlink with {string} and {string} and {string}")
	public void wait_for_Supplierlink_with_and_and(String Ltype, String Lvalue, String MyWait) {
		FunctionLibrary.waitForElement(Ltype, Lvalue, MyWait);  
	}

	@When("click Supplierlink with {string} and {string}")
	public void click_Supplierlink_with_and(String Ltype, String Lvalue) {
	   FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("wait for AddIcon with {string} and {string} and {string}")
	public void wait_for_AddIcon_with_and_and(String Ltype, String Lvalue, String MyWait) {
		FunctionLibrary.waitForElement(Ltype, Lvalue, MyWait);   
	}

	@When("click AddIcon button with {string} and {string}")
	public void click_AddIcon_button_with_and(String Ltype, String Lvalue) {
		FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("wait for supplier number with {string} and {string} and {string}")
	public void wait_for_supplier_number_with_and_and(String Ltype, String Lvalue, String MyWait) {
		FunctionLibrary.waitForElement(Ltype, Lvalue, MyWait);   
	}

	@When("capture Supplier number with {string} and {string}")
	public void capture_Supplier_number_with_and(String LType, String Lvalue) throws Throwable {
	    FunctionLibrary.captureSupp(LType, Lvalue);
	}

	@When("Enter in {string} with {string} and {string}")
	public void enter_in_with_and(String TestData,String LType,String Lvalue) {
		 FunctionLibrary.typeAction(LType, Lvalue, TestData);
	}

	@When("click Add button with {string} and {string}")
	public void click_Add_button_with_and(String Ltype, String Lvalue) {
	    FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("wait for confirm Ok button with {string} and {string} and {string}")
	public void wait_for_confirm_Ok_button_with_and_and(String Ltype, String Lvalue, String MyWait) {
		FunctionLibrary.waitForElement(Ltype, Lvalue, MyWait);   
	}

	@When("click confirm Ok button  with {string} and {string}")
	public void click_confirm_Ok_button_with_and(String Ltype, String Lvalue) {
		FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("wait for Alert Ok button with {string} and {string} and {string}")
	public void wait_for_Alert_Ok_button_with_and_and(String Ltype, String Lvalue, String MyWait) {
		FunctionLibrary.waitForElement(Ltype, Lvalue, MyWait);   
	}

	@When("click Alert Ok button with {string} and {string}")
	public void click_Alert_Ok_button_with_and(String Ltype, String Lvalue) {
		FunctionLibrary.clickAction(Ltype, Lvalue); 
	}

	@When("verify Suppliernumber")
	public void verify_Suppliernumber() throws Throwable {
	   FunctionLibrary.supplierTable();
	}

	@When("click logout link with {string} and {string}")
	public void click_logout_link_with_and(String Ltype, String Lvalue) {
		FunctionLibrary.clickAction(Ltype, Lvalue); 
	}

	@When("close browser")
	public void close_browser() {
	   FunctionLibrary.closeBrowser();;
	}
	@When("wait for customerlink with {string} and {string} and {string}")
	public void wait_for_customerlink_with_and_and(String LType, String Lvalue, String MyWait) {
	    FunctionLibrary.waitForElement(LType, Lvalue, MyWait);
	}

	@When("click customerlink with {string} and {string}")
	public void click_customerlink_with_and(String LType, String Lvalue) {
	    FunctionLibrary.clickAction(LType, Lvalue);
	}
	@When("Click login button with {string} and {string}")
	public void Click_login_button_with_and(String Ltype, String Lvalue)throws Throwable {
		Thread.sleep(2000);
		FunctionLibrary.clickAction(Ltype, Lvalue); 
	}

	@When("wait for customer number with {string} and {string} and {string}")
	public void wait_for_customer_number_with_and_and(String LType, String Lvalue, String MyWait) {
		FunctionLibrary.waitForElement(LType, Lvalue, MyWait);
	}

	@When("capture customer number with {string} and {string}")
	public void capture_customer_number_with_and(String LType, String Lvalue) throws Throwable {
	    FunctionLibrary.captureCus(LType, Lvalue);
	}

	@When("verify customernumber")
	public void verify_customernumber() throws Throwable {
	   FunctionLibrary.customerTable();
	}
	}
	


