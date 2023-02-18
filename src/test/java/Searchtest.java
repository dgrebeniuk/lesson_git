
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
   @Test
   void successfulSearchTest() {

      public static String mag = "https://www.google.com////";

      open(mag);
      $("[name=q]").setValue("selenide").pressEnter();
      $("[id=search]").shouldHave(text("https://selenide.org/"));
      $("[id=search]").shouldHave(text("https://selenide.org"));

   }

   public x = 12
}
