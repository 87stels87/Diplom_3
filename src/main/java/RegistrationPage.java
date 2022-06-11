import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class RegistrationPage {
    public void setNameEmailPassswordAndClickButtonRegistation(String name, String email, String password) {
        this.nameFieldByRegistrationPage.setValue(name);
        this.emailFieldByRegistrationPage.setValue(email);
        this.passwordFieldByRegistrationPage.setValue(password);
        buttonRegistration.click();
    }

    @FindBy(how = How.XPATH, using = ".//*[@class='input__placeholder text noselect text_type_main-default' and contains(text(),'Имя')]/following-sibling::input")
    public SelenideElement nameFieldByRegistrationPage;

/*    public void setNameByRegistrationPage(String nameFieldByRegistrationPage) {
        this.nameFieldByRegistrationPage.setValue(nameFieldByRegistrationPage);
    }*/

    @FindBy(how = How.XPATH, using = ".//*[@class='input__placeholder text noselect text_type_main-default' and contains(text(),'Email')]/following-sibling::input")
    public SelenideElement emailFieldByRegistrationPage;

/*    public void setEmailByRegistrationPage(String emailField) {
        this.emailFieldByRegistrationPage.setValue(emailField);
    }*/

    @FindBy(how = How.XPATH, using = ".//*[@class='input__placeholder text noselect text_type_main-default' and contains(text(),'Пароль')]/following-sibling::input")
    public SelenideElement passwordFieldByRegistrationPage;

/*    public void setPasswordFieldByRegistrationPage(String passwordField) {
        this.passwordFieldByRegistrationPage.setValue(passwordField);
    }*/


    @FindBy(how = How.XPATH, using = ".//*[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']")
    public SelenideElement buttonRegistration;

/*    public LoginPage clickButtonRegistration() {
        buttonRegistration.click();
        LoginPage loginPage = page(LoginPage.class);
        return loginPage;
    }*/

    public void CheckGetURLafterClickButtonRegistration(String url) {
        webdriver().shouldHave(url(url));
    }

    @FindBy(how = How.XPATH, using = ".//*[@class='input__error text_type_main-default']")
    public SelenideElement messageNotCorrectPassword;


    public void CheckGetMessageNotCorrectPassword() {
        messageNotCorrectPassword.shouldBe(exactText("Некорректный пароль"));
    }

/*    @FindBy(how = How.XPATH, using = ".//*[@class='Auth_link__1fOlj']")
    public SelenideElement buttonEnterByRegistrationForm;*/

/*    public LoginPage clickButtonEnterByRegistrationForm() {
        buttonEnterByRegistrationForm.click();
        LoginPage loginPage = page(LoginPage.class);
        return loginPage;
    }*/


/*    @FindBy(how = How.XPATH, using = ".//*[@class='AppHeader_header__logo__2D0X2']")
    public SelenideElement logoOnRegistrationPage;*/

/*    public MainPage clickLogoOnRegistrationPage() {
        logoOnRegistrationPage.scrollTo().click();
        MainPage mainPage = page(MainPage.class);
        return mainPage;
    }*/

    @FindBy(how = How.XPATH, using = ".//*[@class='Auth_link__1fOlj']")
    public SelenideElement buttonEnterfromRegistrationForm;

/*    public LoginPage clickButtonEnterfromRegistrationForm() {
        buttonEnterfromRegistrationForm.scrollTo().click();
        LoginPage loginPage = page(LoginPage.class);
        return loginPage;
    }*/


}
