package zaliczenie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;

import static javax.swing.text.html.CSS.getAttribute;

public class MystoreAttribute {
    private WebDriver driver;

    public MystoreAttribute(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isAliasFieldSuccessConfirmed() {
        //String aliasField = driver.findElement(By.name("alias")).getAttribute("");
        //System.out.println(aliasField);
        //return aliasField.equals("Mizerota");

        {
            WebElement confirmationPanel = this.driver.findElement(By.name("alias"));
            String panelText = confirmationPanel.getText();
            System.out.println(panelText);
            return panelText.equals("Mizerota");

        }

    }
}