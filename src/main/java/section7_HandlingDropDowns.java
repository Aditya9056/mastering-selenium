import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class section7_HandlingDropDowns {
    public static void main(String[] args) {
        // Use chromedrver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement element = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        // special class for handling select in Selenium
        Select dropdown = new Select(element);

        // Method - 1, Select by Index
        dropdown.selectByIndex(2);
        System.out.println(dropdown.getFirstSelectedOption().getText());

        // Method - 2, Select by Name
        dropdown.selectByVisibleText("USD");
        System.out.println(dropdown.getFirstSelectedOption().getText());


        // Method - 3, Select by Value
        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());

        driver.quit(); // whole browser is closed

    }
}
