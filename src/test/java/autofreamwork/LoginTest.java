package autofreamwork;


import autofreamwork_logic_layer.Login;
import autofreamwork_logic_layer.MyActions;
import autofreamwork_logic_layer.SeleniumDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginTest {


    //正确账号密码登录成功
    @Test
    public void loginCase(){
        Login.login("chrome","https://p.moonpool.com.cn/toIndexPage","15010685335","123456");
        String text = MyActions.getText(By.id("crewName"));
        Assert.assertEquals(text,"《斯里兰卡》");
    }

    //手机号有误，登录失败
    @Test
    public void loginFalsephone(){
        Login.login("chrome","https://p.moonpool.com.cn/toIndexPage","1501068533","123456");
        String text = MyActions.getText(By.id("errorMessage"));
        Assert.assertEquals(text,"不存在的用户名/手机号");
    }

    //密码错误，登录失败
    @Test
    public void loginFalsepwd(){
        Login.login("chrome","https://p.moonpool.com.cn/toIndexPage","15010685335","12345");
        String text = MyActions.getText(By.id("errorMessage"));
        Assert.assertEquals(text,"密码错误");
    }

    @AfterMethod
    public void closeCase(){
        SeleniumDriver.closeall();
    }
}
