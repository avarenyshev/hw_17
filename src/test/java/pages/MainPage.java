package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class MainPage {
    private SelenideElement
            searchInput = $(byName("text"));


    public MainPage inputQuery(String value) {
            searchInput.setValue(value).pressEnter();
        return this;
    }
    public MainPage avalibleInputSearch() {
        $(byName("text")).shouldBe(visible);
        return this;
    }

    @Step("Открываем главную страницу")
    public MainPage openPage() {
        open("https://www.citilink.ru/");
        return this;
    }

    @Step("Проверяем результат поиска")
    public MainPage checkSearchResult() {
            $(".app-catalog-1ywclaa:nth-child(1) .e1ys5m360").shouldHave(visible);
        return this;
    }

    @Step("Проверяем результат поиска по ID товара")
    public MainPage chechSearchIdResult() {
            $(".app-catalog-1iqe8jj > .app-catalog-1k0cnlg").shouldHave(Condition.visible);
        return this;
    }
}
//        $(byXpath("a href=\"/product/noutbuk-apple-macbook-pro-m1-16gb-ssd512gb-16-core-gpu-16-2-retina-xdr-1621979/\"")).shouldBe(Condition.visible);


