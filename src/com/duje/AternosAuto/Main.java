package com.duje.AternosAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String exepath = "D:\\chromedriver_win32\\chromedriveer.exe";
        System.setProperty("webdriver.chrome.driver",exepath);


        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);

        driver.get("https://aternos.org/server/");
        WebElement elementLocator = (WebElement) By.className("btn btn-white btn-no-margin google-button");
        actions.click(elementLocator).build().perform();

        driver.findElement(By.id("Sign in with Google")).click();




    }
}
