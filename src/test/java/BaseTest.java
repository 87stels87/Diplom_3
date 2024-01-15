import com.github.javafaker.Faker;

public class BaseTest {
    protected static final String URL_STELLAR_BURGER_PAGE = "https://stellarburgers.nomoreparties.site/";
    protected static final String URL_STELLAR_BURGER_PAGE_LOGIN = "https://stellarburgers.nomoreparties.site/login";

    //для яндекса:
/*        @BeforeClass
    public  static void  setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/apple/Desktop/driver/yandexdriver/");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("/Applications/Yandex.app/Contents/MacOS/Yandex");
    }*/
    Faker faker = new Faker();
    protected String name = faker.pokemon().name();
    protected String password = faker.lorem().characters(10);
    protected String email = faker.internet().emailAddress();
    protected String passwordLess6characters = faker.lorem().characters(5);
}
