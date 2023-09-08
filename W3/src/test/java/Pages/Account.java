package Pages;
import TestBase.WebTestBase;
import Utils.Utility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account extends WebTestBase{
	@FindBy(id ="my-learning-link")
	 WebElement codeTitle;
	
	 @ FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[6]/a")
	 WebElement Jewelry;
	
	 @FindBy(xpath="//a[text()='JavaScript Tutorial']")
     WebElement hover;
//	 @FindBy(xpath="//button[text()='Browse all tutorials']")
//	 WebElement hover;
   		           		          
    @FindBy(xpath="//*[@id=\"main\"]/div[19]/a[2]")
    WebElement instagramOption;
     
    @FindBy(id="search2")
    WebElement searchtext;
    
    @FindBy(id = "learntocode_searchbtn")
    WebElement searchBtn;
    
    @FindBy(xpath ="//*[@id=\"main\"]/h1")
    WebElement Title;
    
    @FindBy(xpath = "//*[@id=\"ui-id-8\"]")
    WebElement dropDown;
    
    public Account(){
   	 PageFactory.initElements(driver, this);
    }
    
 
    public String getTextOFMYAccountPage(){
   	 return codeTitle.getText();
   }
 
    public void conTextClick() {
   	 Utility.conTextClick(driver,searchtext);
   	 searchtext.click();
    }
    public void search () throws InterruptedException{
    	Thread.sleep(3000);
    	// searchtext.click();
    	 searchtext.sendKeys("Java");
    	 Actions act = new Actions(driver);
    	 act.sendKeys(Keys.DOWN).perform();
    	 act.sendKeys(Keys.ENTER).perform();
    	// searchtext.sendKeys(Keys.ENTER);
    	// searchBtn.click();
    }
    public void selectDropDown(String term,String value) {
		dropDown.click();
		Utility.selectValue(dropDown,term,value);
	}
   
    public void mouseHover(){
	   Utility.mouseHover(driver,hover);
	   hover.click();
	   }

    public void scrollDownMethod() {
      Utility.scrollDownByElement(driver, instagramOption);
      instagramOption.click();
      }

     public void windowHandle(){
       Utility.scrollDownByElement(driver,instagramOption);
       instagramOption.click();
       Utility.switchToWindows(driver);
    }
     public String getTitleText() {
    	 return Title.getText();
   
		
     }

    public void getCookiesHandle(){
   	 Utility.getCookies();
     }	
}
