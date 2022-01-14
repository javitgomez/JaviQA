package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class YoutubeElements {

    public static SelenideElement SEARCH_BAR = $(byXpath("//input[@id='search']"));
    public static SelenideElement SEARCH_ICON = $(byId("search-icon-legacy"));
    public static SelenideElement ACCEPT_CONDITIONS = $(byXpath("/html/body/ytd-app/ytd-consent-bump-v2-lightbox/tp-yt-paper-dialog/div[4]/div[2]/div[5]/div[2]/ytd-button-renderer[2]/a/tp-yt-paper-button"));



}
