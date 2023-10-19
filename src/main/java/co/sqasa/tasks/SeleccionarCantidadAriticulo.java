package co.sqasa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.sqasa.userInternfaces.PaginaArticuloSeleccionado.CANTIDAD_ARTICULO_INPUT;

public class SeleccionarCantidadAriticulo implements Task {

    public static SeleccionarCantidadAriticulo ingresar() {
        return Tasks.instrumented(SeleccionarCantidadAriticulo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("2").into(CANTIDAD_ARTICULO_INPUT));
}
}
