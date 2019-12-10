package mainspringapp;

import org.testng.Assert;
import org.testng.annotations.Test;
import mainspringapp.BasePage;
import mainspringapp.HomePageObject;
import mainspringapp.ProductPageObjects;


public class ProductTest extends BasePage{
	BasePage bp;
	HomePageObject hp;
ProductPageObjects pp;

public ProductTest() {
	bp=new BasePage();
	hp=new HomePageObject();
	pp=new ProductPageObjects();
}

	@Test
	public void verifySize() {
		hp.getWomentag().click();
		Assert.assertTrue(bp.elementFound(pp.getSsize()), "failed to dispaly size");
		System.out.println(driver.getTitle());
		
	}
	@Test
	public void verifyMize() {
		hp.getWomentag().click();
		
		Assert.assertTrue(bp.elementFound(pp.getMsize()), "Failed to display M size");
		System.out.println(driver.getTitle());
	}
	@Test
	public void verifyLsize() {
		hp.getWomentag().click();
		Assert.assertTrue(bp.elementFound(pp.getLsize()), "Failed to display L size");
		System.out.println(driver.getTitle());
	}
	
}