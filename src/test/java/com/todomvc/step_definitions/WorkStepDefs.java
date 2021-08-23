package com.todomvc.step_definitions;

import com.todomvc.pages.LoginPage;
import com.todomvc.pages.PolymerPage;
import com.todomvc.utilities.BrowserUtils;
import com.todomvc.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class WorkStepDefs {

    JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.get();

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        new LoginPage().currentLoginPage();
    }

    @And("the user click {string} and {string} orderly")
    public void theUserClickAndOrderly(String arg0, String arg1){
        new LoginPage().navigateToModule(arg0,arg1);
    }


    @When("send {string} İtems")
    public void sendİtems(String arg0){
        new PolymerPage().box.sendKeys(arg0+ Keys.ENTER);
        BrowserUtils.waitFor(2);
    }

    @Then("removes the second text")
    public void removesTheSecondText() {
        javascriptExecutor.executeScript("arguments[0].click();",new PolymerPage().exitButton);
    }
}
