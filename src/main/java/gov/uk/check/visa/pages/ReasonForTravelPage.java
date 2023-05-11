package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 *5.ReasonForTravelPage - nextStepButton, reasonForVisitList locators and create methods  'void selectReasonForVisit(String reason)'
 *   and  'void clickNextStepButton()'
 */
public class ReasonForTravelPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/input[1]")
    WebElement tourism;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[1]/div[2]/input[1]")
    WebElement work;
    @CacheLookup
    @FindBy(id="response-2")
    WebElement study;
    @CacheLookup
    @FindBy(id="response-3")
    WebElement transit;
    @CacheLookup
    @FindBy(id="response-4")
    WebElement joinPartnerOrFamily;
    @CacheLookup
    @FindBy(id="response-5")
    WebElement getMarried;
    @CacheLookup
    @FindBy(id="response-6")
    WebElement stayWithChild;
    @CacheLookup
    @FindBy(id="response-7")
    WebElement medicalTreatment;
    @CacheLookup
    @FindBy(id="response-8")
    WebElement governmentBusiness;
    @CacheLookup
    @FindBy(xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement continueOnReasonForTravel;
    public void selectReasonForVisit(String reason) {
        switch (reason) {
            case "Tourism":
                Reporter.log("Select Tourism or visiting family and friends " + reason);
                CustomListeners.test.log(Status.PASS, "Select Tourism or visiting family and friends :  " + reason);
                clickOnElement(tourism);
                break;
            case "Work, academic visit or business":
                Reporter.log("Select Work, academic visit or business :  " + reason);
                CustomListeners.test.log(Status.PASS, "Select Work, academic visit or business :  " + reason);
                clickOnElement(work);
                break;
            case "Study":
                Reporter.log("Select Study : " + reason);
                CustomListeners.test.log(Status.PASS, "Select Study : " + reason);
                clickOnElement(study);
                break;
            case "Transit":
                Reporter.log("Select Transit (on your way to somewhere else) :  " + reason);
                CustomListeners.test.log(Status.PASS, "Select Transit (on your way to somewhere else) :  " + reason);
                clickOnElement(transit);
                break;
            case "Join partner or family for a long stay":
                Reporter.log("Select Join partner or family for a long stay) :  " + reason);
                CustomListeners.test.log(Status.PASS, "Select Join partner or family for a long stay :  " + reason);
                clickOnElement(joinPartnerOrFamily);
                break;
            case "Get married or enter into a civil partnershipGet married or enter into a civil partnership":
                Reporter.log("Select Get married or enter into a civil partnership  : " + reason);
                CustomListeners.test.log(Status.PASS, "Select Get married or enter into a civil partnership  : " + reason);
                clickOnElement(getMarried);
                break;
            case "Stay with your child, if they’re at school":
                Reporter.log("Select Stay with your child, if they’re at school : " + reason);
                CustomListeners.test.log(Status.PASS, "Select Stay with your child, if they’re at school : " + reason);
                clickOnElement(stayWithChild);
                break;
            case "Have medical treatment":
                Reporter.log("Select Have medical treatment :  " + reason);
                CustomListeners.test.log(Status.PASS, "Select Have medical treatment :  " + reason);
                clickOnElement(medicalTreatment);
                break;
            case "For official diplomatic or government business ":
                Reporter.log("Select For official diplomatic or government business :  " + reason);
                CustomListeners.test.log(Status.PASS, "Select For official diplomatic or government business :  " + reason);
                clickOnElement(governmentBusiness);
                break;
            default:
                Reporter.log("Reason for travel is not in the list");
                CustomListeners.test.log(Status.PASS, "Reason for travel is not in the list");
                System.out.println("Reason for travel not in the list");
        }
    }


    public void clickOnContinueOnReasonForTravelPage(){
        Reporter.log("Click on Continue");
        CustomListeners.test.log(Status.PASS,"Click on Continue");
        clickOnElement(continueOnReasonForTravel);
    }

}
