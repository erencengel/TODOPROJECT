package com.todomvc.pages;

import com.todomvc.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PolymerPage extends BasePage {

    @FindBy(css = "#new-todo")
    public WebElement box;

    @FindBy(css = ".todo-list.style-scope.td-todos>li~li>div>label")
    public WebElement secondBox;

    @FindBy(xpath = "(//button[@class='destroy style-scope td-item'])[2]")
    public WebElement exitButton;

    @FindBy(xpath = "(//label[.='Todo item'])[2]")
    public WebElement lastMohikan;



}
