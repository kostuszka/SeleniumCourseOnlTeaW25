package zaliczenie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BuyTheThings {
    WebDriver driver;


    public BuyTheThings(WebDriver driver) {
        this.driver = driver;
    }

    public void BuyingTheThings() {

        WebElement OurCatalogField = driver.findElement(By.name("s"));
        OurCatalogField.sendKeys("Hummingbird printed sweater");





    }


    }


