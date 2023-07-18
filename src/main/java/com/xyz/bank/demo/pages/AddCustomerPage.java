package com.xyz.bank.demo.pages;

import com.aventstack.extentreports.Status;
import com.xyz.bank.demo.customlisteners.CustomListeners;
import com.xyz.bank.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {
    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Add Customer')]" )
    WebElement addingNewCustomertab;

    @CacheLookup
    @FindBy(xpath ="//input[@placeholder='First Name']")
    WebElement firstname;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']" )
    WebElement lastname;

    @CacheLookup
    @FindBy(xpath ="//input[@placeholder='Post Code']"  )
    WebElement  postcode;

    @CacheLookup
    @FindBy(xpath ="//button[@type='submit']"  )
    WebElement addcustomerbutton;

    public void addNewCustomer(){
        clickOnElement(addingNewCustomertab);
        CustomListeners.test.log(Status.PASS,"Add New Customer");
        Reporter.log("Add New customer"+addingNewCustomertab.toString());
    }
    public void enterFirstname(){
        sendTextToElement(firstname,"Aarti");
        CustomListeners.test.log(Status.PASS,"Enter First Name");
        Reporter.log("Enter First Name"+firstname.toString());
    }

    public void enterLastName(){
        sendTextToElement(lastname,"Doshi");
        CustomListeners.test.log(Status.PASS,"Enter Last Name");
        Reporter.log("Enter Last Name"+lastname.toString());
    }

    public void enterPostcode(){
        sendTextToElement(postcode,"HA3 5SB");
        CustomListeners.test.log(Status.PASS,"Enter Postcode");
        Reporter.log("Enter Postcode"+postcode.toString());
    }

    public void addCustomer(){
        clickOnElement(addcustomerbutton);
        CustomListeners.test.log(Status.PASS,"Add Customer");
        Reporter.log("Add Customer"+addcustomerbutton.toString());
    }
}
