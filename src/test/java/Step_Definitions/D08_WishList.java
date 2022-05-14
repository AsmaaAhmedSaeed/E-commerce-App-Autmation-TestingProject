package Step_Definitions;

import Pages_POM_D_P.P08_WishList;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D08_WishList {
    P08_WishList wishList =new P08_WishList();
   @When("user click on apple product")
    public void click_on_apple_product(){
       wishList.Apple_product().click();
    }
    @And("user clicks on add to wishlist button from detailed product page")
    public void clicks_on_add_to_wishlist_button() throws InterruptedException {
       wishList.detailed_wishButton().click();
       Thread.sleep(4000);
    }
    @And("user go to wish list page")
    public void go_to_wishlist_page(){
       wishList.wishlist_page().click();
    }
    @Then("Apple product will added to wishlist")
    public void product_will_added_to_wishlist(){
      String SKU_Product =wishList.SKU_desired_product().getText();
        Assert.assertTrue(SKU_Product.contains("AP_MBP_13"));
    }

}
