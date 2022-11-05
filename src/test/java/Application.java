import Pages.*;
import com.codeborne.selenide.Condition;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.firefox.HasExtensions;

import static com.codeborne.selenide.Selenide.*;

public class Application {
    @Test
    public void canLogin() {
        HomePage homePage = new HomePage().open();
        LoginModal loginModal = homePage.header.openLoginModal();
        loginModal.login("coop.od-rent@ukr.net", "Qwerty12345");
        $(".alert-success").shouldHave(Condition.text("You have been successfully logged in"));
    }

    @Test
    public void addCar(){
        HomePage homePage = new HomePage().open();
        LoginModal loginModal = homePage.header.openLoginModal();
        loginModal.login("coop.od-rent@ukr.net", "Qwerty12345");
        GaragePage.addCar();
        $(".alert-success").shouldHave(Condition.text("Car added"));
    }

    @Test
    public void canLogoutViaHeader(){
        HomePage homePage = new HomePage().open();
        LoginModal loginModal = homePage.header.openLoginModal();
        loginModal.login("coop.od-rent@ukr.net", "Qwerty12345");
        new Header().logoutFromHeader();
        $x("//*[text()='Sign In']");
    }

    @Test
    public void canLogoutViaSideMenu(){
        HomePage homePage = new HomePage().open();
        LoginModal loginModal = homePage.header.openLoginModal();
        loginModal.login("coop.od-rent@ukr.net", "Qwerty12345");
        new Sidemenu().logoutFromSidemenu();
        $x("//*[text()='Sign In']");
    }
}
