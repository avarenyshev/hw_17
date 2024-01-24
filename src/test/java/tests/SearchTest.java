package tests;

import data.TestData;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class SearchTest {
    MainPage mainPage = new MainPage();
    TestData testData = new TestData();
    @Test
    void SearchTest() {
        mainPage.openPage()
                .inputQuery(TestData.searchItem)
                .checkSearchResult();
    }
}
