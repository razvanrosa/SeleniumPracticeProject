import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OnlineShop {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "resources/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
    }
}
