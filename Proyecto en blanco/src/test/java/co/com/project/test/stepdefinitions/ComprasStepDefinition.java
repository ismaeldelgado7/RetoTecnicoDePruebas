package co.com.project.test.stepdefinitions;

import co.com.project.task.OpenUp;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ComprasStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Aprendiz");
    }

    @Dado("^ingreso a la pagina$")
    public void ingresoALaPagina() {
        theActorInTheSpotlight().attemptsTo(OpenUp.thePage());

    }

    @Cuando("^Hago Click En los Cursos A Comprar$")
    public void hagoClickEnLosCursosAComprar() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Cuando("^Hago Click en el Carrito de Compras$")
    public void hagoClickEnElCarritoDeCompras() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Cuando("^Elimino el curso Selenium Ruby$")
    public void eliminoElCursoSeleniumRuby() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Entonces("^Debería Mostrar Curso Elegido$")
    public void deberíaMostrarCursoElegido() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Entonces("^no el precio debe ser mayor a (\\d+)$")
    public void noElPrecioDebeSerMayorA(int arg1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
