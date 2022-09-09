package zaliczenie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void fillInForm(){
        WebElement email= driver.findElement(By.name("email"));
        email.sendKeys("nzxbskzfbgezloekqy@kvhrw.com");
        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("Nasza123");


    }
    }

