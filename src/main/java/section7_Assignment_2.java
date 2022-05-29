import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;



public class section7_Assignment_2 {

    public static void main(String[] args) throws InterruptedException {
        // Use chromedrver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/angularpractice/");

        // Send Name, Email and Password
        driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Haris");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Haris@gmail.com");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("HarisPassword");

        // Check the checkbox
        driver.findElement(By.cssSelector("input[id='exampleCheck1']")).click();

        driver.findElements(By.cssSelector("select[id='exampleFormControlSelect1'] option")).get(1).click();

        driver.findElement(By.cssSelector("input[id='inlineRadio2']")).click();

        driver.findElement(By.cssSelector("input[type='date']")).sendKeys("12/03/2001");
        driver.findElement(By.cssSelector("input[type='submit']")).click();


//        driver.quit();

    }
}
