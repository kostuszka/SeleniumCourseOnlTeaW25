package zaliczenie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteNewAddress {
    private WebDriver driver;
    public DeleteNewAddress(WebDriver driver) {this.driver=driver;}

    public boolean isAddressDeleteSuccessConfirmed(String text)
    {
        WebElement confirmationPanel= this.driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/aside/div/article/ul/li"));
        String panelText=confirmationPanel.getText();
        System.out.println(panelText);
        return panelText.equals(text);
    }
        public void enterAddresses(){
        WebElement addressesButton=this.driver.findElement(By.id("addresses-link"));
        addressesButton.click();
    }
    }



