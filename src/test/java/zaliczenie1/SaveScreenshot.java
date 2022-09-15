package zaliczenie1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import org.apache.commons.io.FileUtils;


public class SaveScreenshot {
    private WebDriver driver;

    public SaveScreenshot(WebDriver driver) {
        this.driver = driver;
    }

    public void savingScreenshot() throws IOException {

        File tmpScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String currentDateTime = LocalDateTime.now().toString().replaceAll(":", "_");
        FileUtils.copyFile(tmpScreenshot, new File("c:\\tmp\\screenshot"+ currentDateTime+".png"));
        //Files.copy(tmpScreenshot.toPath(), Paths.get("C:\\Users\\koste\\Desktop\\screenshot\\zakupy"  + currentDateTime+".pgn"));
    }

}

