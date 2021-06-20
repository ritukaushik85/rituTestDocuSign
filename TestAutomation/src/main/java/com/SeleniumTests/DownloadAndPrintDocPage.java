package com.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;


public class DownloadAndPrintDocPage extends BasePageObject {
    public DownloadAndPrintDocPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }
    private By ThumbsButton = By.xpath("//*[@id=\"vote-up\"]");

    public void verifyThumbsUpButton() {
        System.out.println("Verifying ThumbsUp button present or not");
        waitForVisibilityOf(ThumbsButton,2000);
        boolean ThumbsUpButtonVisible = find(ThumbsButton).isDisplayed();
        if (ThumbsUpButtonVisible) {
            System.out.println("Thumbs up button is present and visible");
        } else {
            System.out.println("Thumbs up button is NOT present and visible");
        }
    }
}
