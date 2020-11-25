package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.

        driver.get("https://www.facebook.com");
        String actuelTitleFace = driver.getTitle();
        String expectedTitleFace = "facebook";
        if (actuelTitleFace.equals(expectedTitleFace)){
            System.out.println("Facebook page title test PASSED");
        }else{
            System.out.println("Facebook page title test FAILED");
            System.out.println("Actuel title: "+ actuelTitleFace);
        }

        //Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’I
        //yazdirin

        String actuelUrlFace = driver.getCurrentUrl();
        String arananKelimeFace = "facebook";
        if (actuelUrlFace.contains(arananKelimeFace)){
            System.out.println("Facebook URL test PASSED");
        }else{
            System.out.println("Facebook URL test FAILED");
            System.out.println("URL "+ arananKelimeFace + " icermiyor.");
        }

        //https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com/");

        //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actuelTitleWAlmart = driver.getTitle();
        String arananKelimeWalmart = "Walmart.com";
        if(actuelTitleWAlmart.contains(arananKelimeWalmart)){
            System.out.println("Walmart Title Test PASSED");
        }else{
            System.out.println("Walmart Title Test FAILED");
            System.out.println("Walmart Title " +arananKelimeWalmart+ " icermiyor.");
        }

        //Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        //Sayfayi yenileyin
        driver.navigate().refresh();

        //Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();

        //Browser’i kapatin
        driver.close();

    }

}
