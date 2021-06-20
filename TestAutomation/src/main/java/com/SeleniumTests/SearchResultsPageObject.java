package com.SeleniumTests;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;


public class SearchResultsPageObject extends BasePageObject {

    private WebDriver driver;

    private By waiting = By.id("filter-topics");
    private By ResultsLabel = By.id("inbenta-total-results");
    private By DownloadAndPrintLink = By.xpath("//*[@id=\"results\"]/div[23]/div[1]/a/span");
    private By MoreButton = By.id("show-more-button");

    //
    public SearchResultsPageObject(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }

    /**
     * Verify the number of results found on the search page
     */
    public void verifyNoOfResults() {
        System.out.println("Landed on the SearchResults page");
        waitForVisibilityOf(waiting, 2000);

        String ActualNoOfResultsText = find(ResultsLabel).getText();
        String words[] = ActualNoOfResultsText.split("\\s");

        SoftAssert softAssert = new SoftAssert();
        String ExpectedText= "55 Results found for 'Rooms for real estate'";
        softAssert.assertEquals(ExpectedText, ActualNoOfResultsText);
        softAssert.assertTrue(true);
        //softAssert.assertAll();
        System.out.println("Asserion done");
        System.out.println("There are " + words[0] + " results found for 'Rooms for real estate'");

    }
    //        if (ActualNoOfResultsText.contains("55")) {
//            System.out.println("There are 55 results found for 'Rooms for real estate'");
//        } else {
//            System.out.println("There are " + words[0] + " results found for 'Rooms for real estate'");
//        }



        /**we can use Assertion here like the below :
         * Assertion softAssert = new SoftAssert();
         String ExpectedText= "55 Results found for 'Rooms for real estate'";
         softAssert.assetEquals(ExpectedText, NoOfResultsText);
        System.out.println("Assetrion --------------"); */


    /** Find and click on the 'Download and Print Documents' link and land on the Download_and_Print_Document_Page */

    public DownloadAndPrintDocPage findAndClickLink() throws InterruptedException {
        for (int i = 0; i < 20; i++) {
           boolean LinkPresent=isElementPresent(DownloadAndPrintLink);
            if(LinkPresent){
                    System.out.println("clicking on Download and Print Document link");
                    click(DownloadAndPrintLink);
                    System.out.println("Download and Print Document link clciked!!!!Landing on ThumbsUp page");
                    break;
            }else {
                click(MoreButton);
                Thread.sleep(2000);     /** ---------Please read the note at the end of the program */
            }
        }
        return new DownloadAndPrintDocPage(driver);
        }

    }

   /** Three ways I tried to use Explicit wait for successful click operation but
    * all of these did not work and then I had to use the Thread.sleep();*/

//    1) created method "waitForVisibilityOf(MoreButton, 5000)" and called here ; was still trowing NoSuchElementfoundException
//    2) when it was throwing ElementClickInterceptedException: I created "waitForElementToBeClickable(MoreButton, 5000);" and called here;
//    3) JavascriptExecutor executor = (JavascriptExecutor)driver;
//       executor.executeScript("arguments[0].click();", MoreButton);



//        if (NoOfResultsText.contains("55")) {
//            System.out.println("There are 55 results found for 'Rooms for real estate'");
//        } else {
//            String words[] = NoOfResultsText.split("\\s");
//            System.out.println("There are " + words[0] + " results found for 'Rooms for real estate'");
//        }
//    }

