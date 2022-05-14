package Pages_POM_D_P;

import Step_Definitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P01_Register {
    public WebElement registerButton()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }

    public WebElement firstnameTXT()
    {
        return Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement lastnameTXT()
    {
        return Hooks.driver.findElement(By.id("LastName"));
    }

    public WebElement EmailTXT()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement passwordTXT()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement confirm_passwordTXT()
    {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement click_register()
    {
        return Hooks.driver.findElement(By.id("register-button"));
    }

    public WebElement pageBody()
    {
        return  Hooks.driver.findElement(By.cssSelector("div[class=\"page-body\"]"));
    }

    public WebElement result()
    {
        return  Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }

    public WebElement messageError()
    {
        return  Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }
    public WebElement Female_gender(){
        return Hooks.driver.findElement(By.id("gender-female"));
    }

    public WebElement Day_dropdown(){
        return Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]"));
    }

    public WebElement Month_dropdown(){
        return Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"]"));
    }

    public WebElement year_dropdown(){
        return Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"]"));
    }

}
