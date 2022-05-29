import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class section7_importanceOfAssertions {
    public static void main(String[] args) throws InterruptedException {
        // Use chromedrver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Testing on MMT, as the given site is not working
        driver.get("https://www.makemytrip.com/flights/");
//        Assert.assertFalse(true);

    }

}
