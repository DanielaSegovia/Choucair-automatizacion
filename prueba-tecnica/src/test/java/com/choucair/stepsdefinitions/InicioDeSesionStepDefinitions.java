package com.choucair.stepsdefinitions;

import com.choucair.tasks.OpenTheBrowser;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
        actor.can(BrowseTheWeb.with(browser));
    }

    @Given("que el usuario ya se registro en el sistema")
    public void que_el_usuario_ya_se_registro_en_el_sistema() {
        //throw new io.cucumber.java.PendingException();
        actor.wasAbleTo(OpenTheBrowser.on());
    }

    @When("desee iniciar sesion")
    public void desee_iniciar_sesion() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("se encuentre en la pagina de autenticacion")
    public void se_encuentre_en_la_pagina_de_autenticacion() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("ingrese el correo {string}")
    public void ingrese_el_correo(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("ingrese la contrase±a {string}")
    public void ingrese_la_contrasena(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("de clic en el boton Sign in")
    public void de_clic_en_el_boton_sign_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("las credenciales son validas")
    public void las_credenciales_son_validas() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("el inicio de sesion es exitoso")
    public void el_inicio_de_sesion_es_exitoso() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
