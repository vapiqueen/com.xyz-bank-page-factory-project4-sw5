package com.xyz.bank.demo.pages;

import com.aventstack.extentreports.Status;
import com.xyz.bank.demo.customlisteners.CustomListeners;
import com.xyz.bank.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Home']")
    WebElement mouseHoverTohomebutton;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Home']")
    WebElement mainheading;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerloginbutton;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankmanagerlogin;

    public void hoverMouseToHomeButton() {
        mouseHoverToElement(mouseHoverTohomebutton);
        CustomListeners.test.log(Status.PASS, "Mouse Hover On Home Button");
        Reporter.log("Mouse Hover On Home Button" + mouseHoverTohomebutton.toString());
    }


    public void clickOnLoginButton() {

        clickOnElement(customerloginbutton);
        CustomListeners.test.log(Status.PASS, "Click On Login Button");
        Reporter.log("Click On Login Button" + customerloginbutton.toString());
    }

    public void clickOnBankManagerLogin() {

        clickOnElement(bankmanagerlogin);
        CustomListeners.test.log(Status.PASS, "Click On Bank Manager Login");
        Reporter.log("Click on BankManager Login" + bankmanagerlogin.toString());

    }

    public String getMainHeadingText() {

        Reporter.log("Get Main Heading Text" + mainheading.toString());
        CustomListeners.test.log(Status.PASS, "Get Main Heading Text");
        return getTextFromElement(mainheading);
    }
}

