
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class checkboxwithsameproperty {
    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("/checkboxes")).click();
        //List<WebElement>lst = driver.findElements(By.xpath("//input[@type='checkbox']"));
        //lst.get(0).click();



    }
}
