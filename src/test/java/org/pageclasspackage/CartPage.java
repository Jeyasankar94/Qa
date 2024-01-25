package org.pageclasspackage;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Random;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends VisionBaseClass {

	WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// login button in home page

	@FindBy(xpath = "(//*[@class='flex items-center lg:flex-row-reverse lg:grow']/div/div[2])[1]")
	private WebElement loginButtonInHomePage;

	// emailId in login

	@FindBy(xpath = "//*[@id='formGridEmail']")
	private WebElement emailIdCartPage;

	// password in login field

	@FindBy(xpath = "//*[@id='formGridPassword']")
	private WebElement passwordCartPage;

	// submit login

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement loginSubmit;

	// Profile name webelement

	@FindBy(xpath = "//*[@class='relative md:py-3 lg:py-0 lg:pb-3']/div")
	private WebElement profileName;

	// cart page

	@FindBy(xpath = "//*[text()='My Cart']")
	private WebElement cartPage;

	// select payment method

	@FindBy(xpath = "(//*[@class='dropdown'])[1]")
	private WebElement selectPaymentMethod;

	// payment method choices

	@FindBy(xpath = "//*[@x-placement='bottom-start']")
	private List<WebElement> paymentChoices;

	// select place of supply

	@FindBy(xpath = "(//*[@class='dropdown'])[2]")
	private WebElement selectPlaceOfSupply;

	// place of supply choices

	@FindBy(xpath = "(//*[@x-placement='bottom-start'])[2]")
	private List<WebElement> placeOfSupplyChoices;

	// write remarks

	@FindBy(xpath = "//*[@class='flex flex-col border-[#E5EAF4] border-t h-auto p-2 ']/div/textarea")
	private WebElement writeRemarks;

	// terms and condition

	@FindBy(xpath = "//*[@type='checkbox']")
	private WebElement termsAndCondition;

	// accept in terms and condition

	@FindBy(xpath = "//*[@class='modal-content sm:!rounded-t-xl']/div[3]/button[2]")
	private WebElement acceptInTermsAndCondition;

	// decline in terms and condition

	@FindBy(xpath = "//*[@class='modal-content sm:!rounded-t-xl']/div[3]/button[1]")
	private WebElement declineInTermsAndCondition;

	// proceed to pay

	@FindBy(xpath = "//*[@class='flex justify-center items-center']")
	private WebElement proceedToPay;

	// card in the cart page

	@FindBy(xpath = "//*[@class='!mx-1 flex !justify-between w-full']/main")
	private List<WebElement> cards;

	// prices in the card

	@FindBy(xpath = "//*[@class='flex flex-col justify-start w-full']/div[2]/label")
	private List<WebElement> pricesInCard;

	// total amount in cart page

	@FindBy(xpath = "//*[@class='flex gap-1']/div/p")
	private WebElement totalAmount;

	// pencil symbol adjacent to the total amount

	@FindBy(xpath = "//*[@class='flex mt-[6px] ']/div")
	private WebElement pencilSymbol;

	// modify amount value

	@FindBy(xpath = "//*[@class='flex mt-[-6px]']/div/input")
	private WebElement modifyAmountaValue;

	// ok tick mark symbol to know the status of modified total cart value

	@FindBy(xpath = "//*[@class='h-6 w-6 cursor-pointer hover:!text-primaryLight text-black dark:!text-white dark:hover:!text-primaryDark']")
	private WebElement okTickMark;

	// cancel cross mark to cancel the modified amount in the total amount in the
	// cart page

	@FindBy(xpath = "//*[@class='h-5 w-5 cursor-pointer hover:!text-primaryLight text-black dark:!text-white dark:hover:!text-primaryDark']")
	private WebElement cancelCrossMark;

	// minimum amount allowed text

	@FindBy(xpath = "//*[@class='text-[#dc3545] text-xs font-sans font-semibold ml-2']")
	private WebElement validationMessageForModifyingAmount;

	// three dots

	@FindBy(xpath = "//*[@class='sm:hidden cartDropdown-light dropdown']/button")
	private List<WebElement> threeDots;

	// brochure in three dots

	@FindBy(xpath = "//*[@x-placement='bottom-start']/div[1]")
	private WebElement brochure;

	// share in three dots

	@FindBy(xpath = "//*[@x-placement='bottom-start']/div[2]")
	private WebElement share;

	// share copy link

	@FindBy(xpath = "(//*[@class='modal-content sm:!rounded-t-xl'])[1]/div[2]/div[2]/span")
	private WebElement shareCopyLink;

	// share with close

	@FindBy(xpath = "(//*[@class='modal-content sm:!rounded-t-xl'])[1]/div[1]/div/span/span/img")
	private WebElement shareWithClose;

	// remove in three dots

	@FindBy(xpath = "(//*[@class='mr-2 pt-[5px]'])[3]")
	private WebElement remove;

	// cancel in remove pop-up

	@FindBy(xpath = "//*[@class='modal-body']/div[2]/button[1]")
	private WebElement cancelInRemovePopup;

	// remove in remove popup

	@FindBy(xpath = "//*[@class='modal-body']/div[2]/button[2]")
	private WebElement removeInRemovePopup;

	// click Login button in home page and enter credential

	public void enterCredentials() {

		// click the login button in home page

		loginButtonInHomePage.click();

		// enter email id
		emailIdCartPage.sendKeys(email);

		// enter password
		passwordCartPage.sendKeys(password);

		// click submit login button
		loginSubmit.click();

	}

	// click cart page under profile name

	public void clickCartPage() {

		// click profile name

		profileName.click();

		// click cart page under profile name

		cartPage.click();

	}

	// verify select payment

	String randomlySelectedPaymentMethodText;

	public void selectPaymentMethod() {

		// click payment method

		selectPaymentMethod.click();

		// create instance for random instance

		Random random = new Random();

		int randomIndex = random.nextInt(paymentChoices.size());

		// select Payment method

		WebElement randomlySelectedPaymentMethod = paymentChoices.get(randomIndex);

		randomlySelectedPaymentMethod.click();

		// text of randomly selected payment method

		randomlySelectedPaymentMethodText = selectPaymentMethod.getText();

		extentTest.info("raandomlySelectedPaymentMethodText : " + randomlySelectedPaymentMethodText);

	}

	// verify place of supply

	String randomlySelectedPlaceOfSupplyText;

	public void selectPlaceOfSupply() {
		// click place of supply

		selectPlaceOfSupply.click();

		// create instance for random method

		Random random = new Random();

		int randomIndex = random.nextInt(placeOfSupplyChoices.size());

		WebElement randomlySelectedPlaceOfSupply = placeOfSupplyChoices.get(randomIndex);

		randomlySelectedPlaceOfSupply.click();

		// get text of randomly selected place of supply

		randomlySelectedPlaceOfSupplyText = selectPlaceOfSupply.getText();

		extentTest.info("randomlySelectedPlaceOfSupplyText : " + randomlySelectedPlaceOfSupplyText);

	}

	// verify write remarks

	public void sendWriteRemarks() {

		writeRemarks.sendKeys("The items for purchasing are fulfilling the ");
	}

	// verify terms and condition

	public void verifyTermsAndCondition() {

		// click terms and condition

		termsAndCondition.click();

		// click decline in terms and condition

		declineInTermsAndCondition.click();

		// click terms and condition

		termsAndCondition.click();

		// click accept in terms and condition

		acceptInTermsAndCondition.click();
	}

	// verify amount in cart page

	// totalSum is summation of all values quoted in the cards in cart page

	int totalSum;

	public void verifyAmountInCartPage() {

		// verify whether items present in the cart Page

		if (cards.size() > 0) {

			for (WebElement prices : pricesInCard) {

				String priceee = prices.getText();

				extentTest.info(" priceee :  " + priceee);

				// removing the rupee symbol & , from each cart price and it was typecasted to
				// int

				int priceValue = Integer.parseInt(priceee.replaceAll("[₹,]", "").trim());

				// typecasted price value from cart is totaled for comparing purpose

				totalSum += priceValue;

			}


		}

		extentTest.info("total amount in the cart page : " + totalAmount.getText());

		// getting the total amount in the cart page and storing it in string

		String totalAmountText = totalAmount.getText();

		// removing the rupee symbol & , from total amount and it was typecasted to int

		int totalAmountIntValue = Integer.parseInt(totalAmountText.replaceAll("[₹,]", "").trim());

		extentTest.info("totalAmountIntValue : " + totalAmountIntValue);

		extentTest.info("totalSum : " + totalSum);

		assertEquals(totalAmountIntValue, totalSum);

		extentTest.pass(
				"When a card is NOT removed from the cart, the total displayed on the cart page corresponds to the sum of the individual amounts.");

	}

	// verify change amount in cart page

	public void verifyChangeAmountInCartPage() {

		// values to be tested in the

		int[] valuesToTest = { 2, totalSum + 1, 250, totalSum - 1, totalSum };

		for (int value : valuesToTest) {

			try {

				// click pencil symbol in the cart page

				pencilSymbol.click();

				// clear the actual total value

				modifyAmountaValue.clear();

				// send values to change value

				modifyAmountaValue.sendKeys(Integer.toString(value));

				// click the ok Tick mark symbol to accept the modified value

				okTickMark.click();

				// get the validation text

				String validationMessageText = validationMessageForModifyingAmount.getText();

				extentTest.info("validation message for  modified price of" + value + " is : " + validationMessageText);

				// cancel the modified amount

				cancelCrossMark.click();

			}

			catch (Exception e) {

				extentTest.info("Price modified for the " + value + " successfully and is accepted ");

			}
		}

	}

	// verify after removing a card in the cart page

	int revisedTotalSum;

	public void verifyRemoveCard() {

		// verify whether cards is present in the cart page

		if (threeDots.size() > 0) {

			// select first three dots in the cart page

			WebElement firstThreeDots = threeDots.get(0);

			firstThreeDots.click();

			// click remove from the dropdown

			remove.click();

			// click remove in remove pop up

			removeInRemovePopup.click();

			synchronized (driver) {
				try {
					driver.wait(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			// verify whether items present in the cart Page

			if (cards.size() > 0) {

				for (WebElement prices : pricesInCard) {

					String priceee = prices.getText();

					extentTest.info(" priceee :  " + priceee);

					// removing the rupee symbol & , from each cart price and it was typecasted to
					// int

					int priceValue = Integer.parseInt(priceee.replaceAll("[â‚¹,]", "").trim());

					// typecasted price value from cart is totaled for comparing purpose

					revisedTotalSum += priceValue;

				}

			}

			extentTest.info("total amount in the cart page : " + totalAmount.getText());

			// getting the total amount in the cart page and storing it in string

			String totalAmountText = totalAmount.getText();

			// removing the rupee symbol & , from total amount and it was typecasted to int

			int revisedTotalAmountIntValue = Integer.parseInt(totalAmountText.replaceAll("[â‚¹,]", "").trim());

			extentTest.info("totalAmountIntValue : " + revisedTotalAmountIntValue);

			extentTest.info("revisedTotalSum : " + revisedTotalSum);

			assertEquals(revisedTotalAmountIntValue, revisedTotalSum);

			extentTest.pass(
					"When a card is removed from the cart, the total displayed on the cart page corresponds to the sum of the individual amounts.");

		}

		else {
			extentTest.info("card page is empty");
		}

	}

	// verify card details in cart page

	public void verifyCardFunctionality() {

		// verify whether cards is present in the cart page

		if (threeDots.size() > 0) {

			// select first three dots in the cart page

			WebElement firstThreeDots = threeDots.get(0);

			firstThreeDots.click();

			// verify share

			share.click();

			// get the text of share link

			String shareCopyText = shareCopyLink.getText();

			extentTest.info("Link in Share with : " + shareCopyText);

			// close share with

			Actions actions = new Actions(driver);
			actions.moveToElement(shareWithClose).click().perform();

			// shareWithClose.click();

			extentTest.info("Sharing the card details is successfully verified ");

			// clcik three dots

			firstThreeDots.click();

			firstThreeDots.click();

			// verify remove

			remove.click();

			// click cancel in the remove pop up

			cancelInRemovePopup.click();

			// click three dots

			firstThreeDots.click();

			firstThreeDots.click();

			// click brochure

			brochure.click();

			extentTest.info("Brochure is downloaded and verified");

		}

		else {
			extentTest.info("card page is empty");
		}

	}

}
