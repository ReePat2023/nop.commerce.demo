package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//ul[@class = 'top-menu notmobile']/li")
    List<WebElement> menuTop;
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginLink;
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;
    @FindBy(xpath = "//div[@class='header-logo']")
    WebElement nopcommerceLogo;
    @FindBy(xpath = "")
    WebElement myAccountLink;
    @FindBy(xpath = "")
    WebElement logOut;

    public void selectTopMenu(String topMenu) {

        Reporter.log("Select top menu." + topMenu + "from options" + topMenu.toString());
        CustomListeners.test.log(Status.PASS, "Select top menu." + topMenu);
        for (WebElement allMenu : menuTop) {
            if (allMenu.getText().equalsIgnoreCase(topMenu)) {
                clickOnElement(allMenu);
                break;
            }
        }
    }
    public void clickOnLoginLink(){
        Reporter.log("click On Login Link" + loginLink.toString());
        CustomListeners.test.log(Status.PASS,"click On Login Link" + loginLink);
        clickOnElement(loginLink);
    }
    public void clickOnRegisterLink(){
        Reporter.log("click On Register Link " + registerLink.toString());
        CustomListeners.test.log(Status.PASS,"click On Register Link" + registerLink);
        clickOnElement(registerLink);
    }
    public void NopcommerceLogo(){
        Reporter.log("click On NopcommerceLogo" + nopcommerceLogo.toString());
        CustomListeners.test.log(Status.PASS,"click On NopcommerceLogo" + nopcommerceLogo);
        clickOnElement(nopcommerceLogo);
    }
    public void MyAccountLink(){
        Reporter.log("click On My Account Link" + myAccountLink.toString());
        CustomListeners.test.log(Status.PASS,"click On My Account Link" + myAccountLink);
        clickOnElement(myAccountLink);
    }
    public void ClickOnLogOut(){
        Reporter.log("click On Logout Button" + logOut.toString());
        CustomListeners.test.log(Status.PASS,"click On Logout Button" + logOut);
        clickOnElement(logOut);
    }
}
