package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import TestBase.WebTestBase;

	public class Login extends WebTestBase{	
		
		 @FindBy(id = "modalusername")
		    WebElement emailTextBox;

		    @FindBy(id = "current-password")
		    WebElement passwordTextBox;

		    @FindBy(xpath="//span[text()='Log in']")
		    WebElement loginbtn;
		    //@ FindBy(xpath="//div[@class='_6S9iN _WHF4f']")
		    //WebElement courseTextBox;
	   
		    
		    public Login(){
		        PageFactory.initElements(driver, this);
		    }
	//sending the email and passwrord to the login
		    public void login(String email, String password){
		        emailTextBox.sendKeys(email);
		        passwordTextBox.sendKeys(password);
		        loginbtn.click();
		      
		        
		        
		    }
			
	}
