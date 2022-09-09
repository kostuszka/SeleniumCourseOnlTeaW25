package zaliczenie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MystoreMyCreateNewAddresses {
    private WebDriver driver;

    public MystoreMyCreateNewAddresses(WebDriver driver) {this.driver=driver;}

    public boolean isAddressCreationSuccessConfirmed()
    {
    WebElement confirmationPanel= this.driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/aside/div/article/ul/li"));
    String panelText=confirmationPanel.getText();
        System.out.println(panelText);
    return panelText.equals("Address successfully added!");
    }



}


