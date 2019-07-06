package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TermsandConditionsPage {

    WebDriver driver;

    public TermsandConditionsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//p[contains(@class,'signup')]//a[contains(text(),'Terms')]")
    private WebElement btn_TermsAndConditions;

    public void clickOn_Terms(){
        btn_TermsAndConditions.click();
    }

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'terms-content')]")
    private WebElement txt_ContentTermsAndConditions;

    public boolean check_Exist_Terms(){
        return txt_ContentTermsAndConditions.isDisplayed();
    }


}
