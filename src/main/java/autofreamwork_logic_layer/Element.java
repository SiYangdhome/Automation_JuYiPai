package autofreamwork_logic_layer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Element extends SeleniumDriver{

    public static WebElement findelement(By by){

        try {
            WebDriverWait wait = new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
        }catch (Exception e){
            e.printStackTrace();
        }
        WebElement element = driver.findElement(by);
        return element;
    }

    public static List<WebElement> findelements(By by){

        try {
            WebDriverWait wait = new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
        }catch (Exception e){
            e.printStackTrace();
        }

        List<WebElement> list = driver.findElements(by);
        return list;
    }
}
