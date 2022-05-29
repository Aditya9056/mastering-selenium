import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.List;

public class section7_UpdatedDropDown {
    public static void main(String[] args) throws InterruptedException {
        // Use chromedrver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        // Testing on MMT, as the given site is not working
        driver.get("https://www.makemytrip.com/flights/");

//        driver.findElement(By.cssSelector("div[data-cy=\"flightTraveller\"]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.cssSelector(" li[data-cy$='adults-5']")).click();
//        driver.findElement(By.cssSelector(" button[data-cy$='travellerApplyBtn']")).click();
//        Thread.sleep(1000);
//
//        System.out.println(driver.findElements(By.cssSelector("p[class=\"blackText font20 code\"]")).get(1).getText());

        driver.findElement(By.cssSelector("input[data-cy$='fromCity']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("Chen");

//        driver.findElement(By.xpath("//ul/li[@id='react-autowhatever-1-section-0-item-1']")).click();

        Thread.sleep(2000);
        //*[@id="react-autowhatever-1-section-0-item-0"]/div/div[2]
        List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"react-autowhatever-1\"]/div/ul/li"));

//        System.out.println("Here are the options -> " + options[0].getTex());]

        String patternString = "^MAA$";
        Pattern pattern = Pattern.compile(patternString, Pattern.MULTILINE);

        for (WebElement option : options){

            Matcher matcher = pattern.matcher(option.getText());

            if(matcher.find()){
//                System.out.println("It matched");
                option.click();
                break;
            }
        }

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-1\"]")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("departure")).click();

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("div[class='DayPicker-Day DayPicker-Day--selected']")).click();

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[3]/div[4]"));

        Thread.sleep(2000);

        driver.findElement(By.id("travellers")).click();

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("button[data-cy='travellerApplyBtn']")).click();

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("a[class='primaryBtn font24 latoBold widgetSearchBtn']")).click();

        Thread.sleep(2000);

//        Thread.sleep(2000);

//        driver.findElement(By.id("departure")).click();

//        Thread.sleep(2000);



        driver.quit(); // whole browser is closed

    }
}
