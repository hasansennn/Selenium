import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.html.HTMLInputElement;

public class selenium01 {
    static Object WebDriverManager;

    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","src/drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.trendyol.com/");

        // 1 - driver.get ("url")--> yazdigimiz  url'e gider
        driver.get("https://www.amazon.com/");

        //2 - driver.getTitle()--> icinde oldugu sayfanin basligini döndürür
        System.out.println("sayfa title : " + driver.getTitle());// Amazon.com. Spend less.Smile more

        //3- driver.getCurrentUrl()  --->iceinde oldugu sayfanin URL'ini döndürür
        System.out.println(driver.getCurrentUrl()); // https://www.amazon.com/

        // 4- driver getPageSource(); ---> icinde oldugu sayfanin kaynak kodlarini döndürür
        System.out.println("==================================================================");
        System.out.println(driver.getPageSource()); // arka planda calisan sayfa kodlarini yazdirir.
        System.out.println("==================================================================");

        // 5 -driver.getWindowHandle()--->icinde olduğu sayfanin UNIQUE hash kodunu döndürür
        System.out.println(driver.getWindowHandles()); // [CDwindow-4E1FD84FD9BF0597D4784B35A3D94C2C]

    }
}
