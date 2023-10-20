package co.sqasa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidacionMensaje  implements Question<String>{

    private final Target target;

    public ValidacionMensaje(Target target) {
        this.target = target;
    }

    public static ValidacionMensaje delCampo(Target target){
        return new ValidacionMensaje(target);
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(target).viewedBy(actor).asString();
    }

}
