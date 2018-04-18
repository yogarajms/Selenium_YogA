package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{

	public MyLeads() {		
		PageFactory.initElements(driver,this);
	}	


	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreatelead;
	@And("click Creat Lead link")
	public CreateLead clickCreateLead() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleCreatelead);
		return new CreateLead() ;		
	}

	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLead;
	@And("click Find Leads Link")
	public FindLead clickFindLead() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleFindLead);
		return new FindLead() ;		
	}

	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleMergeLeads;

	public MergeLead clickMergeLeads() {
		click(eleMergeLeads);
		return new MergeLead();		
	}

}
