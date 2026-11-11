package com.ttaBank.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.TestApp;

public class RegisterSuccessFactoryPage {

    @FindBy(xpath = "//p[@data-testid=\"account-holder\"]")
    private WebElement profileNameWebElement;
    @FindBy(xpath = "//span[@class='bank-side-username']")
    private  WebElement accountHolderNameWebElement;

    public String getProfileName(){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath("//p[@data-testid=\"account-holder\"]"), 15);
        return profileNameWebElement.getText();
    }

    public String getAccountHolderName(){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath("//span[@class='bank-side-username']"), 15);
        return accountHolderNameWebElement.getText();
    }

}
