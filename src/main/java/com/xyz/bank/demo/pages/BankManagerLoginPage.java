package com.xyz.bank.demo.pages;

import com.aventstack.extentreports.Status;
import com.xyz.bank.demo.customlisteners.CustomListeners;
import com.xyz.bank.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath ="//button[normalize-space()='Add Customer']" )
    WebElement addingNewCustomerPage;

    @CacheLookup
    @FindBy(xpath ="//button[normalize-space()='Open Account']" )
    WebElement openAccount;

    @CacheLookup
    @FindBy(xpath ="//button[normalize-space()='Customers']" )
    WebElement customerTab;

    public void addCustomerByManager(){
        clickOnElement(addingNewCustomerPage);
        CustomListeners.test.log(Status.PASS,"Adding New Customer");
        Reporter.log("Adding New Customer"+addingNewCustomerPage.toString());
    }

    public void openAccount(){
        clickOnElement(openAccount);
        CustomListeners.test.log(Status.PASS,"Open Account");
        Reporter.log("Enter Withdraw"+openAccount.toString());
    }

    public void customersTab(){
        clickOnElement(customerTab);
        CustomListeners.test.log(Status.PASS,"Click On CustomerTab");
        Reporter.log("Click On Customer Tab"+customerTab.toString());
    }
}
