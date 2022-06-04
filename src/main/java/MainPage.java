import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class MainPage {
    @FindBy(how = How.XPATH, using = ".//*[@class='AppHeader_header__linkText__3q_va ml-2' and contains(text(),'Личный Кабинет')]")
    public SelenideElement buttonPersonalAccount;

    @FindBy(how = How.XPATH, using = ".//*[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg' and contains(text(),'Войти в аккаунт')]")
    public SelenideElement buttonLogIn;

    public MainPage clickButtonLogIn() {
        buttonLogIn.click();
        MainPage mainPage = page(MainPage.class);
        return mainPage;
    }

    public LoginPage clickButtonPersonalAccount() {
        buttonPersonalAccount.click();
        LoginPage loginPage = page(LoginPage.class);
        return loginPage;
    }

    @FindBy(how = How.XPATH, using = ".//*[@class='AppHeader_header__logo__2D0X2']")
    public SelenideElement logoOnMainPage;

    public void clicklogoOnMainPage() {
        logoOnMainPage.scrollTo().click();
    }


}
