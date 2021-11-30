package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class ComputersPage extends Utility{

    By deskTopLink = By.xpath("//img[contains(@title,'Show products in category Desktops')]");
    public void clickOnDeskTopLink(){
        clickOnElement(deskTopLink);
    }
}
