package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",  //html report under target
                "me.jvt.cucumber.report.PrettyReports:target/cucumber", // pretty cucumber report with dependency
                "json:target/cucumber.json"},

        features = "src/test/resources/features" ,
        glue = "com/cydeo/steps",
        dryRun = false,
        tags = "@smoke"
)
public class CukesRunner {
}
