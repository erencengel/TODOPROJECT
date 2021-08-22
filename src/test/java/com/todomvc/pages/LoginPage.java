package com.todomvc.pages;

import com.todomvc.utilities.ConfigurationReader;
import com.todomvc.utilities.Driver;

public class LoginPage extends BasePage {

    public void currentLoginPage(){
        Driver.get().get(ConfigurationReader.get("url"));
    }

}
