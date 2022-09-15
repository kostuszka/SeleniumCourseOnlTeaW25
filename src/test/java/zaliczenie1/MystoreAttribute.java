package zaliczenie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MystoreAttribute {
    private WebDriver driver;

    public MystoreAttribute(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isAliasFieldsSuccessConfirmed() {
        String aliasField = driver.findElement(By.name("alias")).getAttribute("value");
        System.out.println(aliasField);
        return aliasField.equals("Mizerota");
    }

    public boolean isAddressFieldSuccessConfirmed() {
        String addressField = driver.findElement(By.name("address1")).getAttribute("value");
        System.out.println(addressField);
        return addressField.equals("Kukułek1");

    }

    public boolean isCityFieldSuccessConfirmed() {
        String cityField = driver.findElement(By.name("city")).getAttribute("value");
        System.out.println(cityField);
        return cityField.equals("Katowice");
    }

    public boolean isZipFieldSuccessConfirmed() {
        String zipField = driver.findElement(By.name("postcode")).getAttribute("value");
        System.out.println(zipField);
        return zipField.equals("4001");
    }

    public boolean isCountryFieldSuccessConfirmed() {
        String countryField = driver.findElement(By.name("id_country")).getAttribute("selected");
        System.out.println(countryField);
        return countryField.equals("United Kingdom");

    }

    public boolean isPhoneFieldSuccessConfirmed() {
        String phoneField = driver.findElement(By.name("phone")).getAttribute("value");
        System.out.println(phoneField);
        return phoneField.equals("327054754");
    }
}


//WebElement confirmationPanel = this.driver.findElement(By.name("alias"));
//String panelText = confirmationPanel.getText();
// System.out.println(panelText);
// return panelText.equals("Mizerota");
