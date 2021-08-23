package com.todomvc.pages;

import com.todomvc.utilities.BrowserUtils;
import com.todomvc.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }


    public void navigateToModule(String tab, String module){
        String tabLocator = "//div[.='" + tab +"']";
        String moduleLocator = "//a[.='" + module + "']";
        WebElement tabb = Driver.get().findElement(By.xpath(tabLocator));
        WebElement modulee = Driver.get().findElement(By.xpath(moduleLocator));

        new Actions(Driver.get()).moveToElement(tabb).click(tabb).build().perform();
        BrowserUtils.waitFor(1);
        new Actions(Driver.get()).moveToElement(modulee).click(modulee).build().perform();
    }


}
