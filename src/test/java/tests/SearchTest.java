package tests;

import org.junit.jupiter.api.Test;
import pages.MainPage;

public class SearchTest {
    MainPage mainPage = new MainPage();
    @Test
    void SearchTest() {
        mainPage.openPage()
                .inputQuery("Apple MacBook Pro")
                .checkSearchResult();


    }


}
