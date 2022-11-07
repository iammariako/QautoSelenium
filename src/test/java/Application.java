import Pages.*;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.firefox.HasExtensions;

import static com.codeborne.selenide.Selenide.*;

public class Application {

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void canLogin() {
        HomePage homePage = new HomePage().open();
        LoginModal loginModal = homePage.header.openLoginModal();
        GaragePage garagePage = loginModal.login("coop.od-rent@ukr.net", "Qwerty12345");
        garagePage.notification.checkMessage("You have been successfully logged in");
    }

    @Test
    public void addCar(){
        HomePage homePage = new HomePage().open();
        LoginModal loginModal = homePage.header.openLoginModal();
        GaragePage garagePage = loginModal.login("coop.od-rent@ukr.net", "Qwerty12345");
        garagePage.addCar();
        garagePage.notification.checkMessage("Car added");
    }

    @Test
    public void canLogoutViaHeader(){
        HomePage homePage = new HomePage().open();
        LoginModal loginModal = homePage.header.openLoginModal();
        GaragePage garagePage = loginModal.login("coop.od-rent@ukr.net", "Qwerty12345");
        garagePage.header.logoutFromHeader();
        $x("//*[text()='Sign In']");
    }

    @Test
    public void canLogoutViaSideMenu(){
        HomePage homePage = new HomePage().open();
        LoginModal loginModal = homePage.header.openLoginModal();
        GaragePage garagePage = loginModal.login("coop.od-rent@ukr.net", "Qwerty12345");
        garagePage.sidemenu.logoutFromSidemenu();
        $x("//*[text()='Sign In']");
    }
}
