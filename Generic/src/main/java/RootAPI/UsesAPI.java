package RootAPI;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;
public class UsesAPI {
   public WebDriver driver = null;
    public String browserstack_username= "your user name";
    public String browserstack_accesskey = "your access key";
    public String saucelabs_username = "";
    public String saucelabs_accesskey = "";

        @Parameters({"url"})
        @BeforeMethod
    public void setUp(@Optional() String url){
            System.setProperty("webdriver.gecko.driver","/Users/rajive/Documents/Projects/Selenium/Maven/FrameWork/Generic/Drivers/geckodriver");
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(url);
            //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone", Keys.ENTER);
        }
    @AfterMethod
    public void cleanUp(){
         //   driver.close();
    }
    public void typeOnCss(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }
    public void typeOID(String locator, String value){
        driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
    }
    public void typeOnXpath(String locator, String value){
        driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
    }
    public void typeOnInputBox(String locator, String value){
            try {
            driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
        }catch (Exception ex1) {
                System.out.println("ID locator");
            }
            try {
                driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
            }catch (Exception ex2){
                System.out.println("NAME locator");
            }
            try {
                driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);

            }catch (Exception ex3){
                System.out.println("CSS locator");
            }
        }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

    public void clickOnCss(String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }
    public void clickOnElement(String locator){
        try {
            driver.findElement(By.cssSelector(locator)).click();
        }catch(Exception ex1){
            try {
                driver.findElement(By.xpath(locator)).click();
            }catch(Exception ex2){
                driver.findElement(By.id(locator)).click();
            }
        }
    }

}


