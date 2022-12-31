package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //By creatig xpath

        driver.findElement(By.xpath("//button[text()='Practice']")).click();
        Thread.sleep(2000l);
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        Thread.sleep(2000l);
        driver.findElement(By.xpath("//button[text()='Signup']")).click();
        Thread.sleep(3000l);
        driver.findElement(By.xpath("//button[text()='Home']")).click();


        






    }













}
