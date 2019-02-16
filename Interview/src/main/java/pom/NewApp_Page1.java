package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewApp_Page1 {
	public WebDriver driver;
	
	public NewApp_Page1(WebDriver driver)
	{
		this.driver=driver;
	}

	@FindBy(xpath="//button[contains(text(),\"Let's get started!\")]")
	public WebElement LetsGetStarted_Button;
	
	@FindBy(id="add-page")
	public WebElement NewPage_Button;
	
	@FindBy(xpath="//form[@class='unsubmittable']//input[@name='name']")
	public WebElement PageName_EditBox;
	
	@FindBy(xpath="//div[20]//div[3]//button[1]")
	public WebElement Create_Button;
	
	@FindBy(xpath="//div[20]//div[3]//button[2]")
	public WebElement Cancel_Button;
	
	@FindBy(xpath="//a[contains(text(),'Messaging')]")
	public WebElement Messaging_Menu;
	
	@FindBy(xpath="//li[text()='Send an SMS']")
	public WebElement SendAnSMS_DragableButton;
	
	
	@FindBy(xpath="//textarea[contains(@name,'phone_constant')]")
	public WebElement PhoneNumber_EditBox;
	
	@FindBy(xpath="//tbody//div[contains(@class,'syn-selectappvar-wrap')]//textarea[contains(@name,'message_phrase[]')]")
	public WebElement Message_EditBox;
	
	@FindBy(xpath="//li[text()='Send an Email']")
	public WebElement SendAnEmail_DragableButton;
	
	@FindBy(xpath="//div[@id='tabs-2']/div[@id='module-1']//div[contains(@id,'node')]")
	public WebElement node1;
	
	@FindBy(xpath="//div[@id='tabs-2']/div[@id='module-2']//div[contains(@id,'rec')]")
	public WebElement node2;
	
	@FindBy(xpath="//div[@id='tabs-2']/div[@id='module-2']//div[contains(@id,'node')][@class='syn-node syn-node-attached-w ui-draggable syn-node-active']")
	public WebElement node3;
	
	@FindBy(xpath="//div[@id='tabs-2']/div[@id='module-2']//div[contains(@id,'node')][@class='syn-node syn-node-attached-e ui-draggable syn-node-active']")
	public WebElement node4;
	
	@FindBy(xpath="//div[@id='tabs-2']/div[@id='module-3']//div[contains(@id,'rec')]")
	public WebElement node5;
	
	@FindBy(xpath="//div[@id='tabs-2']/div[@id='module-4']//div[contains(@id,'rec')]")
	public WebElement node6;
	
	@FindBy(xpath="//a[contains(text(),'Basic')]")
	public WebElement Basic_Menu;

	@FindBy(xpath="//li[@class='module-item ui-widget-content ui-corner-all module-item-red ui-draggable']")
	public WebElement HangUp_Dragable_button;
	
	@FindBy(xpath="//input[contains(@name,'smtp_url')]")
	public WebElement SMTPHost_EditBox;
	
	@FindBy(xpath="//input[contains(@name,'ssl')]")
	public WebElement SSL_CheckBox;
	
	@FindBy(xpath="//div[contains(@class,'left')]//input[contains(@name,'username')]")
	public WebElement Username_EditBox;
	
	@FindBy(xpath="//input[contains(@name,'password')]")
	public WebElement Password_EditField;
	
	
	@FindBy(xpath="//textarea[contains(@name,'from_constant')]")
	public WebElement From_EditBox;
	
	@FindBy(xpath="//textarea[contains(@name,'to_constant')]")
	public WebElement To_EditBox;
	
	@FindBy(xpath="//textarea[contains(@name,'subject_constant')]")
	public WebElement Subject_Editbox;
	
	@FindBy(xpath="//textarea[contains(@name,'cc_constant')]")
	public WebElement CC_EditBox;
	
	@FindBy(xpath="//div[contains(@class,'panel-subsection')]//tbody//div[contains(@class,'syn-selectappvar-wrap')]//textarea[contains(@name,'message_phrase[]')]")
	public WebElement MessageBody_EditBox;
	
	
	
}
