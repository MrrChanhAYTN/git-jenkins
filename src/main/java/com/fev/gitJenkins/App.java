package com.fev.gitJenkins;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class App {

	@Test(priority = 1)
	public void Login() {
    	System.setProperty("webdriver.chrome.driver", "C:/Users/LAM/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
        WebDriver wdriver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) wdriver;
        wdriver.get("http://127.0.0.1:5500/login.html");
        
        WebElement inputName = wdriver.findElement(By.id("inputName"));
        WebElement inputPass = wdriver.findElement(By.id("inputPass"));
        WebElement btnSubmit = wdriver.findElement(By.id("btnSubmit"));
        
        js.executeScript("arguments[0].value='" + "ADMINADMIN" + "'", inputName);
        js.executeScript("arguments[0].value='" + "08102003" + "'", inputPass);
        btnSubmit.click();
    }
	@Test(priority = 2)
	public void Log() {
    	System.setProperty("webdriver.chrome.driver", "C:/Users/LAM/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
        WebDriver wdriver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) wdriver;
        wdriver.get("http://127.0.0.1:5500/login.html");
        
        WebElement inputName = wdriver.findElement(By.id("inputName"));
        WebElement inputPass = wdriver.findElement(By.id("inputPass"));
        WebElement btnSubmit = wdriver.findElement(By.id("btnSubmit"));
        
        js.executeScript("arguments[0].value='" + "ADMINADMIN" + "'", inputName);
        js.executeScript("arguments[0].value='" + "08102003" + "'", inputPass);
        btnSubmit.click();
    }
	@Test(priority = 3)
	public void Logi() {
    	System.setProperty("webdriver.chrome.driver", "C:/Users/LAM/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
        WebDriver wdriver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) wdriver;
        wdriver.get("http://127.0.0.1:5500/login.html");
        
        WebElement inputName = wdriver.findElement(By.id("inputName"));
        WebElement inputPass = wdriver.findElement(By.id("inputPass"));
        WebElement btnSubmit = wdriver.findElement(By.id("btnSubmit"));
        
        js.executeScript("arguments[0].value='" + "ADMINADMIN" + "'", inputName);
        js.executeScript("arguments[0].value='" + "08102003" + "'", inputPass);
        btnSubmit.click();
    }
}

