package co.sqasa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.sqasa.userInternfaces.ListaDeArticulos.IMAGEN_MANAROLA;

public class SeleccionarArticulo implements Task {

        public static SeleccionarArticulo elegido() {
            return Tasks.instrumented(SeleccionarArticulo.class);
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(IMAGEN_MANAROLA)
            );
        }

}
