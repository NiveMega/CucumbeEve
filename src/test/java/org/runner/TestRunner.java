package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Featurefile",glue="org.executionclass",
snippets=SnippetType.CAMELCASE,monochrome=true,strict=true,dryRun=false)

public class TestRunner {

}
