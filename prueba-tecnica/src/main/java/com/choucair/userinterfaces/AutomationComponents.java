package com.choucair.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationComponents {

    public static final Target SIGN_IN = Target.the("Botón Sign In").locatedBy("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
    public static final Target EMAIL = Target.the("Ingresar email").located(By.id("email"));
    public static final Target PASSWORD = Target.the("Ingresar contreña").located(By.id("passwd"));
    public static final Target BTN_SIGN_IN = Target.the("Dar clic en botón Sign In").located(By.id("SubmitLogin"));
    public static final By EXITO = By.className("account");
}
