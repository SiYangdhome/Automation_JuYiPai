package autofreamwork;

import autofreamwork_logic_layer.*;
import com.page_object.home;
import com.page_object.setheadImg;
import com.page_object.userinfo;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;



public class SetHeadImgTest extends SeleniumDriver {


    //上传头像
    @Test
    public void sendfileImg(){
        Login.login("chrome","https://p.moonpool.com.cn/toLoginPage","15010685335","123456");
        MyActions.click(home.userinfo);
        MyActions.click(userinfo.setHeadImg);
        MyActions.sendfile(setheadImg.sendFile,"C:\\Users\\Administrator\\Desktop\\semile.png");
        MyActions.click(setheadImg.confirmbttn);

    }

    @AfterMethod
    public void closeCase(){
        SeleniumDriver.closeall();
    }

}
