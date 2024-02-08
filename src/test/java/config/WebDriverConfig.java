package config;

public class WebDriverConfig {
    public String getBeseUrl() {
        return "https://www.citilink.ru/";
    }

    public String remoteUrl() {
        return "https://user1:1234@selenoid.autotests.cloud/wd/hub";
    }

    public Browser getBrowser() {
        return Browser.Chrome;
    }
    public Browser getBrowser1() {
        return Browser.Firefox;
    }

}
