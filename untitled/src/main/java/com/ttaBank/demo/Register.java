package com.ttaBank.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.PropertyFileReader;
import utils.TestApp;

public class Register {
    WebDriver driver = TestApp.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();
    String fullNameWebElement = prop.getProperty("Register", "full.name.element");
    String emailWebElement = prop.getProperty("Register", "email.address.name");
    String mobileWebElement = prop.getProperty("Register", "phone.element");
    String passwordWebElement = prop.getProperty("Register", "password.element");
    String confirmPasswordWebElement = prop.getProperty("Register", "confirm.password.element");
    String submitWebElement = prop.getProperty("Register", "submit.button.element");

    public Register setFullName(String fullNameValue){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(fullNameWebElement),15);
        WebElement fullNameElement = driver.findElement(By.id(fullNameWebElement));
        fullNameElement.sendKeys(fullNameValue);
        return this;
    }

    public Register setEmail(String emailValue){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(emailWebElement),15);
        WebElement emailElement = driver.findElement(By.id(emailWebElement));
        emailElement.sendKeys(emailValue);
        return this;
    }

    public Register setMobile(String mobileValue){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(mobileWebElement),15);
        WebElement mobileElement = driver.findElement(By.id(mobileWebElement));
        mobileElement.sendKeys(mobileValue);
        return this;
    }

    public Register setPassword(String passwordValue){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(passwordWebElement),15);
        WebElement passwordElement = driver.findElement(By.id(passwordWebElement));
        passwordElement.sendKeys(passwordValue);
        return this;
    }

    public Register setConfirmPassword(String confirmPasswordValue){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(confirmPasswordWebElement),15);
        WebElement confirmPasswordElement = driver.findElement(By.id(confirmPasswordWebElement));
        confirmPasswordElement.sendKeys(confirmPasswordValue);
        return this;
    }

    public RegisterSuccess submit(){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(submitWebElement),18);
        WebElement submitElement = driver.findElement(By.id(submitWebElement));
        submitElement.click();
        return new RegisterSuccess();
    }
}
