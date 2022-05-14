package Step_Definitions;

import Pages_POM_D_P.P05_SearchName_Sku;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Locale;

public class D05_SearchNameSku_StepDefs {
    P05_SearchName_Sku search = new P05_SearchName_Sku();

    @When("user clicks on search field")
    public void user_clicks_on_search_field()
    {
        // locate search field and click on it
        search.searchField().click();
    }

    @And("user search with name of product")
    public void user_search_with_name_of_product()
    {
        search.searchField().sendKeys("book");
        search.searchbtn().click();
    }

    @Then("user could find relative results")
    public void user_could_find_relative_results()
    {
        int count = search.searchResults().size();
        System.out.println(count);
        Assert.assertTrue(count > 0);

        // findelements     [webelement0, webelement1]
        for (int x = 0; x < count ; x++) {
            System.out.println(search.searchResults().get(x).getText());
            Assert.assertTrue(search.searchResults().get(x).getText().toLowerCase().contains("book"));
        }
    }

    //Scenario: user could search for product using SKU

    @And("user search with sku of product")
    public void search_with_sku_of_product() throws InterruptedException {
        search.searchField().sendKeys("CS_TSHIRT");
        search.searchbtn().click();
        Thread.sleep(3000);
    }

    @Then("user could find the desired product")
    public void find_desired_product(){

    Assert.assertTrue(search.product_skuName().getText().toLowerCase().contains("shirt"));
    search.product_skuName().click();
    Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/custom-t-shirt");
    Assert.assertTrue(search.product_sku().getText().toLowerCase().contains("tshirt"));
    }
}
