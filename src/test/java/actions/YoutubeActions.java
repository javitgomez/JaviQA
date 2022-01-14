package actions;

import elements.YoutubeElements;

import static com.codeborne.selenide.Selenide.open;
import static elements.YoutubeElements.*;

public class YoutubeActions {


    YoutubeElements youtubeElements = new YoutubeElements();
    public void openYoutube(){
        open("https://www.youtube.com");
    }
    public void search(){
        SEARCH_BAR.sendKeys("Dakar");
    }
    public void searchButton(){
        SEARCH_ICON.click();
    }
    public void acceptConditions(){
        ACCEPT_CONDITIONS.click();}

}
