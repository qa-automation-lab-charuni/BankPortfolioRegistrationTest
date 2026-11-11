package com.ttaBank.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestApp;

public class HomeFactoryPage {

    @FindBy(css = "[data-testid='link-register']") private WebElement openAccountWebElement;

    public RegisterFactoryPage setOpenAccountWebElement() {
        TestApp.getInstance().waitUntilNextElementAppears(By.cssSelector("[data-testid='link-register']"),
                20);
        openAccountWebElement.click();
        return PageFactory.initElements(TestApp.getInstance().getDriver(), RegisterFactoryPage.class);
    }
}
