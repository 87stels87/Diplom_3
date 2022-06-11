import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {
    @FindBy(how = How.XPATH, using = ".//*[@class='AppHeader_header__linkText__3q_va ml-2' and contains(text(),'Личный Кабинет')]")
    public SelenideElement buttonPersonalAccount;

    @FindBy(how = How.XPATH, using = ".//*[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg' and contains(text(),'Войти в аккаунт')]")
    public SelenideElement buttonLogIn;

    public LoginPage clickButtonLogIn() {
        buttonLogIn.click();
        LoginPage loginPage = page(LoginPage.class);
        return loginPage;
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

    @FindBy(how = How.XPATH, using = ".//*[@class='text text_type_main-large mb-5 mt-10' and contains(text(),'Соберите бургер')]")
    public SelenideElement messageAssembleBurger;

    public void CheckGetMessageAssembleBurger() {
        messageAssembleBurger.shouldBe().isDisplayed();
    }

    @FindBy(how = How.XPATH, using = ".//*[@class='text text_type_main-default'  and contains(text(),'Начинки')]")
    public SelenideElement fillingChapter;

    public void transferFillingChapter() {
        fillingChapter.click();
    }

    @FindBy(how = How.XPATH, using = ".//*[@class='text text_type_main-default'  and contains(text(),'Соус')]")
    public SelenideElement souceChapter;

    public void transferSouceChapter() {
        souceChapter.click();
    }

    public void CheckCurentChapterSouce() {
        curentChapter.shouldBe(exactText("Соусы"));
    }

    @FindBy(how = How.XPATH, using = ".//*[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']")
    public SelenideElement curentChapter;

    public void CheckCurentChapterFilling() {
        curentChapter.shouldBe(exactText("Начинки"));
    }

    public void checkCurentChapterBun() {
        curentChapter.shouldBe(exactText("Булки"));
    }
}
