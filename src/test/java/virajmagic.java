import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class virajmagic {
    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
               driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("who is the most  intelligent student ");
        try {
            sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.get("https://www.google.com");
        driver.get("https://images.search.yahoo.com/search/images;_ylt=Awr9Fqo1AfhhTX4AZ8GJzbkF;_ylu=c2VjA3NlYXJjaARzbGsDYnV0dG9u;_ylc=X1MDOTYwNjI4NTcEX3IDMgRhY3RuA2NsawRjc3JjcHZpZANKOGlfX2pFd0xqTE9kTjFKV191bHRnVFFNVEF4TGdBQUFBQ0FkZGhPBGZyA21jYWZlZQRmcjIDc2EtZ3AEZ3ByaWQDbXpSN3VwOXZUSDJRd1pBQk9wWjh3QQRuX3N1Z2cDMARvcmlnaW4DaW1hZ2VzLnNlYXJjaC55YWhvby5jb20EcG9zAzAEcHFzdHIDBHBxc3RybAMEcXN0cmwDMTUEcXVlcnkDdmlyYWolMjBuYW1lJTIwBHRfc3RtcAMxNjQzNjQzMTk5?p=viraj+name+&fr=mcafee&fr2=sb-top-images.search&ei=UTF-8&x=wrt&type=E211US826G0");


    }
}
