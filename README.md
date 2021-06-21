# Docusign Rooms  - Selenium Automation
## About the 'Rooms for real estate' project
The purpose of this project is to automate the Docusign Support website using the Selenium automation .
Below is the navigation flow of the project:
1) Start at the DocuSign support home page: https://support.docusign.com/
2) Search for: Rooms for Real Estate
3) On the results page, perform a verification on the number of “Results found” displayed near the
4) top of the page. Verify there are ‘55’ results found.
5) Find and click on the link for ‘Download and Print Documents - DocuSign Rooms’
6) On the resulting page,verify the [thumbs up] button from the ‘Was this content helpful?’
section exists.

## Technologies/Installation
* Java SE 16.0.1
* IDE - IntelliJ Idea/ Eclipse or any other 
* Selenium webdriver - 3.141.59
* Maven -3.8.1

### Get the source code :
Clone the repository : 
git clone https://github.com/ritukaushik85/rituTestDocuSign.git

## Content - Description and Sub modules organization/flow 

The navigation/Testing through Docusign Rooms website was done using creating Page Object model architecture in Java (Selenium Webdriver). Below are the classes created:
* *DocisignAssignment class*- This class is the base execution class of the project . It contains the Main method which will run the whole project. This class calling methods of the page object classes.

* *BasePageObject Class* - This class contains all the custom  methods like ( find,type,click,waitfor etc.) which will be used in the page object classes. This class is the super class of all page object classes.

* *HomePageObject class* - This is first page object class which will launch the Docusign URL : https://support.docusign.com/ and will search for the 'Rooms for real estate' by typing in the input box and clicking on the search button.

* *SearchResultsPageObject class* - Once the HomePageObject class's methods search executes ,Search Results page opens , this class will find the 'Download and print document' link and will click on it.

* *DownloadAndPrintDocPage class* - This class will execute once the Download And PrintDocuments Page opens and will verify if the ThumbsUp button exixts or not in the ‘Was this content helpful?’ section.

## Console Output
**Below is the Console output of a *successful* run:**


Only local connections are allowed.  
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe. 
ChromeDriver was started successfully.  
Jun 20, 2021 10:03:54 PM org.openqa.selenium.remote.ProtocolHandshake createSession  
INFO: Detected dialect: W3C  
Opening page: https://support.docusign.com/en/  
Page opened!  
Enter the text - Rooms for real estate  
Clicking Search button on Home Page  
Landed on the SearchResults page  
Assertion done  
There are 57 results found for 'Rooms for real estate'  
clicking on Download and Print Document link  
Download and Print Document link clicked!!!!Landing on ThumbsUp page  
Verifying ThumbsUp button present or not  
Thumbs up button is present and visible  
Process finished with exit code 0  

## Contacts:  
*Email : ritukaushik85@gmail.com* for any quesions or concerns.
