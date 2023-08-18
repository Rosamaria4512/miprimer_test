package com.co.senasoft.pageobjects;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://web.facebook.com/")

public class RegisterPage extends PageObject {
    By BTN_CREARNUEVO = By.xpath("//a[@data-testid=\"open-registration-form-button\"]");
    By TXT_FIRST_NAME = By.xpath("//input[@data-type=\"text\"]");
    By TXT_LAST_NAME = By.xpath("//input[@name=\"lastname\"]");
    By TXT_EMAIL = By.xpath("//input[@name=\"reg_email__\"]");
    By TXT_CONFIRMATION_EMAIL = By.xpath("//input[@name=\"reg_email_confirmation__\"]");
    By TXT_PASSWORD = By.xpath("//input[@name=\"reg_passwd__\"]");

    By TXT_BH = By.xpath("//select[@name=\"birthday_day\"]");
    By TXT_BIRTHDAY = By.xpath("//option[@value=\"27\"]");
    By TXT_BH_MONTH = By.xpath("//select[@name=\"birthday_month\"]");
    By TXT_BIRTHDAY_MONTH = By.xpath("//option[@value=\"11\"]");
    By TXT_BH_YEAR = By.xpath("//select[@name=\"birthday_year\"]");
    By TXT_BIRTHDAY_YEAR = By.xpath("//option[@value=\"1995\"]");
    By TXT_MUJER = By.xpath("//label[@class=\"_58mt\"]");
    By TXT_HOMBRE = By.xpath("//label[@for=\"u_f_5_Hz\"]");
    By TXT_PERSONALIZADO = By.xpath("//label[@for=\"u_f_6_xB\"]");
    By BTN_REGISTER = By.xpath("//button[@name=\"websubmit\"]");






//crear cuenta
    public By getBTN_CREARNUEVO() {
        return BTN_CREARNUEVO;
    }

    public void setBTN_CREARNUEVO(By BTN_CREARNUEVO) {
        this.BTN_CREARNUEVO = BTN_CREARNUEVO;
    }

   //nombre
    public By getTXT_FIRST_NAME() {
        return TXT_FIRST_NAME;
    }

    public void setTXT_FIRST_NAME(By TXT_FIRST_NAME) {
        this.TXT_FIRST_NAME = TXT_FIRST_NAME;
    }

    //apellido
    public By getTXT_LAST_NAME() {
        return TXT_LAST_NAME;
    }

    public void setTXT_LAST_NAME(By TXT_LAST_NAME) {
        this.TXT_LAST_NAME = TXT_LAST_NAME;
    }

    //correo
    public By getTXT_EMAIL() {
        return TXT_EMAIL;
    }
    public void setTXT_EMAIL(By TXT_EMAIL) {
        this.TXT_EMAIL = TXT_EMAIL;

    }

    //confirmacion
    public By getTXT_CONFIRMATION_EMAIL() {
        return TXT_CONFIRMATION_EMAIL;
    }
    public void setTXT_CONFIRMATION_EMAIL(By TXT_CONFIRMATION_EMAIL) {
        this.TXT_CONFIRMATION_EMAIL = TXT_CONFIRMATION_EMAIL;
    }
//contraseña
    public By getTXT_PASSWORD() {
        return TXT_PASSWORD;
    }
    public void setTXT_PASSWORD(By TXT_PASSWORD) {
        this.TXT_PASSWORD = TXT_PASSWORD;
    }


//campo date dia
    public By getTXT_BIRTHDAY() {
        return TXT_BIRTHDAY;
    }

    public void setTXT_BIRTHDAY(By TXT_BIRTHDAY) {
        this.TXT_BIRTHDAY = TXT_BIRTHDAY;
    }
//numero dia
    public By getTXT_BH() {
        return TXT_BH;
    }

    public void setTXT_BH(By TXT_BH) {
        this.TXT_BH = TXT_BH;
    }
//campo mes
    public By getTXT_BH_MONTH() {
        return TXT_BH_MONTH;
    }

    public void setTXT_BH_MONTH(By TXT_BH_MONTH) {
        this.TXT_BH_MONTH = TXT_BH_MONTH;
    }
//numero mes
    public By getTXT_BIRTHDAY_MONTH() {
        return TXT_BIRTHDAY_MONTH;
    }

    public void setTXT_BIRTHDAY_MONTH(By TXT_BIRTHDAY_MONTH) {
        this.TXT_BIRTHDAY_MONTH = TXT_BIRTHDAY_MONTH;
    }
//campo año
    public By getTXT_BH_YEAR() {
        return TXT_BH_YEAR;
    }

    public void setTXT_BH_YEAR(By TXT_BH_YEAR) {
        this.TXT_BH_YEAR = TXT_BH_YEAR;
    }
//numero año
    public By getTXT_BIRTHDAY_YEAR() {
        return TXT_BIRTHDAY_YEAR;
    }

    public void setTXT_BIRTHDAY_YEAR(By TXT_BIRTHDAY_YEAR) {
        this.TXT_BIRTHDAY_YEAR = TXT_BIRTHDAY_YEAR;
    }


    //mujer
    public By getTXT_MUJER() {
        return TXT_MUJER;
    }

    public void setTXT_MUJER(By TXT_MUJER) {
        this.TXT_MUJER = TXT_MUJER;
    }
//hombre
    public By getTXT_HOMBRE() {
        return TXT_HOMBRE;
    }

    public void setTXT_HOMBRE(By TXT_HOMBRE) {
        this.TXT_HOMBRE = TXT_HOMBRE;
    }
//personalizado
    public By getTXT_PERSONALIZADO() {
        return TXT_PERSONALIZADO;
    }

    public void setTXT_PERSONALIZADO(By TXT_PERSONALIZADO) {
        this.TXT_PERSONALIZADO = TXT_PERSONALIZADO;
    }


    //Registro
    public By getBTN_REGISTER() {
        return BTN_REGISTER;
    }

    public void setBTN_REGISTER(By BTN_REGISTER) {
        this.BTN_REGISTER = BTN_REGISTER;
    }
}
