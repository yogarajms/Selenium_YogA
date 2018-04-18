package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	@And("Enter Company name as (.*)")
	public  CreateLead typeCompanyName(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(eleCompanyName, data);
		return this ;		
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	@And("Enter First Name as (.*)")
	public CreateLead typeFirstName(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(eleFirstName, data);
		return this ;		
	}

	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	@And("Enter Last Name as (.*)")
	public CreateLead typeLastName(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(eleLastName, data);
		return this ;		
	}
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement elePhoneNum;
	
	public CreateLead typePhoneNum(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(elePhoneNum, data);
		return this ;		
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleClickButton;
	
	@And("Click Create Lead btn")
	public  ViewLeads clickCreateLeadButton() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleClickButton);;
		return new ViewLeads()  ;		
	}
}
