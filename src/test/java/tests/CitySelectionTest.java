package tests;

import data.TestData;
import helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.CityChangePage;
import pages.MainPage;

public class CitySelectionTest {
    MainPage mainPage = new MainPage();
    CityChangePage cityChangePage = new CityChangePage();
    TestData testData = new TestData();
    @Test
    @DisplayName("Проверка выбора города")
    @Tag("acceptence")
    void CitySelectionTest() {
        mainPage.openPage();
        cityChangePage.CityChangeButton()
                .SearchCity(TestData.city)
                .SearchResultSelect()
                .CheckChosenCity();
    }

    @Test
    @DisplayName("Проверка доступности поиска по городу")
    @Tag("smoke")
    void AvalibleSearchTest() {
        mainPage.openPage();
        cityChangePage.CityChangeButton()
                .AvalibleInputCity();
    }
}
