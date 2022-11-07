package Pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class Notification {

    public void checkMessage(String message){
        $(".alert-success").shouldHave(Condition.text(message));
    }

}
