package mainspringapp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TShirtObj extends BasePage{
	
	@FindBy(xpath="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a")
	private WebElement TshirtSsize;
	
	@FindBy(xpath="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[2]/label/a")
	private WebElement TshirtMsize;
	
	@FindBy(xpath="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[3]/label/a")
	private WebElement TshirtLsize;
	
	
	
	public TShirtObj() {
		PageFactory.initElements(driver, this);
	}
public WebElement shirtSsize() {
	return TshirtSsize;
}

public WebElement shirtMsize() {
	return TshirtMsize;
}
public WebElement shirtLsize() {
	return TshirtLsize;
}

}
