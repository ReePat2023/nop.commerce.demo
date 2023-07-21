package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailfield;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordfield;
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginbtn;
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcometext;
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logout;

    public void enterEmail(String email){
        Reporter.log("Enter Email Address" + emailfield.toString());
        CustomListeners.test.log(Status.PASS, "Enter Email Address" + emailfield.toString());
        sendTextToElement(emailfield,email);
    }
    public void enterPassword(String password){
        Reporter.log("Enter Password" + passwordfield.toString());
        CustomListeners.test.log(Status.PASS, "Enter Password" + passwordfield.toString());
        sendTextToElement(passwordfield,password);
    }
    public void clickOnLoginButton(){
        Reporter.log("Click On Login Button" + passwordfield.toString());
        CustomListeners.test.log(Status.PASS, "Click On Login Button" + passwordfield.toString());
        clickOnElement(loginbtn);
    }
    public String verifyText(){
        Reporter.log("Verify Welcome Text" + welcometext.toString());
        CustomListeners.test.log(Status.PASS,"Verify Welcome Text"+welcometext.toString());
        return getTextFromElement(welcometext);
    }
    public String verifyLogoutLinkIsDisplayed() {
        Reporter.log("Verify logout link." + logout.toString());
        CustomListeners.test.log(Status.PASS, "Verify logout link.");
        return getTextFromElement(logout);
    }
    public void clickOnLogoutLink() {
        Reporter.log("Click on logout link." + logout.toString());
        CustomListeners.test.log(Status.PASS, "Click on logout link.");
        clickOnElement(logout);
    }
}
