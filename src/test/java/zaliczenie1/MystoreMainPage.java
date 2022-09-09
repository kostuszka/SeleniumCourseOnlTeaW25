package zaliczenie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MystoreMainPage {
    private WebDriver driver;

    public MystoreMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignIn() {
        WebElement signIn = this.driver.findElement(
                By.id("submit-login")
        );
        signIn.click();
    }
}
