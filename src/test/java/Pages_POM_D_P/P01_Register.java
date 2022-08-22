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
    public WebElement success_register()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"button-1 register-continue-button\"]"));
    }
    public WebElement Female_gender(){
        return Hooks.driver.findElement(By.id("gender-female"));
    }
    public WebElement Day_dropdown(){
        return Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]"));
    }
  //  public List<WebElement> Birth_Day(){
   //     return Hooks.driver.findElements(By.cssSelector("select[name=\"DateOfBirthDay\"] option"));}

    public WebElement Month_dropdown(){
        return Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"]"));
    }
   // public List<WebElement> Birth_Month(){
    //    return Hooks.driver.findElements(By.cssSelector("select[name=\"DateOfBirthMonth\"] option"));}

    public WebElement year_dropdown(){
        return Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"]"));
    }
  //  public List<WebElement> Birth_year(){
      //  return Hooks.driver.findElements(By.cssSelector("select[name=\"DateOfBirthYear\"] option"));}
}
