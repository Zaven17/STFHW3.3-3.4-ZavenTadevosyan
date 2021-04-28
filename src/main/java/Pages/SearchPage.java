package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    private WebDriver driver;
    private By searchbox = By.id("search_query_top");

    public SearchPage(WebDriver driver){
        this.driver = driver;
    }
    public void search(String searchItem){
        WebElement s = driver.findElement(searchbox);
        s.sendKeys(searchItem);
        s.submit();
    }

}
