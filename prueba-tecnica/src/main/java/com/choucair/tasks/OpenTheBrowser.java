package com.choucair.tasks;

import com.choucair.userinterfaces.AutomationHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class OpenTheBrowser implements Task {
    @Override
    @Step("{0} Abrir navegador en automationpractice.com")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(new AutomationHome()));

    }

    public static OpenTheBrowser on(){
        return instrumented(OpenTheBrowser.class);
    }
}
