import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginTest extends BaseTest {
    @Test
    public void testLoginAfterClickButtonEnter() {
        MainPage objMainPage = open(URL_STELLAR_BURGER_PAGE, MainPage.class);
        LoginPage objLoginPage = objMainPage.clickButtonLogIn();
        RegistrationPage objRegistrationPage = objLoginPage.scrolAndclickButtonRegistration();
        objRegistrationPage.setNameByRegistrationPage(name);
        objRegistrationPage.setEmailByRegistrationPage(email);
        objRegistrationPage.setPasswordFieldByRegistrationPage(password);
        LoginPage objLoginPage1 = objRegistrationPage.clickButtonRegistration();
        objLoginPage1.setEmailByLoginPage(email);
        objLoginPage1.setPasswordFieldByLoginPage(password);
        LoginOnPage loginOnPage = objLoginPage1.clickButtonEnter();
      //  objLoginPage1.getURLafterClickButtonEnter(URL_STELLAR_BURGER_PAGE);
        loginOnPage.clickButtonExit();

    }

    @Test
    public void testLoginAfterClickPersonalAccount() {
        MainPage objMainPage = open(URL_STELLAR_BURGER_PAGE, MainPage.class);
        LoginPage objLoginPage = objMainPage.clickButtonPersonalAccount();
        RegistrationPage objRegistrationPage = objLoginPage.scrolAndclickButtonRegistration();
        objRegistrationPage.setNameByRegistrationPage(name);
        objRegistrationPage.setEmailByRegistrationPage(email);
        objRegistrationPage.setPasswordFieldByRegistrationPage(password);
        LoginPage objLoginPage1 = objRegistrationPage.clickButtonRegistration();
        objLoginPage1.setEmailByLoginPage(email);
        objLoginPage1.setPasswordFieldByLoginPage(password);
        objLoginPage1.clickButtonEnter();
        objLoginPage1.getURLafterClickButtonEnter(URL_STELLAR_BURGER_PAGE);
    }

    @Test
    public void testLoginAfterClickEnterButtonByRegistrationForm() {
        MainPage objMainPage = open(URL_STELLAR_BURGER_PAGE, MainPage.class);
        LoginPage objLoginPage = objMainPage.clickButtonPersonalAccount();
        RegistrationPage objRegistrationPage = objLoginPage.scrolAndclickButtonRegistration();
        objRegistrationPage.setNameByRegistrationPage(name);
        objRegistrationPage.setEmailByRegistrationPage(email);
        objRegistrationPage.setPasswordFieldByRegistrationPage(password);
        LoginPage objLoginPage1 = objRegistrationPage.clickButtonRegistration();
        MainPage objMainPage1 = objLoginPage1.clickLogoOnLoginPage();
        objMainPage1.clickButtonPersonalAccount();
        RegistrationPage objRegistrationPage1 = objLoginPage.scrolAndclickButtonRegistration();
        LoginPage objLoginPage2 = objRegistrationPage1.clickButtonEnterByRegistrationForm();
        objLoginPage2.setEmailByLoginPage(email);
        objLoginPage2.setPasswordFieldByLoginPage(password);
        objLoginPage1.clickButtonEnter();
        objLoginPage1.getURLafterClickButtonEnter(URL_STELLAR_BURGER_PAGE);




     /*   LoginPage objLoginPage1 = objRegistrationPage.clickButtonRegistration();
        objLoginPage1.setEmailByLoginPage(email);
        objLoginPage1.setPasswordFieldByLoginPage(password);
        objLoginPage1.clickButtonEnter();
        objLoginPage1.getURLafterClickButtonEnter(URL_STELLAR_BURGER_PAGE);*/
    }


}
