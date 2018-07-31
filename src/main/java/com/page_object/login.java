package com.page_object;

import org.openqa.selenium.By;

public class login {

    public static By PhoneNumberInput = By.id("userName");

    public static By PasswordInput = By.id("password");

    public static By loginButton = By.id("submit");

    public static By registerButton = By.xpath("//span[text()='立即注册']");

    public static By forgetPwdButton = By.xpath("//span[text()='忘记密码']");
}
