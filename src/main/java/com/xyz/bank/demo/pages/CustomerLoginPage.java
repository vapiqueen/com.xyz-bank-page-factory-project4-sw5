package com.xyz.bank.demo.pages;

import com.aventstack.extentreports.Status;
import com.xyz.bank.demo.customlisteners.CustomListeners;
import com.xyz.bank.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerloginbutton;

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement labelyourname;

    @CacheLookup
    @FindBy(xpath ="//select[@id='userSelect']" )
    WebElement namedropdown;

    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Login')]" )
    WebElement loginbutton;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logoutbutton;
    public void clickOnCustomeLoginPage() {
        clickOnElement(customerloginbutton);
        CustomListeners.test.log(Status.PASS,"Click On Customer Login Page");
        Reporter.log("Click On Customer Login "+customerloginbutton.toString());
    }

    public void nameLabel() {
        mouseHoverToElement(labelyourname);
        CustomListeners.test.log(Status.PASS,"Give Name Label");
        Reporter.log("Give Name Label"+labelyourname.toString());

    }

    public void selectName() {
        selectByVisibleTextFromDropDown(namedropdown, "Harry Potter");
        CustomListeners.test.log(Status.PASS,"Select Name");
        Reporter.log("Select Name"+namedropdown.toString());
    }


    public void clickOnLoginButton() {
        clickOnElement(loginbutton);
        CustomListeners.test.log(Status.PASS,"Click On Login Button");
        Reporter.log("Click On Login Button"+loginbutton.toString());
    }

    public void clickOnLogOutButton(){
        clickOnElement(labelyourname);
        CustomListeners.test.log(Status.PASS,"Click On LogOut Button");
        Reporter.log("Click On LogOut Button"+labelyourname.toString());

    }

   // public void clickAlert() {
      //  acceptAlert();
       // CustomListeners.test.log(Status.PASS,"Click On Alert");
       // Reporter.log("Click On Alert".toString());
  //  }

    public void verifyAlertText() {
        String actual = getTextFromAlert();
        String expected = "Your Name :";
        Assert.assertEquals(expected, actual, "incorrect text");
        CustomListeners.test.log(Status.PASS,"Get Alert Text For YOUR NAME");
        Reporter.log("Get Alert Text For YOUR NAME".toString());

    }
}
