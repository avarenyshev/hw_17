package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private SelenideElement
    searchInput = $(byName("text"));


    public MainPage inputQuery(String value) {
        searchInput.setValue(value).pressEnter();
        return this;
    }

    public MainPage openPage() {
        open("https://www.citilink.ru/");
        return this;
    }

    public MainPage checkSearchResult() {
        $(".app-catalog-1ywclaa:nth-child(1) .e1ys5m360").shouldHave(Condition.text("Батареи для ноутбуков"));
//        href="/search/?text=Apple%20MacBook%20Pro&menu_id=3"
//        $(".app-catalog-1pyy465 e1i4e1af0").shouldHave(Condition.text("Ноутбуки"));
        return this;
    }


}
