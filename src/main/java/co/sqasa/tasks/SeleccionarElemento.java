package co.sqasa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static co.sqasa.userInternfaces.ListaDeArticulos.IMAGEN_MANAROLA;

public class SeleccionarElemento implements Task {
       private final Target target;

        public SeleccionarElemento(Target target) {
            this.target = target;
        }


        public static SeleccionarElemento elegido(Target target) {
            return Tasks.instrumented(SeleccionarElemento.class, target);
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(target)
            );
        }

}
