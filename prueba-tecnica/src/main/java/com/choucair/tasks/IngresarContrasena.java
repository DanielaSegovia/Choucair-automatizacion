package com.choucair.tasks;

import com.choucair.userinterfaces.AutomationComponents;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.EnterValueIntoTarget;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarContrasena implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(new EnterValueIntoTarget(AutomationComponents.PASSWORD, "12345"));
    }


    public static IngresarContrasena pass(){
        return instrumented(IngresarContrasena.class);
    }
}
