import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ForgotPass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.drive", "C:/Users/Ionut/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin1234");
        driver.findElement(By.xpath("//button ")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector("p[class$='oxd-text oxd-text--p oxd-alert-content-text']")).getText());
        driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
        driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
}
