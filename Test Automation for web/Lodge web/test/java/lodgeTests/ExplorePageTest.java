package lodgeTests;

import org.testng.annotations.Test;

import base.BaseTests;
import pages.ExplorePage;

public class ExplorePageTest extends BaseTests {
	
	@Test
	public void searchProperty() {
		ExplorePage explorePage = homePage.clickOnExplore();
		explorePage.searchProperty();
	}

}
