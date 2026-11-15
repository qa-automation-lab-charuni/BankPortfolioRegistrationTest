package com.ttaBank.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestApp;

public class RegisterFactoryPage {

    @FindBy(id = "regName")
    private WebElement fullNameWebElement;
    @FindBy(id = "regEmail")
    private WebElement emailWebElement;
    @FindBy(id = "regPhone")
    private WebElement mobileWebElement;
    @FindBy(id = "regPassword")
    private WebElement passwordWebElement;
    @FindBy(id = "regConfirm")
    private WebElement confirmPasswordWebElement;
    @FindBy(id = "regSubmit")
    private WebElement submitWebElement;

    public RegisterFactoryPage setFullName(String regName){
        //TestApp.getInstance().waitUntilNextElementAppears(By.id(fullNameWebElement),15);
        fullNameWebElement.sendKeys(regName);
        return this;
    }
    public RegisterFactoryPage setEmail(String regEmail){
        emailWebElement.sendKeys(regEmail);
        return this;
    }
    public RegisterFactoryPage setMobile(String regPhone){
        mobileWebElement.sendKeys(regPhone);
        return this;
    }
    public RegisterFactoryPage setPassword(String regPassword){
        passwordWebElement.sendKeys(regPassword);
        return this;
    }
    public RegisterFactoryPage setConfirmPassword(String regConfirm){
        confirmPasswordWebElement.sendKeys(regConfirm);
        return this;
    }
    public RegisterSuccessFactoryPage submit(){
        submitWebElement.click();
        return PageFactory.initElements(TestApp.getInstance().getDriver(), RegisterSuccessFactoryPage.class);
    }

}
