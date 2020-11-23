import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginAdmin {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void BeforeTest() {
        System.setProperty("webdriver.http.factory", "apache");
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("http://52.77.161.168/#/login");
        driver.manage().window().maximize();
    }

    @Test
    public void Test() throws InterruptedException {
        driver.findElement(By.xpath("//input[@formcontrolname='userId'][@ng-reflect-name='userId']")).sendKeys("adli.lantai3@gmail.com");
        driver.findElement(By.xpath("//input[@ng-reflect-name='pass'][@id='pass']")).sendKeys("12345678");
        driver.findElement(By.xpath("//button[@class='px-4 btn btn-primary btn-primary-xl btn btn-block button-login']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@ng-reflect-router-link='/campaign-management']")));
        Thread.sleep(5000);
    }

    @AfterTest
    public void AfterTest() {
        driver.quit();
    }

}
