package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * 2.WorkTypePage - nextStepButton, selectJobtypeList locators and create methods  'void selectJobType(String job)'
 *   and 'void clickNextStepButton()'
 */
public class WorkTypePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/input[1]")
    WebElement healthCareProfessional;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/button[1]")
    WebElement continueWorktype;
    public void selectJobType(String job){
        switch (job) {
            case "Health and care professional":
                Reporter.log("Select Health and care professional  :  "+job );
                CustomListeners.test.log(Status.PASS,"Select Health and care professional  :  "+job);
            clickOnElement(healthCareProfessional);
            break;
            default:
                System.out.println("Option not available");
        }
    }
    public void clickOnContinueButton(){
        Reporter.log("Click on Continue" );
        CustomListeners.test.log(Status.PASS,"Click on Continue");
        clickOnElement(continueWorktype);
    }
}
