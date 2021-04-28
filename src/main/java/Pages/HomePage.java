package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public SignInPage clickFormAuthentication(){
        clickLink("Sign in");
        return new SignInPage(driver);
    }

    public SearchPage clickSearchBtn(){
        driver.findElement(By.id("search_query_top"));
        return new SearchPage(driver);
    }
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}

