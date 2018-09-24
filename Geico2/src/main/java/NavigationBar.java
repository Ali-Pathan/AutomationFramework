import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationBar {
    public static WebDriver driver = null;
    public void clickOnNavOption(String css){
        WebElement option = driver.findElement(By.cssSelector(css));
        option.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
