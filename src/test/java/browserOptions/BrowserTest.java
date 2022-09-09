package browserOptions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
    @Test
    public void BrowserTest(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.qwant.com/");
        driver.get("https://automationpractise.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.manage().window().maximize();


    }
}
