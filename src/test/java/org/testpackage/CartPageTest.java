package org.testpackage;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class CartPageTest extends VisionBaseClass {

	@Test(enabled = true)
	public void cardPagetest() {

		getDriver().get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click login and enter credentials

		pom.getCartPage(getDriver()).enterCredentials();

		synchronized (driver) {
			try {
				driver.wait(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click cart page under profile name

		pom.getCartPage(getDriver()).clickCartPage();

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// select payment method

		pom.getCartPage(getDriver()).selectPaymentMethod();

		// select place of supply

		pom.getCartPage(getDriver()).selectPlaceOfSupply();

		// send keys to write remarks

		pom.getCartPage(getDriver()).sendWriteRemarks();

		// verify terms and condition

		pom.getCartPage(getDriver()).verifyTermsAndCondition();

		// verify amount in the cart page

		pom.getCartPage(getDriver()).verifyAmountInCartPage();

		// verify change amount in cart page

		pom.getCartPage(getDriver()).verifyChangeAmountInCartPage();

		// verify remove in the card in cart page

		pom.getCartPage(getDriver()).verifyRemoveCard();


	}

	@Test(enabled = true)
	public void testFunctionalityOfCard() {

		getDriver().get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click login and enter credentials

		pom.getCartPage(getDriver()).enterCredentials();

		synchronized (driver) {
			try {
				driver.wait(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click cart page under profile name

		pom.getCartPage(getDriver()).clickCartPage();

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click first element in three dots in the cart page

		pom.getCartPage(getDriver()).verifyCardFunctionality();

	}

}
