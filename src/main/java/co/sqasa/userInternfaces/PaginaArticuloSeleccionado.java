package co.sqasa.userInternfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaArticuloSeleccionado {
    public static final Target CANTIDAD_ARTICULO_INPUT = Target.the("Cantidad de ariticulos input").located(By.id("quantity_6531a39fce5200"));
    public static final Target BOTON_AGREGAR_AL_CARRITO = Target.the("Boton agregar al carrito").located(By.cssSelector("button[class='single_add_to_cart_button button alt']"));

}
