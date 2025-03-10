package StepDefPackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features= {"src\\test\\java\\Features\\reddiff.feature"}, glue="StepDefPackage")

public class ReddisRunnerTestCase   extends AbstractTestNGCucumberTests{

}
