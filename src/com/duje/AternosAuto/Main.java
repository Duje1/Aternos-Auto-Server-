package com.duje.AternosAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException, AWTException {
	// write your code here

        String exepath = "D:\\chromedriver_win32\\chromedriveer.exe";
        System.setProperty("webdriver.chrome.driver",exepath);
        Boolean pressed = false;

        Robot r = new Robot();

        String text = "Hello World";
        StringSelection stringSelection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, stringSelection);



        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);

        driver.get("https://aternos.org/server/");
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[4]/div[5]/div/a[1]")).click();//login to google
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("EMAIL");//email
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();//confirmation
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.findElement(By.name("password")).sendKeys("PASS");//pass
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
        driver.findElement(By.xpath("/html/body/div/main/section/div/div[2]/div/div[1]")).click();
        try {
            driver.findElement(By.xpath("//*[@id=\"accept-choices\"]")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            driver.findElement(By.xpath("//*[@id=\"start\"]")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            driver.findElement(By.xpath("//*[@id=\"accept-choices\"]")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            driver.findElement(By.xpath("//*[@id=\"nope\"]/main/div/div/div/main/div/a[2]")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        while(pressed = false){
            try{
                driver.findElement(By.xpath("//*[@id=\"confirm\"]")).click();
                pressed=true;
                System.out.println(pressed);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
        driver.findElement(By.xpath("//*[@id=\"confirm\"]")).click();







    }
}
