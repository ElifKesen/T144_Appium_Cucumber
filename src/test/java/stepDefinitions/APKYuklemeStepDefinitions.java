package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import org.openqa.selenium.remote.DesiredCapabilities;
import utilies.Driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class APKYuklemeStepDefinitions {

    AndroidDriver<AndroidElement>androidDriver= Driver.getAndroidDriver();

    @Given("Kullanici {string} uygulamasini cihaza yükler")
    public void kullanici_uygulamasini_cihaza_yükler(String apkDosyaYolu) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4");//cihazin adi
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");//cihazin android olmasini tanimladik
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");//Android in versiyonunu yazdik
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");// cihazin otomasyonunun saglamak icin. IOS icin XCUITest yazilacak
        caps.setCapability(MobileCapabilityType.APP, apkDosyaYolu);

       androidDriver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
       androidDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
}