package tests;

import data.TestData;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class SearchTest {
    MainPage mainPage = new MainPage();
    TestData testData = new TestData();
    @Test
    @Tag("smoke")
    void AvalibleInputSearch() {
        mainPage.openPage()
                .avalibleInputSearch();
    }

    @Test
    @Tag("acceptence")
    void SearchItemTest() {
        mainPage.openPage()
                .inputQuery(TestData.searchItem)
                .checkSearchResult();
    }

    @Test
    @Tag("acceptence")
    void SearchIdTest() {
        mainPage.openPage()
                .inputQuery(TestData.searchId)
                .chechSearchIdResult();
    }
}
