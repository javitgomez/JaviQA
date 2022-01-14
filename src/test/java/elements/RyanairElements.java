package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class RyanairElements {


    public static SelenideElement ACCEPT_PRIVACY = $(byXpath("//button[contains(text(),'Sí, acepto')]"));

}
