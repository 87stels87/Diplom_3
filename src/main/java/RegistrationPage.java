import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class RegistrationPage {
    @FindBy(how = How.XPATH, using = ".//*[@class='input__placeholder text noselect text_type_main-default' and contains(text(),'Имя')]/following-sibling::input")
    public SelenideElement nameFieldByRegistrationPage;

    public void setNameByRegistrationPage(String nameFieldByRegistrationPage) {
        this.nameFieldByRegistrationPage.setValue(nameFieldByRegistrationPage);
    }

    @FindBy(how = How.XPATH, using = ".//*[@class='input__placeholder text noselect text_type_main-default' and contains(text(),'Email')]/following-sibling::input")
    public SelenideElement emailFieldByRegistrationPage;

    public void setEmailByRegistrationPage(String emailField) {
        this.emailFieldByRegistrationPage.setValue(emailField);
    }

    @FindBy(how = How.XPATH, using = ".//*[@class='input__placeholder text noselect text_type_main-default' and contains(text(),'Пароль')]/following-sibling::input")
    public SelenideElement passwordFieldByRegistrationPage;

    public void setPasswordFieldByRegistrationPage(String passwordField) {
        this.passwordFieldByRegistrationPage.setValue(passwordField);
    }


    @FindBy(how = How.XPATH, using = ".//*[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']")
    public SelenideElement buttonRegistration;

    public void clickButtonRegistration() {
        buttonRegistration.click();
    }

    public void getURLafterClickButtonRegistration(String url) {
        webdriver().shouldHave(url(url));
    }

    @FindBy(how = How.XPATH, using = ".//*[@class='input__error text_type_main-default']")
    public SelenideElement messageNotCorrectPassword;


    public void getMessageNotCorrectPassword() {
        messageNotCorrectPassword.shouldBe(exactText("Некорректный пароль"));
    }


}
