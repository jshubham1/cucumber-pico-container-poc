package com.abn.ibt.cukes;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/feature-files",
    glue = "com.abn.ibt.cukes",
    plugin = {"pretty"}
)
public class RunCucumberTest{
}