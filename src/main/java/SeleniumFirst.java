import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.xpath.XPath;

public class SeleniumFirst {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //Locators TageName,Attribute,Value)
        //<input type="text" id="autocomplete" class="inputs ui-autocomplete-input" placeholder="Type to Select Countries" autocomplete="off">
        //TageName is <input
        //Attribute = 'Value'
        //type      ='text'
        //id='autocomplete'
        /*
        Xpath:  //TageName[@Attribute='value'] //<input[@type='text']
        Css: TageName[Attribute='value'] <input[class='inputs ui-autocomplete-input']
        id
        Name
        Class Name
        Linklist
        partiallinklist
        if there any like in we make a xpath by using text method://TageName[text()='value']

         */

         /*
      driver.findElement(By.xpath());
       driver.findElement(By.className("inputs ui-autocomplete-input")).sendKeys("Rubina");
        driver.findElement(By.id("autocomplete")).sendKeys("Anika");
       driver.findElement(By.name());
         driver.findElement(By.cssSelector());
        driver.findElement(By.linkText());
        driver.findElement(By.partialLinkText());
        */

       //driver.findElement(By.xpath("//input[@value='radio3']")).click();
       //driver.findElement(By.cssSelector("input[value='radio2']")).click();
       //Thread.sleep(2000l);
       //driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("USA");
       //driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
       //driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ayman");
        //driver.findElement(By.xpath("//input[@id='displayed-text']")).sendKeys("Mobinah");
        //Thread.sleep(3000l);
        //alert
       //driver.findElement(By.xpath("//input[@ id='confirmbtn']")).click();

        //text writing insert alert print
       String alertmsg =driver.switchTo().alert().getText();
        System.out.println(alertmsg);
        driver.switchTo().alert().accept();
        //Thread.sleep(3000l);
        //page text print
       //String pageheader =driver.findElement(By.xpath("//h1")).getText();
        //System.out.println(pageheader);

        //How to scroll

        //JavascriptExecutor js =(JavascriptExecutor)driver;
        //WebElement scroll= driver.findElement(By.xpath("//button[@id='mousehover']"));
        //js.executeScript("argument[0].scollintoView();",scroll);

       //Thread.sleep(5000l);

        //driver.quit();






    }
}






















