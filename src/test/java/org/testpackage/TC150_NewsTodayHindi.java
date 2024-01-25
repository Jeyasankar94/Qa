package org.testpackage;

import java.awt.AWTException;
import java.util.NoSuchElementException;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC150_NewsTodayHindi extends VisionBaseClass {

	// Check whether user is able to view the module name with proper banner text
	@Test(priority = 1, enabled = true)
	public void testBannerTextOfNewsTodayHindi() throws InterruptedException, AWTException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		Assert.assertTrue(pom.getResources(getDriver()).displayCurrentAffairsBannerText(),
				"Banner Text is not displayed at Current Affairs Page");

		pom.getNewsTodayHindi(getDriver()).clickNewsTodayHindi();

		Assert.assertTrue(pom.getNewsTodayHindi(getDriver()).displayBannerTextOfNewsTodayHindi(),
				"Banner Text is not displayed at News Today Hindi");
	}

	// Verify News Today Hindi loading with downloadable document
	@Test(priority = 2, enabled = true)
	public void testPresenceOfDocumentInNewsTodayHindi() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayHindi(getDriver()).clickNewsTodayHindi();

		Assert.assertTrue(pom.getNewsTodayHindi(getDriver()).clickDownloadRandomnlyOnNewsTodayHindi(),
				"Documents cannot be Download in News Today Hindi");

	}

	// Verify title of each document is dispalyed properly
	@Test(priority = 3, enabled = true)
	public void testTitleOfDocumentInNewsTodayHindi() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayHindi(getDriver()).clickNewsTodayHindi();

		Assert.assertTrue(pom.getNewsTodayHindi(getDriver()).getTitleOfDocumentInNewsTodayHindi(),
				"Title of the News Today Hindi is not displayed");

	}

	// Verify year,medium under each document
	@Test(priority = 4, enabled = true)
	public void testPresenceOfYearAndMediumInNewsTodayHindiDocument() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayHindi(getDriver()).clickNewsTodayHindi();

		Assert.assertTrue(pom.getNewsTodayHindi(getDriver()).displayYearOnDocumentInNewsTodayHindi(),
				" Year is not displayed in News Today Hindi documents ");
		Assert.assertTrue(pom.getNewsTodayHindi(getDriver()).displayMediumOnDocumentInNewsTodayHindi(),
				" Medium is not displayed in News Today Hindi documents ");

	}

	// Verify whether user can like the documents & Like icon should turn blue and
	// count should be increased
	@Test(priority = 5, enabled = true)
	public void testLikeCountInNewsTodayHindiDocument() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayHindi(getDriver()).clickNewsTodayHindi();

		Assert.assertTrue(pom.getNewsTodayHindi(getDriver()).displayAndLikeTheDocumentInNewsTodayHindi(),
				"Cannot click the Like button in News Today Hindi documents ");

	}

	// Verify whether user can Like the documents & like icon should turn blue and
	// count should be increased
	@Test(priority = 6, enabled = true)
	public void testLikeCountOfDocumentAtBeforeUserLoginInNewsTodayHindi() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayHindi(getDriver()).clickNewsTodayHindi();

		Assert.assertTrue(
				pom.getNewsTodayHindi(getDriver()).displayLikeCountOfTheDocumentAfterRefreshInNewsTodayHindi(),
				"User cannot Like the Document more than once in News Today Hindi documents ");

	}

	// Verify after the user likes the button and refreshes the page (Static Method)
	@Test(priority = 7, enabled = true)
	public void testLikeCountBeforeUserLoginInNewsTodayHindi() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayHindi(getDriver()).clickNewsTodayHindi();

		String beforeRefreshLikeCount = pom.getNewsTodayHindi(getDriver()).getBeforeLikeCount();
		extentTest.info(beforeRefreshLikeCount);

		pom.getNewsTodayHindi(getDriver()).clickLikeOnNewsTodayHindi();

		String afterClickLikeCount = pom.getNewsTodayHindi(getDriver()).getAfterLikeCount();
		extentTest.info(afterClickLikeCount);

		Assert.assertNotEquals(beforeRefreshLikeCount, afterClickLikeCount,
				"Document Like counts are same in News Today Hindi");

		refresh(getDriver());

		String beforeLikeCount = pom.getNewsTodayHindi(getDriver()).getBeforeLikeCount();
		extentTest.info(beforeLikeCount);
		pom.getNewsTodayHindi(getDriver()).clickLikeOnNewsTodayHindi();

		String afterRefreshLikeCount = pom.getNewsTodayHindi(getDriver()).getAfterLikeCount();
		extentTest.info(afterRefreshLikeCount);

		Assert.assertNotEquals(beforeLikeCount, afterRefreshLikeCount,
				"Document Like counts are same in  News Today Hindi  ");
	}

	// Verify whether user can download the documents & download icon should turn
	// blue and count should be increased
	@Test(priority = 8, enabled = true)
	public void testDownloadCountOfDocumentBeforeUserLoginInNewsTodayHindi() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayHindi(getDriver()).clickNewsTodayHindi();

		pom.getNewsTodayHindi(getDriver()).clickbackNewsTodayHindi();

		pom.getNewsTodayHindi(getDriver()).clickAnyOneOfTheMonthOnNewsTodayHindi();

		Assert.assertTrue(
				pom.getNewsTodayHindi(getDriver()).displayDownloadCountOfTheDocumentAfterRefreshInNewsTodayHindi(),
				"User cannot Download more than once in News Today Hindi documents ");

	}

	// To share the page link to Whatsapp
	@Test(priority = 9, invocationCount = 1, enabled = true)
	public void testUserCanShareThePageLinkViaWhatsappOfNewsTodayHindi() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayHindi(getDriver()).clickNewsTodayHindi();

		pom.getNewsTodayHindi(getDriver()).clickbackNewsTodayHindi();

		pom.getNewsTodayHindi(getDriver()).clickAnyOneOfTheMonthOnNewsTodayHindi();

		pom.getNewsTodayHindi(getDriver()).clickShare();

		pom.getNewsTodayHindi(getDriver()).clickWhatsapp();

		windowhandling(getDriver());

		String title = getDriver().getTitle();
		extentTest.info(title);

		Assert.assertEquals("WhatsApp", title, "Incorrect Title for Whatsapp  ");

	}

	// To share the page link to Facebook
	@Test(priority = 10, invocationCount = 1, enabled = true)
	public void testUserCanShareThePageLinkViaFacebookOfNewsTodayHindi() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayHindi(getDriver()).clickNewsTodayHindi();

		pom.getNewsTodayHindi(getDriver()).clickbackNewsTodayHindi();

		pom.getNewsTodayHindi(getDriver()).clickAnyOneOfTheMonthOnNewsTodayHindi();

		pom.getNewsTodayHindi(getDriver()).clickShare();

		pom.getNewsTodayHindi(getDriver()).clickFacebook();

		windowhandling(getDriver());

		String title = getDriver().getTitle();
		extentTest.info(title);

		Assert.assertEquals("Facebook", title, "Incorrect Title for Facebook ");

	}

	// To share the page link to Gmail
	@Test(priority = 11, invocationCount = 1, enabled = true)
	public void testUserCanShareThePageLinkViaGmailOfNewsTodayHindi() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayHindi(getDriver()).clickNewsTodayHindi();

		pom.getNewsTodayHindi(getDriver()).clickbackNewsTodayHindi();

		pom.getNewsTodayHindi(getDriver()).clickAnyOneOfTheMonthOnNewsTodayHindi();

		pom.getNewsTodayHindi(getDriver()).clickShare();

		pom.getNewsTodayHindi(getDriver()).clickGmail();

		windowhandling(getDriver());

		String title = getDriver().getTitle();
		extentTest.info(title);

		Assert.assertEquals("Vision IAS", title, "Incorrect Title for Gmail  ");

	}

	// To share the page link to Telegram
	@Test(priority = 12, invocationCount = 1, enabled = true)
	public void testUserCanShareThePageLinkViaTelegramOfNewsTodayHindi() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayHindi(getDriver()).clickNewsTodayHindi();

		pom.getNewsTodayHindi(getDriver()).clickbackNewsTodayHindi();

		pom.getNewsTodayHindi(getDriver()).clickAnyOneOfTheMonthOnNewsTodayHindi();

		pom.getNewsTodayHindi(getDriver()).clickShare();

		pom.getNewsTodayHindi(getDriver()).clickTelegram();

		windowhandling(getDriver());

		String title = getDriver().getTitle();
		extentTest.info(title);

		Assert.assertEquals("Telegram: Share Web Page", title, "Incorrect Title for Telegram  ");
		;

	}

	@Test(priority = 13, invocationCount = 1, enabled = true) // , invocationTimeOut = 10000 threadPoolSize = 2,
	public void testFilterFunctionalityOfNewsTodayHindi() throws InterruptedException, AWTException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayHindi(getDriver()).clickNewsTodayHindi();

		pom.getNewsTodayHindi(getDriver()).clickbackNewsTodayHindi();

		pom.getNewsTodayHindi(getDriver()).clickFilter();

		pom.getNewsTodayHindi(getDriver()).clickSelectYear();

		pom.getNewsTodayHindi(getDriver()).clickApplyFilter();

		// Check if data is displayed
		boolean isDataDisplayed = pom.getNewsTodayHindi(getDriver()).isDataDisplayed();

		// If data is displayed, assert that data is displayed after applying the filter
		if (isDataDisplayed) {
			Assert.assertTrue(isDataDisplayed, "Data not displayed after applying filter");
			Assert.assertTrue(pom.getNewsTodayHindi(getDriver()).displayYearOnDocumentInNewsTodayHindi(),
					" Year is not displayed in News Today Hindi documents ");
			Assert.assertTrue(pom.getNewsTodayHindi(getDriver()).displayMediumOnDocumentInNewsTodayHindi(),
					" Medium is not displayed in News Today Hindi documents ");

		} else
			// Check if "No Data Found" message is displayed
			try {
				boolean isNoDataFoundDisplayed = pom.getNewsTodayHindi(getDriver()).isNoDataFoundDisplayed();
				Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found message not displayed after applying filter");
			} catch (NoSuchElementException e) {
				// Log or report the issue
				System.out.println("No Data Found element not found: " + e.getMessage());
			}

	}

	@Test(priority = 14, invocationCount = 1, enabled = true) // , invocationTimeOut = 10000 threadPoolSize = 2,
	public void testClearFilterOptionInNewsTodayHindi() throws InterruptedException, AWTException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayHindi(getDriver()).clickNewsTodayHindi();

		pom.getNewsTodayHindi(getDriver()).clickbackNewsTodayHindi();

		pom.getNewsTodayHindi(getDriver()).clickFilter();

		pom.getNewsTodayHindi(getDriver()).clickSelectYear();

		pom.getNewsTodayHindi(getDriver()).clickApplyFilter();

		pom.getNewsTodayHindi(getDriver()).clickClearFilter();

	}

	// Verify after the user likes the button and refreshes the page (Static Method)
	@Test(priority = 15, enabled = true)
	public void testLikeCountAfterUserLoginInNewsTodayHindi() throws InterruptedException {

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

		pom.getNewsTodayHindi(getDriver()).clickNewsTodayHindi();

		pom.getNewsTodayHindi(getDriver()).clickbackNewsTodayHindi();

		pom.getNewsTodayHindi(getDriver()).clickAnyOneOfTheMonthOnNewsTodayHindi();

		String beforeRefreshLikeCount = pom.getNewsTodayHindi(getDriver()).getBeforeLikeCount();
		extentTest.info(beforeRefreshLikeCount);

		// Click the like button
		pom.getNewsTodayHindi(getDriver()).clickLikeOnNewsTodayHindi();

		// Check if the like button is clickable again
		if (pom.getNewsTodayHindi(getDriver()).isLikeButtonClickable()) {
			// Get the like count after clicking
			String afterClickLikeCount = pom.getNewsTodayHindi(getDriver()).getAfterLikeCount();
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

		String beforeLikeCount = pom.getNewsTodayHindi(getDriver()).getBeforeLikeCount();
		extentTest.info(beforeLikeCount);

		// Click the like button
		pom.getNewsTodayHindi(getDriver()).clickLikeOnNewsTodayHindi();

		// Check if the like button is clickable again
		if (pom.getNewsTodayHindi(getDriver()).isLikeButtonClickable()) {
			// Get the like count after clicking
			String afterRefreshLikeCount = pom.getNewsTodayHindi(getDriver()).getAfterLikeCount();
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
	public void testPaginationInNewsTodayHindi() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();

		pom.getNewsTodayHindi(getDriver()).clickNewsTodayHindi();

		pom.getNewsTodayHindi(getDriver()).clickbackNewsTodayHindi();

		pom.getNewsTodayHindi(getDriver()).clickRandomPage();


	}

}
