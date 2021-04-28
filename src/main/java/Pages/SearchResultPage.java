package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {
    private WebDriver driver;
    private By addToCart = By.linkText("Add to cart");
    private By topSellers = By.linkText("Top sellers");
    private By categories = By.xpath("/html/body/div/div[2]/div/div[3]/div[1]/div[2]/h2");
    private By information = By.linkText("Information");
    private By manufacturers = By.linkText("Manufacturers");
    private By specials = By.linkText("Specials");
    private By suppliers = By.linkText("Suppliers");
    private By viewedProducts = By.xpath("/html/body/div/div[2]/div/div[3]/div[1]/div[7]/p");

    public SearchResultPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickAddToCart(){
        driver.findElement(addToCart).click();
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

}
