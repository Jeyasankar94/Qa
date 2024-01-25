package org.testpackage;

import java.awt.AWTException;
import java.util.NoSuchElementException;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC130_NewsTodayEnglish extends VisionBaseClass {

	// Check whether user is able to view the module name with proper banner text
	@Test(priority = 1, enabled = true)
	public void testBannerTextOfNewsTodayEnglish() throws InterruptedException, AWTException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		Assert.assertTrue(pom.getResources(getDriver()).displayCurrentAffairsBannerText(),
				"Banner Text is not displayed at Current Affairs Page");

		pom.getNewsTodayEnglish(getDriver()).clickNewsTodayEnglish();

		Assert.assertTrue(pom.getNewsTodayEnglish(getDriver()).displayBannerTextOfNewsTodayEnglish(),
				"Banner Text is not displayed at News Today English");
	}

	// Verify News Today English loading with downloadable document
	@Test(priority = 2, enabled = true)
	public void testPresenceOfDocumentInNewsTodayEnglish() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayEnglish(getDriver()).clickNewsTodayEnglish();

		Assert.assertTrue(pom.getNewsTodayEnglish(getDriver()).clickDownloadRandomnlyOnNewsTodayEnglish(),
				"Documents cannot be Download in News Today English");

	}

	// Verify title of each document is dispalyed properly
	@Test(priority = 3, enabled = true)
	public void testTitleOfDocumentInNewsTodayEnglish() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayEnglish(getDriver()).clickNewsTodayEnglish();

		Assert.assertTrue(pom.getNewsTodayEnglish(getDriver()).getTitleOfDocumentInNewsTodayEnglish(),
				"Title of the News Today English is not displayed");

	}

	// Verify year,medium under each document
	@Test(priority = 4, enabled = true)
	public void testPresenceOfYearAndMediumInNewsTodayEnglishDocument() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayEnglish(getDriver()).clickNewsTodayEnglish();

		Assert.assertTrue(pom.getNewsTodayEnglish(getDriver()).displayYearOnDocumentInNewsTodayEnglish(),
				" Year is not displayed in News Today English documents ");
		Assert.assertTrue(pom.getNewsTodayEnglish(getDriver()).displayMediumOnDocumentInNewsTodayEnglish(),
				" Medium is not displayed in News Today English documents ");

	}

	// Verify whether user can like the documents & Like icon should turn blue and
	// count should be increased
	@Test(priority = 5, enabled = true)
	public void testLikeCountInNewsTodayEnglishDocument() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayEnglish(getDriver()).clickNewsTodayEnglish();

		Assert.assertTrue(pom.getNewsTodayEnglish(getDriver()).displayAndLikeTheDocumentInNewsTodayEnglish(),
				"Cannot click the Like button in News Today English documents ");

	}

	// Verify whether user can Like the documents & like icon should turn blue and
	// count should be increased
	@Test(priority = 6, enabled = true)
	public void testLikeCountOfDocumentAtBeforeUserLoginInNewsTodayEnglish() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayEnglish(getDriver()).clickNewsTodayEnglish();

		Assert.assertTrue(
				pom.getNewsTodayEnglish(getDriver()).displayLikeCountOfTheDocumentAfterRefreshInNewsTodayEnglish(),
				"User cannot Like the Document more than once in News Today English documents ");

	}

	// Verify after the user likes the button and refreshes the page (Static Method)
	@Test(priority = 7, enabled = true)
	public void testLikeCountBeforeUserLoginInNewsTodayEnglish() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayEnglish(getDriver()).clickNewsTodayEnglish();

		String beforeRefreshLikeCount = pom.getNewsTodayEnglish(getDriver()).getBeforeLikeCount();
		extentTest.info(beforeRefreshLikeCount);

		pom.getNewsTodayEnglish(getDriver()).clickLikeOnNewsTodayEnglish();
		Thread.sleep(2000);
		String afterClickLikeCount = pom.getNewsTodayEnglish(getDriver()).getAfterLikeCount();
		extentTest.info(afterClickLikeCount);

		Assert.assertNotEquals(beforeRefreshLikeCount, afterClickLikeCount,
				"Document Like counts are same in News Today English");

		refresh(getDriver());

		String beforeLikeCount = pom.getNewsTodayEnglish(getDriver()).getBeforeLikeCount();
		extentTest.info(beforeLikeCount);
		pom.getNewsTodayEnglish(getDriver()).clickLikeOnNewsTodayEnglish();
		Thread.sleep(2000);
		String afterRefreshLikeCount = pom.getNewsTodayEnglish(getDriver()).getAfterLikeCount();
		extentTest.info(afterRefreshLikeCount);

		Assert.assertNotEquals(beforeLikeCount, afterRefreshLikeCount,
				"Document Like counts are same in  News Today English  ");
	}

	// Verify whether user can download the documents & download icon should turn
	// blue and count should be increased
	@Test(priority = 8, enabled = true)
	public void testDownloadCountOfDocumentBeforeUserLoginInNewsTodayEnglish() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayEnglish(getDriver()).clickNewsTodayEnglish();

		pom.getNewsTodayEnglish(getDriver()).clickbackNewsTodayEnglish();

		pom.getNewsTodayEnglish(getDriver()).clickAnyOneOfTheMonthOnNewsTodayEnglish();

		Assert.assertTrue(
				pom.getNewsTodayEnglish(getDriver()).displayDownloadCountOfTheDocumentAfterRefreshInNewsTodayEnglish(),
				"User cannot Download more than once in News Today English documents ");

	}

	// To share the page link to Whatsapp
	@Test(priority = 9, invocationCount = 1, enabled = true)
	public void testUserCanShareThePageLinkViaWhatsappOfNewsTodayEnglish() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayEnglish(getDriver()).clickNewsTodayEnglish();

		pom.getNewsTodayEnglish(getDriver()).clickbackNewsTodayEnglish();

		pom.getNewsTodayEnglish(getDriver()).clickAnyOneOfTheMonthOnNewsTodayEnglish();

		pom.getNewsTodayEnglish(getDriver()).clickShare();

		pom.getNewsTodayEnglish(getDriver()).clickWhatsapp();

		windowhandling(getDriver());

		String title = getDriver().getTitle();
		extentTest.info(title);

		Assert.assertEquals("WhatsApp", title, "Incorrect Title for Whatsapp  ");

	}

	// To share the page link to Facebook
	@Test(priority = 10, invocationCount = 1, enabled = true)
	public void testUserCanShareThePageLinkViaFacebookOfNewsTodayEnglish() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayEnglish(getDriver()).clickNewsTodayEnglish();

		pom.getNewsTodayEnglish(getDriver()).clickbackNewsTodayEnglish();

		pom.getNewsTodayEnglish(getDriver()).clickAnyOneOfTheMonthOnNewsTodayEnglish();

		pom.getNewsTodayEnglish(getDriver()).clickShare();

		pom.getNewsTodayEnglish(getDriver()).clickFacebook();

		windowhandling(getDriver());

		String title = getDriver().getTitle();
		extentTest.info(title);

		Assert.assertEquals("Facebook", title, "Incorrect Title for Facebook ");

	}

	// To share the page link to Gmail
	@Test(priority = 11, invocationCount = 1, enabled = true)
	public void testUserCanShareThePageLinkViaGmailOfNewsTodayEnglish() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayEnglish(getDriver()).clickNewsTodayEnglish();

		pom.getNewsTodayEnglish(getDriver()).clickbackNewsTodayEnglish();

		pom.getNewsTodayEnglish(getDriver()).clickAnyOneOfTheMonthOnNewsTodayEnglish();

		pom.getNewsTodayEnglish(getDriver()).clickShare();

		pom.getNewsTodayEnglish(getDriver()).clickGmail();

		windowhandling(getDriver());

		String title = getDriver().getTitle();
		extentTest.info(title);

		Assert.assertEquals("Vision IAS", title, "Incorrect Title for Gmail  ");

	}

	// To share the page link to Telegram
	@Test(priority = 12, invocationCount = 1, enabled = true)
	public void testUserCanShareThePageLinkViaTelegramOfNewsTodayEnglish() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayEnglish(getDriver()).clickNewsTodayEnglish();

		pom.getNewsTodayEnglish(getDriver()).clickbackNewsTodayEnglish();

		pom.getNewsTodayEnglish(getDriver()).clickAnyOneOfTheMonthOnNewsTodayEnglish();

		pom.getNewsTodayEnglish(getDriver()).clickShare();

		pom.getNewsTodayEnglish(getDriver()).clickTelegram();

		windowhandling(getDriver());

		String title = getDriver().getTitle();
		extentTest.info(title);

		Assert.assertEquals("Telegram: Share Web Page", title, "Incorrect Title for Telegram  ");
		;

	}

	@Test(priority = 13, invocationCount = 1, enabled = true) // , invocationTimeOut = 10000 threadPoolSize = 2,
	public void testFilterFunctionalityOfNewsTodayEnglish() throws InterruptedException, AWTException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayEnglish(getDriver()).clickNewsTodayEnglish();

		pom.getNewsTodayEnglish(getDriver()).clickbackNewsTodayEnglish();

		pom.getNewsTodayEnglish(getDriver()).clickFilter();

		pom.getNewsTodayEnglish(getDriver()).clickSelectYear();

		pom.getNewsTodayEnglish(getDriver()).clickApplyFilter();

		// Check if data is displayed
		boolean isDataDisplayed = pom.getNewsTodayEnglish(getDriver()).isDataDisplayed();

		// If data is displayed, assert that data is displayed after applying the filter
		if (isDataDisplayed) {
			Assert.assertTrue(isDataDisplayed, "Data not displayed after applying filter");
			Assert.assertTrue(pom.getNewsTodayEnglish(getDriver()).displayYearOnDocumentInNewsTodayEnglish(),
					" Year is not displayed in News Today English documents ");
			Assert.assertTrue(pom.getNewsTodayEnglish(getDriver()).displayMediumOnDocumentInNewsTodayEnglish(),
					" Medium is not displayed in News Today English documents ");

		} else
			// Check if "No Data Found" message is displayed
			try {
				boolean isNoDataFoundDisplayed = pom.getNewsTodayEnglish(getDriver()).isNoDataFoundDisplayed();
				Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found message not displayed after applying filter");
			} catch (NoSuchElementException e) {
				// Log or report the issue
				System.out.println("No Data Found element not found: " + e.getMessage());
			}

	}

	@Test(priority = 14, invocationCount = 1, enabled = true) // , invocationTimeOut = 10000 threadPoolSize = 2,
	public void testClearFilterOptionInNewsTodayEnglish() throws InterruptedException, AWTException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayEnglish(getDriver()).clickNewsTodayEnglish();

		pom.getNewsTodayEnglish(getDriver()).clickbackNewsTodayEnglish();

		pom.getNewsTodayEnglish(getDriver()).clickFilter();

		pom.getNewsTodayEnglish(getDriver()).clickSelectYear();

		pom.getNewsTodayEnglish(getDriver()).clickApplyFilter();

		pom.getNewsTodayEnglish(getDriver()).clickClearFilter();

	}

	// Verify after the user likes the button and refreshes the page (Static Method)
	@Test(priority = 15, enabled = true)
	public void testLikeCountAfterUserLoginInNewsTodayEnglish() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getHomePage(getDriver()).clickLogin();
		extentTest.info(" Login button is Clicked");

		pom.getHomePage(getDriver()).enterUsername("jeyasankar88@habenwir.com");

		pom.getHomePage(getDriver()).enterPassword("123456");

		pom.getHomePage(getDriver()).clickSubmit();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayEnglish(getDriver()).clickNewsTodayEnglish();

		pom.getNewsTodayEnglish(getDriver()).clickbackNewsTodayEnglish();

		pom.getNewsTodayEnglish(getDriver()).clickAnyOneOfTheMonthOnNewsTodayEnglish();

		String beforeRefreshLikeCount = pom.getNewsTodayEnglish(getDriver()).getBeforeLikeCount();
		extentTest.info(beforeRefreshLikeCount);

		// Click the like button
		pom.getNewsTodayEnglish(getDriver()).clickLikeOnNewsTodayEnglish();

		// Check if the like button is clickable again
		if (pom.getNewsTodayEnglish(getDriver()).isLikeButtonClickable()) {
			// Get the like count after clicking
			String afterClickLikeCount = pom.getNewsTodayEnglish(getDriver()).getAfterLikeCount();
			extentTest.info(afterClickLikeCount);

			Thread.sleep(2000);

			// Check if the like counts are the same
			if (beforeRefreshLikeCount == afterClickLikeCount) {
				// Log a message that the like button is not clickable because it was already
				// clicked
				extentTest.info("User cannot click the like button because already hit the like button");
			} else {
				// Continue with the next steps of your test
				extentTest.info("Like button clicked successfully. Proceeding to the next step.");
				// Perform additional steps here
			}
		} else {
			// Log a message that the like button is not clickable because it was already
			// clicked
			extentTest.info("Like button is not clickable because it was already clicked");
		}

		refresh(getDriver());
		Thread.sleep(5000);

		String beforeLikeCount = pom.getNewsTodayEnglish(getDriver()).getBeforeLikeCount();
		extentTest.info(beforeLikeCount);

		// Click the like button
		pom.getNewsTodayEnglish(getDriver()).clickLikeOnNewsTodayEnglish();

		// Check if the like button is clickable again
		if (pom.getNewsTodayEnglish(getDriver()).isLikeButtonClickable()) {
			// Get the like count after clicking
			String afterRefreshLikeCount = pom.getNewsTodayEnglish(getDriver()).getAfterLikeCount();
			extentTest.info(afterRefreshLikeCount);

			Thread.sleep(2000);

			// Check if the like counts are the same
			if (beforeLikeCount == afterRefreshLikeCount) {
				// Log a message that the like button is not clickable because it was already
				// clicked
				extentTest.info("User cannot click the like button because already hit the like button");
			} else {
				// Continue with the next steps of your test
				extentTest.info("Like button clicked successfully. Proceeding to the next step.");
				// Perform additional steps here
			}
		} else {
			// Log a message that the like button is not clickable because it was already
			// clicked
			extentTest.info("Like button is not clickable because it was already clicked");
		}

	}

	@Test(priority = 16, enabled = true)
	public void testPaginationInNewsTodayEnglish() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayEnglish(getDriver()).clickNewsTodayEnglish();

		pom.getNewsTodayEnglish(getDriver()).clickbackNewsTodayEnglish();

		pom.getNewsTodayEnglish(getDriver()).clickRandomPage();

//		Assert.assertTrue(pom.getUPSCPaperSolution(getDriver()).displayDownloadCountOfTheDocumentAfterRefreshInUPSCPaperSolution(),"User cannot Like the Document more than once in UPSC Paper solution documents ");

	}

}
