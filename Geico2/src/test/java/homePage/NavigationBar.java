package homePage;

import base.BeforeNAfterMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NavigationBar extends BeforeNAfterMethods {
    @Test
    public void testNavigationBar() {

        WebElement information = ((FirefoxDriver) driver).findElementByCssSelector("ul.desktop-links > li:nth-child(2)>a");
        WebElement insurance = driver.findElement(By.cssSelector("#header-left-links > ul> li > a"));
        WebElement geicoLogo = driver.findElement(By.cssSelector("#header-middle-links > a"));
        WebElement location = driver.findElement(By.cssSelector("#header-right-links>ul>li>a>span.icon-geolocation"));
        WebElement login = driver.findElement(By.cssSelector("#header-right-links>ul>li:nth-child(2)>a"));
        WebElement searchIcon = driver.findElement(By.cssSelector("#header-right-links > ul > li:nth-child(3) > a > span"));

        Actions builder = new Actions(driver);
        builder.moveByOffset(information.getLocation().getX()+1, information.getLocation().getY()+1).click().pause(3000);
        builder.moveToElement(insurance).click().pause(3000);
        builder.moveToElement(location).click().pause(3000);
        builder.moveToElement(login).click().pause(3000);
        builder.moveToElement(searchIcon).click().pause(3000);
        builder.moveToElement(geicoLogo).click().pause(3000);

        builder.build().perform();
    }
}
