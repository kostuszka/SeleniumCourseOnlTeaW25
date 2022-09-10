package cucumber.zaliczenie1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import zaliczenie1.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import static junit.framework.TestCase.fail;

public class Zaliczenie1SearchSteps {
private WebDriver driver;
    private MystoreMainPage mystoreMainPage;
    private CreateNewAddress createNewAddress;
    private AccountData1 accountData1;
    private LoginPage loginPage;
    private AddAdddress addAdddress;
    private MystoreMyCreateNewAddresses mystoreMyCreateNewAddresses;
    private UpdateAddress updateAddress;
    private DeleteNewAddress deleteNewAddress;
    private MyDeleteNewAddress myDeleteNewAddress;
    private Object click;
 

    @Given ("An url https:\\/\\/mystore-testlab.coderslab.pl/index.php open in browser")
    public void openUrlInBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        this.driver.get(" https://mystore-testlab.coderslab.pl/index.php/");

        this.mystoreMainPage = new MystoreMainPage(this.driver);
        this.createNewAddress = new CreateNewAddress(this.driver);
    }

    @When("login to user account ")
    public void setLoginPage() {
        loginPage.fillInForm();
    }

    @And("chose create  new address")
    public void setCreateNewAddress() {
        createNewAddress.registerAddress("AccountData1");
    }
    @And("adding new address")
    public void AddAddress(){
    addAdddress(click);
    }

    private void addAdddress(Object click) {
    }

    @Then("First 3 results contain phrase <<W pustyni i w puszczy>>")
    public void firstResultsContainPhrase() {
        List<String> resultsHeaders = resultsPage.getResultsHeaders();
        String lowercaseSearchPhrase = searchPhrase.toLowerCase();
        for (int i = 0; i<4; i++) {
            String lowerCaseActualPhrase = resultsHeaders.get(i).toLowerCase();
            if(!lowerCaseActualPhrase.contains(lowercaseSearchPhrase)) {
                fail(String.format("Element sholud contain %s, but was: %s", lowercaseSearchPhrase, lowerCaseActualPhrase));
            }
        }
    }


   // @And("Save screenshot")
    public void saveScreenshot() throws IOException {
//Take screenshot (will be saved in default location) and automatically removed after test
        File tmpScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//Copy the screenshot to desired location
//Path to the location to save screenshot
//(directory for screenshots MUST exist: C:\test-evidence) e.g.:
        String currentDateTime = LocalDateTime.now().toString().replaceAll(":", "_");
        Files.copy(tmpScreenshot.toPath(), Paths.get("C:", "test-evidence", "qwant-search-"+currentDateTime+".png"));
    }

    //@And("Quit browser")
    public void quitBrowser() {
        driver.quit();
    }
}