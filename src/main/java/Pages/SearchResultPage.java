package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {
    private WebDriver driver;
    private By legalNotice = By.xpath("/html/body/div/div[2]/div/div[3]/div[1]/section/div/ul/li[2]/a");
    private By topSellers = By.xpath("/html/body/div/div[2]/div/div[3]/div[1]/div[1]/h4");
    private By categories = By.xpath("/html/body/div/div[2]/div/div[3]/div[1]/div[2]/h2");
    private By information = By.xpath("/html/body/div/div[2]/div/div[3]/div[1]/section/p");
    //intentional wrong xpath for failure
    private By manufacturers = By.xpath("da");
    private By specials = By.xpath("/html/body/div/div[2]/div/div[3]/div[1]/div[4]/p");
    private By suppliers = By.xpath("/html/body/div/div[2]/div/div[3]/div[1]/div[6]/p");
    private By viewedProducts = By.xpath("/html/body/div/div[2]/div/div[3]/div[1]/div[7]/p");

    public SearchResultPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickTopSeller(){
        driver.findElement(topSellers).click();
    }
    public void clickCategories(){
        driver.findElement(categories);
    }
    public void clickInformation(){
        driver.findElement(information);
    }
    public void clickManufacturers(){
        driver.findElement(manufacturers);
    }
    public void clickSpecial(){
        driver.findElement(specials);
    }
    public void clickSuppliers(){
        driver.findElement(suppliers);
    }
    public void clickViewedProducts(){
        driver.findElement(viewedProducts).click();
    }
    public void clickLegalNotice(){driver.findElement(legalNotice).click();}

}
