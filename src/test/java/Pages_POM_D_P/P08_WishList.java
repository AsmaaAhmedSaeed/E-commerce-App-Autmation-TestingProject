package Pages_POM_D_P;

import Step_Definitions.Hooks;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P08_WishList {
    public WebElement Apple_product(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]"));
    }

    public WebElement detailed_wishButton(){
        return Hooks.driver.findElement(By.id("add-to-wishlist-button-4"));
    }

    public WebElement wishlist_page(){
        return Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));
    }

    public WebElement SKU_desired_product(){
        return Hooks.driver.findElement(By.cssSelector("span[class=\"sku-number\"]"));

    }
}
