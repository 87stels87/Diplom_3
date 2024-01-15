import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginTest extends BaseTest {
    @After
    public void exitFromPersonalAccount() {
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


    @DisplayName("Вход через нажатие на кнопку Личный кабинет")
    @Description("Вход через нажатие на кнопку Личный кабинет")
    @Test
    public void testLoginAfterClickPersonalAccount() {
        MainPage objMainPage = open(URL_STELLAR_BURGER_PAGE, MainPage.class);
        LoginPage objLoginPage = objMainPage.clickButtonPersonalAccount();
        objLoginPage.setEmailAndPasswordAndClickByLoginPage(email, password);
        objLoginPage.CheckGetURLafterClickButtonEnter(URL_STELLAR_BURGER_PAGE);
    }

    @DisplayName("Вход через нажатие на кнопку Войти в аккаунт")
    @Description("Вход через нажатие на кнопку Войти в аккаунт")
    @Test
    public void testLoginAfterClickButtonEnter() {
        MainPage objMainPage = open(URL_STELLAR_BURGER_PAGE, MainPage.class);
        LoginPage objLoginPage = objMainPage.clickButtonLogIn();
        objLoginPage.setEmailAndPasswordAndClickByLoginPage(email, password);
        objLoginPage.CheckGetURLafterClickButtonEnter(URL_STELLAR_BURGER_PAGE);
    }

    @DisplayName("Вход через форму регистрации")
    @Description("Вход через форму регистрации")
    @Test
    public void testLoginAfterClickEnterButtonByRegistrationForm() {
        MainPage objMainPage = open(URL_STELLAR_BURGER_PAGE, MainPage.class);
        LoginPage objLoginPage = objMainPage.clickButtonLogIn();
        objLoginPage.scrolAndclickButtonRegistration();
        objLoginPage.clickButtonLogin();
        objLoginPage.setEmailAndPasswordAndClickByLoginPage(email, password);
        objLoginPage.CheckGetURLafterClickButtonEnter(URL_STELLAR_BURGER_PAGE);
    }

    @DisplayName("Вход через форму восстановление пароля")
    @Description("Вход через форму восстановление пароля")
    @Test
    public void testLoginAfterClickEnterButtonByRecoveryPasswordForm() {
        MainPage objMainPage = open(URL_STELLAR_BURGER_PAGE, MainPage.class);
        LoginPage objLoginPage = objMainPage.clickButtonLogIn();
        objLoginPage.clickButtonRecoveryPassword();
        objLoginPage.clickButtonLogin();
        objLoginPage.setEmailAndPasswordAndClickByLoginPage(email, password);
        objLoginPage.CheckGetURLafterClickButtonEnter(URL_STELLAR_BURGER_PAGE);
    }
}
