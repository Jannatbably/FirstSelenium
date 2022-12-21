import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        String goolePageTitle=driver.getTitle();
        System.out.println(goolePageTitle);

        driver.navigate().to("https://www.facebook.com/");
        String faceBookPageTitle=driver.getTitle();
        System.out.println(faceBookPageTitle);
        Thread.sleep(2000l);
        driver.navigate().back();
        String Title=driver.getTitle();
        System.out.println(Title);
        Thread.sleep(2000l);
        driver.navigate().forward();
        String Titlee=driver.getTitle();
        System.out.println(Titlee);
        driver.navigate().refresh();
        Thread.sleep(2000l);

        driver.quit();















    }





}
