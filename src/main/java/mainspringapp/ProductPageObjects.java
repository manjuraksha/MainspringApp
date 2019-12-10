package mainspringapp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageObjects extends BasePage{
	
	@FindBy(xpath="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a")
	private WebElement WomenSsize;
	
	@FindBy(xpath="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[2]/label/a")
	private WebElement WomenMsize;
	
	@FindBy(xpath="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[3]/label/a")
	private WebElement WomenLsize;
	
	
	
	public ProductPageObjects() {
		PageFactory.initElements(driver, this);
	}
public WebElement getSsize() {
	return WomenSsize;
}

public WebElement getMsize() {
	return WomenMsize;
}
public WebElement getLsize() {
	return WomenLsize;
}

}
