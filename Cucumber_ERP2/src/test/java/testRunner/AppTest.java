package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = {"FeatureFiles"},monochrome = true,glue = {"stepDefinations"}
,plugin= {"pretty","html:target/report/cucumber","json:target/report/cucumber.json","junit:targer/report/cucumber.xml"})
public class AppTest extends AbstractTestNGCucumberTests{

}
