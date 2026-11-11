package com.ttaBank.demo;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.TestApp;

public class NewUserStepDefs {
    HomeFactoryPage homePage;
    RegisterFactoryPage registerPage;
    RegisterSuccessFactoryPage regSuccessPage;


    @Given("User is in Home Page --> Register Page")
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        homePage = PageFactory.initElements(TestApp.getInstance().getDriver(), HomeFactoryPage.class);
        registerPage = homePage.setOpenAccountWebElement();
    }

    @Given("User enter full name as {string}")
    public void setFullName(String fullName) {
        registerPage.setFullName(fullName);
    }

    @And("user enter Email Address as {string}")
    public void setEmailAddress(String emailAddress) {
        registerPage.setEmail(emailAddress);
    }

    @And("user enter Mobile Number as {string}")
    public void setMobileNumber(String mobileNumber) {
        registerPage.setMobile(mobileNumber);
    }

    @And("user enter Password as {string}")
    public void setPassword(String password) {
        registerPage.setPassword(password);
    }

    @And("user enter Confirm Password as {string}")
    public void setConfirmPassword(String confirmPassword) {
        registerPage.setConfirmPassword(confirmPassword);
    }

    @When("user click on open my account")
    public void submit() {
        regSuccessPage = registerPage.submit();
    }

    @Then("profile name will display {string}")
    public void profileNameWillDisplay(String expectedName) {
        Assert.assertEquals(regSuccessPage.getProfileName(),
                expectedName, "Failed to reg new user");

    }

    /*@Then("account holder name will display {string}")
    public void navigateToNextPage(String expectedName) {

    }

    @Then("profile name will display {string}, account holder name will display {string}")
    public void profileNameWillDisplayAccountHolderNameWillDisplay(String expectedName, String expectedName1) {
        Assert.assertEquals(regSuccessPage.getAccountHolderName(),
                expectedName,"Failed to reg new user");

    }*/
}
