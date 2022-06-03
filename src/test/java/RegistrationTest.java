import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class RegistrationTest extends BaseTest {


    @Test
    public void testPositiveRegistration() {
        MainPage objMainPage = open(URL_STELLAR_BURGER_PAGE, MainPage.class);
        LoginPage objLoginPage = objMainPage.clickButtonLogIn();
        RegistrationPage objRegistrationPage = objLoginPage.scroolAndclickButtonRegistation();
        objRegistrationPage.setNameByRegistrationPage(name);
        objRegistrationPage.setEmailByRegistrationPage(email);
        objRegistrationPage.setPasswordFieldByRegistrationPage(password);
        objRegistrationPage.clickButtonRegistration();
        objRegistrationPage.getURLafterClickButtonRegistration(URL_STELLAR_BURGER_PAGE_LOGIN);
    }

    @Test
    public void testNegativeRegistrationLess6charactersInPassword() {
        MainPage objMainPage = open(URL_STELLAR_BURGER_PAGE, MainPage.class);
        LoginPage objLoginPage = objMainPage.clickButtonLogIn();
        RegistrationPage objRegistrationPage = objLoginPage.scroolAndclickButtonRegistation();
        objRegistrationPage.setNameByRegistrationPage(name);
        objRegistrationPage.setEmailByRegistrationPage(email);
        objRegistrationPage.setPasswordFieldByRegistrationPage(passwordLess6characters);
        objRegistrationPage.clickButtonRegistration();
        objRegistrationPage.getMessageNotCorrectPassword();
    }



}
