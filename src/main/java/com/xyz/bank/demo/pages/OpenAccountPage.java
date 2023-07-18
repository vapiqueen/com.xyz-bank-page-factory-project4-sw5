package com.xyz.bank.demo.pages;

import com.aventstack.extentreports.Status;
import com.xyz.bank.demo.customlisteners.CustomListeners;
import com.xyz.bank.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement  openAccount;

    @CacheLookup
    @FindBy(xpath ="//select[@id='userSelect']"  )
    WebElement  CustomerName;

    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement Currency;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Process']")
    WebElement ProcessButton;

    public void clickonOpenSAccountPage(){
        clickOnElement(openAccount);
        CustomListeners.test.log(Status.PASS,"Click On Open Acoount Page Tab");
        Reporter.log("Click On Open Account Page Tab"+openAccount.toString());
    }

    public void selectCustomerName(){
        selectByVisibleTextFromDropDown(CustomerName,"Hermoine Granger");
        CustomListeners.test.log(Status.PASS,"Select Customer Name");
        Reporter.log("Select Customer Name"+CustomerName.toString());
    }

    public void selectCurrency(){
        selectByVisibleTextFromDropDown(Currency,"Pound");
        CustomListeners.test.log(Status.PASS,"Select Currency");
        Reporter.log("Select Currency"+Currency.toString());
    }

    public void clickOnProcessButton(){
        clickOnElement(ProcessButton);
        CustomListeners.test.log(Status.PASS,"Click On Process Button");
        Reporter.log("Click On Process Button "+ProcessButton.toString());
    }
    public void clickAlert(){
        acceptAlert();
        CustomListeners.test.log(Status.PASS,"Click On Alert");
        Reporter.log("Click On Alert".toString());
    }

    public void verifyAlertText (){
        String actual = getTextFromAlert();
        String expected = "Account created successfully with account Number :1016";
        Assert.assertEquals(expected,actual,"incorrect text");
        CustomListeners.test.log(Status.PASS,"Get Alert For Account Created Successfully Text");
        Reporter.log("Get Alert For Account Created Successfully Text".toString());
    }


}
