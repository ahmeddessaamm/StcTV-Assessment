package TestPackage;

import Pages.Countries.Bahrain;
import com.shaft.driver.SHAFT;
import jdk.jfr.Description;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCasesBahrian {
    SHAFT.GUI.WebDriver driver;
  Bahrain bahrain;


    @BeforeClass
    public void beforeClass() {
        driver = new SHAFT.GUI.WebDriver();

        bahrain = new Bahrain(driver);

    }

    @Description("Validate Lite Package for Bahrain Country ")
    @Test(priority = 0)
    public void ValidateLitePackage() {
        //new Bahrain(driver).openUrl();

        bahrain.openUrl();
        bahrain.assertSubscriptionTypeLite();
        bahrain.assertSubscriptionPriceLite();
        bahrain.assertSubscriptionCurrencyLite();

    }
    @Description("Validate Basic Package for Bahrain Country ")
    @Test(priority = 1)
    public void ValidateBasicPackage() {
        //new Bahrain(driver).openUrl();

        bahrain.assertSubscriptionTypeBasic();
        bahrain.assertSubscriptionPriceBasic();
        bahrain.assertSubscriptionCurrencyBasic();

    }

    @Description("Validate Premium Package for Bahrain Country ")
    @Test(priority = 2)
    public void ValidatePremiumPackage() {
        //new Bahrain(driver).openUrl();

        bahrain.assertSubscriptionTypePremium();
        bahrain.assertSubscriptionPricePremium();
        bahrain.assertSubscriptionCurrencyPremium();

    }
}
