package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBox {

    public ChromeDriver searcboxpage() {

        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "enuygunweek2/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.findElement(By.xpath("//div[@class='card mt-4 top-card'][1]")).click();
        driver.findElement(By.xpath("//div//ul//li[@id='item-3'][1]")).click();
        return driver;
    }
}
