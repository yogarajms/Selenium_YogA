package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{
	
	public MyHomePage() {		
		PageFactory.initElements(driver,this);
	}	
	//My Home page
	@FindBy(how=How.LINK_TEXT,using="Leads")
	private WebElement eleLeads;
	@And("click Leads button")
	public  MyLeads clickLeads() {
		click(eleLeads);
		return new MyLeads() ;		
	}
	
	
	
	
	
	
	

}
