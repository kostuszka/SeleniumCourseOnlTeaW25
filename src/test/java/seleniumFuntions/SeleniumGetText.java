package seleniumFuntions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

public class SeleniumGetText {

    @Test
    public void GetText() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement TextElement = driver.findElement(By.className("header-hotel-name"));

        assertEquals("Hotel Dominic Parks", TextElement.getText());
    }
}