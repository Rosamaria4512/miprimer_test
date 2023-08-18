package cosenasoft.stepsdefinitions;

import com.co.senasoft.steps.RegisterStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.implementation.bytecode.Throw;
import net.thucydides.core.annotations.Steps;

public class RegisterStepDefinitions {
    @Steps
    RegisterStep registerStep;


    @Given("he user in on the web page")
    public void heUserInOnTheWebPage() {
        registerStep.openBrowser();



    }
    @When("He user enter the data for the register")
    public void heUserEnterTheDataForTheRegister() {
        registerStep.crearCuenta();
        registerStep.enterName();
        registerStep.enterLastName();
        registerStep.enterEmail();
        registerStep.enterConfirmation_Email();
        registerStep.enterPassword();
        registerStep.enterHb();
        registerStep.enterBirthday();
        registerStep.enterBirthdayMonth();
        registerStep.enterBirthdayMonth1();
        registerStep.enterBirthdayYear();
        registerStep.enterBirthdayYear1();
        registerStep.enterMujer();
        registerStep.enterRegister();


        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    @Then("he could")
    public void heCould() {
    }

}
