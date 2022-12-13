package com.orangehrm.demo.testsuite;

import com.aventstack.extentreports.Status;
import com.orangehrm.demo.customListeners.CustomListeners;
import com.orangehrm.demo.pages.ForgotPassword;
import com.orangehrm.demo.testbase.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest {
    ForgotPassword forgotPassword;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        forgotPassword = new ForgotPassword();
    }


    @Test(groups = {"sanity","regression"})
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        forgotPassword.forgotPasswordLink();

        String expectedMessage = "Reset Password";
        Assert.assertEquals(forgotPassword.resetPasswordMessage(),expectedMessage,"no message displayed");



    }




}
