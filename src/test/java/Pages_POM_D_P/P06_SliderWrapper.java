package Pages_POM_D_P;

import Step_Definitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P06_SliderWrapper {
    public WebElement nokia(){
        return Hooks.driver.findElement
                (By.cssSelector("div[id=\"nivo-slider\"] a[style=\"display: block;\"]"));
    }

    public WebElement iphone(){
        return Hooks.driver.findElement
                (By.cssSelector("div[id=\"nivo-slider\"] a[style=\"display: none;\"]"));
    }

}
