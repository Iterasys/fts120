package walmart;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				dryRun = false,
				features =
							{	"src/test/resources/" },
							
				glue =		{	"walmart/" },
				
				monochrome = true,
				
				plugin	= 	{	"pretty",
								"html:target/cucumber-htmlreport",
								"json:target/cucumber-report5.json",
								"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport5.html"
							}
				)
public class Runner{
	
}