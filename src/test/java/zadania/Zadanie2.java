package zadania;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Zadanie2 {
    @Test
    public void zadanie2SearchTest() {
        System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();

        driver.get("https://www.qwant.com/");
        WebElement searchInputBox=driver.findElement(By.name("q"));
        searchInputBox.sendKeys("W pustyni i w puszczy");
        searchInputBox.submit();
        //driver.quit();
    }
}