package cucumber.zaliczenie1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(features = "src/cucumber/features/zaliczenie1-search.feature",
            plugin = {"pretty","html:out"})
    public class Zaliczenie1SearchTest {
    }


