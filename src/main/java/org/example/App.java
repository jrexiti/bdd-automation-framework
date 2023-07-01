package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;

        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver");

        driver = new ChromeDriver();

        driver.get("https:www.google.com");

        Thread.sleep(3000);
        driver.quit();

    }

}