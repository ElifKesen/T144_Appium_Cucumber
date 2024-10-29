package stepDefinitions;

import io.cucumber.java.en.Given;
import utilies.BrowserDriver;

public class BrowserStepDefinition {
    @Given("Kullanici hepsiburada adresine gider")
    public void kullanici_hepsiburada_adresine_gider() {
        BrowserDriver.getBrowserDriver().get("https://www.hepsiburada.com/");

        BrowserDriver.getBrowserDriver().findElementByXPath("//*[@class='sf-hb-button-dMT9LZe9Dk8_WxAL5MH7 sf-default-header-fyaJ3u6_nqj_jDEekaEb hb-button__icon']").isDisplayed();

    }


}
