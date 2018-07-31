package autofreamwork_logic_layer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDriver {

    public static  WebDriver driver;

    public static void OpenBrowser(String browser){

        String path = System.getProperty("user.dir");

        if (browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver",path + "/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browser.equals("ie")){
            System.setProperty("webdriver.ie.driver",path + "/drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }else if (browser.equals("firefox")){
            driver = new FirefoxDriver();
        }else {
            System.out.println("输入浏览器名称有误");
        }
    }

    public static void closeall(){
        driver.quit();
    }

    public static void close(){
        driver.close();
    }
}
