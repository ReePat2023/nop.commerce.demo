package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class BuildYourOwnComputerPage extends Utility {
    @FindBy(id = "product_attribute_1")
    WebElement processorDropDown;
    @FindBy(id = "product_attribute_2")
    WebElement ramDropDown;
    @FindBy(id = "product_attribute_3_6")
    WebElement hdd320GB;
    @FindBy(id = "product_attribute_3_7")
    WebElement hdd400GB;
    @FindBy(id = "product_attribute_4_8")
    WebElement vistaHome;
    @FindBy(id = "product_attribute_4_8")
    WebElement vistaPremium;
    @FindBy(id = "product_attribute_input_5")
    List<WebElement> softwareSelection;
    @FindBy(id = "product_attribute_5_10")
    WebElement microsoftOffice;
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCartButton;
    @FindBy(xpath = "//div[@class='bar-notification success']/p")
    WebElement verifyProductAddedMessage;
    @FindBy(xpath = "//span[@class = 'close']")
    WebElement crossButton;

    public void selectProcessorFromDropDown(String processor) {
        Reporter.log("Select processor from drop down list." + processor + "from drop down" + processorDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Select processor from drop down list." + processor);
        selectByVisibleTextFromDropDown(processorDropDown, processor);
    }

    public void selectRamFromDropDown(String ram) {
        Reporter.log("Select ram from drop down list." + ram + "from drop down" + ramDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Select ram from drop down list." + ram);
        selectByVisibleTextFromDropDown(ramDropDown, ram);
    }
    public void selectHDDRadios(String hddRadio) {

        Reporter.log("Select HDD radio button." + hddRadio);
        CustomListeners.test.log(Status.PASS, "Select HDD radio button." + hddRadio);
        switch (hddRadio) {
            case "320 GB":
                clickOnElement(hdd320GB);
                break;
            case "400 GB [+$100.00]":
                clickOnElement(hdd400GB);
                break;
            default:
                break;
        }
    }
    public void selectOSRadioButton(String osRadio) {

        Reporter.log("Select OS radio button." + osRadio);
        CustomListeners.test.log(Status.PASS, "Select OS radio button." + osRadio);
        switch (osRadio) {
            case "Vista Home [+$50.00]":
                clickOnElement(vistaHome);
                break;
            case "Vista Premium [+$60.00]":
                clickOnElement(vistaPremium);
                break;
            default:
                break;
        }
    }
    public void selectSoftwareType(String software) {

        for (WebElement softwareType : softwareSelection) {
            if (softwareType.getText().equalsIgnoreCase(software)) {
                clickOnElement(softwareType);
                break;
            }
        }
    }
    public void selectMicrosoftOffice() {
        Reporter.log("Select microsoft office." + microsoftOffice.toString());
        CustomListeners.test.log(Status.PASS, "Select microsoft office.");
        clickOnElement(microsoftOffice);
    }
    public void clickOnAddToCartButton() {
        Reporter.log("Click on add to cart button." + addToCartButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on add to cart button.");
        clickOnElement(addToCartButton);
    }
    public String verifyProductHasBeenAddedText() {
        Reporter.log("Verify product has been added text." + verifyProductAddedMessage.toString());
        CustomListeners.test.log(Status.PASS, "Verify product has been added text.");
        return getTextFromElement(verifyProductAddedMessage);
    }

    public void closeTheBar() {
        Reporter.log("Close the bar." + crossButton.toString());
        CustomListeners.test.log(Status.PASS, "Close the bar.");
        clickOnElement(crossButton);
    }
    public void buildYourOwnComputer(String processor, String ram, String hdd, String os, String software) {

        selectProcessorFromDropDown(processor);
        selectRamFromDropDown(ram);
        selectHDDRadios(hdd);
        selectOSRadioButton(os);
        selectMicrosoftOffice();
        selectSoftwareType(software);
    }

}
