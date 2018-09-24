package homePage;

import base.BeforeNAfterMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class AccessYourPolicy extends BeforeNAfterMethods {
    @Test
    public void DropDownTest(){
        Select accessYourPolicy = new Select(((FirefoxDriver) driver).findElementById("homepage_manage_select"));
        List<WebElement> accessYourPolicyOptions = accessYourPolicy.getOptions();
        for(WebElement ele: accessYourPolicyOptions){
            ele.click();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
