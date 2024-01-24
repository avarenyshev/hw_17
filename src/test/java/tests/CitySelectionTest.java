package tests;

import data.TestData;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.CityChangePage;
import pages.MainPage;

public class CitySelectionTest {
    MainPage mainPage = new MainPage();
    CityChangePage cityChangePage = new CityChangePage();
    TestData testData = new TestData();

    @Test
    @Tag("acceptence")
    void CitySelectionTest() {
        mainPage.openPage();
        cityChangePage.CityChangeButton()
                .SearchCity(TestData.city)
                .SearchResultSelect()
                .CheckChosenCity();
    }

    @Test
    @Tag("smoke")
    void AvalibleSearchTest() {
        mainPage.openPage();
        cityChangePage.CityChangeButton()
                .AvalibleInputCity();
    }
}
