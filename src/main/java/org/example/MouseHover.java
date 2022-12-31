package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class MouseHover {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //action(mouse interaction or mouse ajex)
        Actions a=new Actions(driver);
        WebElement element=driver.findElement(By.xpath("//button[@id='mousehover']"));
        a.moveToElement(element).perform();
        a.moveToElement(driver.findElement(By.xpath("//a[text()='Reload']"))).click().perform();




    }



}
