package com.nopcommerce.demo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile",
        glue = "uk/co/library/cucumber",
        tags = "@Smoke",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"}
)
public class Smoke {

    @AfterClass
    public static void setUp() {
    }


}
