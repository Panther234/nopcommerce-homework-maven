package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {

    By firstName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By emailAddress = By.xpath("//input[@id='BillingNewAddress_Email']");
    By countryName = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By cityName = By.xpath("//input[@id='BillingNewAddress_City']");
    By addressLine1 = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By postalCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueButton = By.xpath("(//button[@class='button-1 new-address-next-step-button'])[1]");
    By nextDayAirButton = By.id("shippingoption_1");
    By continueButton2 = By.xpath("(//button[@class='button-1 shipping-method-next-step-button'])[1]");
    By creditCardButton = By.id("paymentmethod_1");
    By continueButton3 = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By creditCardType = By.xpath("//select[@id='CreditCardType']");
    By cardHolderName = By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("//input[@id='CardNumber']");
    By expireMonth = By.xpath("//select[@id='ExpireMonth']");
    By expireYear = By.xpath("//select[@id='ExpireYear']");
    By cardCode = By.xpath("//input[@id='CardCode']");
    By continueButton4 = By.xpath("(//button[@class='button-1 payment-info-next-step-button'])[1]");
    By verifyTextOnPaymentMethod = By.xpath("//span[contains(text(),'Credit Card')]");
    By verifyTextOnShippingMethod = By.xpath("//span[contains(text(),'Next Day Air')]");
    By verifyTextOfTotalAmount = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    By confirmButton = By.xpath("//button[normalize-space()='Confirm']");
    By verifyTextOfThankYou = By.xpath("//h1[contains(text(),'Thank you')]");
    By verifyTextOfOrderMessage = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continueButton5 = By.xpath("//button[contains(text(),'Continue')]");
    By verifyTextOfWelcomeMessage = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By verifyTotalAmount = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");


    public void setFirstName() {
        sendKeysToElement(firstName, "bob");
    }
    public void setLastName() {
        sendKeysToElement(lastName, "alexa");
    }
    public void setEmailAddress() {
        sendKeysToElement(emailAddress, "abc@realestates.com");
    }
    public void setCountryName() {
        selectByVisibleTextFromDropDown(countryName, "United Kingdom");
    }
    public void setCityName() {
        sendKeysToElement(cityName, "London");
    }
    public void setAddressLine1() {
        sendKeysToElement(addressLine1, "69 Haydon Drive");
    }
    public void setPostalCode() {
        sendKeysToElement(postalCode, "HA0 2LD");
    }
    public void setPhoneNumber() {
        sendKeysToElement(phoneNumber, "+44123456789");
    }
    public void clickContinue() {
        clickOnElement(continueButton);
    }
    public void clickOnNextDayAir() {
        clickOnElement(nextDayAirButton);
    }
    public void clickOnContinueButton2() {
        clickOnElement(continueButton2);
    }
    public void clickOnCreditCardButton() {
        clickOnElement(creditCardButton);
    }
    public void clickContinueButton3() {
        clickOnElement(continueButton3);
    }
    public void clickOnCardType() {
        selectByVisibleTextFromDropDown(creditCardType, "Master card");
    }
    public void clickOnVisaCardType(){selectByVisibleTextFromDropDown(creditCardType, "Visa");}
    public void clickOnCardHolderName() {
        sendKeysToElement(cardHolderName, "bob alexa");
    }
    public void clickOnCardNumber() {
        sendKeysToElement(cardNumber, "2222 4000 7000 0005");
    }
    public void clickOnExpireMonth() {
        selectByVisibleTextFromDropDown(expireMonth, "12");
    }
    public void clickOnExpireYear() {
        selectByVisibleTextFromDropDown(expireYear, "2035");
    }
    public void clickOnCardCode() {
        sendKeysToElement(cardCode, "123");
    }
    public void clickContinueButton4() {
        clickOnElement(continueButton4);
    }
    public void textOfPaymentMethod() {
        verifyText("Credit Card", verifyTextOnPaymentMethod, "Error");
    }
    public void textOfShippingMethod() {
        verifyText("Next Day Air", verifyTextOnShippingMethod, "Error");
    }
    public void textOfTotalAmount() {
        verifyText("$2,950.00", verifyTextOfTotalAmount, "Error");
    }
    public void clickOnConfirmButton() {
        clickOnElement(confirmButton);
    }
    public void textOfThankYou() {
        verifyText("Thank you", verifyTextOfThankYou, "Error");
    }
    public void textOfOrderMessage() {verifyText("Your order has been successfully processed!", verifyTextOfOrderMessage, "Error");}
    public void clickContinueButton5() {
        clickOnElement(continueButton5);
    }
    public void textOfWelcomeMessage() {
        verifyText("Welcome to our store", verifyTextOfWelcomeMessage, "Error");
    }
    public void verifyTextOfTotalAmount() {
        verifyText("$698.00", verifyTotalAmount, "Error");
    }
}
