package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartElectronics {
    @Test
    public void Auto_Suggestive_Drop_dwon() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

       //WebElement e=driver.findElement(By.xpath("//div[@class='eFQ30H']//div[text()='Electronics']"));
       WebElement e=driver.findElement(By.xpath("//div[@class='eFQ30H'][4]//div[text()='Electronics']"));
       //WebElement e=driver.findElement(By.xpath("//div[@class='eFQ30H'][4]//div[text()='Electronics']"));
        //div[text()='Electronics']
        //WebElement e=driver.findElement(By.xpath("//div[contains(@class,'_37M3Pb')]//div[text()='Electronics']"));
        //WebElement e=driver.findElement(By.xpath("//div[contains(@class,'_37M3Pb')]//div[@class='eFQ30H'][4]"));







        //WebElement e=driver.findElement(By.xpath("//div[@class='_37M3Pb']//div[@class='eFQ30H'][4]//div[text()='Electronics']"));
        //WebElement e= driver.findElement(By.xpath("//div[@class='_37M3Pb']//div[@class='eFQ30H'][4]//div[@class='xtXmba']"));
        //WebElement e=driver.findElement(By.xpath("//div[@class='eFQ30H'][4]//div[@class='xtXmba']"));

        Actions a=new Actions(driver);
        a.moveToElement(e).perform();
        //WebElement ld=driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
        WebElement ld= driver.findElement(By.xpath("//a[text()='Laptop and Desktop']"));
        a.moveToElement(ld).click().build().perform();
        //a.click().perform();









    }

}
