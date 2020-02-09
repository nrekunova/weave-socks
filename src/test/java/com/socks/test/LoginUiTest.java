package com.socks.test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class LoginUiTest {
        static {
            Configuration.baseUrl = "http://167.172.110.35";
            Configuration.browser = "chrome";
        }
    @Test
    public void loginTest(){
        open("/");
        $("#login").shouldBe(Condition.enabled).click();
        sleep(2000);
        $("#Login");
        $("#username-modal").setValue("testName");
        $("#password-modal").setValue("password");
        $(By.xpath("//button[contains(@onclick,'login')]")).click();
        sleep(3000);
    }
}
