package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/*
3.SelectNationalityPage -nationalityDropDownList, nextStepButton locators and create methods  'void selectNationality(String nationality)'
  and 'void clickNextStepButton()'

 */
public class SelectNationalityPage extends Utility {
    @CacheLookup
    @FindBy(id="response")
    WebElement nationalityDropdown;
    @CacheLookup
    @FindBy(xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement continueOnNationality;
    public void selectNationality(String nationality){
        Reporter.log("Select Nationality : "+nationality);
        CustomListeners.test.log(Status.PASS,"Select Nationality : "+nationality);
        selectByVisibleTextFromDropDown(nationalityDropdown,nationality);
    }
    public void clickOnContinueButtonOnNationalityPage(){
        Reporter.log("Click on Continue");
        CustomListeners.test.log(Status.PASS,"Click on Continue");
        clickOnElement(continueOnNationality);
    }
}
