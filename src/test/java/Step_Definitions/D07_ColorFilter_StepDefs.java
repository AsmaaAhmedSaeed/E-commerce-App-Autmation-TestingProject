package Step_Definitions;

import Pages_POM_D_P.P07_ColorFilter;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D07_ColorFilter_StepDefs {
    //Scenario: user could navigate successfully to related page when click on Nokia slider wrapper
    P07_ColorFilter colorFilter =new P07_ColorFilter();

    @When("user hover on Apparel option and select shoes category")
    public void hover_on_Apparel_option() throws InterruptedException {
        //finding element
        colorFilter.apparel();
        //Instantiating Actions class
        Actions action = new Actions(Hooks.driver);
        //Hovering on apparel option
        action.moveToElement(colorFilter.apparel());
        Thread.sleep(1000);

        // Locating the element from Sub Menu
        colorFilter.sub_option_shoes();
        //To mouseover on sub menu
        action.moveToElement(colorFilter.sub_option_shoes());
        action.click().build().perform();
    }

    @Then("user move successfully to the shoes page")
    public void user_move_successfully()
    {
        String url = "https://demo.nopcommerce.com/shoes";
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),url);
    }

    @When("Selecting {string} color option")
    public void selectingColorOption(String color) {
        colorFilter.redColorFilter().click();
    }

    @Then("Filter is applied")
    public void filterIsApplied() {
        String url = "https://demo.nopcommerce.com/shoes?viewmode=grid&orderby=0&pagesize=6&specs=15";
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),url);

    }

}
