import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumIntro {

    public static void main(String[] args) {

        // Use chromedrver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        //ChromeDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        System.out.println(driver.getTitle());
//        driver.close(); // only window is closed
        driver.quit(); // whole browser is closed

    }
}