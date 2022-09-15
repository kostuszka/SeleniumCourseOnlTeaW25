package zaliczenie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateNewAddress {
    private WebDriver driver;

    public CreateNewAddress(WebDriver driver) {
        this.driver = driver;
    }

    public void registerAddress(AccountData1 accountData1) {
        WebElement aliasField = driver.findElement(By.name("alias"));
        aliasField.sendKeys(accountData1.getAlias());
        WebElement addressField = driver.findElement(By.name("address1"));
        addressField.sendKeys(accountData1.getAddress());
        WebElement zipField = driver.findElement(By.name("postcode"));
        zipField.sendKeys(accountData1.getZip());
        WebElement cityField = driver.findElement(By.name("city"));
        cityField.sendKeys(accountData1.getCity());
        WebElement countryField = driver.findElement(By.name("id_country"));
        countryField.sendKeys(accountData1.getCountry());
        WebElement phoneField = driver.findElement(By.name("phone"));
        phoneField.sendKeys(accountData1.getPhone());
        WebElement saveButton = this.driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/form/footer/button"));
        saveButton.click();


    }


}


