package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * 7.DurationOfStayPage - nextStepButton, lessThanSixMonths, moreThanSixMonths locators and create methods
 *   'void selectLengthOfStay(String moreOrLess)' (Note: use switch statement for select moreOrLess stay) and
 *   'void clickNextStepButton()'
 */
public class DurationOfStayPage extends Utility {
    @CacheLookup
    @FindBy(id="response-0")
    WebElement lessThanSixMonths;
    @CacheLookup
    @FindBy(id="response-1")
    WebElement moreThanSixMonths;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/button[1]")
    WebElement continueOnDurationOfStay;

    public void selectLengthOfStay(String moreOrLess){
        switch (moreOrLess){
            case "6 months or less":
                Reporter.log("Select 6 months or less :" +moreOrLess);
                CustomListeners.test.log(Status.PASS,"Select 6 months or less :" +moreOrLess);
                clickOnElement(lessThanSixMonths);
                break;
            case "longer than 6 months":
                Reporter.log("Select longer than 6 months :" +moreOrLess);
                CustomListeners.test.log(Status.PASS,"Select longer than 6 months :" +moreOrLess);
                clickOnElement(moreThanSixMonths);
                break;
            default:
                Reporter.log("Option is not available :" +moreOrLess);
                CustomListeners.test.log(Status.PASS,"Option is not available :" +moreOrLess);
                System.out.println("Option is not available");
        }
    }
    public void clickContinueOnLengthOfStayPage(){
        Reporter.log("Click on Continue");
        CustomListeners.test.log(Status.PASS,"Click on Continue");
        clickOnElement(continueOnDurationOfStay);
    }



}
