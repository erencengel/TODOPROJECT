package com.todomvc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PolymerPage extends BasePage {

    @FindBy(css = "#new-todo")
    public WebElement box;

    @FindBy(xpath = "(//button[@class='destroy style-scope td-item'])[2]")
    public WebElement exitButton;

}
