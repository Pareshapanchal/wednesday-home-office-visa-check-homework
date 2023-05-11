package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class VisaConfirmationTest extends BaseTest {
    StartPage startPage;
    WorkTypePage workTypePage;
    SelectNationalityPage selectNationalityPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage resultPage;
    DurationOfStayPage durationOfStayPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){

        startPage = new StartPage();
        workTypePage = new WorkTypePage();
        selectNationalityPage = new SelectNationalityPage();
        reasonForTravelPage = new ReasonForTravelPage();
        resultPage = new ResultPage();
        durationOfStayPage = new DurationOfStayPage();
    }
    @Test(groups = {"sanity","regression"})
    //1.anAustralianCominToUKForTourism().
    public void anAustralianCominToUKForTourism(){

    //    Click on start button
        startPage.clickOnStartNow();
    //	Select a Nationality 'Australia'
        selectNationalityPage.selectNationality("Australia");
        startPage.clickRejectAdditionalcookies();
    //	Click on Continue button
        selectNationalityPage.clickOnContinueButtonOnNationalityPage();
    //	Select reason 'Tourism'
        reasonForTravelPage.selectReasonForVisit("Tourism");
    //	Click on Continue button
        reasonForTravelPage.clickOnContinueOnReasonForTravelPage();
    //	verify result 'You will not need a visa to come to the UK'
        resultPage.confirmResultMessage("You will not need a visa to come to the UK");
    	}
        @Test(groups = {"smoke","regression"})
        //2.aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths().
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() {
            //	Click on start button
            startPage.clickOnStartNow();
            //	Select a Nationality 'Chile'
            selectNationalityPage.selectNationality("Chile");
            //	Click on Continue button
            selectNationalityPage.clickOnContinueButtonOnNationalityPage();
            //recejec cookies
            startPage.clickRejectAdditionalcookies();
            //	Select reason 'Work, academic visit or business'
            reasonForTravelPage.selectReasonForVisit("Work, academic visit or business");
            //	Click on Continue button
            reasonForTravelPage.clickOnContinueOnReasonForTravelPage();
            //	Select intendent to stay for 'longer than 6 months'
            durationOfStayPage.selectLengthOfStay("longer than 6 months");
            //	Click on Continue button
            durationOfStayPage.clickContinueOnLengthOfStayPage();
            //	Select have planning to work for 'Health and care professional'
            workTypePage.selectJobType("Health and care professional");
            //	Click on Continue button
            workTypePage.clickOnContinueButton();
            //	verify result 'You need a visa to work in health and care'
            resultPage.confirmResultMessage("You need a visa to work in health and care");
        }
 @Test(groups = {"regression"})
    //3.aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card()
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card() {
     //	Click on start button
     startPage.clickOnStartNow();
     //	Select a Nationality 'Colombia'
     selectNationalityPage.selectNationality("Colombia");
     //	Click on Continue button
     selectNationalityPage.clickOnContinueButtonOnNationalityPage();
     //recejec cookies
     startPage.clickRejectAdditionalcookies();
     //	Select reason 'Join partner or family for a long stay'
     reasonForTravelPage.selectReasonForVisit("Join partner or family for a long stay");
     //	Click on Continue button
     reasonForTravelPage.clickOnContinueOnReasonForTravelPage();
     //	Select state My partner of family member have uk immigration status 'yes'
     //	Click on Continue button
     //	verify result 'You’ll need a visa to join your family or partner in the UK'
     resultPage.confirmResultMessage("You may need a visa");
 }

}
