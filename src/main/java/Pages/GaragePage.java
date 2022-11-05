package Pages;

import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class GaragePage extends BasePage{

    public static GaragePage addCar(){
        $x("//*[text()='Add car']").click();
        $("#addCarBrand").selectOptionContainingText("BMW");
        $("#addCarModel").selectOption("X5");
        $("#addCarMileage").sendKeys("199");
        $x("//*[text()='Add']").click();
        return new GaragePage();
    }

}
