package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * 1.StartPage - startNowButton locatores and create method 'void clickStartNow()'
 */
public class StartPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/main[1]/div[2]/div[1]/article[1]/section[1]/a[1]")
    WebElement statNowbutton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='gem-c-button govuk-button']")
    WebElement rejectAdditionalcookies;
    public void clickOnStartNow(){ // This method will click on start now button
        Reporter.log("Click on Star now");
        CustomListeners.test.log(Status.PASS,"Click on Star now");
        clickOnElement(statNowbutton);
    }
    public void clickRejectAdditionalcookies(){
        Reporter.log("Reject Additional coockies");
        CustomListeners.test.log(Status.PASS,"Reject Additional coockies");
        clickOnElement(rejectAdditionalcookies);
    }

}
