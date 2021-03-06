package com.Training4;

import net.thucydides.core.annotations.Managed;
import com.Training4.tools.Constants; 

import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Training4.requirements.Application;
import com.Training4.steps.LoginSteps;

@Story(Application.Search.SearchByKeyword.class)
@RunWith(ThucydidesRunner.class)
public class LoginTest {
    
	@Managed(uniqueSession = true)
    public WebDriver webdriver;
    
    @ManagedPages(defaultUrl = Constants.BASE_URL)
    public Pages pages;
    
    @Steps
    LoginSteps loginSteps;
    
    @Test
    public void login_test(){
    	loginSteps.login(Constants.DM_USER, Constants.DM_PASS);
    }
 
//    @Steps
//    public LoginSteps endUser;
//
//    @Issue("#WIKI-1")
//    @Test
//    public void searching_by_keyword_apple_should_display_the_corresponding_article() {
//        endUser.is_the_home_page();
//		endUser.looks_for("apple");
//        endUser.should_see_definition("A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.");
//
//    }
//
//    @Test
//    public void searching_by_keyword_banana_should_display_the_corresponding_article() {
//        endUser.is_the_home_page();
//		endUser.looks_for("pear");
//		endUser.should_see_definition("An edible fruit produced by the pear tree, similar to an apple but elongated towards the stem.");
//    }

} 