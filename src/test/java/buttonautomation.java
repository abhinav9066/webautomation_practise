import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class buttonautomation
{
    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Add/Remove Elements")).click();
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//button[text()='Delete']")).click();
        driver.findElement(By.linkText("Dropdown")).click();
//        driver.get("https://www.google.com");
//        driver.manage().window().maximize();
//        driver.findElement(By.name("q")).sendKeys("who is the most beautiful girl");
//        try {
//            sleep(6000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        driver.get("https://www.google.com");
//        driver.get("https://www.google.com/search?q=kritika+++name+girls&tbm=isch&ved=2ahUKEwjfjsjp3Nv1AhU2zqACHfknAPQQ2-cCegQIABAA&oq=kritika+++name+girls&gs_lcp=CgNpbWcQAzoECAAQQzoFCAAQgAQ6CAgAEAgQBxAeOgYIABAIEB5QAFigMmDVN2gDcAB4AIAB7QKIAdUNkgEHMC45LjEuMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=WrL3Yd_5ELacg8UP-c-AoA8&bih=612&biw=1366&rlz=1C1RLNS_enIN824IN824#imgrc=-bh4wNyV2CeEyM");
//







    }

}