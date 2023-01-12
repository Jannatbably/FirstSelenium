package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Flipchart {
    @Test
    public void Auto_Suggestive_Drop_dwon() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone14");
        Thread.sleep(2000l);

        List<WebElement> b = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']//li//div//a//div[2]//span"));
        System.out.println(b.size());
        for (int i = 0; i < b.size(); i++) {
            System.out.println(b.get(i).getText());
            String d = b.get(i).getText();
            if (d.equalsIgnoreCase("iphone 14 cover")) {
                b.get(i).click();


            }


        }
    }

}
