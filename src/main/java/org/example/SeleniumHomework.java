package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumHomework {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.xpath("//input[@value='radio1']")).click();
        driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Bangladesh");
        driver.findElement(By.xpath("//legend[text()='Dropdown Example']")).click();
        //driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        Select s =new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
        s.selectByVisibleText("Option3");
        //s.selectByValue("");
        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
        driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
        driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Fatima");
        driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
        String alertext =driver.switchTo().alert().getText();
        System.out.println(alertext);
        Thread.sleep(3000l);
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//input[@id='displayed-text']")).sendKeys("Mobinah");
        Thread.sleep(2000l);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement element=driver.findElement(By.xpath("//button[@id='mousehover']"));
        js.executeScript("arguments[0].scrollIntoView();",element);
        Thread.sleep(3000l);
        WebElement ci = driver.findElement(By.xpath("//a[text()='Contact info']"));
        js.executeScript("arguments[0].scrollIntoView();",ci);
        Thread.sleep(3000l);
        WebElement pp=driver.findElement(By.xpath("//h1"));
        js.executeScript("arguments[0].scrollIntoView();",pp);

        driver.quit();

























    }






















}
