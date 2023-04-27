package TestPackage;

import Pages.Countries.Bahrain;
import Pages.Countries.Kuwait;
import com.shaft.driver.SHAFT;
import jdk.jfr.Description;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCasesKuwait {
    SHAFT.GUI.WebDriver driver;
 Kuwait kuwait;


    @BeforeClass
    public void beforeClass() {
        driver = new SHAFT.GUI.WebDriver();

        kuwait = new Kuwait(driver);

    }

    @Description("Validate Lite Package for Kuwait Country ")
    @Test(priority = 0)
    public void ValidateLitePackageForKuwait() {


        kuwait.openUrl();
        kuwait.assertSubscriptionTypeLite();
        kuwait.assertSubscriptionPriceLite();
        kuwait.assertSubscriptionCurrencyLite();

    }
    @Description("Validate Basic Package for Kuwait Country ")
    @Test(priority = 1)
    public void ValidateBasicPackageForKuwait() {


        kuwait.assertSubscriptionTypeBasic();
        kuwait.assertSubscriptionPriceBasic();
        kuwait.assertSubscriptionCurrencyBasic();

    }

    @Description("Validate Premium Package for Kuwait Country ")
    @Test(priority = 2)
    public void ValidatePremiumPackageForKuwait() {


        kuwait.assertSubscriptionTypePremium();
        kuwait.assertSubscriptionPricePremium();
        kuwait.assertSubscriptionCurrencyPremium();

    }
}
