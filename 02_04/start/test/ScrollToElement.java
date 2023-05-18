import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/Arturo/chromeDriver2/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));
        actions.moveToElement(name);
        name.sendKeys("Arturo Garcia");
        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2021");

        Thread.sleep(2000);
        driver.quit();
    }
}
