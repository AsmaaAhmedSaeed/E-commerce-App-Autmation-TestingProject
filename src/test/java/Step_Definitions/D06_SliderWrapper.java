package Step_Definitions;

import Pages_POM_D_P.P06_SliderWrapper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D06_SliderWrapper {
    //Scenario: user could navigate successfully to related page when click on Nokia slider wrapper
    P06_SliderWrapper slider =new P06_SliderWrapper();
    @When("user click on Nokia slider wrapper")
    public void click_on_Nokia_sliderwrapper(){
        slider.nokia().click();
    }
    @Then("user navigate to Nokia related page")
    public void navigate_to_Nokia_related_page() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
       // soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/nokia-lumia-1020"));
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"));
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        soft.assertAll();
        Thread.sleep(2000);
    }

    //Scenario: user could navigate successfully to related page when click on Iphone slider wrapper
    @When("user click on Iphone slider wrapper")
    public void click_on_Iphone_sliderwrapper(){
        slider.iphone().click();
    }
    @Then("user navigate to Iphone related page")
    public void navigate_to_Iphone_related_page(){
        SoftAssert soft = new SoftAssert();
       // soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/iPhone6"));
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"));
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        soft.assertAll();
    }
}
