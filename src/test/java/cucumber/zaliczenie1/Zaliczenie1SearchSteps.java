package cucumber.zaliczenie1;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import zaliczenie1.*;

import java.time.Duration;

public class Zaliczenie1SearchSteps {
    private WebDriver driver;
    private AccountData1 accountData1;
    private AddAdddress addAdddress;
    private BuyTheThings buyTheThings;
    private CreateNewAddress createNewAddress;
    private LoginPage loginPage;
    private MystoreMainPage mystoreMainPage;
    private MystoreMyCreateNewAddresses mystoreMyCreateNewAddresses;

    @Given("An Url https:\\/\\/mystore-testlab.coderslab.pl\\/index.php\\/ open in browser")
    public void anUrlHttpsMystoreTestlabCoderslabPlIndexPhpOpenInBrowser()  {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        this.driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=my-account");
        this.driver.manage().window().maximize();

        this.loginPage = new LoginPage(this.driver);
        this.mystoreMainPage = new MystoreMainPage(this.driver);
    }

    @When("log in as a user")
    public void logInAsAUser() {
    }



    @And("enter Button Add New Address")
    public void enterButtonAddNewAddress() {
    }

    @And("fill in form new address")
    public void fillInFormNewAddress() {
    }

    @And("check that address is correct")
    public void checkThatAddressIsCorrect() {
    }

    @Then("quit the browse")
    public void quitTheBrowse() {
    }


   {
    }

    {
    }

    {
    }
  }









