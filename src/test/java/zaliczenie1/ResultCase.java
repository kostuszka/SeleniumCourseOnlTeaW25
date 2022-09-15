package zaliczenie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ResultCase {
    private WebDriver driver;

    public ResultCase(WebDriver driver) {
        this.driver = driver;
    }

    public List<String> getResultsCase() {
        List<WebElement> elements = driver.findElements(By.id("quantity_wanted"));
        List<String> result = new ArrayList<>();
        for (WebElement element : elements) {
            result.add(element.getText());
        }
        return result;
    }
}