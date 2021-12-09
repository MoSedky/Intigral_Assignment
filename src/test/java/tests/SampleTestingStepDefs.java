package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.*;
import utilities.PropertyManager;

import java.net.MalformedURLException;


public class SampleTestingStepDefs {
    SampleTestingPageObject sampleTestingPageObject;
    HomePage homePage;
    PaymentPage paymentPage;
    SubscribePage subscribePage;
    TermsandConditionsPage termsandConditionsPage;
    UserStatusPage userStatusPage;

//    WebDriver driver=PropertyManager.getInstance().getdriver();
    String Url;

    {
        Url = "http://automationpractice.com/index.php";
    }

    WebDriver Driver;

    {
        try {
            Driver = PropertyManager.getInstance().getdriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    String email;

    {
        try {
            email = PropertyManager.getInstance().getUsername();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    String password;

    {
        try {
            password = PropertyManager.getInstance().getPassword();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    String country;

    {
        try {
            country = PropertyManager.getInstance().getCountry();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void user_on_page() throws MalformedURLException {
        sampleTestingPageObject = new SampleTestingPageObject();
        homePage=sampleTestingPageObject.gethomePageObject();
        homePage.navigateTo_jawwy(Url);
    }


    @Given("^User Open Landing Page$")
    @Test
    public void Jawwytv_site_opens_successfully() throws MalformedURLException {
        user_on_page();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("User clicks on Sign In Url")
    @Test
    public void User_changes_language_in_welcome_screen(){
        homePage.click_sign_in();
    }

    @And("User Insert valid Email as {string}")
    @Test
    public void User_insert_valid_email_txt(String arg0){
        homePage.insert_email(arg0);
    }

    @And("User Insert valid Password as {string}")
    public void userInsertValidPasswordAs(String arg0) {
        homePage.insert_password(arg0);
    }

    @And("User Clicks on SignIn button")
    public void userClicksOnSignInButton() {
        homePage.click_sign_in_button();
    }

    @Then("User Full Name displayed properly")
    public void userFullNameDisplayedProperly() {
        String displayed_fullName= homePage.getFullName();
        String expected_val=fake_api_getFullName();
        Assert.assertEquals("Displayed Logged In User is not as expected", expected_val, displayed_fullName);

    }
    
    public String fake_api_getFullName() {
        String FullName= "Abdullah Atef";
        return FullName;
    }


//    @And("^User Insert valid Password$")
//    @Test
//    public void User_insert_valid_password(){
//        homePage.insert_password();
//    }
//
//    @Then("^User enters username as testuser@gm.com$")
//    @Test
//    public void enter_username(){
//        subscribePage.Sendtxt_email(email);
//
//    }
//
//    @And("User enters password as {string}")
//    public void enter_password(String pwd){
//        subscribePage.Sendtxt_password(String.valueOf(pwd));
//    }
//
//    @And("^User clicks on continue button$")
//    public void click_continue(){
//        subscribePage.clickOn_Continue();
//    }
//
//    @Then("^User should see back button displayed on payment screen$")
//    public void user_should_see_back_button_displayed_on_payment_screen(){
//        if(subscribePage.check_Exist_Back())
//            System.out.println("Back Button displayed on payment screen$");
//
//    }
//
//    @Then("User should selects {string} from country dropdown menu")
//    public void select_country(){
//        paymentPage.select_country(country);
//
//    }
//
//    @And("User should see available payment methods displayed for {string}")
//    public void validate_count_payment(){
//        int no_of_payment_methods=paymentPage.getPayment_methods_count();
//        String payment_method_name=paymentPage.getPayment_methods_text();
//        System.out.println("Available Payment methods for "+country +"are "+no_of_payment_methods+"Name is "+payment_method_name);
//
//    }
//
//    @And("^User clicks on Click here link in create your account section$")
//    public void click_here_btn(){
//        userStatusPage.clickOn_Clickhere();
//
//    }
//
//    @And("^User clicks on Subscribe link in Existing User section$")
//    public void click_subscribe_btn(){
//        userStatusPage.clickOn_Subscribe();
//
//    }
//
//    @Then("^User should navigate to Create your account section$")
//    public void navigate_create_account(){
//        if(userStatusPage.check_Exist_Section())
//            System.out.println("User navigates successfully to Account Section$");
//
//    }
//
//    @Then("^User clicks on Terms and Conditions link in create your account section$")
//    public void click_Terms_Conditions(){
//        termsandConditionsPage.clickOn_Terms();
//
//    }
//
//    @Then("^User should see that Terms & Conditions section is displayed$")
//    public void check_Terms_content(){
//        termsandConditionsPage.check_Exist_Terms();
//
//    }

}
