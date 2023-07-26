package com.nopcommerce.demo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featureflie",
        glue = "com/nopcommerce/demo/cucumber",
        tags = "@Smoke",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"}
)
public class Regression {

}
