package co.com.choucair.certificatio.guiatecnica.tasks;

import co.com.choucair.certificatio.guiatecnica.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {

    private String course;

    public Search(String course) {
        this.course = course;
    }
    public static Search the(String course){
        return Tasks.instrumented(Search.class, course);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("aca estoy");
        actor.attemptsTo(
                Click.on(SearchCoursePage.BUTTON_CC),
                Enter.theValue("EXAMEN JAVA - Cursos y Certificaciones").into(SearchCoursePage.INPUT_COURSE),
                Click.on(SearchCoursePage.BUTTON_GO),
                Click.on(SearchCoursePage.COURSE));

    }
}
