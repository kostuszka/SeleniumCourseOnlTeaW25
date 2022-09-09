package zadania;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nawigacja {
    @Test
    public void nawigacjaSearchTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        WebElement searchInputBox = driver.findElement(By.xpath("/html/body/main/header/nav/div/div/div[1]/div[2]/div[2]/div/a") );
        searchInputBox.click();
       // WebElement emailField = driver.findElement(By.name("email"));
        //emailField.sendKeys("janek
        // ");
        WebElement noAccount= driver.findElement(By.className("no-account"));
        noAccount.click();
        driver.navigate().to("https://mystore-testlab.coderslab.pl/index.php");

        //searchInputBox.sendKeys("W pustyni i w puszczy");
       // searchInputBox.submit();
        //driver.quit();
    }
}