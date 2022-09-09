package zaliczenie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteNewAddress {
    private WebDriver driver;
    public DeleteNewAddress(WebDriver driver) {this.driver=driver;}

    public boolean isAddressDeleteSuccessConfirmed()
    {
        WebElement confirmationPanel= this.driver.findElement(By.xpath(" /html/body/main/section/div/div/section/section/div[1]/article/div[2]/a[2]"));
        String panelText=confirmationPanel.getText();
        System.out.println(panelText);
        return panelText.equals("Address successfully deleted!");
    }


}

