package Pages.CompleteRegister;

import com.shaft.driver.SHAFT;
import com.shaft.validation.Validations;
import org.openqa.selenium.By;

public class Bahrain {


    private final By SubscriptionTypeLite = By.id("name-لايت");

    private final By SubscriptionPriceLite = By.xpath("//div[@class='price' and @id='currency-لايت']/b ");
    private final By SubscriptionCurrencyLite = By.xpath("//div[@class='price' and @id='currency-لايت']/i ");


    SHAFT.GUI.WebDriver driver;
    String url = "https://subscribe.stctv.com/bh-ar";

    //Constructor for the homepage
    public Bahrain(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    //navigating to the website url and asserting that the url is correct
    public Bahrain openUrl() {
        driver.browser().navigateToURL(url);
        return this;
    }

    public void assertSubscriptionTypeLite() {

        Validations.assertThat().element( SubscriptionTypeLite).text().isEqualTo("لايت").perform();

    }

    public void assertSubscriptionPriceLite() {
        Validations.assertThat().element( SubscriptionPriceLite).text().isEqualTo(2).perform();
    }
    public void assertSubscriptionCurrencyLite() {
        Validations.assertThat().element( SubscriptionCurrencyLite).text().contains("دينار بحريني").perform();
    }

}

