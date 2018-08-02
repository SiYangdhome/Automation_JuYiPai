package autofreamwork;

import autofreamwork_logic_layer.Login;
import autofreamwork_logic_layer.MyActions;
import autofreamwork_logic_layer.SeleniumDriver;
import com.page_object.home;
import com.page_object.userinfo;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LogOutTest {

    //退出登录
    @Test
    public void LogoutCase(){
        Login.login("chrome11","https://p.moonpool.com.cn/toLoginPage","15010685335","123456");
        MyActions.click(home.userinfo);
        MyActions.click(userinfo.logout);
        String url = MyActions.getCurrentURL();
        Assert.assertEquals(url,"https://p.moonpool.com.cn/toLoginPage");
    }

    @AfterMethod
    public void closeBrowser(){
        SeleniumDriver.closeall();
    }

}
