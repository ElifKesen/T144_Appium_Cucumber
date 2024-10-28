package stepDefinitions;

import io.cucumber.java.en.Given;
import utilies.BrowserDriver;

public class BrowserStepDefinition {
    @Given("Kullanici hepsiburada adresine gider")
    public void kullanici_hepsiburada_adresine_gider() {
        BrowserDriver.getBrowserDriver().get("https://www.hepsiburada.com/");

    }
}
