package com.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresoExitoso implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        
    }

    public static IngresoExitoso exitoso(){
        return instrumented(IngresoExitoso.class);
    }
}
