package Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public static void main (String[] arg) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://github.com/login");

        WebElement Password = driver.findElement(By.id("password"));
        WebElement Login = driver.findElement(By.cssSelector("#login_field"));

        Login.sendKeys("violette15091994@gmail.com");
        Password.sendKeys("3249865951431vk");
        driver.findElement(By.cssSelector("#login > form > div.auth-form-body.mt-3 > input.btn.btn-primary.btn-block")).click();

        Thread.sleep(10000);

        driver.close();
        driver.quit();
    }

}
