package pages;

import com.codeborne.selenide.SelenideElement;
import data.TestData;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class CityChangePage {
    TestData testData = new TestData();
    private SelenideElement
    citySearch = $(byName("search-city"));
    @Step ("Нажимаем на выбор города")
    public CityChangePage CityChangeButton() {
        $(".css-0 > .elgmz660").click();
        return this;
    }
    @Step ("Проверяем доступность поиска по городу")
    public CityChangePage AvalibleInputCity() {
        $(byName("search-city")).shouldBe(visible);
        return this;
    }

    @Step ("Выполняем поиск по городу")
    public CityChangePage SearchCity(String value) {
        citySearch.setValue(value);
        return this;
    }
    @Step ("Выбираем найденный город")
    public CityChangePage SearchResultSelect() {
        $(".css-sl5paq").click();
        return this;
    }
    @Step ("Проверяем выборанный город")
    public CityChangePage CheckChosenCity() {
        $(byText(TestData.city)).shouldBe(visible);
        return this;
    }
}

