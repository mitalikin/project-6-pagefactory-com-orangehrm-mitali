package com.orangehrm.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrm.demo.customListeners.CustomListeners;
import com.orangehrm.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ForgotPassword extends Utility {

    @CacheLookup
    @FindBy(xpath = "//p[contains(@class,'-forgot-header')]")
    WebElement forgotPasswordButton;
    @CacheLookup
    @FindBy(xpath = "//h6[contains(@class,'forgot-password-title')]")
    WebElement resetPasswordText;

    public void forgotPasswordLink(){
        Reporter.log("clicking on Forgot Password button : " + forgotPasswordButton.toString());
        CustomListeners.test.log(Status.PASS,"Enter EmailId " + forgotPasswordButton);
        clickOnElement(forgotPasswordButton);

    }
    public String resetPasswordMessage(){
        Reporter.log("Getting Message : " + resetPasswordText.toString());
        CustomListeners.test.log(Status.PASS,"Enter EmailId " + resetPasswordText);
        return getTextFromElement(resetPasswordText);

    }


}
