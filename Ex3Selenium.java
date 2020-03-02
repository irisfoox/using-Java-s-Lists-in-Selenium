package first;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3Selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        //Go to http://automationpractice.com/index.php
        //Click on tshirt tab & Read the text from tshirt text
		//Go back to home page
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/Selenium/Drivers/chrome79/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.automationpractice.com/index.php");
        driver.manage().window().maximize();
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        WebElement tsh=driver.findElement(By.linkText("T-SHIRTS"));
        tsh.click();
        Thread.sleep(3000);
        WebElement txt=driver.findElement(By.className("rte"));
        System.out.println(txt.getText());
        String url="http://automationpractice.com/";
        driver.get(url);
        Thread.sleep(3000);
        
        //Go to https://www.calculator.net/
        //Find all elements with link contains the word Calculator
        //Click on Salary calculator&type all kinds of calculators
        driver.get("https://www.calculator.net/");
        Thread.sleep(3000);
        java.util.List<WebElement>calList=driver.findElements(By.partialLinkText("Calculator"));
        for(int i=0;i<calList.size();i++) {
        	if(calList.get(i).getText().contains(("Salary Calculator"))){
        		calList.get(i).click();
        	}
        	System.out.print(calList.get(i).getText()+" ,");
        }
        
        Thread.sleep(2000);
        
        driver.quit();
	}

}
