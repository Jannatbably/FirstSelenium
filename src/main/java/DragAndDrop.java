import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");

        WebElement frame=driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);


       WebElement source=driver.findElement(By.id("draggable"));
       WebElement target  =driver.findElement(By.id("droppable"));
        Actions action=new Actions(driver);
        action.dragAndDrop(source,target).build().perform();

        driver.switchTo().defaultContent();
        Thread.sleep(3000l);
        driver.findElement(By.xpath("//a[text()='Draggable']")).click();

        Thread.sleep(3000l);
        driver.quit();








    }
}
