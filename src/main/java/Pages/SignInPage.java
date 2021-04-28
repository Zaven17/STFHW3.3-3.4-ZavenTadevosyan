package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    private WebDriver driver;
    private By signInField = By.id("email");
    private By passwordField = By.id("passwd");
    private By loginButton = By.linkText("Sign in");

    public SignInPage(WebDriver driver){
        this.driver = driver;
    }

    public void setSignInField(String username){
        driver.findElement(signInField).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
}
