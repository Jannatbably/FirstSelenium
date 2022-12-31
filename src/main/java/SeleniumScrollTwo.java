import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumScrollTwo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        JavascriptExecutor je= (JavascriptExecutor)driver;
        //Horizontal Slider
        WebElement hs =driver.findElement(By.xpath("//a[text()='Horizontal Slider']"));
        je.executeScript("arguments[0].scrollIntoView();",hs);
        Thread.sleep(3000l);
        //WYSI
        WebElement we =driver.findElement(By.xpath("//a[text()='WYSIWYG Editor']"));
        je.executeScript("arguments[0].scrollIntoView();",we);
        Thread.sleep(3000l);
        //welcome to
        WebElement wt =driver.findElement(By.xpath("//h1[@class='heading']"));
        je.executeScript("arguments[0].scrollIntoView();",wt);

        //js.executeScript("arguments[0].scrollIntoView();",st);
















    }


}
