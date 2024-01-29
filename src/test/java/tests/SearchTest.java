package tests;

import data.TestData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class SearchTest {
    MainPage mainPage = new MainPage();
    TestData testData = new TestData();
    @Test
    @DisplayName("Провверка доступности строки поиска")
    @Tag("smoke")
    void AvalibleInputSearch() {
        mainPage.openPage()
                .avalibleInputSearch();
    }

    @Test
    @DisplayName("Проверка поиска по названи товара")
    @Tag("acceptence")
    void SearchItemTest() {
        mainPage.openPage()
                .inputQuery(TestData.searchItem)
                .checkSearchResult();
    }

    @Test
    @DisplayName("Проверка поиска по коду товара")
    @Tag("acceptence")
    void SearchIdTest() {
        mainPage.openPage()
                .inputQuery(TestData.searchId)
                .chechSearchIdResult();
    }
}
