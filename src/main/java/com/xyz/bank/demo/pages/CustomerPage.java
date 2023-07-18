package com.xyz.bank.demo.pages;

import com.aventstack.extentreports.Status;
import com.xyz.bank.demo.customlisteners.CustomListeners;
import com.xyz.bank.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomerPage extends Utility {
    @CacheLookup
    @FindBy(xpath ="//input[@placeholder='Search Customer']" )
    WebElement searchCustomerBox;

    public void customerSearch(){
        clickOnElement(searchCustomerBox);
        CustomListeners.test.log(Status.PASS,"Click Customer Search");
        Reporter.log("Click Customer Search"+searchCustomerBox.toString());

    }
}
