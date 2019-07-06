package pages;


import org.openqa.selenium.WebDriver;
import utilities.PropertyManager;

public class SampleTestingPageObject {

    private WebDriver driver=PropertyManager.getInstance().getdriver();

    private HomePage homePage;
    private PaymentPage paymentPage;
    private UserStatusPage userStatusPage;
    private SubscribePage subscribePage;
    private TermsandConditionsPage termsandConditionsPage;

    public SampleTestingPageObject(WebDriver driver) {

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
