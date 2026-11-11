package com.ttaBank.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.PropertyFileReader;
import utils.TestApp;

public class RegisterSuccess {
    WebDriver driver = TestApp.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();
    String profileName = prop.getProperty("RegisterSuccess", "profile.name.css");
    String accountHolder =
            prop.getProperty("RegisterSuccess", "account.holder.css");

    public String getProfileName(){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath(profileName),10);
        WebElement profileNameWebElement = driver.findElement(By.xpath(profileName));
        //By locator = By.cssSelector(prop.getProperty("RegisterSuccess", "profile.name.css"));
        return profileNameWebElement.getText();
    }
    public String getAccountHolderName(){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath(accountHolder),10);
        WebElement accountHolderNameWebElement = driver.findElement(By.xpath(accountHolder));
        return accountHolderNameWebElement.getText();
    }


}
