package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {
    public static void main(String[] args) {
        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://www.amazon.com/");
        // Print the title of the page Amazon {

        driver.findElement(By.id("twotabsearchtextbox")).click();

        driver.findElement(By.id("twotabsearchtextbox")).click();

        searchBox.sendKeys("i phone 17 pro");

        //searchBox.submit();


    }
    
}
