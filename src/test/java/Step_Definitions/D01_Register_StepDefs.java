package Step_Definitions;

import Pages_POM_D_P.P01_Register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.ThreadLocalRandom;

public class D01_Register_StepDefs {
    // apply POM Design Pattern
    P01_Register register =new P01_Register();
// Scenario: user could register with Only Mandatory Data valid first name last name email password and confirm_password
    @Given("Go to Register Page")
    public void register_page()
    {
        register.registerButton().click();
    }

    @When("^Enter valid \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
    public void Enter_first_last_email_password(String firstname, String lastname, String Email,
                                                String password,String confirmPassword){
        register.firstnameTXT().sendKeys(firstname);
        register.lastnameTXT().sendKeys(lastname);
        register.EmailTXT().sendKeys(Email);
        register.passwordTXT().sendKeys(password);
        register.confirm_passwordTXT().sendKeys(confirmPassword);
    }
    @And("user press on register button")
    public void press_register()
    {
        register.click_register().click();
    }

    @Then("System direct user to profile page")
    public void success_register()
    {
        String msg = register.pageBody().getText();

        if (msg.contains("registration completed"))
        {
            Assert.assertTrue(register.result().isDisplayed());
            Assert.assertTrue(register.result().getText().contains("Your registration completed"));
        }
        else if(msg.contains("email already exists"))
        {
            Assert.assertTrue(register.messageError().isDisplayed());
            Assert.assertTrue(register.messageError().getText().contains("email already exists"));
        }

        else {
            Assert.assertTrue(false, "different message is displayed");
        }

    }
 //Scenario: user could register with valid necessary and optional data
    @When("user select female gender")
    public void select_female_gender(){
     register.Female_gender().click();
    }
    @And("Enter birth of day")
        public void Day_dropdown () throws InterruptedException {
         int min = 1;
         int max = 31;
         int random_int = (int)Math.floor(Math.random()*(max - min+1)+min);
        Select select = new Select(register.Day_dropdown());
        select.selectByIndex(random_int);
            Thread.sleep(2000);

     }
        @And("Enter birth of Month")
                public void Month_dropdown() throws InterruptedException {
            int min = 1;
            int max = 12;
            int random_int = (int)Math.floor(Math.random()*(max - min+1)+min);
            Select select = new Select(register.Month_dropdown());
            select.selectByIndex(random_int);
            Thread.sleep(2000);
        }
        @And("Enter birth of year")
        public void year_dropdown() throws InterruptedException {
            int min = 1;
            int max = 110;
            int random_int = (int)Math.floor(Math.random()*(max - min+1)+min);
            Select select = new Select(register.year_dropdown());
            select.selectByIndex(random_int);
            Thread.sleep(2000);
        }


}
