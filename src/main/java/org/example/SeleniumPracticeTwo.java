package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class SeleniumPracticeTwo {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.xpath("//a[text()='Dropdown']")).click();
        //driver.findElement(By.xpath("//select[@ id='dropdown']"));
        Select s =new Select( driver.findElement(By.xpath("//select[@ id='dropdown']")));
        //s.selectByValue("1");
        s.selectByVisibleText("Option 1");
        //s.selectByIndex();

     //



        }








    }
















