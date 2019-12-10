package mainspringapp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DressPageTest extends BasePage {

	BasePage bp;
	HomePageObject hp;
DressPageObj dp;

public DressPageTest() {
	bp=new BasePage();
	hp=new HomePageObject();
	dp=new DressPageObj();
}

@Test
public void dressSsize() {
	hp.getdressestag().click();
	Assert.assertTrue(bp.elementFound(dp.dresSsize()), "Failed to display dress S size");
	
	System.out.println(driver.getTitle());
}
@Test
public void dressMsize() {
	hp.getdressestag().click();
	Assert.assertTrue(bp.elementFound(dp.dresMsize()), "Failed to display dress M size");
}
@Test
public void dressLsize() {
	hp.getdressestag().click();
	Assert.assertTrue(bp.elementFound(dp.dresLsize()), "Failed to display dress L size");
}
}
