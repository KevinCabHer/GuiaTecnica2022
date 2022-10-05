package co.com.choucair.certificatio.guiatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target BUTTON_CC = Target.the("access button courses and certifications")
            .located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section[1]/div[2]/aside/section[1]/div/div/div[1]/center/div/div/div/div[2]/div[1]/a/h4/strong"));
    public static final Target INPUT_COURSE = Target.the("Input search course")
            .located(By.xpath("/html/body/div[1]/div[2]/div/div/div/section/div[2]/form/fieldset/input[1]"));
    public static final Target BUTTON_GO = Target.the("Button search")
            .located(By.xpath("/html/body/div[1]/div[2]/div/div/div/section/div[2]/form/fieldset/button"));
    public static final Target COURSE = Target.the("Course JAVA").
            located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div[1]/h4/a"));

    public static final Target NAME_COURSE = Target.the("title course")
            .located(By.xpath("/html/body/div[1]/div[2]/div/header/div/div/div[2]/div[1]/div[1]/a/div/div/h1"));

}
//EXAMEN JAVA - Cursos y Certificaciones