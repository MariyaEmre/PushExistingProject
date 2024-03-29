package code.stepsDefinitions;
import code.pages.TariffHome;
import code.utils.BrowserUtils;
import code.utils.ConfigurationsReader;
import code.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.Map;

public class TariffSteps extends BrowserUtils {
    TariffHome tariffHome = new TariffHome();

    @Given("The user wants to see Guru demo site")
    public void the_user_wants_to_see_guru_demo_site() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("tariffURL"));
        setWaitTime();
    }
    @When("The user wants to Add Tariff Plan")
    public void The_user_wants_to_Add_Tariff_Plan() {
    }
    @Then("c")
    public void the_User_Wants_To_Verify_Add_Tariff_Plans_Header() {
    }
    @Then("The user wants to verify Add Tariff Plans header")
    public void theUserWantsToVerifyAddTariffPlansHeader() {
    }
    @Then("The user wants to verify header as {string}")
    public void the_user_wants_to_verify_header_as(String addTariffPlansHeader) {
    }
    @Then("The user wants to Add Tariff Plan details as")
    public void The_user_wants_to_Add_Tariff_Plan_details_as(Map<String, String> dataTable) {
        tariffHome.setMonthlyRental(dataTable.get("10"));
        tariffHome.setLocalMinutes(dataTable.get("12"));
        tariffHome.setInternationalMinutes(dataTable.get("13"));
        tariffHome.setFreeSmsPack(dataTable.get("15"));
        tariffHome.setLocalPerMinutesCharges(dataTable.get("18"));
        tariffHome.setInternationalPerMinutesCharges(dataTable.get("25"));
        tariffHome.setSmsCharges(dataTable.get("28"));
    }
    @Then("The user wants to submit")
    public void the_user_wants_to_submit() {
        tariffHome.setSubmitButton();
    }
    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String string) {
        tariffHome.verifyMessage("Congratulation you add Tariff Plan");
    }}


