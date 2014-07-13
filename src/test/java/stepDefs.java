import com.peacocks.basePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by vikramdevarakonda on 13/07/2014.
 */
public class stepDefs {

    public static WebDriver driver;
    basePage BasePage;

    @Before
    public void start() {
        driver.get("http://www.peacocks.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        BasePage=new basePage(driver);
    }
    @After
    public void close()
    {
        driver.quit();
    }

    @Given("^User is registered$")
    public void User_is_registered() {
        // Express the Regexp above with the code you wish you had

    }

    @When("^he logged into the website with the Vikram.(\\d+)stlondon@gmail.com and cae(\\d+)fa(\\d+)e(\\d+)$")
    public void he_logged_into_the_website_with_the_Vikram_stlondon_gmail_com_and_cae_fa_e(int arg1, int arg2, int arg3, int arg4) {
        // Express the Regexp above with the code you wish you had

    }

    @Then("^he should be logged into the website$")
    public void he_should_be_logged_into_the_website() {
        // Express the Regexp above with the code you wish you had

    }

}
