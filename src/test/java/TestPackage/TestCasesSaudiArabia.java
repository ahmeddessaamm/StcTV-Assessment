package TestPackage;

import Pages.Countries.Bahrain;
import Pages.Countries.SaudiArabia;
import com.shaft.driver.SHAFT;
import jdk.jfr.Description;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCasesSaudiArabia {
    SHAFT.GUI.WebDriver driver;
  SaudiArabia saudiArabia;


    @BeforeClass
    public void beforeClass() {
        driver = new SHAFT.GUI.WebDriver();

        saudiArabia = new SaudiArabia(driver);

    }

    @Description("Validate Lite Package for SaudiArabia Country ")
    @Test(priority = 0)
    public void ValidateLitePackageForSaudiArabia() {


        saudiArabia.openUrl();
        saudiArabia.assertSubscriptionTypeLite();
        saudiArabia.assertSubscriptionPriceLite();
        saudiArabia.assertSubscriptionCurrencyLite();

    }
    @Description("Validate Basic Package for Saudi Arabia Country ")
    @Test(priority = 1)
    public void ValidateBasicPackageForSaudiArabia() {


        saudiArabia.assertSubscriptionTypeBasic();
        saudiArabia.assertSubscriptionPriceBasic();
        saudiArabia.assertSubscriptionCurrencyBasic();

    }

    @Description("Validate Premium Package for Saudi Arabia Country ")
    @Test(priority = 2)
    public void ValidatePremiumPackageForSaudiArabia() {


        saudiArabia.assertSubscriptionTypePremium();
        saudiArabia.assertSubscriptionPricePremium();
        saudiArabia.assertSubscriptionCurrencyPremium();

    }
}
