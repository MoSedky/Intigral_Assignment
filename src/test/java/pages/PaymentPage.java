package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PaymentPage {
    WebDriver driver;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.NAME, using = "country")
    private Select ddl_Country;

    public void select_country(String country){
        ddl_Country.selectByVisibleText(country);
    }

    @FindBys(@FindBy(how = How.XPATH, using = "//div[@class='selectProviders-main']//li//div[@class='provider-name']"))
    private List<WebElement> paymentMethods;

    public int getPayment_methods_count(){
        return paymentMethods.size();
    }

    public String getPayment_methods_text(){
        return paymentMethods.get(0).getText();
    }



}
