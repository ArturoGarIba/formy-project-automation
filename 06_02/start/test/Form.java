import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ConfirmationPage;
import pages.FormPage;

import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/Arturo/chromeDriver2/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        FormPage formPage = new FormPage();
        ConfirmationPage confirmationPage = new ConfirmationPage();
        driver.get("https://formy-project.herokuapp.com/form");

        formPage.submitForm(driver);
        confirmationPage.waitForAlertBanner(driver);
        assertEquals("The form was successfully submitted!",
                confirmationPage.getAlertBannerText(driver));


        driver.quit();
    }





}
