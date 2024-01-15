import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class RegistrationTest extends BaseTest {

    @DisplayName("Позитивная проверка на регистрацию с валидным паролем")
    @Description("Позитивная проверка на регистрацию с валидным паролем")
    @Test
    public void testPositiveRegistration() {
        MainPage objMainPage = open(URL_STELLAR_BURGER_PAGE, MainPage.class);
        LoginPage objLoginPage = objMainPage.clickButtonLogIn();
        RegistrationPage objRegistrationPage = objLoginPage.scrolAndclickButtonRegistration();
        objRegistrationPage.setNameEmailPassswordAndClickButtonRegistation(name, email, password);
        objRegistrationPage.CheckGetURLafterClickButtonRegistration(URL_STELLAR_BURGER_PAGE_LOGIN);
    }

    @DisplayName("Негативная проверка на регистрацию с вводом пароля менее 6 символов")
    @Description("Негативная проверка на регистрацию с вводом пароля менее 6 символов")
    @Test
    public void testNegativeRegistrationLess6charactersInPassword() {
        MainPage objMainPage = open(URL_STELLAR_BURGER_PAGE, MainPage.class);
        LoginPage objLoginPage = objMainPage.clickButtonLogIn();
        RegistrationPage objRegistrationPage = objLoginPage.scrolAndclickButtonRegistration();
        objRegistrationPage.setNameEmailPassswordAndClickButtonRegistation(name, email, passwordLess6characters);
        objRegistrationPage.CheckGetMessageNotCorrectPassword();
    }
}
