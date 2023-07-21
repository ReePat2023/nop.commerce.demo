package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;
    @FindBy(id = "gender-male")
    WebElement genderMale;
    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement genderFemale;
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;
    @FindBy(tagName = "DateOfBirthDay")
    WebElement dateofbirthday;
    @FindBy(tagName = "DateOfBirthMonth")
    WebElement dateofmonth;
    @FindBy(tagName = "DateOfBirthYear")
    WebElement birthyear;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmpassword;
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @FindBy(id = "FirstName-error")
    WebElement firstNameError;
    @FindBy(id = "LastName-error")
    WebElement lastNameError;
    @FindBy(id = "Email-error")
    WebElement emailError;
    @FindBy(id = "Password-error")
    WebElement passwordError;
    @FindBy(id = "ConfirmPassword-error")
    WebElement confirmPasswordError;
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement verifyRegistration;
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueTab;


    public String verifyRegisterText() {
        Reporter.log("Verify register text" + registerText.toString());
        CustomListeners.test.log(Status.PASS, "Verify register text");
        return getTextFromElement(registerText);
    }
    public void selectGender(String maleOrFemale) {
        Reporter.log("Select gender." + maleOrFemale + "radio button");
        CustomListeners.test.log(Status.PASS, "Select gender." + maleOrFemale);
        switch (maleOrFemale) {
            case "Male":
                clickOnElement(genderMale);
                break;
            case "Female":
                clickOnElement(genderFemale);
                break;
            default:
                break;
        }
    }
    public void enterFirstname(String value) {
        Reporter.log("enter Firstname " + firstName.toString());
        CustomListeners.test.log(Status.PASS,"enter Firstname " + firstName);
        sendTextToElement(firstName,value);
    }
    public void enterLastname(String value) {
        Reporter.log("enter Lastname " + lastName.toString());
        CustomListeners.test.log(Status.PASS,"enter Lastname " + lastName);
        sendTextToElement(lastName,value);
    }
    public void dateOfBirthDay(String day) {
        Reporter.log("Enter day for date of birth." + day + "in day field" + dateofbirthday.toString());
        CustomListeners.test.log(Status.PASS, "Enter day for date of birth." + day);
        selectByVisibleTextFromDropDown(dateofbirthday, day);
    }

    public void dateOfBirthMonth(String month) {
        Reporter.log("Enter month for date of birth." + month + "in month field" + dateofmonth.toString());
        CustomListeners.test.log(Status.PASS, "Enter month for date of birth." + month);
        selectByVisibleTextFromDropDown(dateofmonth, month);
    }

    public void birthYear(String year) {
        Reporter.log("Enter year for date of birth." + year + "in year field" + birthyear.toString());
        CustomListeners.test.log(Status.PASS, "Enter year for date of birth." + year);
        selectByVisibleTextFromDropDown(birthyear, year);
    }
    public void enterEmail(String value) {
        Reporter.log("enter Email " + email.toString());
        CustomListeners.test.log(Status.PASS,"enter Email " + email);
        sendTextToElement(email,value);
    }
    public void enterPassword(String value) {
        Reporter.log("enter Password " + password.toString());
        CustomListeners.test.log(Status.PASS,"enter Password " + password);
        sendTextToElement(password,value);
    }
    public void enterConfirmPassword(String value) {
        Reporter.log("enter Confirm Password " + confirmpassword.toString());
        CustomListeners.test.log(Status.PASS,"enter Confirm Password " + confirmpassword);
        sendTextToElement(confirmpassword, value);
        sendTextToElement(confirmpassword,value);
    }
    public void clickOnRegisterButton() {
        Reporter.log("click On Register Button " + registerButton.toString());
        CustomListeners.test.log(Status.PASS,"click On Register Button " + registerButton);
        clickOnElement(registerButton);
    }
    public String verifyFirstNameError() {
        Reporter.log("Verify first name error" + firstNameError.toString());
        CustomListeners.test.log(Status.PASS, "Verify first name error");
        return getTextFromElement(firstNameError);
    }

    public String verifyLastNameError() {
        Reporter.log("Verify last name error" + lastNameError.toString());
        CustomListeners.test.log(Status.PASS, "Verify last name error");
        return getTextFromElement(lastNameError);
    }
    public String verifyPasswordError() {
        Reporter.log("Verify password error" + passwordError.toString());
        CustomListeners.test.log(Status.PASS, "Verify password error");
        return getTextFromElement(passwordError);
    }

    public String verifyConfirmPasswordError() {
        Reporter.log("Verify confirm password error" + confirmPasswordError.toString());
        CustomListeners.test.log(Status.PASS, "Verify confirm password error");
        return getTextFromElement(confirmPasswordError);
    }

    public String verifyEmailError() {
        Reporter.log("Verify email error" + emailError.toString());
        CustomListeners.test.log(Status.PASS, "Verify email error");
        return getTextFromElement(emailError);
    }
    public String verifyRegistrationCompleteMessage() {
        Reporter.log("Verify registration complete message" + verifyRegistration.toString());
        CustomListeners.test.log(Status.PASS, "Verify registration complete message");
        return getTextFromElement(verifyRegistration);
    }

    public void clickOnContinueTab() {
        Reporter.log("Click on continue tab" + continueTab.toString());
        CustomListeners.test.log(Status.PASS, "Click on continue tab");
        clickOnElement(continueTab);
    }
}
