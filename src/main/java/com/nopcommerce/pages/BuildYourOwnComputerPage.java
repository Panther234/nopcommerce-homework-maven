package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {

    By textFromElement = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By selectProcessor = By.xpath("//select[@id='product_attribute_1']");
    By selectRAM = By.xpath("//select[@id='product_attribute_2']");
    By selectHDD = By.xpath("//input[@id='product_attribute_3_7']");
    By selectOS = By.xpath("//input[@id='product_attribute_4_9']");
    By selectSoftware = By.xpath("//input[@id='product_attribute_5_12']");
    By textFromPrice = By.xpath("//span[contains(text(),'$1,475.00')]");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-1']");
    By messageVerifying = By.xpath("//p[contains(.,'The product has been added to your shopping cart')]");
    By clickCloseButton = By.xpath("//span[@title='Close']");
    By mouseHoverShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By mouseHoverGoToCart = By.xpath("//button[contains(text(),'Go to cart')]");


    public void verifyTextFromElement() {
        verifyText("Build your own computer", textFromElement, "Message not found");
    }

    public void selectProcessorFrom() {
        selectByVisibleTextFromDropDown(selectProcessor, "2.2 GHz Intel Pentium Dual-Core E2200");
    }

    public void selectRAMFrom() {
        selectByVisibleTextFromDropDown(selectRAM, "8GB [+$60.00]");
    }

    public void selectHDDFrom() {
        clickOnElement(selectHDD);
    }

    public void selectOSFrom() {
        clickOnElement(selectOS);
    }

    public void selectSoftwareFrom() {
        clickOnElement(selectSoftware);
    }

    public void verifyTextFromPrice() {
        verifyText("$1,475.00", textFromPrice, "Total does not match");
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCart);
    }

    public void verifyTextMessagePopUpFrom() {
        verifyText("The product has been added to your shopping cart", messageVerifying, "Error, Message not displayed");
    }

    public void setClickCloseButtonOnMessage() {
        clickOnElement(clickCloseButton);
    }

    public void setMouseHoverToShoppingCart() throws InterruptedException {
        mouseHoverOnly(mouseHoverShoppingCart);
    }

    public void setMouseHoverToGoToCart() throws InterruptedException {
        mouseHoverClick(mouseHoverGoToCart);
    }

}
