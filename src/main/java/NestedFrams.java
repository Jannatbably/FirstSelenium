import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class NestedFrams {


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/nested_frames");

        Actions a= new Actions(driver);
        List<WebElement> d =driver.findElements(By.tagName("frame"));
        System.out.println(d.size());
       WebElement parentTop=driver.findElement(By.xpath("//frame[@name='frame-top']"));
       driver.switchTo().frame(parentTop);
       List<WebElement>b =driver.findElements(By.tagName("frame"));
        System.out.println(b.size());
        a.contextClick().perform();
       driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-left']")));
        a.contextClick().perform();
        driver.switchTo().parentFrame().switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
        a.contextClick().perform();
        driver.switchTo().parentFrame().switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-right']")));
        a.contextClick().perform();
        driver.switchTo().defaultContent();

        a.contextClick().perform();



        driver.quit();

    }

}
