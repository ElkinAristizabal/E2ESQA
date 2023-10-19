package co.sqasa.tasks;

import net.serenitybdd.core.environment.ConfiguredEnvironment;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirAplicacion implements Task {

    private EnvironmentVariables environmentVariables =  ConfiguredEnvironment.getEnvironmentVariables();
    private final String url = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("urlsanangel");

    @Override
    @Step("{0} Abrir el navegador en la aplicación")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }

    public static AbrirAplicacion en (){
        return instrumented(AbrirAplicacion.class);
    }
}
