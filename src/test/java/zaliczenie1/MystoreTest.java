package zaliczenie1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageobject.QwantSearchResultsPage;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

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
    }

    @Test
    public void myAddingAddressTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillInForm();

        MystoreMainPage MystoreMainPage = new MystoreMainPage(driver);
        MystoreMainPage.clickSignIn();

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

        MystoreAttribute mystoreAttribute = new MystoreAttribute(driver);
        Assert.assertTrue(mystoreAttribute.isAliasFieldsSuccessConfirmed());
        Assert.assertTrue(mystoreAttribute.isAddressFieldSuccessConfirmed());
        Assert.assertTrue(mystoreAttribute.isCityFieldSuccessConfirmed());
        Assert.assertTrue(mystoreAttribute.isZipFieldSuccessConfirmed());
        //Assert.assertTrue(mystoreAttribute.isCountryFieldSuccessConfirmed());
        Assert.assertTrue(mystoreAttribute.isPhoneFieldSuccessConfirmed());


        //driver.quit();
    }


    @Test
    public void deletingAddressTest() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillInForm();

        MystoreMainPage MystoreMainPage = new MystoreMainPage(driver);
        MystoreMainPage.clickSignIn();


        DeleteNewAddress deleteNewAddress = new DeleteNewAddress(driver);
        deleteNewAddress.enterAddresses();
        MyDeleteNewAddress myDeleteNewAddress = new MyDeleteNewAddress(driver);
        myDeleteNewAddress.deletingAddress();
        Assert.assertTrue(deleteNewAddress.isAddressDeleteSuccessConfirmed());
    }

    @Test
    public void buyingTheThingsTest() throws IOException {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillInForm();

        MystoreMainPage MystoreMainPage = new MystoreMainPage(driver);
        MystoreMainPage.clickSignIn();

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

        driver.quit();
    }
       @AfterAll
       public void AfterAll (){
        driver.quit();
       }
       }



    //@Test
    //public void testLoginWithProperCredentials() {
       //UserLoger userLoger = new UserLoger(driver);
       // userLoger.loginAs("nzxbskzfbgezloekqy@kvhrw.com", "Nasza123");
       // Assert.assertEquals("Automated Tester", UserLoger.getLoggedUsername());
