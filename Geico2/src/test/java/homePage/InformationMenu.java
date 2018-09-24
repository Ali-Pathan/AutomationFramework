package homePage;

import base.BeforeNAfterMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class InformationMenu extends BeforeNAfterMethods {
    @Test
    public void clickOnInformationMenu() {
        WebElement information = ((FirefoxDriver) driver).findElementByCssSelector("ul.desktop-links > li:nth-child(2)>a");

        Actions builder = new Actions(driver);
        builder.moveToElement(information).click();
        builder.build().perform();

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("iframe-applicationname_ModalDialog_0"));
        WebElement myAccount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"primary-navigation\"]/div[3]/ul/li[1]/a/span[2]")));
        builder.moveToElement(myAccount).click();
        builder.perform();
        driver.switchTo().defaultContent();

    }
}
