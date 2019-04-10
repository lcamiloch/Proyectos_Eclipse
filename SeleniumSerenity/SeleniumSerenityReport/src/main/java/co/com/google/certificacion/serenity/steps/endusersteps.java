	package co.com.google.certificacion.serenity.steps;

import co.com.google.certificacion.serenity.pages.googlehomepage;
import net.thucydides.core.annotations.Step;

public class endusersteps {
	
	googlehomepage googlePage;

	@Step
	public void is_the_home_page() {
	    googlePage.open();
	}
	
    @Step
    public void enters(String keyword) {
        googlePage.enter_keywords(keyword);
    }

    @Step
    public void startsSearch() {
    	googlePage.lookupterms();
    
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        startsSearch();
    
    }

}
