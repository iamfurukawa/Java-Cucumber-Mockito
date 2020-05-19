package com.democucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", 
				 glue = "com.democucumber.steps",
				 monochrome = true, 
				 dryRun = false)
public class UserTest {

}
