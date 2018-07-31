package autofreamwork_logic_layer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyActions extends SeleniumDriver {


    //输入文本封装
    public static void sendText(By by,String text){
       WebElement element = Element.findelement(by);
       element.clear();
       element.sendKeys(text);
    }

    //点击方法封装
    public static void click(By by){

        Element.findelement(by).click();
    }

    //获取文本方法封装
    public static String getText(By by){
         String text = Element.findelement(by).getText();
         return text;
    }

    //上传文件方法封装
    public static void sendfile(By by,String path){
        Element.findelement(by).sendKeys(path);
    }

    //获取当前Url方法封装
    public static String getCurrentURL(){

        String url = driver.getCurrentUrl();
        return url;
    }



}
