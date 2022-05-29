import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Arrays;
import java.util.List;

public class functionalTesting {
    public static void main(String[] args) {
        // Use chromedrver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");


        List<WebElement> elements = driver.findElements(By.cssSelector("h4.product-name"));
        String[] vegToBuy = {"Cauliflower", "Brocolli", "Cucumber"};
        int j = vegToBuy.length;

        for( int i = 0; i<elements.size(); i++){
            String name[] = elements.get(i).getText().split("-");

            List veggies = Arrays.asList(vegToBuy);

            if( veggies.contains(name[0].trim()) && j != 0 ){
                // click on add to cart
                j--;
                System.out.println(name[0]);
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
            }
        }

        driver.quit(); // whole browser is closed
    }
}
