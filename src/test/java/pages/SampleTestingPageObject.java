package pages;


import org.openqa.selenium.WebDriver;
import utilities.PropertyManager;

import java.net.MalformedURLException;

public class SampleTestingPageObject {

    public WebDriver driver=PropertyManager.getInstance().getdriver();

    public HomePage homePage=new HomePage(driver);
    private PaymentPage paymentPage;
    private UserStatusPage userStatusPage;
    private SubscribePage subscribePage;
    private TermsandConditionsPage termsandConditionsPage;

    public SampleTestingPageObject() throws MalformedURLException {
    }

    public SampleTestingPageObject(WebDriver driver) throws MalformedURLException {

        this.driver = driver;

    }

    public HomePage gethomePageObject() {
        return homePage;
    }

    public PaymentPage getpaymentPageObject() {
        return paymentPage;
    }

    public UserStatusPage getuserStatusObject() {
        return userStatusPage;
    }

    public SubscribePage getsubscribePageObject() {
        return subscribePage;
    }

    public TermsandConditionsPage gettermsandConditionsObject() {
        return termsandConditionsPage;
    }

    public WebDriver getDriver(){
        return driver;
    }
}
