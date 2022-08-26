import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.commands.ScrollTo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.files.DownloadActions.click;

public class TextBoxTest {

    @BeforeAll
    static void configure() {
        System.out.println("this is the @BeforeAll");
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize= "1024x768";
        new ScrollTo();
    }

    @Test
    @DisplayName("Проверка заполнения формы")
    void fillFormTest() {
//            $("id=\'userName\'")
//            $("[id=userName]").setValue("Egor")
        open("/text-box");
        $("#userName").setValue("Egor");
        $("#userEmail").setValue("Egor@fff.ty");
        $("#currentAddress").setValue("adress 1");
        $("#permanentAddress").setValue("adress 2");
        $("#submit").click();
        $("#output #name").shouldHave(text("Egor"));
        $("#output #email").shouldHave(text("Egor@fff.ty"));
//            $("#output").$("#name").shouldHave(text("Egor@fff.ty"));
//            $("#name").shouldHave(text("Egor@fff.ty"));
//            $("#output").shouldHave(text("Egor@fff.ty"));
        $("#output #currentAddress").shouldHave(text("adress 1"));
        $("#output #permanentAddress").shouldHave(text("adress 2"));
    }

    @Test
    @DisplayName("automation-practice-form")
    void fillPracticeForm() {
        open("/automation-practice-form");
        $("#userForm #firstName").setValue("Kamila");
        $("#userForm #lastName").setValue("Sharuykova");
        $("#userForm #userEmail").setValue("kamila@gmail.com");
        $(".custom-radio:nth-child(2) > .custom-control-label").click(); // выбор пола
        $("#userForm #userNumber").setValue("79518935500");
// birthday
        $("#dateOfBirthInput").click();
        $(".react-datepicker__day--021").click();
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption("February");
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOption("2003");
        $(".react-datepicker__week:nth-child(6) > .react-datepicker__day--006").click();
// subjects
//        $("#userForm #subjectsContainer").setValue("a");
//        $("#react-select-2-option-0").click();
//        $(".subjects-auto-complete__value-container").setValue("a");
//        $("#react-select-2-option-2").click();
// hobbies
        $(".custom-checkbox:nth-child(1) > .custom-control-label").click();
// upload image
        $("#uploadPicture").setValue("C:\\Users\\79518\\Desktop\\card.jpg");
// address
        $("#currentAddress").setValue("my address 123");
// state
        $(".css-1pahdxg-control > .css-1hwfws3").click();
        $("#react-select-3-option-2").click();
// city
        $(".css-1pahdxg-control > .css-1hwfws3").click();
        $("#react-select-4-option-1").click();

        $("#submit").click();
        }






}


// div.S-product-item__name