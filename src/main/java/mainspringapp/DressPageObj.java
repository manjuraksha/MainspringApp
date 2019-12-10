package mainspringapp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressPageObj extends BasePage {
	
	@FindBy(xpath="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a")
	private WebElement dressSsize;
	
	@FindBy(xpath="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[2]/label/a")
	private WebElement dressMsize;
	
	@FindBy(xpath="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[3]/label/a")
	private WebElement dressLsize;
	
	public DressPageObj() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement dresSsize() {
		return dressSsize;
	}
	public WebElement dresMsize() {
		return dressMsize;
	}
	public WebElement dresLsize() {
		return dressLsize;
	}

}
