package com.SeleniumTests;
//import com.SeleniumTests.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DocuSignAssignment extends BasePageObject {

    public DocuSignAssignment(WebDriver driver) {
        super(driver);
    }

    public static void verifyRoomsForRealEstate() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/Kaushik/WebDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        /** open main page */
        HomePageObject HomePage = new HomePageObject(driver);
        HomePage.openPage();

        /** Enter search text and Click on Search Button */
        HomePage.clickSearchButton();

        /** Landing on Search Results page and Verify No of results on SearchResults page */
        SearchResultsPageObject SearchResultsPage =new SearchResultsPageObject(driver);
        SearchResultsPage.verifyNoOfResults();

        /** Finding and Clicking on the Download and Print document link */
        SearchResultsPage.findAndClickLink();

        /** Landing on the Documents and Print link page and Verify the ThumbsUp button  */
        DownloadAndPrintDocPage DownloadAndPrint = new DownloadAndPrintDocPage(driver);
        //Thread.sleep(3000);
        DownloadAndPrint.verifyThumbsUpButton();
        driver.close();

    }
    public static void main(String args[]) throws InterruptedException {
        verifyRoomsForRealEstate();
    }
}





