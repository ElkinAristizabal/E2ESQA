package co.sqasa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.sqasa.userInternfaces.PaginaArticuloSeleccionado.CANTIDAD_ARTICULO_INPUT;

public class SeleccionarCantidadAriticulo implements Task {

    private final String value;

    public SeleccionarCantidadAriticulo(String value) {
        this.value = value;
    }

    public static SeleccionarCantidadAriticulo ingresar(String value) {
        return Tasks.instrumented(SeleccionarCantidadAriticulo.class, value);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(value).into(CANTIDAD_ARTICULO_INPUT));
}
}
