package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ShoppingCartPage extends Utility {
    By shoppingCartText = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By quantityUpdate = By.xpath("//input[contains(@id, 'itemquantity')]");
    By updateShoppingCart = By.xpath("//button[text()='Update shopping cart']");
    By subTotalText = By.className("product-subtotal");
    By termsOfService = By.id("termsofservice");
    By checkOut = By.id("checkout");
    By quantityText = By.xpath("//span[contains(text(),'(2)')]");



    public void verifyTextFromShoppingCart() {
        verifyText("Shopping cart", shoppingCartText, "Error, Message not displayed as expected");
    }
    public void quantityUpdateInShoppingCart(){
        sendKeysToElement(quantityUpdate, Keys.BACK_SPACE + "2");
    }
    public void updateShoppingCartClick(){
        clickOnElement(updateShoppingCart);
    }
    public void subTotalTextClickVerify(){
        verifyText("$2,950.00",subTotalText,"Incorrect price");
    }
    public void termsOfServiceClick(){
        clickOnElement(termsOfService);
    }
    public void checkOutClick(){
        clickOnElement(checkOut);
    }
    public void verifyQuantityText(){
        verifyText("(2)", quantityText, "Error, Message not displayed as expected");
    }
    public void verifyTotalText(){
        verifyText("$698.00",subTotalText,"Error, Message not displayed as expected");
    }



}
