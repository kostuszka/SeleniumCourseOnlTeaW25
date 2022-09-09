package zaliczenie1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MystoreAuthenticationPage {
    @FindBy(name = "email")
    private WebElement emailInput;
    @FindBy(name = "SubmitCreate")
    private WebElement submitButton;
    private String email;

    public MystoreAuthenticationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void submitCreateAnAccountForm(String email) {
        this.email = email;
        emailInput.sendKeys(email);
        submitButton.click();
    }
}

