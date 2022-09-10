package zaliczenie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdateAddress {
    private WebDriver driver;

    public UpdateAddress(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUpdate() {
        WebElement updateButton = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div[1]/article/div[2]/a[1]"));
        updateButton.click();
    }



    }


