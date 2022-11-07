package Pages;

import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {
    //header
    public Header header = new Header();

    //notification
    public Notification notification = new Notification();

    //sidemenu
    public Sidemenu sidemenu = new Sidemenu();

}
