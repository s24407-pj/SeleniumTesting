package com.demoqa.pages.forms;

import org.openqa.selenium.By;

import static utils.JavaScriptUtility.clickJS;
import static utils.JavaScriptUtility.scrollToElementJS;

public class PracticeFormPage extends FormsPage {
    private final By femaleRadioButton = By.id("gender-radio-2");
    private final By sportsHobbyCheckbox = By.id("hobbies-checkbox-1");
    private final By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
    private final By musicHobbyCheckbox = By.id("hobbies-checkbox-3");


    public void clickFemaleRadioButton() {
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public boolean isFemaleSelected(){
        return find(femaleRadioButton).isSelected();
    }

    public void clickSportsHobbyCheckbox(){
        if(!find(sportsHobbyCheckbox).isSelected()){
            scrollToElementJS(sportsHobbyCheckbox);
            clickJS(sportsHobbyCheckbox);
        }
    }

    public void clickReadingHobbyCheckbox(){
        if(!find(readingHobbyCheckbox).isSelected()){
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }

    public void clickMusicHobbyCheckbox(){
        if(!find(musicHobbyCheckbox).isSelected()){
            scrollToElementJS(musicHobbyCheckbox);
            clickJS(musicHobbyCheckbox);
        }
    }

    public void unclickMusicHobbyCheckbox(){
        if(find(musicHobbyCheckbox).isSelected()){
            scrollToElementJS(musicHobbyCheckbox);
            clickJS(musicHobbyCheckbox);
        }
    }

    public boolean isMusicSelected(){
        return find(musicHobbyCheckbox).isSelected();
    }
}
