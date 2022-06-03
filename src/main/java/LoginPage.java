import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class LoginPage {
    @FindBy(how = How.XPATH, using = ".//*[@class='text input__textfield text_type_main-default' and contains(@name, 'name')]")
    public SelenideElement nameFieldByLoginPage;

    public void setEmailByLoginPage(String emailField) {
        this.nameFieldByLoginPage.setValue(emailField);
    }

    @FindBy(how = How.XPATH, using = ".//*[@class='Auth_link__1fOlj' and contains(@href, '/register')]")
    public SelenideElement buttonRegistration;


    public RegistrationPage scroolAndclickButtonRegistation() {
        this.buttonRegistration.scrollTo().click();
        RegistrationPage registrationPage = page(RegistrationPage.class);
        return registrationPage;
    }
}
