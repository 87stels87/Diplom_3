import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class TransfersTest extends BaseTest {

    @After
    public void exitAfterLogin() {
        MainPage objMainPage = open(URL_STELLAR_BURGER_PAGE, MainPage.class);
        objMainPage.logoOnMainPage.click();
        LoginPage objLoginPage = objMainPage.clickButtonPersonalAccount();
        objLoginPage.clickButtonExit();
    }

    @Before
    public void createUser() {
        MainPage objMainPage = open(URL_STELLAR_BURGER_PAGE, MainPage.class);
        LoginPage objLoginPage = objMainPage.clickButtonPersonalAccount();
        RegistrationPage objRegistrationPage = objLoginPage.scrolAndclickButtonRegistration();
        objRegistrationPage.setNameEmailPassswordAndClickButtonRegistation(name, email, password);
    }

    @DisplayName("Проверка перехода в личный кабинет")
    @Description("Проверка перехода в личный кабинет")
    @Test
    public void testTransferOnPersonalAccount() {
        MainPage objMainPage = open(URL_STELLAR_BURGER_PAGE, MainPage.class);
        LoginPage objLoginPage = objMainPage.clickButtonPersonalAccount();
        objLoginPage.setEmailAndPasswordAndClickByLoginPage(email, password);
        MainPage objMainPage1 = objLoginPage.clickLogoOnLoginPage();
        LoginPage objLoginPage1 = objMainPage1.clickButtonPersonalAccount();
        objLoginPage1.checkVisibleButtonProfile();
    }

    @DisplayName("Проверка перехода из личного кабинета в конструктор")
    @Description("Проверка перехода из личного кабинета в конструктор")
    @Test
    public void testTransferFromPersonalAccountInСonstructor() {
        MainPage objMainPage = open(URL_STELLAR_BURGER_PAGE, MainPage.class);
        LoginPage objLoginPage = objMainPage.clickButtonPersonalAccount();
        objLoginPage.setEmailAndPasswordAndClickByLoginPage(email, password);
        MainPage objMainPage1 = objLoginPage.clickButtonConsructor();
        objMainPage1.CheckGetMessageAssembleBurger();
    }

    @DisplayName("Переход на раздел булки (по умолчанию на главной странице)")
    @Description("Переход на раздел булки (по умолчанию на главной странице)")
    @Test
    public void testTransferOnBunChapter() {
        MainPage objMainPage = open(URL_STELLAR_BURGER_PAGE, MainPage.class);
        LoginPage objLoginPage = objMainPage.clickButtonPersonalAccount();
        MainPage objMainPage1 = objLoginPage.setEmailAndPasswordAndClickByLoginPage(email, password);
      objMainPage1.checkCurentChapterBun();
    }


    @DisplayName("Переход на раздел начинки")
    @Description("Переход на раздел начинки")
    @Test
    public void testTransferOnFillingChapter() {
        MainPage objMainPage = open(URL_STELLAR_BURGER_PAGE, MainPage.class);
        LoginPage objLoginPage = objMainPage.clickButtonPersonalAccount();
        MainPage objMainPage1 = objLoginPage.setEmailAndPasswordAndClickByLoginPage(email, password);
        objMainPage1.transferFillingChapter();
        objMainPage1.CheckCurentChapterFilling();
    }

    @DisplayName("Переход на раздел соусы")
    @Description("Переход на раздел соусы")
    @Test
    public void testTransferOnSouceChapter() {
        MainPage objMainPage = open(URL_STELLAR_BURGER_PAGE, MainPage.class);
        LoginPage objLoginPage = objMainPage.clickButtonPersonalAccount();
        MainPage objMainPage1 = objLoginPage.setEmailAndPasswordAndClickByLoginPage(email, password);
        objMainPage1.transferSouceChapter();
        objMainPage1.CheckCurentChapterSouce();
    }
}
