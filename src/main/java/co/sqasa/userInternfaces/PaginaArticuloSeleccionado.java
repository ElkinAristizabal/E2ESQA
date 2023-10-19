package co.sqasa.userInternfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaArticuloSeleccionado {
    public static final Target CANTIDAD_ARTICULO_INPUT = Target.the("Cantidad de ariticulos input").located(By.cssSelector("input[class='input-text qty text']"));
    public static final Target BOTON_AGREGAR_AL_CARRITO = Target.the("Boton agregar al carrito").located(By.cssSelector("button[class='single_add_to_cart_button button alt']"));

}
