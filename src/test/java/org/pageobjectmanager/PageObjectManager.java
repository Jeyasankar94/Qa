package org.pageobjectmanager;


import org.openqa.selenium.WebDriver;
import org.pageclasspackage.AIRNewsAnalysis;
import org.pageclasspackage.Abhyaas;
import org.pageclasspackage.CSATFooterPage;
import org.pageclasspackage.CartPage;
import org.pageclasspackage.Centers;
import org.pageclasspackage.ClassRoomDemoPage;
import org.pageclasspackage.Classroom;
import org.pageclasspackage.CurrentAffairsPage;
import org.pageclasspackage.EconomicSurvey;
import org.pageclasspackage.Footers;
import org.pageclasspackage.ForgotPasswordPage;
import org.pageclasspackage.HindiMagazine;
import org.pageclasspackage.HomePage;
import org.pageclasspackage.HomePageRag;
import org.pageclasspackage.InfographicsPage;
import org.pageclasspackage.Interview;
import org.pageclasspackage.LoginPage;
import org.pageclasspackage.Mains365Page;
import org.pageclasspackage.MainsTestSeriesPage;
import org.pageclasspackage.MonthlyCurrentAffairsPage;
import org.pageclasspackage.NewsTodayEnglish;
import org.pageclasspackage.NewsTodayHindi;
import org.pageclasspackage.Open_Test;
import org.pageclasspackage.PT365Footer;
import org.pageclasspackage.PT365Page;
import org.pageclasspackage.PersonalityInterviewPage;
import org.pageclasspackage.PrelimsTestSeries;
import org.pageclasspackage.QuickRevisionMaterial;
import org.pageclasspackage.Register;
import org.pageclasspackage.ResearchAndAnalysisPage;
import org.pageclasspackage.Resources;
import org.pageclasspackage.ResourcesPage;
import org.pageclasspackage.SignUp;
import org.pageclasspackage.SignupRandomPage;
import org.pageclasspackage.SmartQuizPage;
import org.pageclasspackage.TalksAndInterviews;
import org.pageclasspackage.ToppersAnswerCopyPage;
import org.pageclasspackage.UPSCPaperSolution;
import org.pageclasspackage.UnionBudget;
import org.pageclasspackage.ValueAddedMaterialPage;
import org.pageclasspackage.ValueAdditionOptionalSubject;
import org.pageclasspackage.WeeklyFocus;

public class PageObjectManager {

//	public LoginPage loginPage;
	public HomePage homepage;
//	public NewWebLogin newWebLogin;
	public SignUp signUp;
	public ForgotPasswordPage forgotPassword;
	public PrelimsTestSeries prelimsTestSeries;
	public Register register;
	public Footers footers;
	public Classroom classroom;
	public Resources resources;
	public UPSCPaperSolution upscPaperSolution;
	public QuickRevisionMaterial quickRevisionMaterial;
	public NewsTodayHindi newsTodayHindi;
	public NewsTodayEnglish newsTodayEnglish;
	public EconomicSurvey economicSurvey;
	public UnionBudget unionBudget;
	public Interview interview;
	public AIRNewsAnalysis airNewsAnalysis;
	public HindiMagazine hindiMagazine;
	public Centers centers;
	public Abhyaas abhyaas;
	public Open_Test open_Test;
	public TalksAndInterviews talksAndInterviews;

	public LoginPage loginPage;
	public HomePageRag homepageRag;
	public ResourcesPage resourcespage;
	public InfographicsPage infographicspage;
	public WeeklyFocus weeklyFocus;
	public MonthlyCurrentAffairsPage monthlyCurrentAffairsPage;
	public CurrentAffairsPage currentAffairsPage;
	public PT365Page pt365Page;
	public Mains365Page mains365Page;
	public ValueAddedMaterialPage valueAddedMaterialPage;
	public ValueAdditionOptionalSubject  valueAdditionOptionalSubject ;
	public ToppersAnswerCopyPage toppersAnswerCopyPage;
	public ResearchAndAnalysisPage researchAndAnalysis;
	public SmartQuizPage smartQuizPage;
	public PersonalityInterviewPage personalityInterviewPage;
	public MainsTestSeriesPage mainsTestSeriesPage;
	public SignupRandomPage signupRandomPage;
	public CartPage cartPage;
	public ClassRoomDemoPage classRoomDemoPage;
	public PT365Footer pt365FooterObject;
	public CSATFooterPage csatFooter;

