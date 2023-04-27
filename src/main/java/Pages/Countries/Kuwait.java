package Pages.Countries;

import com.shaft.driver.SHAFT;
import com.shaft.validation.Validations;
import org.openqa.selenium.By;

public class Kuwait {


    private final By SubscriptionTypeLite = By.id("name-لايت");
    private final By SubscriptionPriceLite = By.xpath("//div[@class='price' and @id='currency-لايت']/b ");
    private final By SubscriptionCurrencyLite = By.xpath("//div[@class='price' and @id='currency-لايت']/i ");



    private final By SubscriptionTypeBasic = By.xpath("//strong[@class='plan-title' and @id='name-الأساسية']");
    private final By SubscriptionPriceBasic = By.xpath("//div[@class='price' and @id='currency-الأساسية']/b ");
    private final By SubscriptionCurrencyBasic = By.xpath("//div[@class='price' and @id='currency-الأساسية']/i ");


    private final By SubscriptionTypePremium = By.id("name-بريميوم");
    private final By SubscriptionPricePremium = By.xpath("//div[@class='price' and @id='currency-بريميوم']/b ");
    private final By SubscriptionCurrencyPremium = By.xpath("//div[@class='price' and @id='currency-بريميوم']/i ");
    SHAFT.GUI.WebDriver driver;
    String url = "https://subscribe.stctv.com/kw-ar";

    //Constructor for the homepage
    public Kuwait(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    //navigating to the website url and asserting that the url is correct
    public Kuwait openUrl() {
        driver.browser().navigateToURL(url);
        return this;
    }

    public void assertSubscriptionTypeLite() {

        Validations.assertThat().element( SubscriptionTypeLite).text().isEqualTo("لايت").perform();

    }

    public void assertSubscriptionPriceLite() {
        Validations.assertThat().element( SubscriptionPriceLite).text().isEqualTo(1.2).perform();
    }
    public void assertSubscriptionCurrencyLite() {
        Validations.assertThat().element( SubscriptionCurrencyLite).text().contains("دينار كويتي").perform();
    }

    public void assertSubscriptionTypeBasic() {
        Validations.assertThat().element( SubscriptionTypeBasic).text().isEqualTo("الأساسية").perform();
    }
    public void assertSubscriptionPriceBasic() {
        Validations.assertThat().element( SubscriptionPriceBasic).text().isEqualTo(2.5).perform();
    }
    public void assertSubscriptionCurrencyBasic() {
        Validations.assertThat().element( SubscriptionCurrencyBasic).text().contains("دينار كويتي").perform();
    }

    public void assertSubscriptionTypePremium() {
        Validations.assertThat().element( SubscriptionTypePremium).text().isEqualTo("بريميوم").perform();
    }
    public void assertSubscriptionPricePremium() {
        Validations.assertThat().element( SubscriptionPricePremium).text().isEqualTo(4.8).perform();
    }
    public void assertSubscriptionCurrencyPremium() {
        Validations.assertThat().element( SubscriptionCurrencyPremium).text().contains("دينار كويتي").perform();
    }
}

