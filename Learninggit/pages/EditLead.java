package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{

	public EditLead() {		
		PageFactory.initElements(driver,this);
	}	

	// To Clear the existing First name

	@FindBy(how=How.ID,using="updateLeadForm_firstName")
	private WebElement eleClearFname;
	@And("clear the existing First name")
	public EditLead clearFname() {

		eleClearFname.clear();
		return this ;		
	}

	// To Clear the existing Last name

	@FindBy(how=How.ID,using="updateLeadForm_lastName")
	private WebElement eleLname;
	@And("clear the existing Last name")
	public EditLead clearLname() {

		eleLname.clear();
		return this ;		
	}

	//To Enter New First Name	
	@FindBy(how=How.ID,using="updateLeadForm_firstName")
	private WebElement eleNewFirstName;

	@And("Enter New First Name as (.*)")
	public EditLead enterNewFirstName(String data) {

		type(eleNewFirstName, data);
		return this ;		
	}

	//To Enter New Last Name
	@FindBy(how=How.ID,using="updateLeadForm_lastName")
	private WebElement eleNewLastName;

	@And("Enter New Last Name as (.*)")
	public EditLead enterNewLastName(String data) {

		type(eleNewLastName, data);
		return this ;		
	}


	//To Enter New Company Name
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleCompanyName;
	@And("Enter New company name as (.*)")
	public EditLead enterCompanyName(String data) {

		type(eleCompanyName ,data);
		return this ;		
	}

	//To clear New Company Name
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleClearCompName;
	@And("clear the existing company name")	
	public EditLead clearCompanyName() {

		eleClearCompName.clear();
		return this ;		
	}

	@FindBy(how=How.XPATH,using="//input[@value='Update']")
	private WebElement eleClickUpdateBtn;

	@And("click edit button to save the details")
	public  ViewLeads ClickUpdateBtn() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleClickUpdateBtn);
		return new ViewLeads();		
	}
}
