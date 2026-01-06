package edit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prueba1 {

    @Test
    public void searchProduct() {

    // 1- define browser
        WebDriver browser = new ChromeDriver();

    // 2- maximize windows and clear cookies
        browser.manage().window().maximize();
        browser.manage().deleteAllCookies();

    // 3- access the URL

    // 4- write the product you want to search for (text field)

    // 5- simulate pressing enter

    // 6- close the navigator

    }
}
