package com.co.senasoft.steps;

import com.co.senasoft.pageobjects.RegisterPage;
import net.thucydides.core.annotations.Step;

public class RegisterStep {
    RegisterPage registerPage = new RegisterPage();

    @Step
    public void openBrowser(){
        registerPage.open();
    }

    @Step
    public void crearCuenta(){
        registerPage.getDriver().findElement(registerPage.getBTN_CREARNUEVO())
                .click();
    }

    @Step
    public void enterName(){
        registerPage.getDriver().findElement(registerPage.getTXT_FIRST_NAME())
                .sendKeys("Rosa");
    }
    @Step
    public void enterLastName(){
        registerPage.getDriver().findElement(registerPage.getTXT_LAST_NAME())
                .sendKeys("Ledezma");
    }
    @Step
    public void enterEmail(){
        registerPage.getDriver().findElement(registerPage.getTXT_EMAIL())
                .sendKeys("fabricadesoftware060@gmail.com");
    }
    @Step
    public void enterConfirmation_Email(){
        registerPage.getDriver().findElement(registerPage.getTXT_CONFIRMATION_EMAIL())
                .sendKeys("fabricadesoftware060@gmail.com");
    }

    @Step
    public void enterPassword(){
        registerPage.getDriver().findElement(registerPage.getTXT_PASSWORD())
                .sendKeys("Rosa4512");
    }
    @Step
    public void enterHb(){
        registerPage.getDriver().findElement(registerPage.getTXT_BH())
                .click();
    }


    @Step
    public void enterBirthday(){
        registerPage.getDriver().findElement(registerPage.getTXT_BIRTHDAY())
                .click();
    }
    @Step
    public void enterBirthdayMonth(){
        registerPage.getDriver().findElement(registerPage.getTXT_BH_MONTH())
                .click();
    }
    @Step
    public void enterBirthdayMonth1(){
        registerPage.getDriver().findElement(registerPage.getTXT_BIRTHDAY_MONTH())
                .click();
    }
    @Step
    public void enterBirthdayYear(){
        registerPage.getDriver().findElement(registerPage.getTXT_BH_YEAR())
                .click();
    }
    @Step
    public void enterBirthdayYear1(){
        registerPage.getDriver().findElement(registerPage.getTXT_BIRTHDAY_YEAR())
                .click();
    }
    @Step
    public void enterMujer(){
        registerPage.getDriver().findElement(registerPage.getTXT_MUJER())
                .click();
    }

    @Step
    public void enterRegister(){
        registerPage.getDriver().findElement(registerPage.getBTN_REGISTER())
                .click();
    }

}
