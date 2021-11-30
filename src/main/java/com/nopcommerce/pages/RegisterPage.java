package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

import java.util.Random;

public class RegisterPage extends Utility {

    By registerText = By.xpath("//h1[contains(text(),'Register')]");
    By genderSelector = By.xpath("//input[@id='gender-male']");
    By firstName = By.xpath("//input[@id='FirstName']");
    By lastName = By.xpath("//input[@id='LastName']");
    By randomEmailAdd = By.id("Email");
    By newsLetter = By.xpath("//input[@id='Newsletter']");
    By password = By.xpath("//input[@id='Password']");
    By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    By registerButton = By.xpath("//button[@id='register-button']");
    By registrationCompleted = By.xpath("//div[contains(text(),'Your registration completed')]");
    By continueButton = By.xpath("//a[contains(text(),'Continue')]");


    public void verifyRegisterText(){
        verifyText("Register", registerText, "Error, Message not displayed as expected");
    }
    public void clickGenderSelector(){
        clickOnElement(genderSelector);
    }
    public void setFirstName(){
        sendTextToElement(firstName,"Bob");
    }
    public void setLastName(){
        sendTextToElement(lastName,"Alexa");
    }
    public void randomEmailSelection(){
        driver.findElement(randomEmailAdd).click();
        Random randomEmail = new Random();
        int randomInt = randomEmail. nextInt(1000);
        driver.findElement(randomEmailAdd).sendKeys("username"+ randomInt +"@gmail.com");
    }
    public void selectNewsLetter(){
        clickOnElement(newsLetter);
    }
    public void addPassword(){
        sendTextToElement(password,"abc123");
    }
    public void addConfirmPassword(){
        sendTextToElement(confirmPassword, "abc123");
    }
    public void clickRegisterButton(){
        clickOnElement(registerButton);
    }
    public void verifyRegistrationCompleted(){
        verifyText("Your registration completed", registrationCompleted,"Error-Registration fail");
    }
    public void clickContinueButton(){
        clickOnElement(continueButton);
    }
}




