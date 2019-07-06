package tests;

import cucumber.api.java.BeforeStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.SampleTestingPageObject;
import pages.HomePage;
import pages.PaymentPage;
import pages.SubscribePage;
import pages.TermsandConditionsPage;
import pages.UserStatusPage;
import utilities.PropertyManager;

public class SampleTestingStepDefs {
    SampleTestingPageObject sampleTestingPageObject;
    HomePage homePage;
    PaymentPage paymentPage;
    SubscribePage subscribePage;
    TermsandConditionsPage termsandConditionsPage;
    UserStatusPage userStatusPage;

    WebDriver driver=sampleTestingPageObject.getDriver();
    String Url=PropertyManager.getInstance().getURL();
    String email=PropertyManager.getInstance().getUsername();
    String password=PropertyManager.getInstance().getPassword();
    String country=PropertyManager.getInstance().getCountry();

    public void user_on_page(){
        sampleTestingPageObject = new SampleTestingPageObject(driver);
        homePage=sampleTestingPageObject.gethomePageObject();
        homePage.navigateTo_jawwy(Url);
    }


    @Given("^Jawwytv site opens successfully$")
    public void Jawwytv_site_opens_successfully(){
        user_on_page();
        throw new cucumber.api.PendingException();
    }

    @When("^User changes language in welcome screen$")
    public void User_changes_language_in_welcome_screen(){
        homePage.click_On_btn_English();
        throw new cucumber.api.PendingException();
    }

    @And("^User clicks on seven days free subscribe now button$")
    public void User_clicks_on_seven_days_free_subscribe_now_button(){
        homePage.click_On_btn_Subscribe_trial();
        throw new cucumber.api.PendingException();
    }

    @Then("^User enters username as testuser@gm.com$")
    public void enter_username(){
        subscribePage.Sendtxt_email(email);
        throw new cucumber.api.PendingException();

    }

    @And("User enters password as {string}")
    public void enter_password(String pwd){
        subscribePage.Sendtxt_password(String.valueOf(pwd));
        throw new cucumber.api.PendingException();
    }

    @And("^User clicks on continue button$")
    public void click_continue(){
        subscribePage.clickOn_Continue();
        throw new cucumber.api.PendingException();
    }

    @Then("^User should see back button displayed on payment screen$")
    public void user_should_see_back_button_displayed_on_payment_screen(){
        if(subscribePage.check_Exist_Back())
            System.out.println("Back Button displayed on payment screen$");
        throw new cucumber.api.PendingException();
    }

    @Then("User should selects {string} from country dropdown menu")
    public void select_country(){
        paymentPage.select_country(country);
        throw new cucumber.api.PendingException();
    }

    @And("User should see available payment methods displayed for {string}")
    public void validate_count_payment(){
        int no_of_payment_methods=paymentPage.getPayment_methods_count();
        String payment_method_name=paymentPage.getPayment_methods_text();
        System.out.println("Available Payment methods for "+country +"are "+no_of_payment_methods+"Name is "+payment_method_name);
        throw new cucumber.api.PendingException();
    }

    @And("^User clicks on Click here link in create your account section$")
    public void click_here_btn(){
        userStatusPage.clickOn_Clickhere();
        throw new cucumber.api.PendingException();
    }

    @And("^User clicks on Subscribe link in Existing User section$")
    public void click_subscribe_btn(){
        userStatusPage.clickOn_Subscribe();
        throw new cucumber.api.PendingException();
    }

    @Then("^User should navigate to Create your account section$")
    public void navigate_create_account(){
        if(userStatusPage.check_Exist_Section())
            System.out.println("User navigates successfully to Account Section$");
        throw new cucumber.api.PendingException();
    }

    @Then("^User clicks on Terms and Conditions link in create your account section$")
    public void click_Terms_Conditions(){
        termsandConditionsPage.clickOn_Terms();
        throw new cucumber.api.PendingException();
    }

    @Then("^User should see that Terms & Conditions section is displayed$")
    public void check_Terms_content(){
        termsandConditionsPage.check_Exist_Terms();
        throw new cucumber.api.PendingException();
    }


}
