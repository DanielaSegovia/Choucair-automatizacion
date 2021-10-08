package com.choucair.tasks;

import com.choucair.userinterfaces.AutomationComponents;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClicSignIn implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AutomationComponents.BTN_SIGN_IN));
    }


    public static ClicSignIn On(){
        return instrumented(ClicSignIn.class);
    }
}
