package com.ttaBank.demo;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class RegisterUserTest2 {
    Home homePage;
    Register registerPage;
    RegisterSuccess regSuccessPage;

    @BeforeMethod
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        homePage = new Home();
        homePage.clickOnOpenAccountMenu();
        registerPage = new Register();
        regSuccessPage = new RegisterSuccess();

    }

    @Test
    public void testRegisterNewUser() {
        registerPage.setFullName("AnneMarrie");
        registerPage.setEmail("annie156@gmail.com");
        registerPage.setMobile("1568749520");
        registerPage.setPassword("156lolA*");
        registerPage.setConfirmPassword("156lolA*");
        registerPage.submit();
        Assert.assertEquals(
                regSuccessPage.getProfileName(),"AnneMarrie");
        Assert.assertEquals(
                regSuccessPage.getAccountHolderName(), "AnneMarrie"
        );
    }
}
