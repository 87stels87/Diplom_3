import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class LoginOnPage {
    @FindBy(how = How.XPATH, using = ".//*[@class='Account_button__14Yp3 text text_type_main-medium text_color_inactive']")
    public SelenideElement buttonExit;

    public LoginPage clickButtonExit() {
        buttonExit.click();
        LoginPage loginPage = page(LoginPage.class);
        return loginPage;
    }
}
