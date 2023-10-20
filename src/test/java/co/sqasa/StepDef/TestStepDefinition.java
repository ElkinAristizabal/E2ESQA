package co.sqasa.StepDef;

import co.sqasa.questions.ValidacionMensaje;
import co.sqasa.questions.ValidarValue;
import co.sqasa.tasks.AbrirAplicacion;
import co.sqasa.tasks.AgregarAlCarrito;
import co.sqasa.tasks.SeleccionarElemento;
import co.sqasa.tasks.SeleccionarCantidadAriticulo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.waits.Wait;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.sqasa.userInternfaces.ConfirmarCompra.MENSAJE_VALIDACION;
import static co.sqasa.userInternfaces.ConfirmarCompra.VALUE_VALIDACION;
import static co.sqasa.userInternfaces.ListaDeArticulos.IMAGEN_MANAROLA;
import static co.sqasa.userInternfaces.PaginaArticuloSeleccionado.BOTON_AGREGAR_AL_CARRITO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;

public class TestStepDefinition {

    @Managed(driver = "chrome")

    public WebDriver browser;
    private final Actor user = Actor.named("User");

    @Before
    public void setUP ()
    {
        user.can(BrowseTheWeb.with(browser));
        browser.manage().window().maximize();
    }

    @Given("^el usuario navegue a san angel floristeria$")
    public void el_usuario_navegue_a_san_angel_floristeria() {
        user.wasAbleTo(AbrirAplicacion.en());
    }

    @When("^seleccione un articulo$")
    public void seleccione_un_articulo() {
        user.attemptsTo(SeleccionarElemento.elegido(IMAGEN_MANAROLA));
    }

    @When("^agregue \"([^\"]*)\" cantidades al carrito$")
    public void agregue_dos_cantidades_al_carrito(String value) {
        user.attemptsTo(SeleccionarCantidadAriticulo.ingresar(value), SeleccionarElemento.elegido(BOTON_AGREGAR_AL_CARRITO));
    }

    @Then("^podra observar un mensaje de \"([^\"]*)\"$")
    public void podra_observar_un_mensaje_de(String mensaje) {
        user.attemptsTo(
                Wait.until(ValidacionMensaje.delCampo(MENSAJE_VALIDACION), containsString(mensaje)).forNoLongerThan(5).seconds());
    }

    @Then("^validara que se hayan agregado \"([^\"]*)\" cantidades de articulo$")
    public void validara_que_se_hayan_agregado_dos_cantidades_de_articulo(String value) {
        user.should(seeThat(ValidarValue.delElemento(VALUE_VALIDACION),containsString(value)));
    }
}
