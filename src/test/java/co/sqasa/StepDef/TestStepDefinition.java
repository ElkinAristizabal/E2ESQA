package co.sqasa.StepDef;

import co.sqasa.questions.ValidacionMensaje;
import co.sqasa.tasks.AbrirAplicacion;
import co.sqasa.tasks.AgregarAlCarrito;
import co.sqasa.tasks.SeleccionarArticulo;
import co.sqasa.tasks.SeleccionarCantidadAriticulo;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.waits.Wait;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.sqasa.userInternfaces.ConfirmarCompra.MENSAJE_VALIDACION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.equalTo;

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
        user.attemptsTo(SeleccionarArticulo.elegido());
    }

    @When("^agregue dos cantidades al carrito$")
    public void agregue_dos_cantidades_al_carrito() {
        user.attemptsTo(SeleccionarCantidadAriticulo.ingresar(), AgregarAlCarrito.elegido());
    }

    @Then("^podra observar un mensaje de \"([^\"]*)\"$")
    public void podra_observar_un_mensaje_de(String mensaje) {
        user.attemptsTo(
                Wait.until(ValidacionMensaje.delCampo(MENSAJE_VALIDACION), containsString(mensaje)).forNoLongerThan(5).seconds());
    }
}
