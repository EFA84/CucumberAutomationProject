package runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
       features="classpath:features", 
       glue= "steps", 
       tags="@smoke2",
       dryRun=false, 
       monochrome=true, 
       plugin= {
               "pretty",
               "html:test-output"
       }
       )

public class WhiteRunner {

}
