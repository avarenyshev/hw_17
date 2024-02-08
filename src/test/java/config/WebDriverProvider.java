package config;
import java.util.function.Supplier;
//import com.google.common.base.Supplier;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


import static config.Browser.Firefox;

public class WebDriverProvider implements Supplier<WebDriver> {
    private final WebDriverConfig config;
    public WebDriverProvider() {
        this.config = new WebDriverConfig();
    }
    @Override
    public WebDriver get() {
        WebDriver driver = createDriver();
        driver.get(config.getBeseUrl());
        return driver;
    }
    public WebDriver createDriver() {
        switch (config.getBrowser()) {
//            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
        case Firefox: {
//            WebDriverManager.firefoxdriver().setup():
            return new FirefoxDriver();
        }
        default: {
            throw new RuntimeException("No such driver");
        }
    }

}
