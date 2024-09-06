package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

         features = "src/test/java/Features/Login.feature",

        glue ="StepDefinitions" , monochrome = true,
        tags = "@SignUp",
        //tags = "@SignIn",
        plugin = {"pretty", "html:target/cucumber.html" , "json:target/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class
testRunner  {

}
