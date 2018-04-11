package com.dlg.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="features/AccountCreation.feature",glue={"com.dlg.stepdefinitions.acceptancetests"}, plugin={"pretty","json:report.json","html:HTML_Reports" }) 
public class RunnerClass {


}