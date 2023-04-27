package TestPackage;

import Pages.Countries.Bahrain;
import com.shaft.driver.SHAFT;
import jdk.jfr.Description;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCasesBahrain {
    SHAFT.GUI.WebDriver driver;
  Bahrain bahrain;


    @BeforeClass
    public void beforeClass() {
        driver = new SHAFT.GUI.WebDriver();

        bahrain = new Bahrain(driver);

    }

    @Description("Validate Lite Package for Bahrain Country ")
    @Test(priority = 0)
    public void ValidateLitePackageForBahrain() {


        bahrain.openUrl();
        bahrain.assertSubscriptionTypeLite();
        bahrain.assertSubscriptionPriceLite();
        bahrain.assertSubscriptionCurrencyLite();

    }
    @Description("Validate Basic Package for Bahrain Country ")
    @Test(priority = 1)
    public void ValidateBasicPackageForBahrain() {


        bahrain.assertSubscriptionTypeBasic();
        bahrain.assertSubscriptionPriceBasic();
        bahrain.assertSubscriptionCurrencyBasic();

    }

    @Description("Validate Premium Package for Bahrain Country ")
    @Test(priority = 2)
    public void ValidatePremiumPackageForBahrain() {


        bahrain.assertSubscriptionTypePremium();
        bahrain.assertSubscriptionPricePremium();
        bahrain.assertSubscriptionCurrencyPremium();

    }
}
