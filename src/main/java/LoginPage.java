import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class LoginPage {
    @FindBy(how = How.XPATH, using = ".//*[@class='input__placeholder text noselect text_type_main-default' and contains(text(),'Email')]/following-sibling::input")
    public SelenideElement emailFieldByLoginPage;

    public void setEmailByLoginPage(String emailField) {
        this.emailFieldByLoginPage.setValue(emailField);
    }

    @FindBy(how = How.XPATH, using = ".//*[@class='input__placeholder text noselect text_type_main-default' and contains(text(),'Пароль')]/following-sibling::input")
    public SelenideElement passwordFieldByLoginPage;

    public void setPasswordFieldByLoginPage(String passwordField) {
        this.passwordFieldByLoginPage.setValue(passwordField);
    }


    @FindBy(how = How.XPATH, using = ".//*[@class='Auth_link__1fOlj' and contains(@href, '/register')]")
    public SelenideElement buttonRegistration;


    public RegistrationPage scrolAndclickButtonRegistration() {
        this.buttonRegistration.scrollTo().click();
        RegistrationPage registrationPage = page(RegistrationPage.class);
        return registrationPage;
    }

    @FindBy(how = How.XPATH, using = ".//*[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']")
    public SelenideElement buttonEnter;

    public LoginOnPage clickButtonEnter() {
        buttonEnter.click();
        LoginOnPage loginOnPage = page(LoginOnPage.class);
        return loginOnPage;
    }

    public void getURLafterClickButtonEnter(String url) {
        webdriver().shouldHave(url(url));
    }


    @FindBy(how = How.XPATH, using = ".//*[@class='AppHeader_header__logo__2D0X2']")
    public SelenideElement logoOnLoginPage;

    public MainPage clickLogoOnLoginPage() {
        logoOnLoginPage.scrollTo().click();
        MainPage mainPage = page(MainPage.class);
        return mainPage;
    }
}
