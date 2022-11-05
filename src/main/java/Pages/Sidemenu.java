package Pages;

import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Sidemenu {
    WebElement LogoutSidemenu = $x("//a[text()=' Log out ']");
    //    WebElement LogoutSidemenu = $(".icon .icon-logout").shouldHave(Condition.text("Log out"));

    public HomePage logoutFromSidemenu(){
        LogoutSidemenu.click();
        return new HomePage();
    }

}
