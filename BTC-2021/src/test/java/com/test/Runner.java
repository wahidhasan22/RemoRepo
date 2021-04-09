package com.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\wahid\\eclipse-workspace\\BTC-2021"}
, tags= {"@smoke"}, glue="com.test", plugin= {"pretty","html:report"})
public class Runner {

}
