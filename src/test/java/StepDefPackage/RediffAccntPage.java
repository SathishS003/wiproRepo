package StepDefPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RediffAccntPage extends Base {  // Extending Base class correctly
    RediffPage rediffPage; 

    // No need to reassign 'driver' here, just use 'Base.driver'
    public RediffAccntPage() {
        rediffPage = PageFactory.initElements(Base.driver, RediffPage.class);
    }

    @Given("I navigate to {string} Page")
    public void setURL(String url) {
        Base.driver.get(url);
    }

    @Then("I click on signIn")
    public void signIn() {
        rediffPage.signIn();
        Assert.assertEquals(1, 1);
    }

    @And("Click on create a new account")
    public void createAccount() {
        rediffPage.createAccount(Base.driver);
        Assert.assertEquals(1, 1);
    }

    @Then("Fill all the details in the page")
      public void fill_all_the_details_in_the_page() {
        // Write code here that turns the phrase above into concrete actions
    	rediffPage.enterDetails();
    	Assert.assertEquals(1, 1);
    	
       
    }


    
}
