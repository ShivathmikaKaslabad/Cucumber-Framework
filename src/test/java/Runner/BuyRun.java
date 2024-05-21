package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="test.feature",glue="StepDefinationP",
tags="tag")
public class BuyRun {

	
}
