package code.pages;
import code.utils.BrowserUtils;
import code.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class TariffHome extends BrowserUtils {
    WebDriver driver;
    public TariffHome(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(tagName = "header")
    private WebElement addTariffPlansHeader;
    @FindBy(name = "rental")
    private WebElement monthlyRental;
    @FindBy(id = "local_minutes")
    private WebElement localMinutes;
    @FindBy(id = "inter_minutes")
    private WebElement internationalMinutes;
    @FindBy(id = "sms_pack")
    private WebElement smsPack;
    @FindBy(id = "minutes_charges")
    private WebElement localPerMinutesCharges;
    @FindBy(id = "inter_charges")
    private WebElement internationalPerMinutesCharges;
    @FindBy(id = "sms_charges")
    private WebElement smsCharges;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitButton;
    @FindBy(xpath = "//*[@id=\"main\"]/div/h2")
    private WebElement string;
    public void setMonthlyRental(String MonthlyRental) {
        staticWait(1);
        monthlyRental.sendKeys("10");}
    public void setLocalMinutes(String LocalMinutes) {
        staticWait(1);
        localMinutes.sendKeys("12");
    }
    public void setInternationalMinutes(String InternationalMinutes) {
        staticWait(1);
        internationalMinutes.sendKeys("13");
    }
    public void setFreeSmsPack(String FreeSmsPack) {
        staticWait(1);
        smsPack.sendKeys("15");
    }
    public void setLocalPerMinutesCharges(String LocalPerMinutesCharges) {
        staticWait(1);
        localPerMinutesCharges.sendKeys("18");
    }
    public void setInternationalPerMinutesCharges(String InternationalPerMinutesCharges) {
        staticWait(1);
        internationalPerMinutesCharges.sendKeys("25");
    }
    public void setSmsCharges(String SmsCharges) {
        staticWait(1);
        smsCharges.sendKeys("28");
    }
    public void setSubmitButton() {
        submitButton.click();
    }
    public void verifyMessage(String expectedMessage) {
        Assert.assertEquals(string.getText(), expectedMessage);
    }
    public void verifyHeader(String string) {
        Assert.assertTrue(addTariffPlansHeader.getText().contains(string));
    }
}