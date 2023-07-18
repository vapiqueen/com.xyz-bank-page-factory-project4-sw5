package com.xyz.bank.demo.pages;

import com.aventstack.extentreports.Status;
import com.xyz.bank.demo.customlisteners.CustomListeners;
import com.xyz.bank.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class AccountPage extends Utility {

    @CacheLookup
    @FindBy(xpath ="//button[normalize-space()='Transactions']" )
    WebElement TransactionTab;

    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Deposit')]" )
    WebElement DepositTab;

    @CacheLookup
    @FindBy(xpath ="//button[normalize-space()='Withdrawl']"  )
    WebElement  WithdrawlTab;

    @CacheLookup
    @FindBy(xpath ="//input[@placeholder='amount']" )
    WebElement AmountToBeDepositedDropDown;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement  deposit;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement AmountToBeWithdrawn;

    @CacheLookup
    @FindBy(xpath ="//button[normalize-space()='Withdraw']" )
    WebElement withdraw;


    public void clickOnTransactionTab(){
        clickOnElement(TransactionTab);
        CustomListeners.test.log(Status.PASS,"Click On Transaction Tab");
        Reporter.log("Click On Login Button"+TransactionTab.toString());

    }
    public void clickOnDepositTab(){
        clickOnElement(DepositTab);
        CustomListeners.test.log(Status.PASS,"Click On Deposit Tab");
        Reporter.log("Click on deposit tab"+DepositTab.toString());
    }

    public void clickOnWithdrawTab(){
        clickOnElement(WithdrawlTab);
        CustomListeners.test.log(Status.PASS,"Click On Withdraw Tab");
        Reporter.log("Click On Withdraw tab"+WithdrawlTab.toString());
    }
    public void enterAmount(){
        sendTextToElement(AmountToBeDepositedDropDown,"100");
        CustomListeners.test.log(Status.PASS,"Enter Amount");
        Reporter.log("Enter Deposit Amount"+AmountToBeWithdrawn.toString());
    }

    public void clickOnDeposit(){
        clickOnElement(deposit);
        CustomListeners.test.log(Status.PASS,"Click On Deposit Tab");
        Reporter.log("Click On Deposit"+deposit.toString());
    }

    public void enterWithdrwalAmount(){
        sendTextToElement(AmountToBeWithdrawn,"50");
        CustomListeners.test.log(Status.PASS,"Enter Amount for Withdraw");
        Reporter.log("Enter Withdrawal Amount"+AmountToBeWithdrawn.toString());
    }

    public void clickOnwithdraw(){
        clickOnElement(withdraw);
        CustomListeners.test.log(Status.PASS,"Click On Withdraw Tab");
        Reporter.log("Click on Withdraw Tab"+withdraw.toString());
    }
    public void clickAlert(){
        acceptAlert();
        CustomListeners.test.log(Status.PASS,"Click On Alert");
        Reporter.log("Click On Alert");
    }

    public void verifyAlertText (){
        String actual = getTextFromAlert();
        String expected = "Deposit Successful";
        Assert.assertEquals(expected,actual,"incorrect text");
        CustomListeners.test.log(Status.PASS,"Get Alert For Sucessfull Deposit");
        Reporter.log("Get Alert For Sucessfull Deposit".toString());
    }

    public void clickAlertText1(){
        String actual = getTextFromAlert();
        String expected = "Transaction successful";
        Assert.assertEquals(expected,actual,"incorrect text");
        CustomListeners.test.log(Status.PASS,"Get ALERT For Successful Transaction");
        Reporter.log("Get ALERT For Successful Transaction".toString());
    }
}
