package process;

import org.openqa.selenium.WebDriver;
import pageobject.CreatePostPage;
import utility.Helper;

public class CreatePostProcess extends Helper {

    CreatePostPage cp = new CreatePostPage(driver);
    public CreatePostProcess(WebDriver driver) {
        super(driver);
    }

    public void ClickOnMenuButton(){
        cp.ClickOnMenu().click();
        cp.ClickOnPost().click();
        cp.WhatsOnYourMind().sendKeys("This is a Test message");
        cp.ClickOnPost_button().click();

    }




}
