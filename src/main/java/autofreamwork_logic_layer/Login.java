package autofreamwork_logic_layer;

import com.page_object.login;
import org.apache.http.util.Asserts;
import org.openqa.selenium.By;

public class Login extends SeleniumDriver{

    final static LoggerControler log = LoggerControler.GetLoggerTest(Login.class);

    public static void login(String browser,String url,String username,String pwd){
        SeleniumDriver.OpenBrowser(browser);
        OpenUrl.geturl(url);
        MyActions.sendText(login.PhoneNumberInput,username);
        MyActions.sendText(login.PasswordInput,pwd);
        MyActions.click(login.loginButton);

        log.info("登录");


    }
}
