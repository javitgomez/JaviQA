package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class EmployeesElements {
    public static SelenideElement ANDREW_BUTTON = $(byXpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[2]"));
    public static SelenideElement ANDREW_DOWN_BUTTON = $(byXpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]"));
    public static SelenideElement NANCY_BUTTON = $(byXpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/span[4]"));
    public static SelenideElement NANCY_BUTTON_OFF = $(byXpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/span[4]/div[1]"));
    public static SelenideElement JANET_BUTTON = $(byXpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/span[4]"));
    public static SelenideElement JANET_BUTTON_OFF = $(byXpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/span[4]/div[1]"));
    public static SelenideElement MARGARET_BUTTON = $(byXpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[1]/span[4]"));
    public static SelenideElement MARGARET_BUTTON_OFF = $(byXpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[1]/span[4]"));
    public static SelenideElement STEVEN_BUTTON = $(byXpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[1]/span[3]"));
    public static SelenideElement STEVEN_DOWN_BUTTON = $(byXpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[1]/span[2]"));
    public static SelenideElement MICHAEL_BUTTON = $(byXpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/table[1]/tbody[1]/tr[6]/td[1]/span[5]"));
    public static SelenideElement ROBERT_BUTTON = $(byXpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/table[1]/tbody[1]/tr[7]/td[1]/span[5]"));
    public static SelenideElement ANNE_BUTTON = $(byXpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/table[1]/tbody[1]/tr[8]/td[1]/span[5]"));
    public static SelenideElement ANNE_BUTTON_OFF = $(byXpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/table[1]/tbody[1]/tr[8]/td[1]/span[5]/div[1]"));
    public static SelenideElement LAURA_BUTTON = $(byXpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/table[1]/tbody[1]/tr[9]/td[1]/span[4]"));
    public static SelenideElement LAURA_BUTTON_OFF = $(byXpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/table[1]/tbody[1]/tr[9]/td[1]/span[4]/div[1]"));
    public static SelenideElement SHOW_LIST_BUTTON = $(byXpath("/html[1]/body[1]/button[1]"));
    public static SelenideElement SHOW_LIST_TEXT = $(byXpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]"));
}
