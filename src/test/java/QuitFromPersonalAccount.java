import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class QuitFromPersonalAccount extends BaseTest {
    @Before
    public void createUser() {
        MainPage objMainPage = open(URL_STELLAR_BURGER_PAGE, MainPage.class);
        LoginPage objLoginPage = objMainPage.clickButtonPersonalAccount();
        RegistrationPage objRegistrationPage = objLoginPage.scrolAndclickButtonRegistration();
        objRegistrationPage.setNameByRegistrationPage(name);
        objRegistrationPage.setEmailByRegistrationPage(email);
        objRegistrationPage.setPasswordFieldByRegistrationPage(password);
        objRegistrationPage.clickButtonRegistration();
        objRegistrationPage.clickLogoOnRegistrationPage();
    }
    @DisplayName("Выход из аккаунта")
    @Description("Выход из аккаунта")
    @Test
    public void testQuitFromPersonalAccount() {
        MainPage objMainPage1 = open(URL_STELLAR_BURGER_PAGE, MainPage.class);
        objMainPage1.logoOnMainPage.click();
        LoginPage objLoginPage2 = objMainPage1.clickButtonPersonalAccount();
        objLoginPage2.setEmailByLoginPage(email);
        objLoginPage2.setPasswordFieldByLoginPage(password);
        MainPage objMainPage2 = objLoginPage2.clickButtonEnter();
        objMainPage2.clicklogoOnMainPage();
        LoginPage objLoginPage3 = objMainPage2.clickButtonPersonalAccount();
        objLoginPage3.getURLafterClickButtonExit(URL_STELLAR_BURGER_PAGE_LOGIN);



    }
    }
