import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

import java.time.Duration;

public class seleniumLocators {

    public static void main(String[] args) throws InterruptedException {
        String name = "Adityaacount";

        // chromeDriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        WebDriver driver = new ChromeDriver();
        // using 3 seconds, implicit wait to let the page put out the error message
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        // locators
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
//        driver.findElement(By.id("inputUsername")).sendKeys("Adityaaccount");
//        driver.findElement(By.name("inputPassword")).sendKeys("Adityaaccountpassword");
//        driver.findElement(By.className("signInBtn")).click();
//
////        driver.findElement(By.cssSelector("input#inputUsername")); // with tagname#id, could be tagname#class
////        driver.findElement(By.cssSelector("input[placeholder='Username']")).getText(); // with tagname[attribute='value]
//
//        String out = driver.findElement(By.cssSelector("p.error")).getText(); // with tagname.class
//        System.out.println(out);
//
//        // link locator
//        driver.findElement(By.linkText("Forgot your password?")).click();
//
//        // xpath locator
//        driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[1]")).sendKeys("Rajesh");
//
//        driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("prakash@gmail.com");
//
//        driver.findElement(By.xpath("//input[@type=\"text\"][2]")).clear();
//
//        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("yarian@gmail.com");
//
//        driver.findElement(By.xpath("//form/input[3]")).sendKeys("+919748374833");
//
//        driver.findElement(By.xpath("//div[1]/form/div/button[2]")).click();
//
//        System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());

        // Getting password dynamically
        String password = getPassword(driver);
        // Signing In after seeing error

        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder=\"Username\"]")).sendKeys(name);
        driver.findElement(By.cssSelector("input[placeholder*=\"Pass\"]")).sendKeys(password);

        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();

        Thread.sleep(200);
        // Assertion from Testng
//        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/p")).getText(), "You are successfully logged in.");
//        Assert.assertEquals(driver.findElement(By.cssSelector("div[class=\"login-container\"] h2")).getText(), "Hello " + name + ",");
        driver.findElement(By.xpath("//button[text() = \"Log Out\"]")).click();

        // whole driver along with browser is closed
         driver.quit();

    }

    public static String getPassword(WebDriver driver) throws InterruptedException {
        String password;

        // locators
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[1]/form/div/button[2]")).click();
        String passwordText = driver.findElement(By.cssSelector("p.infoMsg")).getText();

        // Please use temporary password 'rahulshettyacademy' to Login.
        String[] passwordArray = passwordText.split("'");
        password = passwordArray[1].split("'")[0];

        return password;
    }
}
