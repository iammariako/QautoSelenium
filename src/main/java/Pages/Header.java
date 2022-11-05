package Pages;

import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Header {
    WebElement signIn = $(".header_signin");
    WebElement guestLogin = $(".-guest");

    public LoginModal openLoginModal() {
        signIn.click();
        return new LoginModal();
    }

    WebElement MyProfile = $("#userNavDropdown");
    WebElement LogoutHeader = $x("//*[text()='Logout']");

    public HomePage logoutFromHeader(){
        MyProfile.click();
        LogoutHeader.click();
        return new HomePage();
    }


}
