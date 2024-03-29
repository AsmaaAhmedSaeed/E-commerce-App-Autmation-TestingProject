package Pages_POM_D_P;

import Step_Definitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P03_ResetPassword {
    //pom design pattern (class for every feature)
    //public WebElement loginBtn() {return Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]"));}
    public WebElement forgotPassword(){return Hooks.driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]"));}
    public WebElement emailTxt()
    {
        return   Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement recoverButton(){return   Hooks.driver.findElement(By.name("send-email"));}
    public WebElement confirmationMessage(){return   Hooks.driver.findElement(By.className("content"));}
}
