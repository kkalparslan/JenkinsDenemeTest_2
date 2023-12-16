package com.krafttech.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Jenkins_Test_1 {

    @Test
    public static void jenkinsDenemeTest1() throws InterruptedException {

        System.out.println("test başarılı");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

//        driver.get("http://google.com");
//        WebElement searchBox = driver.findElement(By.xpath("//input[@class='gLFyf']"));
//        //searchBox.click();
//        searchBox.sendKeys(("mhrs")+ ENTER);
//        JavascriptExecutor jse= (JavascriptExecutor) driver;
//        jse.executeScript("arguments[0].scrollIntoView(true);"
//                +"arguments[0].click()",searchBox);
        driver.get("https://www.mhrs.gov.tr/");
        driver.manage().window().maximize();
        driver.findElement(By.className("headerRandevual")).click();
        Thread.sleep(2000);

        String currentTab = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();

        for (String tab : windowHandles) {
            if(!tab.equals(currentTab)) {
                driver.switchTo().window(tab);
            }
        }
        Thread.sleep(2000);
        //System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        WebElement tc = driver.findElement(By.xpath("//input[@id='LoginForm_username']"));
        tc.click();
        tc.sendKeys("....");
        Thread.sleep(2000);
        WebElement psword=driver.findElement(By.xpath("//input[@id='LoginForm_password']"));
        psword.click();
        psword.sendKeys("....");
        WebElement login=driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-teal ant-btn-block']"));
        login.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@class='ant-btn']")).click();
//        Alert alert=driver.switchTo().alert();
//        alert.accept();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='randevu-turu-grup-article'])[3]")).click();
        Thread.sleep(2000);
        driver.quit();
    }
    @Step
    public static void allureDeneme() throws InterruptedException {

        System.out.println("test başarılı");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

//        driver.get("http://google.com");
//        WebElement searchBox = driver.findElement(By.xpath("//input[@class='gLFyf']"));
//        //searchBox.click();
//        searchBox.sendKeys(("mhrs")+ ENTER);
//        JavascriptExecutor jse= (JavascriptExecutor) driver;
//        jse.executeScript("arguments[0].scrollIntoView(true);"
//                +"arguments[0].click()",searchBox);
        driver.get("https://www.mhrs.gov.tr/");
        driver.manage().window().maximize();
        driver.findElement(By.className("headerRandevual")).click();
        Thread.sleep(2000);

        String currentTab = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();

        for (String tab : windowHandles) {
            if(!tab.equals(currentTab)) {
                driver.switchTo().window(tab);
            }
        }
        Thread.sleep(2000);
        //System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        WebElement tc = driver.findElement(By.xpath("//input[@id='LoginForm_username']"));
        tc.click();
        tc.sendKeys("....");
        Thread.sleep(2000);
        WebElement psword=driver.findElement(By.xpath("//input[@id='LoginForm_password']"));
        psword.click();
        psword.sendKeys("....");
        WebElement login=driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-teal ant-btn-block']"));
        login.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@class='ant-btn']")).click();
//        Alert alert=driver.switchTo().alert();
//        alert.accept();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='randevu-turu-grup-article'])[3]")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
