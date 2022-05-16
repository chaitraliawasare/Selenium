import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  

public class selenium {  
    public static void main(String[] args) {      
    // declaration and instantiation of objects/variables  
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium Test Case\\src\\chromedriver.exe");  
     WebDriver driver=new ChromeDriver();  
     driver.navigate().to("http://172.168.1.150:8080/login");
     driver.findElement(By.xpath("/html/body/div/div/div/div/span/a")).click();
     driver.findElement(By.id("firstName")).sendKeys("Kamal");
     driver.findElement(By.id("lastName")).sendKeys("Soni");
     driver.findElement(By.id("email")).sendKeys("Kamal@tcs.com");
     driver.findElement(By.id("password")).sendKeys("2002");
     //Register Button
     driver.findElement(By.xpath("/html/body/div/div/div/form/div[5]/button")).click();
     //Login Here Button
     driver.findElement(By.xpath("/html/body/div/div/div/form/div[5]/span/a")).click();
     //Login Details
     driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Kamal@tcs.com");
     driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("2002");
     driver.findElement(By.xpath("//*[@id=\"login-submit\"]")).click();
     driver.findElement(By.xpath("/html/body/div/a")).click();
     //Add Employee
     driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Prajakta");
     driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Maid");
     driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("prajakta@tcs.com");
     driver.findElement(By.xpath("html/body/div/form/button")).click();
     driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li/a")).click();  
    }  
}  
