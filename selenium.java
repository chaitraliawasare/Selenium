
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  

public class selenium {  
    public static void main(String[] args) {      
    // declaration and instantiation of objects/variables  
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium Test Case\\src\\chromedriver.exe");  
     WebDriver driver=new ChromeDriver();  
     //driver.manage().timeouts().pageLoadTimeout(10, null);
     driver.navigate().to("http://172.168.1.150:8080/login");
     driver.findElement(By.xpath("/html/body/div/div/div/div/span/a")).click();
     driver.findElement(By.id("firstName")).sendKeys("Shubham");
     driver.findElement(By.id("lastName")).sendKeys("Patil");
     driver.findElement(By.id("email")).sendKeys("Shubham@tcs.com");
     driver.findElement(By.id("password")).sendKeys("2000");
     //Register Button
     driver.findElement(By.xpath("/html/body/div/div/div/form/div[5]/button")).click();
     //Login Here Button
     driver.findElement(By.xpath("/html/body/div/div/div/form/div[5]/span/a")).click();
     //Login Details
     driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Shubham@tcs.com");
     driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("2000");
     driver.findElement(By.xpath("//*[@id=\"login-submit\"]")).click();
     driver.findElement(By.xpath("/html/body/div/a")).click();
     //Add Employee
     driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Praveen");
     driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Kumar");
     driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Praveen@tcs.com");
     driver.findElement(By.xpath("html/body/div/form/button")).click();
     driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li/a")).click();  
    }  
}  
