package co.sqasa.userInternfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmarCompra {
    public static final Target MENSAJE_VALIDACION = Target.the("Mensaje Validación").located(By.cssSelector("h1.entry-title"));
    public static final Target VALUE_VALIDACION = Target.the("Mensaje Validación").located(By.cssSelector("input[class=\"input-text qty text\"]"));

}
