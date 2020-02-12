package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonBehavior {

    public CommonBehavior(String url){
        baseUrl = url;
    }

    public WebDriver driver;
    public String baseUrl;

    public void setDriver(){
        System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }
}
