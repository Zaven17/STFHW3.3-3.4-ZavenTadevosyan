package search;

import Pages.SearchPage;
import base.BaseTests;
import org.testng.annotations.Test;

public class SearchTest extends BaseTests {
    @Test
    public void testSuccessfulSearch(){
        SearchPage searchPage = homePage.clickSearchBtn();
        searchPage.search("Printed Chiffon");
    }
}
