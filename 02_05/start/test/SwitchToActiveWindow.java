import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/Arturo/chromeDriver2/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newtab = driver.findElement(By.id("new-tab-button"));
        newtab.click();

        String windowHandle = driver.getWindowHandle();

        for(String handle: driver.getWindowHandles()){
            driver.switchTo().window(handle);
        }
        Thread.sleep(2000);
        driver.switchTo().window(windowHandle);
        Thread.sleep(2000);
        driver.quit();
    }
}
