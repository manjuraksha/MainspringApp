package mainspringapp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TshirtTest extends BasePage {
	
	BasePage bp;
	HomePageObject hp;
TShirtObj tp;

public TshirtTest() {
	bp=new BasePage();
	hp=new HomePageObject();
	tp=new TShirtObj();
}

@Test
public void tshirtSsize() {
	hp.gettShirtTag().click();
	Assert.assertTrue(bp.elementFound(tp.shirtSsize()), "Failed to display shirt S size");
	
	System.out.println(driver.getTitle());
}
@Test
public void tshirtMsize() {
	hp.gettShirtTag().click();
	Assert.assertTrue(bp.elementFound(tp.shirtMsize()), "Failed to display Tshirt M size");
}
@Test
public void tshirtLsize() {
	hp.gettShirtTag().click();
	Assert.assertTrue(bp.elementFound(tp.shirtLsize()), "Failed to display Tshirt L size");
}

}
