package com.peacocks;

import org.openqa.selenium.By;

/**
 * Created by vikramdevarakonda on 13/07/2014.
 */
public class homePage extends basePage{

public void clickHomePage()
{
    driver.findElement(By.className("signin-link")).click();

}
}
