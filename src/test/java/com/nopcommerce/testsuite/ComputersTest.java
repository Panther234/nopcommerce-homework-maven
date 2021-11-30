package com.nopcommerce.testsuite;

import com.nopcommerce.pages.*;
import com.nopcommerce.testbase.TestBase;
import org.testng.annotations.Test;

public class ComputersTest extends TestBase {
    HomePage homePage = new HomePage();
    DeskTopPage deskTopPage = new DeskTopPage();
    ComputersPage computersPage = new ComputersPage();
    DeskTopPage addToCart = new DeskTopPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage= new BuildYourOwnComputerPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    SignInPage signInPage = new SignInPage();
    CheckOutPage checkOutPage =new CheckOutPage();

    @Test
    public void verifyUserNavigatesToComputersPage() {
        homePage.selectMenu("Computers");
        homePage.verifyComputersText();
    }

    @Test
    public void verifyUserNavigatesToElectronicsPage() {
        homePage.selectMenu("Electronics");
        homePage.verifyElectronicsText();
    }

    @Test
    public void verifyUserNavigatesToApparelPage() {
        homePage.selectMenu("Apparel");
        homePage.verifyApparelText();
    }

    @Test
    public void verifyUserNavigatesToDigitalDownloadsPage() {
        homePage.selectMenu("Digital downloads");
        homePage.verifyDigitalDownloadsText();
    }

    @Test
    public void verifyUserNavigatesToBooksPage() {
        homePage.selectMenu("Books");
        homePage.verifyBooksText();
    }

    @Test
    public void verifyUserNavigatesToJewelryPage() {
        homePage.selectMenu("Jewelry");
        homePage.verifyJewelryText();
    }

    @Test
    public void verifyUserNavigatesToGiftCardsPage() {
        homePage.selectMenu("Gift Cards");
        homePage.verifyGiftCardsText();
    }

    @Test

    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        homePage.clickOnComputersLink(); //click on computer link on homepage
        computersPage.clickOnDeskTopLink(); // click on desktop link on computer
        deskTopPage.clickOnSortByZToA(); //sort by and click on Z to A
        deskTopPage.verifyTextSortByDescending();
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homePage.clickOnComputersLink(); //click on computer link on homepage
        computersPage.clickOnDeskTopLink(); // click on desktop link on computer
        deskTopPage.clickOnSortByAToZ(); //sort by and click on A to Z
        deskTopPage.selectBuildYourComputers();//Add to cart
        buildYourOwnComputerPage.verifyTextFromElement();
        buildYourOwnComputerPage.selectProcessorFrom();
        buildYourOwnComputerPage.selectRAMFrom();
        buildYourOwnComputerPage.selectHDDFrom();
        buildYourOwnComputerPage.selectOSFrom();
        buildYourOwnComputerPage.selectSoftwareFrom();
        buildYourOwnComputerPage.verifyTextFromPrice();
        buildYourOwnComputerPage.clickOnAddToCartButton();
        buildYourOwnComputerPage.verifyTextMessagePopUpFrom();
        buildYourOwnComputerPage.setClickCloseButtonOnMessage();
        buildYourOwnComputerPage.setMouseHoverToShoppingCart();
        buildYourOwnComputerPage.setMouseHoverToGoToCart();
        shoppingCartPage.verifyTextFromShoppingCart();
        shoppingCartPage.quantityUpdateInShoppingCart();
        shoppingCartPage.updateShoppingCartClick();
        shoppingCartPage.subTotalTextClickVerify();
        shoppingCartPage.termsOfServiceClick();
        shoppingCartPage.checkOutClick();
        signInPage.verifyTextFromChekOutAsGuest();
        signInPage.clickOnCheckOutAsGuest();
        checkOutPage.setFirstName();
        checkOutPage.setLastName();
        checkOutPage.setEmailAddress();
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
        checkOutPage.clickOnCardType();
        checkOutPage.clickOnCardHolderName();
        checkOutPage.clickOnCardNumber();
        checkOutPage.clickOnExpireMonth();
        checkOutPage.clickOnExpireYear();
        checkOutPage.clickOnCardCode();
        checkOutPage.clickContinueButton4();
        checkOutPage.textOfPaymentMethod();
        checkOutPage.textOfShippingMethod();
        checkOutPage.textOfTotalAmount();
        checkOutPage.clickOnConfirmButton();
        checkOutPage.textOfThankYou();
        checkOutPage.textOfOrderMessage();
        checkOutPage.clickContinueButton5();
        checkOutPage.textOfWelcomeMessage();

    }

}
