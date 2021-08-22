package com.todomvc.pages;

import com.todomvc.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy (xpath = "//div[.='JavaScript']")
    public WebElement javaScriptButton;

    @FindBy(xpath = "//a[.='Polymer']")
    public WebElement polymerButton;
}
