package Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:/com.learnautomation.cucumber/src/main/resources/features",
		glue= {"Stepdefs"},
		plugin= {"html:target/cucumber-html-report","json:target/cucumber.json","pretty:target/cucumber-pretty.txt",
				"usage:target/cucumber-usage.json","junit:target/cucumber-results.xml"})


public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
