package Pages;

import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage extends BasePage{
    public static HomePage open(){
        WebDriverManager.chromedriver().setup();
        Selenide.open("https://qauto.forstudy.space/", "", "guest", "welcome2qauto");
        return new HomePage();
    }
}
