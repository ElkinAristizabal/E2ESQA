package co.sqasa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.sqasa.userInternfaces.ListaDeArticulos.IMAGEN_MANAROLA;
import static co.sqasa.userInternfaces.PaginaArticuloSeleccionado.BOTON_AGREGAR_AL_CARRITO;

public class AgregarAlCarrito implements Task {

    public static AgregarAlCarrito elegido() {
        return Tasks.instrumented(AgregarAlCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_AGREGAR_AL_CARRITO)
        );
    }
}
