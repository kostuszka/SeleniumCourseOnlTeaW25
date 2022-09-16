package cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import zaliczenie1.*;

import java.time.Duration;

public class TryAgainStep {

        private WebDriver driver;
        private AccountData1 accountData1;
        private BuyTheThings buyTheThings;
        private UserLoger userLoger;
        private LoginPage loginPage;
        private MystoreMainPage mystoreMainPage;
        private MystoreMyCreateNewAddresses mystoreMyCreateNewAddresses;

        private AddAdddress addAddress;

        @Given("An Url https:\\/\\/mystore-testlab.coderslab.pl\\/index.php\\/ open in browser")
        public void an_url_https_mystore_testlab_coderslab_pl_index_php_open_in_browser() {
                System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
                this.driver = new ChromeDriver();
                this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
                this.driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=my-account");
                this.driver.manage().window().maximize();

        }
        @When("log in as a user")
        public void log_in_as_a_user() {
                this.userLoger = new UserLoger(driver);
                userLoger.loginAs("nzxbskzfbgezloekqy@kvhrw.com", "Nasza123");
                Assert.assertEquals("Jan Nowak", UserLoger.getLoggedUsername());


        }
        @When("enter Button Add New Address")
        public void enter_button_add_new_address() {
                        this.addAddress = new AddAdddress(this.driver);
                        addAddress.addingAddress();

        }
        @When("First <fill in form > new address show Mizerota")
        public void first_fill_in_form_new_address_show_mizerota() {
                // Write code here that turns the phrase above into concrete actions
                throw new io.cucumber.java.PendingException();
        }
        @When("check that address is correct")
        public void check_that_address_is_correct() {
                // Write code here that turns the phrase above into concrete actions
                throw new io.cucumber.java.PendingException();
        }
        @Then("quit the browse")
        public void quit_the_browse() {
                // Write code here that turns the phrase above into concrete actions
                throw new io.cucumber.java.PendingException();
        }

    {}
}








