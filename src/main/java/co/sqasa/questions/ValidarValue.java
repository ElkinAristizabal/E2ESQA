package co.sqasa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.questions.Value;

public class ValidarValue implements Question<String> {

    private final Target target;

    public ValidarValue(Target target) {
        this.target = target;
    }

    public static ValidarValue delElemento(Target target) {
        return new ValidarValue(target);
    }

    @Override
    public String answeredBy(Actor actor) {
        return Value.of(target).viewedBy(actor).asString();
    }
}


