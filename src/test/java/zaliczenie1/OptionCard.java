package zaliczenie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OptionCard {
    private WebDriver driver;

    public static void click() {
    }

    public OptionCard(WebDriver driver) {
        this.driver = driver;
        WebElement AddToCard = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[2]/button"));
        AddToCard.click();


        WebElement checkoutProceededButton = driver.findElement(By.xpath(" /html/body/div[1]/div/div/div[2]/div/div[2]/div/div/a"));
        checkoutProceededButton.click();
        WebElement checkoutProceededButton1 = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div/div[2]/div[1]/div[2]/div/a"));
        checkoutProceededButton1.click();
        WebElement confirmedAddress = driver.findElement(By.name("confirm-addresses"));
        confirmedAddress.click();
        //WebElement prestaShopButton=driver.findElement(By.id("delivery_option_1"));
        //prestaShopButton.click();// because is unclickable button
        WebElement continueButton = driver.findElement(By.xpath("/html/body/section/div/section/div/div[1]/section[3]/div/div[2]/form/button"));
        continueButton.click();
        WebElement payByCheck = driver.findElement(By.id("payment-option-1"));
        payByCheck.click();
        WebElement agreeButton = driver.findElement(By.xpath("/html/body/section/div/section/div/div[1]/section[4]/div/form/ul/li/div[1]/span/input"));
        agreeButton.click();
        WebElement orderingButton = driver.findElement(By.xpath("/html/body/section/div/section/div/div[1]/section[4]/div/div[3]/div[1]/button"));
        orderingButton.click();



    }
}