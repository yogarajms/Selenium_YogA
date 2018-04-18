package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLead extends ProjectMethods{
	
	public MergeLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	//To Click From Lead in Merge Lead Page
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[1]")
	private WebElement eleFromLead;
	
	public  FindLead clickFromLead() {
		click(eleFromLead);
		return new FindLead();		
	}
	//To Click To Lead in Merge Lead Page
		@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[2]")
		private WebElement eleToLead;
		
		public FindLead clickToLead() {
			click(eleToLead);
			return new FindLead();		
		}	
	
		public  void acceptAlert(){
			acceptAlert();
		}
	
	
		@FindBy(how=How.LINK_TEXT,using="Merge")
		private WebElement eleMergeLead;
		
		public ViewLeads clickMergeLead() {
			
			click(eleMergeLead);
			return new ViewLeads();
			
		}
			
		
}
