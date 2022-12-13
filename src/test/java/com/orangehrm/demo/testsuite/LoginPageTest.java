package com.orangehrm.demo.testsuite;

import com.orangehrm.demo.customListeners.CustomListeners;
import com.orangehrm.demo.pages.LoginPage;
import com.orangehrm.demo.testbase.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {

    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
    }


    @Test (groups = {"smoke","regression"})
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        loginPage.usernameField("Admin");
        loginPage.passwordField("admin123");
        loginPage.clickToLoginButton();
        String expectedMessage = "Dashboard";
        Assert.assertEquals(loginPage.MessageOccur(),expectedMessage,"Message not Displayed");


    }
}
