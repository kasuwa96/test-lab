package com.example.registrationlogindemo.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumTutorial {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable (download from
        https://sites.google.com/chromium.org/driver/ )
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\driver\\chrome\\chromedriver.exe");
        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Navigate to a website
        driver.get("http://localhost:8080/index");
        // Perform some actions (e.g., print the title)
        System.out.println("Page Title: " + driver.getTitle());
        // Close the browser
        driver.quit();
    }
}
