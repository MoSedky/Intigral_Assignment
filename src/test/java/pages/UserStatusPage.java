package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserStatusPage {

    WebDriver driver;

    public UserStatusPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'already have an account')]//a")
    private WebElement btn_Clickhere;

    public void clickOn_Clickhere(){
        btn_Clickhere.click();
    }

    @FindBy(how = How.XPATH, using = "//a[contains(@id,'not_user_subscribe')]")
    private WebElement btn_Subscribe;

    public void clickOn_Subscribe(){
        btn_Subscribe.click();
    }

    @FindBy(how = How.XPATH, using = "//section[@class='login-content']//*[contains(text(),'Create your account')]")
    private WebElement create_Account_Section;

    public boolean check_Exist_Section(){
        return create_Account_Section.isDisplayed();
    }

}
