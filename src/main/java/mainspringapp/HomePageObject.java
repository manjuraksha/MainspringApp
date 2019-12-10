package mainspringapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject extends BasePage {
	
 @FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
 private WebElement womentag;
 
 @FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
 private WebElement dressestag;
 
 @FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
 private WebElement tShirttag;
 
 //WebElement km= driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")); 

 public HomePageObject() {
	 PageFactory.initElements(driver, this);
 }
 
 public WebElement getWomentag() {
	 return womentag;
	 
 }  
 
 public WebElement getdressestag() {
	 return dressestag;
 }
 public WebElement gettShirtTag() {
	 return tShirttag;
 }
 
 
 
 
 
 
}
