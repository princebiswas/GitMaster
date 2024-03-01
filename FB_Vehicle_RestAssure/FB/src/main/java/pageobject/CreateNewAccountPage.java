package pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Helper;

public class CreateNewAccountPage extends Helper {
    public WebElement element = null;

    public static final String Month_Id= "month";
    public static final String Day_Id = "day";
    public static final String Year_Id = "year";
    public static final String Gender_F = "Female";

    public CreateNewAccountPage(WebDriver driver) {
        super(driver);
    }




   public WebElement CreateNewAccountButton()
   {
        element = getElementByXpath("//a[text()='Create new account']");
        return element;

   }


   public WebElement firstName_TextBox()
   {
        element = getElementByName("firstname");
            return element;

        }

   public WebElement LastName_TextBox()
        {
            element = getElementByName("lastname");
            return element;

        }

   public WebElement MobileNumber_email_TextBox ()
        {
            element = getElementByName("reg_email__");
            return element;

        }


   public WebElement Password_Textbox()
        {
            element = getElementByName("reg_email__");
            return element;

        }

   public WebElement SelectMonth()
   {
       element = getElementById(Month_Id);
       return element;
   }

    public WebElement SelectDay()
    {
        element = getElementById(Day_Id);
        return element;
    }

    public WebElement SelectYear()
    {
        element = getElementById(Year_Id);
        return element;
    }

    public WebElement SelectGender_female()
    {
        element = getElementByXpath("(//input[@name='sex'])[1]");
        return element;
    }

    public WebElement SelectGender_male()
    {
        element = getElementByXpath("(//input[@name='sex'])[2]");
        return element;
    }

    public WebElement SignUpButton()
    {
        element = getElementByXpath("//button[@name='websubmit']");
        return  element;
    }

    public WebElement FNError()
    {
        element = getElementByXpath("(//div[contains(text(),'What')])[1]");
        return element;
    }


}
