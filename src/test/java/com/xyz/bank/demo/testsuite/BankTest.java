package com.xyz.bank.demo.testsuite;

import com.xyz.bank.demo.customlisteners.CustomListeners;
import com.xyz.bank.demo.pages.*;
import com.xyz.bank.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListeners.class)
public class BankTest extends BaseTest {
    HomePage homePage ;

    CustomerLoginPage customerLoginPage ;

    AddCustomerPage addCustomerPage ;

    BankManagerLoginPage bankManagerLoginPage ;

    OpenAccountPage openAccountPage ;

    AccountPage accountPage ;
    CustomerPage customerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
       customerLoginPage = new CustomerLoginPage();
       addCustomerPage = new AddCustomerPage();
       bankManagerLoginPage = new BankManagerLoginPage();
       openAccountPage = new OpenAccountPage();
       accountPage = new AccountPage();
       customerPage =new CustomerPage();
    }


    @Test(groups = {"sanity", "smoke", "regression"})
    public void bankManagerShouldAddCustomerSuccessfully () {
        homePage.clickOnBankManagerLogin();
        addCustomerPage.addNewCustomer();
        addCustomerPage.enterFirstname();
        addCustomerPage.enterLastName();
        addCustomerPage.enterPostcode();
        addCustomerPage.addCustomer();

    }
    @Test (groups = { "smoke", "regression"})
    public void bankManagerShouldOpenAccountSuccessfully(){

        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.openAccount();
        openAccountPage.selectCustomerName();
        openAccountPage.selectCurrency();
        openAccountPage.clickOnProcessButton();
        openAccountPage.clickAlert();


    }

    @Test(groups = { "regression"})
    public void  customerShouldLoginAndLogoutSuceessfully(){
        customerLoginPage.clickOnCustomeLoginPage();
        openAccountPage.selectCustomerName();
        customerLoginPage.clickOnLoginButton();
        customerLoginPage.clickOnLogOutButton();
       // customerLoginPage.clickAlert();
    }

    @Test(groups = {"regression"})
    public void customerShouldDepositMoneySucessfully(){
        customerLoginPage.clickOnCustomeLoginPage();
        openAccountPage.selectCustomerName();
        customerLoginPage.clickOnLoginButton();

        accountPage.clickOnDepositTab();
        accountPage.enterAmount();
        accountPage.clickOnDeposit();
        //accountPage.clickAlertText1();

    }

    @Test(groups = {"regression"})
    public void  customerShouldWithdrawMoneySuccessfully(){
        customerLoginPage.clickOnCustomeLoginPage();
        openAccountPage.selectCustomerName();
        customerLoginPage.clickOnLoginButton();
        accountPage.clickOnWithdrawTab();
        accountPage.enterWithdrwalAmount();
        accountPage.clickOnwithdraw();


    }
}
