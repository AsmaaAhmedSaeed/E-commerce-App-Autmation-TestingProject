package Step_Definitions;

import Pages_POM_D_P.P07_FollowUs;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;

import static Step_Definitions.Hooks.driver;

public class D07_FollowUs_StepDefs {
    //Scenario: when user press on facebook icon,it should open the corresponding website
    P07_FollowUs followUs = new P07_FollowUs();

    @When("user click on facebook icon")
    public void click_on_facebook_icon() throws InterruptedException {
        followUs.facebook().click();
        Thread.sleep(4000);
    }
    @Then("user logged successfully to the facebook website")
    public void facebook_website(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        //Now, we will switch between tabs and print CurrentUrl to make sure that
        // driver is moving between tabs successfully
        Hooks.driver.switchTo().window(Tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());

        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://web.facebook.com/nopCommerce?_rdc=1&_rdr"));

        Hooks.driver.switchTo().window(Tabs.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());

    }

    //Scenario: when user press on twitter icon,it should open the corresponding website
    @When("user click on twitter icon")
    public void click_on_twitter_icon(){
        followUs.twitter().click();
    }
    @Then("user logged successfully to the twitter website")
    public void twitter_website(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        //Now, we will switch between tabs and print CurrentUrl to make sure that
        // driver is moving between tabs successfully
        Hooks.driver.switchTo().window(Tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());

        Assert.assertTrue(driver.getCurrentUrl().contains("https://twitter.com/nopCommerce"));

        Hooks.driver.switchTo().window(Tabs.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());
    }


    //Scenario: when user press on news icon,it should open the corresponding website
    @When("user click on news icon")
    public void click_on_news_icon() {
        followUs.news().click();

    }
    @Then("user logged successfully to the news website")
    public void news_website(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.numberOfWindowsToBe(1));
        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        //Now, we will switch between tabs and print CurrentUrl to make sure that
        // driver is moving between tabs successfully
        Hooks.driver.switchTo().window(Tabs.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());

        Assert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/news/rss/1"));

    }


    //Scenario: when user press on youtube icon,it should open the corresponding website
    @When("user click on youtube icon")
    public void click_on_youtube_icon(){
        followUs.youtube().click();

    }
    @Then("user logged successfully to the youtube website")
    public void youtube_website(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        //Now, we will switch between tabs and print CurrentUrl to make sure that
        // driver is moving between tabs successfully
        Hooks.driver.switchTo().window(Tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.youtube.com/user/nopCommerce"));

        Hooks.driver.switchTo().window(Tabs.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());

    }
}
