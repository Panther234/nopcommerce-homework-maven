package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {

    By verifySignInPageText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By checkOutAsGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By registerTab =  By.xpath("//button[contains(text(),'Register')]");


    public void verifyTextFromChekOutAsGuest() {
        verifyText("Welcome, Please Sign In!", verifySignInPageText, "Error, Message not displayed as expected");
    }
    public void verifyTextFromSignIn(){
        verifyText("Welcome, Please Sign In!", verifySignInPageText, "Error, Message not displayed as expected");
    }
    public void clickOnCheckOutAsGuest() {
        clickOnElement(checkOutAsGuest);
    }
    public void clickOnRegisterTab(){
        clickOnElement(registerTab);
    }

}
