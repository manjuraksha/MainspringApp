package mainspringapp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest {
	BasePage bp;
	HomePageObject hp;
	
	public HomePageTest() {
		
		bp= new BasePage();
		hp=new HomePageObject();
		String a;
	}
	
	@Test
	
	public void verifywomentag() {
		Assert.assertTrue(bp.elementFound(hp.getWomentag()), "Failed to km");
		
		
	}
	@Test
	
public void verifydresstag() {
	Assert.assertTrue(bp.elementFound(hp.getdressestag()), "Failed to dress KM");
}
	@Test
public void verifyTshirt() {
	Assert.assertTrue(bp.elementFound(hp.gettShirtTag()), "Failed to Tshirt KM");
}
	
	@Test
	public void verifyTitle() {
		hp.getWomentag().click();
				String a=bp.getTitlte();
				Assert.assertTrue(a.contains("Women"), "Failed to display");
				
		
	}
	@Test
	public void verifydressTitle() {
		hp.getdressestag().click();
				String b=bp.getTitlte();
				Assert.assertTrue(b.contains("Dresses"), "Failed to display");
		
	}
	@Test
	public void verifyShirtTitle() {
		hp.gettShirtTag().click();
				String c=bp.getTitlte();
				Assert.assertTrue(c.contains("shirts"), "Failed to display");
		
	}
	
	
		
	
	
}

