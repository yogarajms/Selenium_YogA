package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class FindLead extends ProjectMethods{

	public FindLead() {		
		PageFactory.initElements(driver,this);
	}	


	@FindBy(how=How.NAME,using="id")
	private WebElement eleEnterLeadId;
	@And("Enter the ID to search as (.*)")
	public FindLead enterLeadId(String data) {

		type(eleEnterLeadId, data);
		return this ;		
	}


	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleClickFindLeads;
	@And("click find Leads Search Button")
	public FindLead clickFindLeads() {
		click(eleClickFindLeads);
		return this ;		
	}

	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleClickFirstResultingId;
	@And("click first Resulting lead")
	public  ViewLeads clickFirstResultingId(){
		//Thread.sleep(1000);
		click(eleClickFirstResultingId);
		return new ViewLeads()  ;		
	}

	public  FindLead switchToFindLeadWindow(int index){
		switchToWindow(index);
		return new FindLead() ;		
	}

	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleClickMergeId;

	public FindLead clickMergeId(){
		clickWithNoSnap(eleClickMergeId);
		return this;		
	}

	public MergeLead switchToMergeleadWindow(int index){
		switchToWindow(index);
		return new MergeLead() ;		
	}
}
