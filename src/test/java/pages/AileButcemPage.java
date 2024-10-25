package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilies.Driver;
import utilies.ReusableMethods;

import java.time.Duration;

public class AileButcemPage {
    public AileButcemPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)),this);
    }

    public void ilkekranayarlari() throws InterruptedException {
        for (int i = 0; i < 6; i++) {
            Thread.sleep(3000);
            ReusableMethods.ekranKaydirmaMethodu(926,1123,500,127,1123);
        }

        ReusableMethods.scrollWithUiScrollableAndClick("Giriş Yap");

    }


}
