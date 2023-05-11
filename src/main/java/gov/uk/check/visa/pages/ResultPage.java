package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

/**
 * 4.ResultPage - resultMessage locator and create methods 'String getResultMessage()'
 * and 'void confirmResultMessage(String expectedMessage)' (Note Use Assert.assertTrue)
 */

public class ResultPage extends Utility {
    @CacheLookup
    @FindBy(xpath="//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/h2[1]")
    WebElement resultMessage;
    public String getResultMessage(){
        Reporter.log("Get Result message :"+resultMessage.getText());
        CustomListeners.test.log(Status.PASS,"Get Result message :"+resultMessage.getText());
        return getTextFromElement(resultMessage);
    }
    public void confirmResultMessage(String expectedMessage){
        Reporter.log("Verify Result message :"+resultMessage.getText());
        CustomListeners.test.log(Status.PASS,"Verify Result message :"+resultMessage.getText());
        boolean message = resultMessage.getText().contains(expectedMessage.trim());
        Assert.assertTrue(message,"Result message not matching");
    }
}
