package com.in.reqres.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue = "com.in.reqres.step_definitions",
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true
)
public class ListagemRunner {
}