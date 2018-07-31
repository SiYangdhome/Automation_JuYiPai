package autofreamwork;

import autofreamwork_logic_layer.Login;
import autofreamwork_logic_layer.MyActions;
import autofreamwork_logic_layer.SeleniumDriver;
import com.page_object.basicnation;
import com.page_object.home;
import com.page_object.userinfo;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class BasicnationTest extends SeleniumDriver {


    //用户设置 - 基本信息 — 姓名修改成功
    @Test
    public void updateName() throws InterruptedException {

        Login.login("chrome", "https://p.moonpool.com.cn/toIndexPage", "15010685335", "123456");
        MyActions.click(home.userinfo);
        MyActions.click(userinfo.userDetail);
        driver.switchTo().frame("rightContentIframe");
        MyActions.sendText(basicnation.realName,"王小建");
        String text = driver.findElement(basicnation.realName).getAttribute("placeholder");
        System.out.println(text);
        /*
        MyActions.click(basicnation.sexwoman);
        MyActions.sendText(basicnation.age,"31");
        MyActions.click(basicnation.saveBttn);
        String text = MyActions.getText(basicnation.realName);
        Assert.assertEquals(text,"王小建");
       */

    }

    @AfterMethod
    public void closeCase(){
        SeleniumDriver.closeall();
    }


}