package com.ttaBank.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.PropertyFileReader;
import utils.TestApp;

public class Home {
    WebDriver driver = TestApp.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();
    String openAccountWebElement = prop.getProperty("Home", "open.account.element");

    public Register clickOnOpenAccountMenu(){
        TestApp.getInstance().waitUntilNextElementAppears(By.cssSelector(openAccountWebElement), 15);
        WebElement registerMenuWebElement = driver.findElement(By.cssSelector(openAccountWebElement));
        registerMenuWebElement.click();
        return new Register();
    }
}
