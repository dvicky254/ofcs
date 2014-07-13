package com.peacocks;

import org.openqa.selenium.WebDriver;

/**
 * Created by vikramdevarakonda on 13/07/2014.
 */
public class basePage {

    public static WebDriver driver;
    public basePage()
    {
        this(driver);
    }

    public basePage(WebDriver driver)
    {
        this.driver=driver;
    }
}
