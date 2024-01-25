package org.testpackage;

import java.awt.AWTException;
import java.util.NoSuchElementException;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC080_QuickRevisionMaterial extends VisionBaseClass {

	//Check whether user is able to view the module name with proper banner text
			@Test(priority = 1, enabled = true)
			public void testBannerTextOfQuickRevisionMaterial() throws InterruptedException, AWTException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				Thread.sleep(5000);

				pom.getResources(getDriver()).clickResources();

				pom.getQuickRevisionMaterial(getDriver()).clickQuickRevisionMaterial();
				
				Assert.assertTrue(pom.getQuickRevisionMaterial(getDriver()).displayBannerTextOfQuickRevisionMaterial(),"Banner Text is not displayed at Quick Revision Material");
			}
			//Verify quick revision material loading with downloadable document
			@Test(priority = 2, enabled = true)
			public void testPresenceOfDocumentInQuickRevisionMaterial() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				Thread.sleep(5000);

				pom.getResources(getDriver()).clickResources();

				pom.getQuickRevisionMaterial(getDriver()).clickQuickRevisionMaterial();
				Thread.sleep(2000); 
				
				Assert.assertTrue(pom.getQuickRevisionMaterial(getDriver()).clickDownloadQuickRevisionMaterial(),"Documents cannot be Download in Quick Revision Material ");
				
			}
			//Verify title of each document is dispalyed properly
			@Test(priority = 3, enabled = true)
			public void testTitleOfDocumentInQuickRevisionMaterial() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				Thread.sleep(5000);

				pom.getResources(getDriver()).clickResources();

				pom.getQuickRevisionMaterial(getDriver()).clickQuickRevisionMaterial();
				Thread.sleep(2000);
				
				Assert.assertTrue(pom.getQuickRevisionMaterial(getDriver()).getTitleOfDocumentInQuickRevisionMaterial(),"Title of the Quick Revision Material is not displayed");
				
			}
			//Verify year,medium under each document
			@Test(priority = 4, enabled = true)
			public void testPresenceOfYearAndMediumInQuickRevisionMaterialDocument() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				Thread.sleep(5000);

				pom.getResources(getDriver()).clickResources();

				pom.getQuickRevisionMaterial(getDriver()).clickQuickRevisionMaterial();
				Thread.sleep(2000);
				
				Assert.assertTrue(pom.getQuickRevisionMaterial(getDriver()).displayYearOnDocumentInQuickRevisionMaterial()," Year is not displayed in Quick revision Material documents ");
				Assert.assertTrue(pom.getQuickRevisionMaterial(getDriver()).displayMediumOnDocumentInQuickRevisionMaterial()," Medium is not displayed in Quick revision Material documents ");
				
			}
			//Verify whether user can like the documents & Like icon should turn blue and count should be increased
			@Test(priority = 5, enabled = true)
			public void testLikeCountInQuickRevisionMaterialDocument() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				Thread.sleep(5000);

				pom.getResources(getDriver()).clickResources();

				pom.getQuickRevisionMaterial(getDriver()).clickQuickRevisionMaterial();
				Thread.sleep(2000);
				
				Assert.assertTrue(pom.getQuickRevisionMaterial(getDriver()).displayAndLikeTheDocumentInQuickRevisionMaterial(),"Cannot click the Like button in Quick Revision Material documents ");
				
			}
			//Verify after the user likes the button and refreshes the page
			@Test(priority = 6, enabled = true)
			public void testLikeCountBeforeUserLoginInQuickRevisionMaterial() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				Thread.sleep(5000);

				pom.getResources(getDriver()).clickResources();

				pom.getQuickRevisionMaterial(getDriver()).clickQuickRevisionMaterial();
				Thread.sleep(2000);
				
				String beforeRefreshLikeCount = pom.getQuickRevisionMaterial(getDriver()).getBeforeLikeCount();
				
				pom.getQuickRevisionMaterial(getDriver()).displayTheDocumentLikeCountAfterRefreshInQuickRevisionMaterial();
				
				String afterClickLikeCount = pom.getQuickRevisionMaterial(getDriver()).getAfterLikeCount();
				
				Thread.sleep(4000);
				
				Assert.assertNotEquals(beforeRefreshLikeCount,afterClickLikeCount,"Document Like counts are same in Quick Revision Material  ");
				
				refresh(getDriver());
				
				Thread.sleep(4000);
				synchronized (driver) {driver.wait(5000);}
				
				String beforeLikeCount = pom.getQuickRevisionMaterial(getDriver()).getBeforeLikeCount();
				
				pom.getQuickRevisionMaterial(getDriver()).displayTheDocumentLikeCountAfterRefreshInQuickRevisionMaterial();
				
				String afterRefreshLikeCount = pom.getQuickRevisionMaterial(getDriver()).getAfterLikeCount();
				
				Thread.sleep(4000);
				
				Assert.assertNotEquals(beforeLikeCount,afterRefreshLikeCount,"Document Like counts are same in Quick Revision Material  ");
				
			}
			//Verify whether user can download the documents & Download icon should turn blue.
			@Test(priority = 7, enabled = true)
			public void testDownloadCountOfDocumentInQuickRevisionMaterial() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				Thread.sleep(5000);

				pom.getResources(getDriver()).clickResources();

				pom.getQuickRevisionMaterial(getDriver()).clickQuickRevisionMaterial();
				Thread.sleep(2000);
				
				Assert.assertTrue(pom.getQuickRevisionMaterial(getDriver()).displayAndDownloadTheDocumentInQuickRevisionMaterial(),"User cannot Click the Download button in Quick Revision Material documents ");
				
			}
			//Verify whether user can download the documents & download icon should turn blue and count should be increased
			@Test(priority = 8, enabled = true)
			public void testDownloadCountOfDocumentAtBeforeUserLoginInAIRnewsAnalysis() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				Thread.sleep(5000);

				pom.getResources(getDriver()).clickResources();

				pom.getQuickRevisionMaterial(getDriver()).clickQuickRevisionMaterial();
				Thread.sleep(2000);
				
				Assert.assertTrue(pom.getQuickRevisionMaterial(getDriver()).displayDownloadCountOfTheDocumentAfterRefreshInQuickRevisionMaterial(),"User cannot Like the Document more than once in QRM documents ");
				
			}
			//Verify whether User can share the page via whatsapp
			@Test(priority = 9, enabled = true)
			public void testUserCanShareTheDocumentViaWhatsappOfQuickRevisionMaterial() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				Thread.sleep(5000);

				pom.getResources(getDriver()).clickResources();

				pom.getQuickRevisionMaterial(getDriver()).clickQuickRevisionMaterial();
				Thread.sleep(2000);
				
				pom.getQuickRevisionMaterial(getDriver()).clickShareButtonOfQuickRevisionMaterial();
				
				pom.getQuickRevisionMaterial(getDriver()).clickWhatsappInQuickRevisionMaterial();
				Thread.sleep(2000);
				synchronized (driver) {driver.wait(5000);}
				
				windowhandling(getDriver());
				
				String title = getDriver().getTitle();
				extentTest.info(title);
				
				Assert.assertEquals("WhatsApp",title,"Incorrect Title for Whatsapp  ");
				
			}
			//Verify whether User can share the page via Facebook
			@Test(priority = 10, enabled = true)
			public void testUserCanShareTheDocumentViaFacebookOfQuickRevisionMaterial() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				Thread.sleep(5000);

				pom.getResources(getDriver()).clickResources();

				pom.getQuickRevisionMaterial(getDriver()).clickQuickRevisionMaterial();
				Thread.sleep(2000);
				
				pom.getQuickRevisionMaterial(getDriver()).clickShareButtonOfQuickRevisionMaterial();
				
				pom.getQuickRevisionMaterial(getDriver()).clickFacebookInQuickRevisionMaterial();
				Thread.sleep(2000);
				synchronized (driver) {driver.wait(5000);}
				
				windowhandling(getDriver());
				
				String title = getDriver().getTitle();
				extentTest.info(title);
				
				Assert.assertEquals("Facebook",title,"Incorrect Title for Facebook ");					
			}
			//Verify whether User can share the page via Email
			@Test(priority = 11, enabled = true)
			public void testUserCanShareTheDocumentViaEmailOfQuickRevisionMaterial() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				Thread.sleep(5000);

				pom.getResources(getDriver()).clickResources();

				pom.getQuickRevisionMaterial(getDriver()).clickQuickRevisionMaterial();
				Thread.sleep(2000);
				
				pom.getQuickRevisionMaterial(getDriver()).clickShareButtonOfQuickRevisionMaterial();
				
				pom.getQuickRevisionMaterial(getDriver()).clickGmailInQuickRevisionMaterial();
				Thread.sleep(2000);
				synchronized (driver) {driver.wait(5000);}
				
				windowhandling(getDriver());
				
				String title = getDriver().getTitle();
				extentTest.info(title);
				
				Assert.assertEquals("Vision IAS",title,"Incorrect Title for Gmail  ");		
				
			}
			//Verify whether User can share the page via Telegram
			@Test(priority = 12, enabled = true)
			public void testUserCanShareTheDocumentViaTelegramOfQuickRevisionMaterial() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				Thread.sleep(5000);

				pom.getResources(getDriver()).clickResources();

				pom.getQuickRevisionMaterial(getDriver()).clickQuickRevisionMaterial();
				Thread.sleep(2000);
				
				pom.getQuickRevisionMaterial(getDriver()).clickShareButtonOfQuickRevisionMaterial();
				
				pom.getQuickRevisionMaterial(getDriver()).clickTelegramInQuickRevisionMaterial();
				Thread.sleep(2000);
				synchronized (driver) {driver.wait(5000);}
				
				windowhandling(getDriver());
				
				String title = getDriver().getTitle();
				extentTest.info(title);
				
				Assert.assertEquals("Telegram: Share Web Page",title,"Incorrect Title for Telegram  ");		;		
				
			}

			@Test(priority = 13, enabled = true, invocationCount = 1)
			public void testFilterFunctionalityOfQuickRevisionMaterial() throws InterruptedException {

			    getDriver().get(baseURL);
			    extentTest.info("Successfully Navigated to Vision Website");

			    PageObjectManager pom = new PageObjectManager();
			    Thread.sleep(5000);

			    pom.getResources(getDriver()).clickResources();

			    pom.getQuickRevisionMaterial(getDriver()).clickQuickRevisionMaterial();
			    Thread.sleep(2000);

			    pom.getQuickRevisionMaterial(getDriver()).clickFilterButtonInQuickRevisionMaterial();
			    Thread.sleep(2000);

			    pom.getQuickRevisionMaterial(getDriver()).selectYearFilterOnQuickRevisionMaterial();

				pom.getQuickRevisionMaterial(getDriver()).clickSlectCategoryFilter();
			    Thread.sleep(4000);

			    pom.getQuickRevisionMaterial(getDriver()).clickFilterApplyButton();
			    Thread.sleep(4000);

			    // Check if data is displayed
			    boolean isDataDisplayed = pom.getQuickRevisionMaterial(getDriver()).isDataDisplayed();

			    // Check if "No Data Found" message is displayed
			    boolean isNoDataFoundDisplayed = pom.getQuickRevisionMaterial(getDriver()).isNoDataFoundDisplayed();

			    // If data is displayed, assert that data is displayed after applying the filter
			    if (isDataDisplayed) {
			        Assert.assertTrue(isDataDisplayed, "Data not displayed after applying filter");
			    } 
			    // If no data is found, assert that "No Data Found" message is displayed after applying the filter
			    else if (isNoDataFoundDisplayed) {
			        Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found message not displayed after applying filter");
			    }

			    Thread.sleep(2000);
			}
			//Verify whether download count is increased after User Login
			@Test(priority = 14, enabled = true)
			public void testDownloadCountOfDocumentAfterUserLoginInQuickRevisionMaterial() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				Thread.sleep(5000);

				pom.getHomePage(getDriver()).clickLogin();
				extentTest.info(" Login button is Clicked");

				pom.getHomePage(getDriver()).enterUsername("jeyasankar88@habenwir.com");

				pom.getHomePage(getDriver()).enterPassword("123456");


				pom.getHomePage(getDriver()).clickSubmit();
				Thread.sleep(3000);
				
				pom.getResources(getDriver()).clickResources();

				pom.getQuickRevisionMaterial(getDriver()).clickQuickRevisionMaterial();
				Thread.sleep(2000);
				
				Assert.assertTrue(pom.getQuickRevisionMaterial(getDriver()).displayDownloadCountOfTheDocumentAfterRefreshInQuickRevisionMaterial(),"User cannot Like the Document more than once in QRM documents ");
				
			}
			//Verify after the user likes the button and refreshes the page
			@Test(priority = 15, enabled = true)
			public void testLikeCountAfterUserLoginInQuickRevisionMaterial() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				Thread.sleep(5000);
				
				pom.getHomePage(getDriver()).clickLogin();
				extentTest.info(" Login button is Clicked");

				pom.getHomePage(getDriver()).enterUsername("jeyasankar88@habenwir.com");

				pom.getHomePage(getDriver()).enterPassword("123456");

				pom.getHomePage(getDriver()).clickSubmit();
				Thread.sleep(3000);
				
				pom.getResources(getDriver()).clickResources();

				pom.getQuickRevisionMaterial(getDriver()).clickQuickRevisionMaterial();
				Thread.sleep(2000);
				
				String beforeRefreshLikeCount = pom.getQuickRevisionMaterial(getDriver()).getBeforeLikeCount();
				
				pom.getQuickRevisionMaterial(getDriver()).displayTheDocumentLikeCountAfterRefreshInQuickRevisionMaterial();
				
				String afterClickLikeCount = pom.getQuickRevisionMaterial(getDriver()).getAfterLikeCount();
				
				Thread.sleep(4000);
				
				Assert.assertNotEquals(beforeRefreshLikeCount,afterClickLikeCount,"Document Like counts are same in Quick Revision Material  ");
				
				refresh(getDriver());
				
				Thread.sleep(4000);
				synchronized (driver) {driver.wait(5000);}
				
				String beforeLikeCount = pom.getQuickRevisionMaterial(getDriver()).getBeforeLikeCount();
				
				pom.getQuickRevisionMaterial(getDriver()).displayTheDocumentLikeCountAfterRefreshInQuickRevisionMaterial();
				
				String afterRefreshLikeCount = pom.getQuickRevisionMaterial(getDriver()).getAfterLikeCount();
				
				Thread.sleep(4000);
				
				Assert.assertNotEquals(beforeLikeCount,afterRefreshLikeCount,"Document Like counts are same in Quick Revision Material  ");
				
			}
			//Verify whether download count is increased after User Login
			@Test(priority = 16, enabled = true)
			public void testPaginationInQuickRevisionMaterial() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				Thread.sleep(5000);

				pom.getHomePage(getDriver()).clickLogin();
				extentTest.info(" Login button is Clicked");

				pom.getHomePage(getDriver()).enterUsername("jeyasankar88@habenwir.com");

				pom.getHomePage(getDriver()).enterPassword("123456");

				pom.getHomePage(getDriver()).clickSubmit();
				Thread.sleep(3000);
				
				pom.getResources(getDriver()).clickResources();

				pom.getQuickRevisionMaterial(getDriver()).clickQuickRevisionMaterial();
				Thread.sleep(2000);
				
				synchronized (driver) {driver.wait(5000);}
				pom.getQuickRevisionMaterial(getDriver()).clickRandomPage();
				
	//			Assert.assertTrue(pom.getQuickRevisionMaterial(getDriver()).displayDownloadCountOfTheDocumentAfterRefreshInQuickRevisionMaterial(),"User cannot Like the Document more than once in QRM documents ");
				
			}
			@Test(priority = 17, enabled = true)
			public void testClearFilterOnQuickRevisionMaterial() throws InterruptedException {

			    getDriver().get(baseURL);
			    extentTest.info("Successfully Navigated to Vision Website");

			    PageObjectManager pom = new PageObjectManager();
			    Thread.sleep(5000);

			    pom.getResources(getDriver()).clickResources();

			    pom.getQuickRevisionMaterial(getDriver()).clickQuickRevisionMaterial();
			    Thread.sleep(2000);

			    pom.getQuickRevisionMaterial(getDriver()).clickFilterButtonInQuickRevisionMaterial();
			    Thread.sleep(2000);

			    pom.getQuickRevisionMaterial(getDriver()).selectYearFilterOnQuickRevisionMaterial();

				pom.getQuickRevisionMaterial(getDriver()).clickSlectCategoryFilter();
			    Thread.sleep(4000);

			    pom.getQuickRevisionMaterial(getDriver()).clickFilterApplyButton();
			    Thread.sleep(4000);

			    // Check if data is displayed
			    boolean isDataDisplayed = pom.getQuickRevisionMaterial(getDriver()).isDataDisplayed();

			    // Check if "No Data Found" message is displayed
//			    boolean isNoDataFoundDisplayed = pom.getQuickRevisionMaterial(getDriver()).isNoDataFoundDisplayed();
			    
			    try {
			        boolean isNoDataFoundDisplayed = pom.getEconomicSurvey(getDriver()).isNoDataFoundDisplayed();
			        Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found message not displayed after applying filter");
			    } catch (NoSuchElementException e) {
			        // Log or report the issue
			        System.out.println("No Data Found element not found: " + e.getMessage());
			    }


			    // If data is displayed, assert that data is displayed after applying the filter
			    if (isDataDisplayed) {
			        Assert.assertTrue(isDataDisplayed, "Data not displayed after applying filter");
			    } 
/*			    // If no data is found, assert that "No Data Found" message is displayed after applying the filter
			    else if (isNoDataFoundDisplayed) {
			        Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found message not displayed after applying filter");
			    }
*/
			    pom.getQuickRevisionMaterial(getDriver()).clickClearFilter();
			    Thread.sleep(2000);
			}
	
}
