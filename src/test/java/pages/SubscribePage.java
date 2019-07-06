package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SubscribePage {

    WebDriver driver;

    public SubscribePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(how = How.ID, using = "email")
    private WebElement txt_Email;

    @FindBy(how = How.ID, using = "password")
    private WebElement txt_Password;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Continue')]")
    private WebElement btn_Continue;

    public void Sendtxt_email(String email){
        txt_Email.sendKeys(email);
    }

    public void Sendtxt_password(String password){
        txt_Password.sendKeys(password);
    }

    public void clickOn_Continue(){
        btn_Continue.click();
    }

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Back')]")
    private WebElement btn_Back;

    public boolean check_Exist_Back(){
        return btn_Back.isDisplayed();
    }

}
