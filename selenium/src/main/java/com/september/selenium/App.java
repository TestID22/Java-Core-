package com.september.selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Для работы Селениума нужно прописать путь к скачанному геккодрайверу
 * 
 *  
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.gecko.driver","D:\\Code_Code_Code\\Java-Core-\\selenium\\driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
        driver.get("http://sss.cjwl.ljdpn.1.gsr.anonimizing.com/");
//        driver.manage().window().setSize(new Dimension(100, 300));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.name("q"));
        
        element.sendKeys("djaga");
    }
}
