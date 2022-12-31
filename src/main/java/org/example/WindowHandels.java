package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandels {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.id("openwindow")).click();
        Set <String> window =driver.getWindowHandles();
         Iterator <String> it =window.iterator();
          String parent =it.next();
          String child= it.next();
          driver.switchTo().window(parent);
         String p=driver.getTitle();
        System.out.println(p);
        driver.switchTo().window(child);
        String c=driver.getTitle();
        System.out.println(c);
        driver.switchTo().window(parent);
        String q=driver.getTitle();
        System.out.println(q);
        driver.switchTo().window(child);
        String d=driver.getTitle();
        System.out.println(d);
        driver.close();

        Thread.sleep(5000l);
        driver.quit();














    }
}
