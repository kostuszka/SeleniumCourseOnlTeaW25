package zadania;

import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Zadanie3 {


    @Test
    public void zadanie3SearchTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();



                driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
                WebElement firstName = driver.findElement(By.id("first-name"));
                firstName.sendKeys("Karol");


                WebElement lastName = driver.findElement(By.id("last-name"));
                lastName.sendKeys("Kowalski");

                WebElement address = driver.findElement(By.id("address"));
                address.sendKeys(": Prosta 21");


                WebElement password = driver.findElement(By.id("password"));
                password.sendKeys("Pass123");


                WebElement email = driver.findElement(By.id("email"));
                email.sendKeys("karol.kowalski@mailinator.com");

                WebElement genderMale = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[3]/div/div/label[1]"));
                genderMale.click();

                WebElement companyField = driver.findElement(By.id("company"));
                companyField.sendKeys("Coders Lab");


                WebElement comment = driver.findElement(By.id("comment"));
                comment.sendKeys(" To jest mój pierwszy automat testowy");

                WebElement dateOfBirth = driver.findElement(By.id("dob"));
                dateOfBirth.sendKeys("5/22/2010");

                WebElement submitButton = driver.findElement(By.id("submit"));
                submitButton.click();
            }
        }










