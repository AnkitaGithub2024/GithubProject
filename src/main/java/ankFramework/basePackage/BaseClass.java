package ankFramework.basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.rblbank.com");
        driver.manage().window().maximize();
        driver.close();
    }
}
