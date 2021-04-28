package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public SignInPage clickSignIn(){
        clickXpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a");
        return new SignInPage(driver);
    }

    public SearchPage clickSearchBtn(){
        clickXpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/input[4]");
        return new SearchPage(driver);
    }
    public CartPage clicCartPage(){
        clickXpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a");
        return new CartPage(driver);
    }


    private void clickXpath(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
}

