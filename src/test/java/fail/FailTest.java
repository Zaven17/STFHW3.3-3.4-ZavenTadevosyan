package fail;

import Pages.SearchResultPage;
import base.BaseTests;
import org.testng.annotations.Test;

public class FailTest extends BaseTests {
    @Test
    public void testFail(){
        SearchResultPage failTest = searchPage.goToSearchResultPage();
        failTest.clickManufacturers();
    }
}
