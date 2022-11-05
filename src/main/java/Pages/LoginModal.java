package Pages;

import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginModal {
    WebElement Email = $("#signinEmail");
    WebElement Password =  $("#signinPassword");

    public GaragePage login (String email, String password){
        Email.sendKeys(email);
        Password.sendKeys(password);
        $("[for='remember']").click();
        $x("//*[text()='Login']").click();
        return new GaragePage();
    }
}
