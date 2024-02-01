package tests;

import data.TestData;
import helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

public class SearchTest extends TestBase {
    MainPage mainPage = new MainPage();
    TestData testData = new TestData();

//    @AfterEach
//    void addAttacments() {
//        Attach.screenshotAs("Last screenshot");
//        Attach.pageSource();
//        Attach.browserConsoleLogs();
//        Attach.addVideo();
//    }

    @Test
    @DisplayName("Проверка доступности поиска")
    @Tag("smoke")
    void AvalibleInputSearch() {
        step("Открываем главную страницу citilink.ru", () -> {
                    mainPage.openPage();
                });
        step("Проверка доступности строки поиска", () -> {
            mainPage.avalibleInputSearch();
        });
    }
    @Test
    @DisplayName("Проверка поиска по названию товара")
    @Tag("acceptence")
    void SearchItemTest() {
        step("Открываем главную страницу citilink.ru", () -> {
            mainPage.openPage();
        });
        step("Проверяем выдачу поиска по"+TestData.searchItem, () -> {
            mainPage.inputQuery(TestData.searchItem)
                    .checkSearchResult();
        });
    }
    @Test
    @DisplayName("Проверка поиска по коду товара")
    @Tag("acceptence")
    void SearchIdTest() {
        step("Открываем главную страницу citilink.ru", () -> {
            mainPage.openPage();
        });
        step("Проверяем выдачу поиса по ID"+TestData.searchId, () -> {
            mainPage.inputQuery(TestData.searchId)
                    .chechSearchIdResult();
        });
    }
}