	public LoginPage getLoginPage(WebDriver driver) {
		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
	}

	public HomePageRag getHomePageRag(WebDriver driver) {
		return (homepageRag == null) ? homepageRag = new HomePageRag(driver) : homepageRag;
	}

	public ResourcesPage getResourcesPage(WebDriver driver) {
		return (resourcespage == null) ? resourcespage = new ResourcesPage(driver) : resourcespage;
	}

	public InfographicsPage getInfographicsPage(WebDriver driver) {
		return (infographicspage == null) ? infographicspage = new InfographicsPage(driver) : infographicspage;
	}

	public WeeklyFocus getWeeklyFocus(WebDriver driver) {
		return (weeklyFocus == null) ? weeklyFocus = new WeeklyFocus(driver) : weeklyFocus;
	}

	public MonthlyCurrentAffairsPage getMonthlyCurrentAffairsPage(WebDriver driver) {
		return (monthlyCurrentAffairsPage == null) ? monthlyCurrentAffairsPage = new MonthlyCurrentAffairsPage(driver)
				: monthlyCurrentAffairsPage;
	}

	public CurrentAffairsPage getCurrentAffairsPage(WebDriver driver) {
		return (currentAffairsPage == null) ? currentAffairsPage = new CurrentAffairsPage(driver) : currentAffairsPage;
	}

	public PT365Page getPT365Page(WebDriver driver) {
		return (pt365Page == null) ? pt365Page = new PT365Page(driver) : pt365Page;
	}

	public Mains365Page getMains365Page(WebDriver driver) {
		return (mains365Page == null) ? mains365Page = new Mains365Page(driver) : mains365Page;
	}

	public ValueAddedMaterialPage getValueAddedMaterialPage(WebDriver driver) {
		return (valueAddedMaterialPage == null) ? valueAddedMaterialPage = new ValueAddedMaterialPage(driver)
				: valueAddedMaterialPage;
	}
	
	public ValueAdditionOptionalSubject getValueAdditionOptionalSubject(WebDriver driver) {
		return (valueAdditionOptionalSubject == null) ? valueAdditionOptionalSubject = new ValueAdditionOptionalSubject(driver)
				: valueAdditionOptionalSubject;
	}

	public ToppersAnswerCopyPage getToppersAnswerCopyPage(WebDriver driver) {
		return (toppersAnswerCopyPage == null) ? toppersAnswerCopyPage = new ToppersAnswerCopyPage(driver)
				: toppersAnswerCopyPage;
	}

	public ResearchAndAnalysisPage getResearchAndAnalysisPage(WebDriver driver) {
		return (researchAndAnalysis == null) ? researchAndAnalysis = new ResearchAndAnalysisPage(driver)
				: researchAndAnalysis;
	}

	public SmartQuizPage getSmartQuizPage(WebDriver driver) {
		return (smartQuizPage == null) ? smartQuizPage = new SmartQuizPage(driver) : smartQuizPage;
	}

	public PersonalityInterviewPage getInterviewPage(WebDriver driver) {
		return (personalityInterviewPage == null) ? personalityInterviewPage = new PersonalityInterviewPage(driver)
				: personalityInterviewPage;
	}

	public MainsTestSeriesPage getMainsTestSeriesPage(WebDriver driver) {
		return (mainsTestSeriesPage == null) ? mainsTestSeriesPage = new MainsTestSeriesPage(driver) : mainsTestSeriesPage;
	}

	public SignupRandomPage getSignupRandomPage(WebDriver driver) {
		return (signupRandomPage == null) ? signupRandomPage = new SignupRandomPage(driver) : signupRandomPage;
	}

	public CartPage getCartPage(WebDriver driver) {
		return (cartPage == null) ? cartPage = new CartPage(driver) : cartPage;
	}

	public ClassRoomDemoPage getClassRoomDemoPage(WebDriver driver) {
		return (classRoomDemoPage == null) ? classRoomDemoPage = new ClassRoomDemoPage(driver) : classRoomDemoPage;
	}

