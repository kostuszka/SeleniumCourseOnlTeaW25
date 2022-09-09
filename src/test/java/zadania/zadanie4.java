package zadania;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;


public class zadanie4 {


    @Test
    public void zadanie4SearchTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&create_account=1");
        WebElement TextElement   = driver.findElement(By.xpath("     //*[@id=\"customer-form\"]/section/div[1]/label"));
        assertEquals("Social Title", TextElement.getText());


    }
}
// WebElement TextElement = driver.findElement(By.className("header-hotel-name"));
//
//        assertEquals("Hotel Dominic Parks", TextElement.getText());