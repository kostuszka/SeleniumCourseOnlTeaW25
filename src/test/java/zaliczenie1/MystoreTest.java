package zaliczenie1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import java.io.IOException;
import java.time.Duration;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class MystoreTest {
    private static WebDriver driver;


    @BeforeEach
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=my-account");
        driver.manage().window().maximize();
        //LoginPage loginPage = new LoginPage(driver);
        //loginPage.fillInForm();
        //MystoreMainPage MystoreMainPage = new MystoreMainPage(driver);
        //MystoreMainPage.clickSignIn();
        UserLoger userLoger = new UserLoger(driver);
        userLoger.loginAs("nzxbskzfbgezloekqy@kvhrw.com", "Nasza123");
    }

    @Test
    public void addingAddressTest() {


        AddAdddress addAdddress = new AddAdddress(driver);
        addAdddress.addingAddress();


        CreateNewAddress createNewAddress = new CreateNewAddress(driver);
        AccountData1 accountData1 = new AccountData1()
                .setAlias("Mizerota")
                .setAddress("Kukułek1")
                .setCity("Katowice")
                .setZip("4001")
                .setCountry("United Kingdom")
                .setPhone("327054754");

        createNewAddress.registerAddress(accountData1);


        MystoreMyCreateNewAddresses myCreateNewAddresses = new MystoreMyCreateNewAddresses(driver);
        Assert.assertTrue(myCreateNewAddresses.isAddressCreationSuccessConfirmed());


        UpdateAddress updateButton = new UpdateAddress(driver);
        updateButton.clickUpdate();

        AttributeCase mystoreAttribute = new AttributeCase(driver);
        Assert.assertTrue(mystoreAttribute.isAliasFieldsSuccessConfirmed("Mizerota"));
        Assert.assertTrue(mystoreAttribute.isAddressFieldSuccessConfirmed());
        Assert.assertTrue(mystoreAttribute.isCityFieldSuccessConfirmed());
        Assert.assertTrue(mystoreAttribute.isZipFieldSuccessConfirmed());
        //Assert.assertTrue(mystoreAttribute.isCountryFieldSuccessConfirmed());
        Assert.assertTrue(mystoreAttribute.isPhoneFieldSuccessConfirmed());


        //driver.quit();
    }


    @Test
    public void deletingAddressTest() {


        DeleteNewAddress deleteNewAddress = new DeleteNewAddress(driver);
        deleteNewAddress.enterAddresses();
        MyDeleteNewAddress myDeleteNewAddress = new MyDeleteNewAddress(driver);
        myDeleteNewAddress.deletingAddress();
        Assert.assertTrue(deleteNewAddress.isAddressDeleteSuccessConfirmed("Address successfully deleted!"));
    }

    @Test
    public void buyingTheThingsTest() throws IOException {


        AddAdddress addAdddress = new AddAdddress(driver);
        addAdddress.addingAddress();

        CreateNewAddress createNewAddress = new CreateNewAddress(driver);
        AccountData1 accountData1 = new AccountData1()
                .setAlias("Mizerota")
                .setAddress("Kukułek1")
                .setCity("Katowice")
                .setZip("4001")
                .setCountry("United Kingdom")
                .setPhone("327054754");

        createNewAddress.registerAddress(accountData1);


        MystoreMyCreateNewAddresses myCreateNewAddresses = new MystoreMyCreateNewAddresses(driver);
        Assert.assertTrue(myCreateNewAddresses.isAddressCreationSuccessConfirmed());

        BuyTheThings buyTheThings = new BuyTheThings(driver);
        BuyTheThings.clickSearchButton();

        DropDownSelect dropDownSelect = new DropDownSelect(driver);
        dropDownSelect.selectingThings();

        OptionCard optionCard = new OptionCard(driver);
        OptionCard.click();

        SaveScreenshot saveScreenshot = new SaveScreenshot(driver);
        saveScreenshot.savingScreenshot();


    }

    //@AfterEach
    //public void AfterEach() {
       // driver.quit();



    @Test
    public void testLoginWithProperCredentials() {
        //UserLoger userLoger = new UserLoger(driver);
        //userLoger.loginAs("nzxbskzfbgezloekqy@kvhrw.com", "Nasza123");
        Assert.assertEquals("Jan Nowak", UserLoger.getLoggedUsername());
    }
}