import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginSelenium {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("http://52.77.161.168/#/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@formcontrolname='userId'][@ng-reflect-name='userId']")).sendKeys("adli.lantai3@gmail.com");
        driver.findElement(By.xpath("//input[@ng-reflect-name='pass'][@id='pass']")).sendKeys("12345678");
        driver.findElement(By.xpath("//button[@class='px-4 btn btn-primary btn-primary-xl btn btn-block button-login']")).click();
        // String logoutText = driver.findElement(By.tagName("body")).getText();
        // System.out.println(logoutText);
        // wait.until(ExpectedConditions.urlContains("http://52.77.161.168/#/homes"));
        // assertThat(logoutText,containsString("Log Out"));
        driver.quit();
    }

}
