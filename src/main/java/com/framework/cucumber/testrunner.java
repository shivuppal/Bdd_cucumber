package com.framework.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources"},
glue={"stepdefination"},
tags={"@tag1"}
)
public class testrunner 
{

}
