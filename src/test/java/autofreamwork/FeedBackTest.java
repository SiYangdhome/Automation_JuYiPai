package autofreamwork;

import autofreamwork_logic_layer.Login;
import autofreamwork_logic_layer.MyActions;
import autofreamwork_logic_layer.SeleniumDriver;
import com.page_object.feedback;
import com.page_object.home;
import com.page_object.userinfo;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import javax.management.StringValueExp;

public class FeedBackTest extends SeleniumDriver {

    @Test
    public void messageBackCase(){
       // String time = String.valueOf(System.currentTimeMillis());
        Login.login("chrome","https://p.moonpool.com.cn/toIndexPage","15010685335","123456");
        MyActions.click(home.userinfo);
        MyActions.click(userinfo.feedback);
        driver.switchTo().frame("rightContentIframe");
        MyActions.sendText(feedback.messageInput,"自动化测试练习");
        MyActions.sendText(feedback.contactInput,"15010685335");
        MyActions.click(feedback.submitBttn);

    }

    @AfterMethod
    public void closeCase(){
        SeleniumDriver.closeall();
    }
}
