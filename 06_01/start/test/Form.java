import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/Arturo/chromeDriver2/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        WebElement first_name = driver.findElement(By.id("first-name"));
        first_name.sendKeys("Arturo");
        WebElement last_name = driver.findElement(By.id("last-name"));
        last_name.sendKeys("Garcia");
        WebElement job_title = driver.findElement(By.id("job-title"));
        job_title.sendKeys("Tester");
        WebElement rbt2 = driver.findElement(By.id("radio-button-2"));
        rbt2.click();
        WebElement checkbox_2 = driver.findElement(By.id("checkbox-2"));
        checkbox_2.click();
        driver.findElement(By.cssSelector("option[value='1']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("20/01/2023");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.xpath("//a[text()='Submit']")).click();


        driver.quit();
    }
}
