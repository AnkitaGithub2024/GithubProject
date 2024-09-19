package ankFramework.basePackage;

import ankFramework.resourcePackage.globalResource.GLOBAL_STATIC;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        FileInputStream file = new FileInputStream("src/main/java/ankFramework/configPackage/config.properties");
        GLOBAL_STATIC.prop = new Properties();
        GLOBAL_STATIC.prop.load(file);
        driver.get(GLOBAL_STATIC.prop.getProperty("applicationURL"));

/**
 * Reterving properties from properties file
 *
 * There is a class called file input stream there we need to pass config file Repository path.
 * There is another class called as properties class .
 * In this class we have load method there we need to pass object of file input stream class.
 * there is another method is properties class called as get property,there we need pass the key.
 * It will retrieve the value from config file.
 *
 * **/
      //  driver.get("https://google.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()=\"nl\"]")).click();
        driver.findElement(By.xpath("//li[text()=\"\u202AEnglish\u202C\"]")).click();
        driver.findElement(By.xpath("//div[text()=\"Accept all\"]")).click();
        driver.close();
    }
}
