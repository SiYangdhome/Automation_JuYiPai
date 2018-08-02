package autofreamwork_logic_layer;

import org.openqa.selenium.WebDriver;

public class OpenUrl extends SeleniumDriver{

    final static LoggerControler log = LoggerControler.GetLoggerTest(OpenUrl.class);


    public static void geturl(String url){
        driver.get(url);
        log.info("打开网址：" +url);

    }
}
