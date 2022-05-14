package Pages_POM_D_P;

import Step_Definitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P07_FollowUs {
    public WebElement facebook(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
    }

    public WebElement twitter(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
    }

    public WebElement news(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));
    }

    public WebElement youtube(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }
}
