package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ZaraElements {
    public static SelenideElement COOKIES_BUTTON = $(byId("onetrust-accept-btn-handler"));
    public static SelenideElement LOGON_BUTTON = $(byXpath("//header/div[1]/div[2]/div[1]/a[1]"));
    public static SelenideElement USER_BAR = $(byXpath("//body/div[@id='app-root']/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/div[2]/div[1]/section[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
    public static SelenideElement PASSWORD_BAR = $(byXpath("//body/div[@id='app-root']/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/div[2]/div[1]/section[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
    public static SelenideElement CONFIRM_lOGON_BUTTON = $(byXpath("//body/div[@id='app-root']/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/div[2]/div[1]/section[1]/form[1]/div[2]/button[1]/div[1]"));
    public static SelenideElement SEARCH_BUTTON = $(byXpath("//header/div[1]/div[2]/div[1]/div[1]/a[1]/span[1]"));
    public static SelenideElement SEARCH_BARR = $(byXpath("//input[@id='search-products-form-combo-input']"));
    public static SelenideElement SEARCH_BUTTON_TROUSERS = $(byXpath("//body/div[@id='app-root']/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/div[2]/section[1]/ul[1]/li[2]"));
    //public static SelenideElement BUTTON_COLOR = $(byXpath(""));
    //public static SelenideElement BUTTON_SIZE = $(byXpath("//span[contains(text(),'36')]"));
    public static SelenideElement BUTTON_ADD_CART = $(byXpath("//body/div[@id='app-root']/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[2]/div[1]/div[3]/button[1]"));
    public static SelenideElement BUTTON_GO_CART = $(byXpath("//header/div[1]/div[2]/div[1]/a[3]"));
    public static SelenideElement BUTTON_ADD_1_MORE= $(byXpath("//body/div[@id='app-root']/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/article[1]/div[2]/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[2]\n"));
    public static SelenideElement BUTTON_EDIT_ORDER= $(byXpath("//p[contains(text(),'Ticket regalo incluido')]"));
    public static SelenideElement FROM_BAR= $(byXpath("//body/div[@id='app-root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]"));
    public static SelenideElement MESSAGE_BAR= $(byXpath("//label[@id='form-input__label-gift-ticket-message']"));
    public static SelenideElement BUTTON_SAVE_EDIT = $(byXpath("//body/div[@id='app-root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]"));
    public static SelenideElement BUTTON_CONTINUE_1 = $(byXpath("//body/div[@id='app-root']/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/article[1]/div[2]/div[2]/div[2]/section[1]/div[2]/div[2]/div[2]/button[1]/div[1]"));
    public static SelenideElement BUTTON_CONTINUE_2 = $(byXpath("//body/div[@id='app-root']/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[2]/div[2]/div[2]/button[1]"));
    public static SelenideElement CARD_BUTTON = $(byXpath("//body/div[@id='app-root']/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/article[1]/div[2]/div[2]/section[1]/fieldset[1]/div[1]/div[1]/div[1]/label[1]"));
    public static SelenideElement BUTTON_CONTINUE_3 = $(byXpath("//body/div[@id='app-root']/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/article[1]/div[2]/div[2]/div[1]/section[1]/div[2]/div[2]/div[2]/button[1]"));
    public static SelenideElement BUTTON_BACK = $(byXpath("//header/div[1]/div[1]/div[1]/a[1]"));
    public static SelenideElement BUTTON_ACCOUNT = $(byXpath("//header/div[1]/div[2]/div[1]/a[1]"));
    public static SelenideElement BUTTON_LOGOUT = $(byXpath("//span[contains(text(),'Cerrar sesión')]"));



    // public static SelenideElement BUTTON_ADD_CART = $(byXpath("//body/div[@id='app-root']/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[2]/div[1]/div[5]/button[1]"));
}