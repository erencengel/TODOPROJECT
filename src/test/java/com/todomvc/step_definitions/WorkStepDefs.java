package com.todomvc.step_definitions;

import com.todomvc.pages.LoginPage;
import com.todomvc.pages.PolymerPage;
import com.todomvc.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;

import java.security.Key;

public class WorkStepDefs {

    JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.get();

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        new LoginPage().currentLoginPage();
    }


    @And("click the javaScript")
    public void clickTheJavaScript() {
        new LoginPage().javaScriptButton.click();
    }

    @And("click the polymer")
    public void clickThePolymer() {
        new LoginPage().polymerButton.click();
    }

    @When("send Todo İtems")
    public void sendTodoİtems() throws InterruptedException {
        new PolymerPage().box.sendKeys("Todo item");
        new PolymerPage().box.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

    @Then("removes the second text")
    public void removesTheSecondText() {
        javascriptExecutor.executeScript("arguments[0].click();",new PolymerPage().exitButton);
    }

    @When("send {string} İtems")
    public void sendİtems(String arg0) throws InterruptedException {
        new PolymerPage().box.sendKeys(arg0+ Keys.ENTER);
        Thread.sleep(2000);
    }
}
