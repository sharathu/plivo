package Plivo.Interview;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pom.HomePage;
import pom.NewApp_Page1;

public class DragAndDrop_Test extends BaseClass{
	
	@Test
	public void plivoTest() throws InterruptedException, AWTException
	{
		//BaseClass.baseMethod("chrome", "http://quickfuseapps.com/");
		String title=driver.getTitle();
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(title, "Login :: Plum Fuse");
		WebDriverWait wait=new WebDriverWait(driver,3);
		
		//Initiating the HomePage pom class
		HomePage homepage= PageFactory.initElements(driver, HomePage.class);
				//initElements(driver, HomePage.class);
		homepage.createAnApp.click();
		wait.equals("5000");
		NewApp_Page1 newAppPage= PageFactory.initElements(driver, NewApp_Page1.class);
		newAppPage.LetsGetStarted_Button.click();
		wait.equals("5000");
		newAppPage.NewPage_Button.click();
		wait.equals("5000");
		/*Alert alert= driver.switchTo().alert();
		alert.sendKeys("Test");
		alert.accept();*/
		newAppPage.PageName_EditBox.sendKeys("Test");
		newAppPage.Create_Button.click();
		//wait.equals("3000");
		Thread.sleep(4000);
		
		
	//clicking the messaging menu
		
		newAppPage.Messaging_Menu.click();
		Thread.sleep(2000);
		Actions action= new Actions(driver);
		action.dragAndDropBy(newAppPage.SendAnSMS_DragableButton, 1052,252).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(newAppPage.node1, newAppPage.node2);
		Thread.sleep(1000);
		
		newAppPage.PhoneNumber_EditBox.sendKeys("1234567890");
		newAppPage.Message_EditBox.sendKeys("Hello world");
			
		action.dragAndDropBy(newAppPage.SendAnEmail_DragableButton, 1577,314).build().perform();
		Thread.sleep(3000);
		action.dragAndDrop(newAppPage.node4, newAppPage.node5).build().perform();
		Thread.sleep(2000);
		
		newAppPage.SMTPHost_EditBox.sendKeys("smtp.gmail.com");
		Robot robo= new Robot();
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		robo.keyPress(KeyEvent.VK_4);
		robo.keyRelease(KeyEvent.VK_4);
		robo.keyPress(KeyEvent.VK_6);
		robo.keyRelease(KeyEvent.VK_6);
		robo.keyPress(KeyEvent.VK_5);
		robo.keyRelease(KeyEvent.VK_5);
		
		newAppPage.Username_EditBox.sendKeys("abc@gmail.com");
		newAppPage.Password_EditField.sendKeys("abc@gmail.com");
		newAppPage.From_EditBox.sendKeys("abc@gmail.com");
		newAppPage.To_EditBox.sendKeys("xyz@gmail.com");
		newAppPage.Subject_Editbox.sendKeys("SMS not sent");
		newAppPage.MessageBody_EditBox.sendKeys("SMS to phone number 1234567890 is not sent");
		
		newAppPage.Basic_Menu.click();
		Thread.sleep(2000);
		action.dragAndDropBy(newAppPage.HangUp_Dragable_button, 658, 287);
		Thread.sleep(5000);
		action.dragAndDrop(newAppPage.node3,newAppPage.node6 ).build().perform();
		Thread.sleep(3000);
				
		
		
		
	}
	
	

}
