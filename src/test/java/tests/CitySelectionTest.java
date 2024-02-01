package tests;

import data.TestData;
import helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.CityChangePage;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

public class CitySelectionTest extends TestBase {
    MainPage mainPage = new MainPage();
    CityChangePage cityChangePage = new CityChangePage();
    TestData testData = new TestData();

    @Test
    @DisplayName("Проверка выбора города")
    @Tag("acceptence")
    void CitySelectionTest() {
        step("Открываем главную страницу citilink.ru", () -> {
            mainPage.openPage();
        });
        step("Устанавливаем город" + TestData.city, () -> {
            cityChangePage.CityChangeButton()
                    .SearchCity(TestData.city)
                    .SearchResultSelect();
        });
        step("Проверяем установку города" + TestData.city, () -> {
            cityChangePage.CheckChosenCity();
        });
    }

    @Test
    @DisplayName("Проверка доступности поиска по городу")
    @Tag("smoke")
    void AvalibleSearchTest() {
        step("Открываем главную страницу citilink.ru", () -> {
            mainPage.openPage();
        });
        step("Проверка доступность строки ввода города", () -> {
            cityChangePage.CityChangeButton()
                    .AvalibleInputCity();
        });
    }
}
