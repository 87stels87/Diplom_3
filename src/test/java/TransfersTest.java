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
        objLoginPage.setEmailByLoginPage(email);
        objLoginPage.setPasswordFieldByLoginPage(password);
        objLoginPage.clickButtonEnter();
        MainPage objMainPage1 = objLoginPage.clickLogoOnLoginPage();
        LoginPage objLoginPage1 = objMainPage1.clickButtonPersonalAccount();
        objLoginPage1.getButtonAccount();
    }

    @DisplayName("Проверка перехода из личного кабинета в конструктор")
    @Description("Проверка перехода из личного кабинета в конструктор")
    @Test
    public void testTransferFromPersonalAccountInСonstructor() {
        MainPage objMainPage = open(URL_STELLAR_BURGER_PAGE, MainPage.class);
        LoginPage objLoginPage = objMainPage.clickButtonPersonalAccount();
        objLoginPage.setEmailByLoginPage(email);
        objLoginPage.setPasswordFieldByLoginPage(password);
        objLoginPage.clickButtonEnter();
        MainPage objMainPage1 = objLoginPage.clickButtonConsructor();
        objMainPage1.CheckGetMessageAssembleBurger();
    }

    @DisplayName("Переход на булки")
    @Description("Переход на булки")
    @Test
    public void testGetBun() {
        MainPage objMainPage = open(URL_STELLAR_BURGER_PAGE, MainPage.class);
        LoginPage objLoginPage = objMainPage.clickButtonPersonalAccount();
        objLoginPage.setEmailByLoginPage(email);
        objLoginPage.setPasswordFieldByLoginPage(password);
        objLoginPage.clickButtonEnter();
        MainPage objMainPage1 = objLoginPage.clickButtonConsructor();
        objMainPage1.CheckGetBun();
    }

    @DisplayName("Переход на соусы")
    @Description("Переход на соусы")
    @Test
    public void testGetSauce() {
        MainPage objMainPage = open(URL_STELLAR_BURGER_PAGE, MainPage.class);
        LoginPage objLoginPage = objMainPage.clickButtonPersonalAccount();
        objLoginPage.setEmailByLoginPage(email);
        objLoginPage.setPasswordFieldByLoginPage(password);
        objLoginPage.clickButtonEnter();
        MainPage objMainPage1 = objLoginPage.clickButtonConsructor();
        objMainPage1.CheckGetSauce();
    }

    @DisplayName("Переход на начинки")
    @Description("Переход на начинки")
    @Test
    public void testGetFilling() {
        MainPage objMainPage = open(URL_STELLAR_BURGER_PAGE, MainPage.class);
        LoginPage objLoginPage = objMainPage.clickButtonPersonalAccount();
        objLoginPage.setEmailByLoginPage(email);
        objLoginPage.setPasswordFieldByLoginPage(password);
        objLoginPage.clickButtonEnter();
        MainPage objMainPage1 = objLoginPage.clickButtonConsructor();
        objMainPage1.CheckGetFilling();
    }
}
