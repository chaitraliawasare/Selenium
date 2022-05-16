import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  

public class selenium {  
    public static void main(String[] args) throws InterruptedException {      
    // declaration and instantiation of objects/variables  
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium Test Case\\src\\chromedriver.exe");  
     WebDriver driver=new ChromeDriver();  
     //driver.manage().timeouts().pageLoadTimeout(10, null);
     driver.navigate().to("http://172.168.1.150:8080/login");
     Thread.sleep(3000);
     driver.findElement(By.xpath("/html/body/div/div/div/div/span/a")).click();
     driver.findElement(By.id("firstName")).sendKeys("Smith");
     driver.findElement(By.id("lastName")).sendKeys("Williams");
     driver.findElement(By.id("email")).sendKeys("Smith@tcs.com");
     driver.findElement(By.id("password")).sendKeys("1999");
     //Register Button
     Thread.sleep(3000);
     driver.findElement(By.xpath("/html/body/div/div/div/form/div[5]/button")).click();
     //Login Here Button
     driver.findElement(By.xpath("/html/body/div/div/div/form/div[5]/span/a")).click();
     //Login Details
     driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Smith@tcs.com");
     driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1999");
     Thread.sleep(3000);
     driver.findElement(By.xpath("//*[@id=\"login-submit\"]")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("/html/body/div/a")).click();
     //Add Employee
     Thread.sleep(3000);
     driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Jennifer");
     driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Jones");
     driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Jennifer@tcs.com");
     Thread.sleep(3000);
     driver.findElement(By.xpath("html/body/div/form/button")).click();
     driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li/a")).click();  
    }  
}  
