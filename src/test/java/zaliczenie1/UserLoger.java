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
        loginInput.sendKeys (email);

        WebElement passwordInput =driver.findElement(By.name("password"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);

        WebElement signInButton = driver.findElement(By.id("submit-login"));
        signInButton.click();
    }

    public static String getLoggedUsername() {
       WebElement userName= driver.findElement(By.xpath("/html/body/main/header/nav/div/div/div[1]/div[2]/div[2]/div/a[2]/span"));
       return userName.getText();
    }
}



    // public static String getLoggedUsername() {
      //  WebElement userName = driver.findElement(By.xpath("//a[@class='account']"));
        //return userName.getText();






