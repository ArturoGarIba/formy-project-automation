import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/Arturo/chromeDriver2/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement rbt1 = driver.findElement(By.id("radio-button-1"));
        rbt1.click();

        WebElement rbt2 = driver.findElement(By.cssSelector("input[value='option2']"));
        rbt2.click();

        WebElement rbt3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        rbt3.click();



        driver.quit();
    }
}
