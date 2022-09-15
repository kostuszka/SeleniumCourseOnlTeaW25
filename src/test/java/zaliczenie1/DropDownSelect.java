package zaliczenie1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {
    private WebDriver driver;

    public DropDownSelect(WebDriver driver) {
        this.driver = driver;
    }

    public void selectingThings() {
        WebElement sweater = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div[3]/div/div[1]/article[1]/div/div[1]/h2/a"));
        sweater.click();
        WebElement sweaterSize = driver.findElement(By.id("group_1"));
        Select select = new Select(sweaterSize);
        select.selectByValue("2");
        //select.selectByVisibleText("M");
        //select.selectByVisibleText("5");
        //select.selectByIndex(1);


            WebElement quantity = driver.findElement(By.id("quantity_wanted"));

            //System.out.println("Value entered: " + quantity.getAttribute("value"));
            quantity.clear();
            quantity.sendKeys("5");



        }
    }


