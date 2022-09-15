package zaliczenie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.naming.directory.SearchResult;


public class BuyTheThings {
    static WebDriver driver;


    public BuyTheThings(WebDriver driver) {
        this.driver = driver;
    }



    public static void clickSearchButton() {

        WebElement OurCatalogField = driver.findElement(By.name("s"));
        OurCatalogField.sendKeys("Hummingbird printed sweater");
        WebElement SearchButton=driver.findElement(By.xpath("/html/body/main/header/div[2]/div/div[1]/div[2]/div[2]/form/button"));
        SearchButton.click();
        //WebElement SweaterField= driver.findElement(By.xpath("/html/body/main/section/div/div/section/div[1]/div[2]/h1"));
        //SweaterField.click();


    }
}



