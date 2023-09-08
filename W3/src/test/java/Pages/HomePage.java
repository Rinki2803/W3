package Pages;

import TestBase.WebTestBase;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage extends WebTestBase{
	@FindBy(id= "w3loginbtn")
    WebElement usersearch;
	

    public HomePage(){
    	//to conncet webelement with driver we are using pagefactory
        PageFactory.initElements(driver, this);
    }

    public void userSearchClick(){
        usersearch.click();
    }
}
