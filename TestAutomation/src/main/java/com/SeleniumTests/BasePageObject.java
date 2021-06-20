package com.SeleniumTests;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BasePageObject {

    protected WebDriver driver;

    public BasePageObject(WebDriver driver) {
        this.driver = driver;
    }
        /** Open page with given URL */
        protected void openUrl (String url){
            driver.get(url);
        }

        /** Find element using given locator */
        protected WebElement find (By locator){
            return driver.findElement(locator);
        }

        /** Click on element with given locator when its visible */
        protected void click (By locator){
            waitForVisibilityOf(locator, 5);
            find(locator).click();
        }

        /** Type given text into element with given locator */
        protected WebDriver type (String text, By locator){
            waitForVisibilityOf(locator, 5);
            find(locator).sendKeys(text);
            return driver;
        }

        /** Checking whether the element is PRESENT or not */
        public boolean isElementPresent(By locatorKey) {
        try {
            driver.findElement(locatorKey);
            return true;
        } catch (Exception e) {
            return false; }
        }

        /** Wait for specific ExpectedCondition for the given amount of time in seconds */
        private void waitFor (ExpectedCondition < WebElement > condition, Integer timeOutInSeconds){
            timeOutInSeconds = timeOutInSeconds != null ? timeOutInSeconds : 30;
            WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
            wait.until(condition);
        }

        /** Wait for given number of seconds for element with given locator to be VISIBLE on the page */
        protected void waitForVisibilityOf (By locator, Integer...timeOutInSeconds) {
            try {
                waitFor(ExpectedConditions.visibilityOfElementLocated(locator),
                        (timeOutInSeconds.length > 0 ? timeOutInSeconds[0] : null));
            } catch (StaleElementReferenceException e) {
            }
        }

       /** Wait for given number of seconds for element with given locator to be CLICKABLE on the page */
       protected void waitForElementToBeClickable(By locator, Integer...timeOutInSeconds){
                try {
                    waitFor(ExpectedConditions.elementToBeClickable(locator),
                            (timeOutInSeconds.length > 0 ? timeOutInSeconds[0] : null));
                } catch (ElementClickInterceptedException e) {
                }
        }

}
