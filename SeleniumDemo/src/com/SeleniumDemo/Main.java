package com.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello_World");

        System.setProperty("webdriver.chrome.driver","C:\\Users\\asmaa\\Desktop\\SWE\\PreRequists\\chromedriver_win32_86\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.gmail.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("identifierId")).sendKeys("asmaakhal55@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.className("VfPpkd-RLmnJb")).click();
        Thread.sleep(1000);
        String at = driver.getTitle();
        String et ="gmail";
        System.out.println(at);
        driver.close();
        if(at.equalsIgnoreCase(et)){

            System.out.println("Test Successful");
        }
        else {
            System.out.println("Test Failure");
        }


    }
}






