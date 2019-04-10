package co.com.google.certificacion.serenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.bing.com/")
public class googlehomepage extends PageObject {

	@FindBy(name="q")
    private WebElementFacade searchTerms;

    @FindBy(name="go")
    private WebElementFacade lookupButton;

    public void enter_keywords(String keyword) {
        searchTerms.typeAndEnter(keyword);	//Escribe y da enter
    }

    public void lookupterms() {
   //  lookupButton.waitUntilClickable().click(); //espera a que sea cliqueable
    }
}