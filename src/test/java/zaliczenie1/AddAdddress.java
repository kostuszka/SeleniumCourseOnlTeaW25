package zaliczenie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddAdddress {
    private WebDriver driver;

    public AddAdddress(WebDriver driver) {
        this.driver = driver;
    }

    public void addingAddress() {
        WebElement addAddress = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/a[2]/span"));
        addAddress.click();
    }


    }