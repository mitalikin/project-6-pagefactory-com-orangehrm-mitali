package com.orangehrm.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrm.demo.customListeners.CustomListeners;
import com.orangehrm.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(name = "username")
    WebElement username;

    @CacheLookup

    @FindBy(name = "password")
    WebElement password;

    @CacheLookup

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;

    @CacheLookup

    @FindBy(xpath = "//h6[contains(@class,'header-breadcrumb-module')]")
    WebElement dashBoardMessage;




    public void usernameField(String userName) {
        Reporter.log("Sending text to Username field : " + userName.toString());
        sendTextToElement(username, userName);
        CustomListeners.test.log(Status.PASS,"Enter username " + username);
    }

    public void passwordField(String passcode) {
        Reporter.log("Sending text to Username field : " + passcode.toString());
        sendTextToElement(password, passcode);
        CustomListeners.test.log(Status.PASS,"Enter password " + password);

    }
    public void clickToLoginButton(){
        Reporter.log("clicking on login button : " + loginButton.toString());
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS,"click on login button ");
    }
    public String MessageOccur(){
        Reporter.log("Getting dashboard message : " + dashBoardMessage.toString());
        return getTextFromElement(dashBoardMessage);

    }
}

