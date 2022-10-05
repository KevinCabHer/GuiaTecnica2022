package co.com.choucair.certificatio.guiatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchTitleCourse extends PageObject {

    public static final Target NAME_COURSE = Target.the("title course")
            .located(By.xpath("/html/body/div[1]/div[2]/div/header/div/div/div[2]/div[1]/div[1]/a/div/div/h1"));
}
