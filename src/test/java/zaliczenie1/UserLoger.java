package zaliczenie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserLoger {

    static WebDriver driver;

    public UserLoger(WebDriver driver) {
        UserLoger.driver = driver;
    }

    public static void loginAs(String email, String password) {
        WebElement loginInput = driver.findElement(By.name("email"));
        loginInput.click();
        loginInput.clear();
        loginInput.sendKeys("nzxbskzfbgezloekqy@kvhrw.com");

        driver.findElement(By.name("password"));
        loginInput.click();
        loginInput.clear();
        loginInput.sendKeys("Nasza123");

        WebElement signInButton = driver.findElement(By.id("submit-login"));
        signInButton.click();
    }

    public static String getLoggedUsername() {
        return null;
    }
}



    // public static String getLoggedUsername() {
      //  WebElement userName = driver.findElement(By.xpath("//a[@class='account']"));
        //return userName.getText();






