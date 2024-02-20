package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Helper;


public class CreatePostPage extends Helper {


    public final static String Post_message = "message";
    public WebElement element = null ;

    public CreatePostPage(WebDriver driver) {
        super(driver);
    }

    public WebElement ClickOnMenu() {
        element = getElementByXpath("//div[@aria-label='Menu']");
        return element;
    }

    public WebElement ClickOnPost() {
        element = getElementByXpath("//span[text()='Post']");
        return element;
    }
    public WebElement WhatsOnYourMind(){
       element = getElementByXpath(Post_message);
       return element;

    }
    public WebElement ClickOnPost_button() {
        element = getElementByXpath("//div[@aria-label='Menu']");
        return element;
    }

}
