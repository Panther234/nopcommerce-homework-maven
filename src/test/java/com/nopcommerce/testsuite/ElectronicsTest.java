package com.nopcommerce.testsuite;

import com.nopcommerce.pages.*;
import com.nopcommerce.testbase.TestBase;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {
    HomePage homePage = new HomePage();
    CellPhonesPage cellPhonesPage = new CellPhonesPage();
    NokiaLumia1020 nokiaLumia1020 = new NokiaLumia1020();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    SignInPage signInPage = new SignInPage();
    RegisterPage registerPage = new RegisterPage();
    CheckOutPage checkOutPage = new CheckOutPage();


    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() throws InterruptedException {
        homePage.mouseHoverElectronicsLink();
        homePage.cellPhoneLinkClick();
        cellPhonesPage.textCellPhones();

    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        homePage.mouseHoverElectronicsLink();
        homePage.cellPhoneLinkClick();
        cellPhonesPage.textCellPhones();
        cellPhonesPage.clickListViewTab();
        cellPhonesPage.clickNokiaLumia();
        nokiaLumia1020.textNokiaLumia1020();
        nokiaLumia1020.thePriceText();
        nokiaLumia1020.changeQuantityTo2();
        nokiaLumia1020.clickAddToCart();
        nokiaLumia1020.textCartMessage();
        nokiaLumia1020.closeNotificationMessage();
        nokiaLumia1020.setMouseHoverToShoppingCart();
        nokiaLumia1020.setMouseHoverToGoToCart();
        shoppingCartPage.verifyTextFromShoppingCart();
        shoppingCartPage.verifyQuantityText();
        shoppingCartPage.verifyTotalText();
        shoppingCartPage.termsOfServiceClick();
        shoppingCartPage.checkOutClick();
        signInPage.verifyTextFromSignIn();
        signInPage.clickOnRegisterTab();
        registerPage.verifyRegisterText();
        registerPage.clickGenderSelector();
        registerPage.setFirstName();
        registerPage.setLastName();
        registerPage.randomEmailSelection();
        registerPage.selectNewsLetter();
        registerPage.addPassword();
        registerPage.addConfirmPassword();
        registerPage.clickRegisterButton();
        registerPage.verifyRegistrationCompleted();
        registerPage.clickContinueButton();
        shoppingCartPage.verifyTextFromShoppingCart();
        shoppingCartPage.termsOfServiceClick();
        shoppingCartPage.checkOutClick();
        checkOutPage.setCountryName();
        checkOutPage.setCityName();
        checkOutPage.setAddressLine1();
        checkOutPage.setPostalCode();
        checkOutPage.setPhoneNumber();
        checkOutPage.clickContinue();
        checkOutPage.clickOnNextDayAir();
        checkOutPage.clickOnContinueButton2();
        checkOutPage.clickOnCreditCardButton();
        checkOutPage.clickContinueButton3();
        checkOutPage.clickOnVisaCardType();
        checkOutPage.clickOnCardHolderName();
        checkOutPage.clickOnCardNumber();
        checkOutPage.clickOnExpireMonth();
        checkOutPage.clickOnExpireYear();
        checkOutPage.clickOnCardCode();
        checkOutPage.clickContinueButton4();
        checkOutPage.textOfPaymentMethod();
        checkOutPage.textOfShippingMethod();
        checkOutPage.verifyTextOfTotalAmount();
        checkOutPage.clickOnConfirmButton();
        checkOutPage.textOfThankYou();
        checkOutPage.textOfOrderMessage();
        checkOutPage.clickContinueButton5();
        checkOutPage.textOfWelcomeMessage();
        homePage.clickOnLogoutLink();
        homePage.verifyUrl();
    }
}
