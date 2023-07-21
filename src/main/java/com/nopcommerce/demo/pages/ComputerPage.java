package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computersText;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement desktopsLink;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]")
    WebElement notebooksLink;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[3]/a[1]")
    WebElement softwareLink;


    public String verifyComputersText() {
        Reporter.log("Verify computers text." + computersText.toString());
        CustomListeners.test.log(Status.PASS, "Verify computers text.");
        return getTextFromElement(computersText);
    }

    public void selectFromSublist(String subList) {

        Reporter.log("Select option from sublist." + subList + "from options");
        CustomListeners.test.log(Status.PASS, "Select option from sublist." + subList);
        switch (subList) {
            case "Desktops":
                clickOnElement(desktopsLink);
                break;
            case "Notebooks":
                clickOnElement(notebooksLink);
                break;
            case "Software":
                clickOnElement(softwareLink);
                break;
            default:
                break;
        }
    }
}