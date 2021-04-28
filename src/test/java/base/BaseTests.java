package base;

import Pages.HomePage;
import Pages.SearchPage;
import Pages.SearchResultPage;
import com.google.common.io.Files;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import util.EventReporter;
import util.WindowManager;

import java.io.File;
import java.io.IOException;

public class BaseTests {
    private EventFiringWebDriver driver;
    protected HomePage homePage;
    protected SearchPage searchPage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        driver.register(new EventReporter());
        goHome();
    }

    @BeforeMethod
    public void goHome(){
        driver.get("http://automationpractice.com/index.php");
        homePage = new HomePage(driver);
        searchPage = new SearchPage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @AfterMethod
    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus())
        {
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try{
                Files.move(screenshot, new File("C:\\Users\\user\\IdeaProjects\\STFHW3.3_3.4_ZavenTadevosyan\\src\\main\\resources" + result.getName() + ".png"));
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        return options;
    }

    private void setCookie(){
        Cookie cookie = new Cookie.Builder("tau", "123")
                .domain("http://automationpractice.com/index.php")
                .build();
        driver.manage().addCookie(cookie);
    }
}
