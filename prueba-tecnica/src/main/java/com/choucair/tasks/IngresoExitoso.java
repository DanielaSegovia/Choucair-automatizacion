package com.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.junit.Assert;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresoExitoso implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Assert.assertTrue("La prueba ha fallado, credenciales inválidas", "Daniel Suarez".equals(BrowseTheWeb.as(actor).findBy(".account").getText()));
    }

    public static IngresoExitoso exitoso(){
        return instrumented(IngresoExitoso.class);
    }
}
