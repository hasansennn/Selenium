import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium02 {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","src/drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.amazon.com");

        driver.navigate().to("https://www.facebook.com");

        // 2- driver.navigate().back;---> bir onceki sayfaya donus yapar.
        driver.navigate().back(); // ornegimizdeki amazona donus yapacaktir

        // 3- driver.navigate().forward(); ---> back () ile geldigi sayfaya yeniden gider
        driver.navigate().forward(); // ornegimizdeki facebook a donus yapacaktir.

        // 4 - driver.navigate().refresh; ---> icinde oldugu sayfayi yeniler
        driver.navigate().refresh();

        // driver olusturuldugunda acilan sayfayi kapatmak istersek
        //driver.close();

        // driver calisirken birden fazal tab veya window actiysa tumunu kapatmak icin
        driver.quit();




    }
}
