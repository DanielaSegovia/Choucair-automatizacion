package com.choucair.stepsdefinitions;

import com.choucair.tasks.*;
import com.choucair.utils.Driver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class InicioDeSesionStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver browser;
    private Actor actor = Actor.named("Daniela");

    @Before
    public void setUp(){
        browser = Driver.getDriver();
        actor.can(BrowseTheWeb.with(browser));
    }

    @Given("el usuario desea iniciar sesion")
    public void elUsuarioDeseaIniciarSesion() {
        actor.wasAbleTo(OpenTheBrowser.on());
    }

    @When("de clic sobre el botón Sign in")
    public void deClicSobreElBotónSignIn() {
        actor.wasAbleTo(Navegar.Login());
    }

    @When("ingrese el correo electronico {string}")
    public void ingreseElCorreoElectronico(String string) {
        actor.wasAbleTo(IngresarEmail.email());
    }

    @When("ingrese la contrasena {string}")
    public void ingreseLaContrasena(String string) {
        actor.wasAbleTo(IngresarContrasena.pass());
    }

    @When("de clic en el boton Sign in")
    public void deClicEnElBotonSignIn() {
        actor.wasAbleTo(ClicSignIn.On());
    }


    @Then("el inicio de sesion es exitoso")
    public void elInicioDeSesionEsExitoso() {
        actor.wasAbleTo(IngresoExitoso.exitoso());

    }

}
