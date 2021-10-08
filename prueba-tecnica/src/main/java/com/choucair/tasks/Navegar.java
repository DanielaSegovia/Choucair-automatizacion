package com.choucair.tasks;

import com.choucair.userinterfaces.AutomationComponents;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navegar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AutomationComponents.SIGN_IN));
    }

    public static Navegar Login(){
        return instrumented(Navegar.class);
    }
}
