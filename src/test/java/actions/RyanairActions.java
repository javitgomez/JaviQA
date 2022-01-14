package actions;

import elements.RyanairElements;
import elements.YoutubeElements;

import static com.codeborne.selenide.Selenide.open;

public class RyanairActions {


    RyanairElements ryanairElements = new RyanairElements();


    public void ClickAccpet(){
        open("https://www.ryanair.com/es/es");
        RyanairElements.ACCEPT_PRIVACY.click();
    }
}
