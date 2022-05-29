import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class section9_ImplicitWait {
    public static void main(String[] args) throws InterruptedException {
        // Use chromedrver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        String[] items = {"Cauliflower", "Brocolli", "Cucumber"};
        section9_ImplicitWait test = new section9_ImplicitWait();
        test.selectItems(driver, items);
    }

    public void selectItems(WebDriver driver, String[] items) throws InterruptedException {

        List<WebElement> elements = driver.findElements(By.cssSelector("h4.product-name"));

        int j = items.length;

        for( int i = 0; i<elements.size(); i++){
            String name[] = elements.get(i).getText().split("-");

            List veggies = Arrays.asList(items);

            if( veggies.contains(name[0].trim()) && j != 0 ){
                // click on add to cart
                j--;
                System.out.println(name[0]);
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
            }
        }

        driver.findElement(By.cssSelector("a[class='cart-icon']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button[class='promoBtn']")).click();

        boolean applied = driver.findElement(By.cssSelector("span[class='promoInfo']")).getText().equals("Code applied ..!");

        if(applied){
            System.out.println("Applied");
        } else {
            System.out.println("Not applied");
        }
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();


    }
}
