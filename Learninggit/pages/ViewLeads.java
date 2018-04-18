package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class ViewLeads extends ProjectMethods{

	public ViewLeads() {		
		PageFactory.initElements(driver,this);
	}	

	// To Verify Last Name
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleVerifyFirstName;

	public   ViewLeads verifyFirstname(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		verifyPartialText(eleVerifyFirstName, data);
		return this ;		
	}
	// To Verify Last Name
	@FindBy(how=How.ID,using="viewLead_lastName_sp")
	private WebElement eleVerifyLastName;

	public   ViewLeads verifyLastname(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		verifyPartialText(eleVerifyLastName, data);
		return this ;		
	}


	//For Edit Lead button
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleClickEditLeadButton;
	@And("click edit link")
	public EditLead clickEditLeadButton() {
		click(eleClickEditLeadButton);
		return new EditLead();		
	}

	//For Delete Lead button
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement eleClickDeleteLeadButton;
	@And("click Delete Lead Button")
	public  FindLead clickDeleteLeadButton() {
		click(eleClickDeleteLeadButton);
		return new FindLead();		
	}



}
