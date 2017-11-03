/**
 * Created by Supriya on 9/9/2016.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","html:target/cucumber"},features= "src/test/resources",tags = {"@StatusUpdate"})
public class TestRunner {
}
