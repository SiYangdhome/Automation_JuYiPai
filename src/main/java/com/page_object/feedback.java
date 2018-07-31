package com.page_object;

import org.openqa.selenium.By;

public class feedback {

    public static By messageInput = By.id("message");

    public static By contactInput = By.id("contact");

    public static By submitBttn = By.xpath("//button[text()='提交']");

    public static By replyInput = By.xpath(".//*[@class='oper-li']/input");

    public static By replyBttn = By.xpath(".//*[@class='oper-li']/button");
}
