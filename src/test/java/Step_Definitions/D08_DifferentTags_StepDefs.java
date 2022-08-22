package Step_Definitions;

import Pages_POM_D_P.P08_DifferentTags;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;

import static Step_Definitions.Hooks.driver;

public class D08_DifferentTags_StepDefs {

    P08_DifferentTags selectTags = new P08_DifferentTags();

    static String tag_Store ;
    @When("user click on {string} Tag")
    public void userClickOnTag(String tag) {
        tag_Store = tag;
        driver.findElement(new By.ByCssSelector("a[href=\"/"+ tag +"\"]")).click();
    }

    @Then("user redirected to correct page")
    public void userRedirectedToCorrectPage() {
        String url = "https://demo.nopcommerce.com/"+tag_Store;
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),url);
    }
}
