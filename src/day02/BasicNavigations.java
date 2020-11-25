package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.youtube.com");  // youtube gittim
        driver.navigate().to("https://www.amazon.com");  //amazona gittim
        driver.navigate().back();                           //tekrar youtubeye gittim
        driver.navigate().forward();                        //tekrar amazona gittim
        driver.navigate().refresh();                  //amazon sayfasini refresh yaptim
        driver.manage().window().maximize();          //tam ekran yaptik
        Thread.sleep(5000);
        driver.close();
    }
}