	public PT365Footer getPT365Footer(WebDriver driver) {
		return (pt365FooterObject == null) ? pt365FooterObject = new PT365Footer(driver) : pt365FooterObject;
	}

	public CSATFooterPage getCSATFooterPage(WebDriver driver) {
		return (csatFooter == null) ? csatFooter = new CSATFooterPage(driver) : csatFooter;
	}


	public HindiMagazine getHindiMagazine(WebDriver driver) {
		return (hindiMagazine == null) ? hindiMagazine = new HindiMagazine(driver) : hindiMagazine;
	}

	public AIRNewsAnalysis getAIRNewsAnalysis(WebDriver driver) {
		return (airNewsAnalysis == null) ? airNewsAnalysis = new AIRNewsAnalysis(driver) : airNewsAnalysis;
	}

	public Interview getInterview(WebDriver driver) {
		return (interview == null) ? interview = new Interview(driver) : interview;
	}

	public UnionBudget getUnionBudget(WebDriver driver) {
		return (unionBudget == null) ? unionBudget = new UnionBudget(driver) : unionBudget;
	}

	public EconomicSurvey getEconomicSurvey(WebDriver driver) {
		return (economicSurvey == null) ? economicSurvey = new EconomicSurvey(driver) : economicSurvey;
	}

	public NewsTodayEnglish getNewsTodayEnglish(WebDriver driver) {
		return (newsTodayEnglish == null) ? newsTodayEnglish = new NewsTodayEnglish(driver) : newsTodayEnglish;
	}

	public NewsTodayHindi getNewsTodayHindi(WebDriver driver) {
		return (newsTodayHindi == null) ? newsTodayHindi = new NewsTodayHindi(driver) : newsTodayHindi;
	}

	public QuickRevisionMaterial getQuickRevisionMaterial(WebDriver driver) {
		return (quickRevisionMaterial == null) ? quickRevisionMaterial = new QuickRevisionMaterial(driver) : quickRevisionMaterial;
	}

	public UPSCPaperSolution getUPSCPaperSolution(WebDriver driver) {
		return (upscPaperSolution == null) ? upscPaperSolution = new UPSCPaperSolution(driver) : upscPaperSolution;
	}

	public Classroom getClassroom(WebDriver driver) {
		return (classroom == null) ? classroom = new Classroom(driver) : classroom;
	}

	public HomePage getHomePage(WebDriver driver) {
		return (homepage == null) ? homepage = new HomePage(driver) : homepage;
	}

	public Register getRegister(WebDriver driver) {
		return (register == null) ? register = new Register(driver) : register;
	}

	public SignUp getSignUp(WebDriver driver) {
		return (signUp == null) ? signUp = new SignUp(driver) : signUp;
	}

	public ForgotPasswordPage getForgotPasswordPage(WebDriver driver) {
		return (forgotPassword == null) ? forgotPassword = new ForgotPasswordPage(driver) : forgotPassword;
	}

	public PrelimsTestSeries getPrelimsTestSeries(WebDriver driver) {
		return (prelimsTestSeries == null) ? prelimsTestSeries = new PrelimsTestSeries(driver) : prelimsTestSeries;
	}

	public Footers getFooters(WebDriver driver) {
		return (footers == null) ? footers = new Footers(driver) : footers;
	}

	public Resources getResources(WebDriver driver) {
		return (resources == null) ? resources = new Resources(driver) : resources;
	}
	public Centers getCenters(WebDriver driver) {
		return (centers == null) ? centers = new Centers(driver) : centers;
	}
	public Abhyaas getAbhyaas(WebDriver driver) {
		return (abhyaas == null) ? abhyaas = new Abhyaas(driver) : abhyaas;
	}
	public Open_Test getOpen_Test(WebDriver driver) {
		return (open_Test == null) ? open_Test = new Open_Test(driver) : open_Test;
	}
	public TalksAndInterviews getTalksAndInterviews(WebDriver driver) {
		return (talksAndInterviews == null) ? talksAndInterviews = new TalksAndInterviews(driver) : talksAndInterviews;
	}
}
