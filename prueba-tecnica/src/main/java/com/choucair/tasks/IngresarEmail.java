package com.choucair.tasks;

import com.choucair.userinterfaces.AutomationComponents;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.EnterValueIntoTarget;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarEmail implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(new EnterValueIntoTarget(AutomationComponents.EMAIL, "dag@gmail.com"));

    }


    public static IngresarEmail email(){
        return instrumented(IngresarEmail.class);
    }
}
