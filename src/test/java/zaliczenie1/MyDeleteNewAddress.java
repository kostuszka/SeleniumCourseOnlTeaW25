package zaliczenie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyDeleteNewAddress {
    private WebDriver driver;

    public MyDeleteNewAddress(WebDriver driver) {
        this.driver = driver;
    }

    public void deletingAddress() {
        WebElement deleteAddress = driver.findElement(By.xpath("//html/body/main/section/div/div/section/section/div[1]/article/div[2]/a[2]"));
        deleteAddress.click();
    }
    }





