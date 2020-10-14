package test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import org.junit.Test;
import org.openqa.selenium.By;

public class automationTest {
	
	@Test
	public void AutomationTest()
	{
		open("http://www.explorecalifornia.org/contact.htm");
		
		$("#name").should(appear);
		$("#comments").should(appear);
		
		$("#name").setValue("FirstName");
		$("#state").selectOptionContainingText("California");
		$(By.name("newsletter")).selectRadio("yes");
		$(By.id("cycle")).click();
		
		$("#name").shouldHave(value("FirstName"));
		
		String state = $("#state").getSelectedText();
		assert(state).equals("California");
		
		$(By.name("newsletter")).shouldHave(value("yes"));
		
		$(By.id("cycle")).shouldBe(selected);
	}
}
