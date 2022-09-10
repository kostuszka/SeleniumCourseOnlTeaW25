package zaliczenie1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.w3c.dom.html.HTMLInputElement;

import java.time.Duration;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class MystoreTest {
    private static WebDriver driver;


    @BeforeEach
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=my-account");
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
        //BuyTheThings buyTheThings=new BuyTheThings(driver);
        //buyTheThings.click();



        //UpdateAddress updateButton=new UpdateAddress(driver);
        //updateButton.clickUpdate();

        //MystoreAttribute mystoreAttribute =new MystoreAttribute (driver);
        //Assert.assertTrue(mystoreAttribute.isAliasFieldSuccessConfirmed());
    }



   // @Test
        public void deletingAddressTest(){

          LoginPage loginPage = new LoginPage(driver);
          loginPage.fillInForm();

          MystoreMainPage MystoreMainPage = new MystoreMainPage(driver);
          MystoreMainPage.clickSignIn();


          DeleteNewAddress  deleteNewAddress = new DeleteNewAddress(driver);
          deleteNewAddress.enterAddresses();
          MyDeleteNewAddress myDeleteNewAddress=new MyDeleteNewAddress(driver);
          myDeleteNewAddress.deletingAddress();
          Assert.assertTrue(deleteNewAddress.isAddressDeleteSuccessConfirmed());
        }

    //@Test
    public void buyingTheThingsTest() {

    }
}


