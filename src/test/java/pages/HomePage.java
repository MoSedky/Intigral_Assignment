package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void navigateTo_jawwy(String Url){
        driver.get(Url);
    }

    @FindBy(how = How.XPATH, using = "//a[contains(@href,'en/home')]")
    private WebElement btn_English;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Subscribe Now')]")
    private WebElement btn_Subscribe_trial;

    public void click_On_btn_English(){
        btn_English.click();
    }

    public void click_On_btn_Subscribe_trial(){
        btn_Subscribe_trial.click();
    }

}
