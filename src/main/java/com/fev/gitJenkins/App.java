package com.fev.gitJenkins;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class App {

	@Test(priority = 1)
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/LAM/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("http://127.0.0.1:5500/login.html");
        
        WebElement inputName = driver.findElement(By.id("inputName"));
        WebElement inputPass = driver.findElement(By.id("inputPass"));
        WebElement btnSubmit = driver.findElement(By.id("btnSubmit"));
        
        js.executeScript("arguments[0].value='" + "ADMINADMIN" + "'", inputName);
        js.executeScript("arguments[0].value='" + "08102003" + "'", inputPass);
        btnSubmit.click();				
	        		
	        // create file named Cookies to store Login Information		
	        File file = new File("Cookies.data");							
	        try		
	        {	  
	            // Delete old file if exists
				file.delete();		
	            file.createNewFile();			
	            FileWriter fileWrite = new FileWriter(file);							
	            BufferedWriter Bwrite = new BufferedWriter(fileWrite);							
	            // loop for getting the cookie information 		
	            	
	            // loop for getting the cookie information 		
	            for(Cookie ck : driver.manage().getCookies())							
	            {			
	            	System.out.println(ck.getName());
	                Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
	                Bwrite.newLine();             
	            }			
	            Bwrite.close();			
	            fileWrite.close();	
	            
	        }
	        catch(Exception ex)					
	        {		
	            ex.printStackTrace();			
	        }		
    }
	
}

