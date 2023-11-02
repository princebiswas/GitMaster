package process;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pageobject.CreateNewAccountPage;
import utility.Helper;

import java.util.List;

public class CreateNewAccountProcess extends Helper {

    CreateNewAccountPage ca = new CreateNewAccountPage(driver);

    public CreateNewAccountProcess(WebDriver driver) {
        super(driver);
    }


    public void SignUp_BlankFirstName() throws InterruptedException {

        String FN = Helper.randomString(6);
        String LN = Helper.randomString(5);
        String MN = Helper.randomNumber(9);
        System.out.println("Phone_Number-" + MN);

        ca.CreateNewAccountButton().click();
        //ca.firstName_TextBox().sendKeys(FN);
        ca.LastName_TextBox().sendKeys(LN);
        ca.MobileNumber_email_TextBox().sendKeys(MN);
        ca.Password_Textbox().sendKeys("Password123!");


        // Select Month
        WebElement monthdropdpwn = ca.SelectMonth();
        Select sel = new Select(monthdropdpwn);
        List<WebElement> li = sel.getOptions();
        System.out.println(li.size());
        for (WebElement webElement : li) {
            System.out.println(webElement.getText());
        }
        sel.selectByVisibleText("Apr");


        // Select Day
        WebElement daydropdown = ca.SelectDay();
        Select sel_day = new Select(daydropdown);
        sel_day.selectByVisibleText("30");

        Thread.sleep(5000);

        //Select Year
        WebElement yeardropdown = ca.SelectYear();
        Select sel_year = new Select(yeardropdown);
        sel_year.selectByVisibleText("1970");

        // Select Gender
        ca.SelectGender_female().click();

        // Click on Sign Up button
        ca.SignUpButton().click();

        String ActualError = ca.FNError().getText();

        System.out.println(ActualError);

    }

    public void SignUp_BlankLastName() {

        String FN = Helper.randomString(6);
        String LN = Helper.randomString(5);
        String MN = Helper.randomNumber(9);
        System.out.println("Phone_Number-" + MN);

        ca.CreateNewAccountButton().click();
        ca.firstName_TextBox().sendKeys(FN);
        // ca.LastName_TextBox().sendKeys(LN);
        ca.MobileNumber_email_TextBox().sendKeys(MN);
        ca.Password_Textbox().sendKeys("Password123!");


        // Select Month
        WebElement monthdropdpwn = ca.SelectMonth();
        Select sel = new Select(monthdropdpwn);
        List<WebElement> li = sel.getOptions();
        System.out.println(li.size());
        for (WebElement webElement : li) {
            System.out.println(webElement.getText());
        }
        sel.selectByVisibleText("Apr");


        // Select Day
        WebElement daydropdown = ca.SelectDay();
        Select sel_day = new Select(daydropdown);
        sel_day.selectByVisibleText("30");

        //Select Year
        WebElement yeardropdown = ca.SelectYear();
        Select sel_year = new Select(yeardropdown);
        sel_year.selectByVisibleText("1970");

        // Select Gender
        ca.SelectGender_female().click();

        // Click on Sign Up button
        ca.SignUpButton().click();


    }


    public void SignUp_BlankMobileNumber() {

        String FN = Helper.randomString(6);
        String LN = Helper.randomString(5);
        String MN = Helper.randomNumber(9);
        System.out.println("Phone_Number-" + MN);

        ca.CreateNewAccountButton().click();
        ca.firstName_TextBox().sendKeys(FN);
        ca.LastName_TextBox().sendKeys(LN);
        // ca.MobileNumber_email_TextBox().sendKeys(MN);
        ca.Password_Textbox().sendKeys("Password123!");


        // Select Month
        WebElement monthdropdpwn = ca.SelectMonth();
        Select sel = new Select(monthdropdpwn);
        List<WebElement> li = sel.getOptions();
        System.out.println(li.size());
        for (WebElement webElement : li) {
            System.out.println(webElement.getText());
        }
        sel.selectByVisibleText("Apr");


        // Select Day
        WebElement daydropdown = ca.SelectDay();
        Select sel_day = new Select(daydropdown);
        sel_day.selectByVisibleText("30");

        //Select Year
        WebElement yeardropdown = ca.SelectYear();
        Select sel_year = new Select(yeardropdown);
        sel_year.selectByVisibleText("1970");

        // Select Gender
        ca.SelectGender_female().click();

        // Click on Sign Up button
        ca.SignUpButton().click();


    }

    public void SignUp_BlankPasswordField() {

        String FN = Helper.randomString(6);
        String LN = Helper.randomString(5);
        String MN = Helper.randomNumber(9);
        System.out.println("Phone_Number-" + MN);

        ca.CreateNewAccountButton().click();
        ca.firstName_TextBox().sendKeys(FN);
        ca.LastName_TextBox().sendKeys(LN);
        ca.MobileNumber_email_TextBox().sendKeys(MN);
        //ca.Password_Textbox().sendKeys("Password123!");


        // Select Month
        WebElement monthdropdpwn = ca.SelectMonth();
        Select sel = new Select(monthdropdpwn);
        List<WebElement> li = sel.getOptions();
        System.out.println(li.size());
        for (WebElement webElement : li) {
            System.out.println(webElement.getText());
        }
        sel.selectByVisibleText("Apr");


        // Select Day
        WebElement daydropdown = ca.SelectDay();
        Select sel_day = new Select(daydropdown);
        sel_day.selectByVisibleText("30");

        //Select Year
        WebElement yeardropdown = ca.SelectYear();
        Select sel_year = new Select(yeardropdown);
        sel_year.selectByVisibleText("1970");

        // Select Gender
        ca.SelectGender_female().click();

        // Click on Sign Up button
        ca.SignUpButton().click();


    }

    public void SignUp_BlankBirthday_Month() {

        String FN = Helper.randomString(6);
        String LN = Helper.randomString(5);
        String MN = Helper.randomNumber(9);
        System.out.println("Phone_Number-" + MN);

        ca.CreateNewAccountButton().click();
        ca.firstName_TextBox().sendKeys(FN);
        ca.LastName_TextBox().sendKeys(LN);
        ca.MobileNumber_email_TextBox().sendKeys(MN);
        ca.Password_Textbox().sendKeys("Password123!");


        // Select Month
        WebElement monthdropdpwn = ca.SelectMonth();
        Select sel = new Select(monthdropdpwn);
        List<WebElement> li = sel.getOptions();
        System.out.println(li.size());
        for (WebElement webElement : li) {
            System.out.println(webElement.getText());
        }
        //sel.selectByVisibleText("Apr");


        // Select Day
        WebElement daydropdown = ca.SelectDay();
        Select sel_day = new Select(daydropdown);
        sel_day.selectByVisibleText("30");

        //Select Year
        WebElement yeardropdown = ca.SelectYear();
        Select sel_year = new Select(yeardropdown);
        sel_year.selectByVisibleText("1970");

        // Select Gender
        ca.SelectGender_female().click();

        // Click on Sign Up button
        ca.SignUpButton().click();


    }

    public void SignUp_BlankBirthDay_Day() {

        String FN = Helper.randomString(6);
        String LN = Helper.randomString(5);
        String MN = Helper.randomNumber(9);
        System.out.println("Phone_Number-" + MN);

        ca.CreateNewAccountButton().click();
        ca.firstName_TextBox().sendKeys(FN);
        ca.LastName_TextBox().sendKeys(LN);
        ca.MobileNumber_email_TextBox().sendKeys(MN);
        ca.Password_Textbox().sendKeys("Password123!");


        // Select Month
        WebElement monthdropdpwn = ca.SelectMonth();
        Select sel = new Select(monthdropdpwn);
        List<WebElement> li = sel.getOptions();
        System.out.println(li.size());
        for (WebElement webElement : li) {
            System.out.println(webElement.getText());
        }
        sel.selectByVisibleText("Apr");


        // Select Day
        WebElement daydropdown = ca.SelectDay();
        Select sel_day = new Select(daydropdown);
        //sel_day.selectByVisibleText("30");

        //Select Year
        WebElement yeardropdown = ca.SelectYear();
        Select sel_year = new Select(yeardropdown);
        sel_year.selectByVisibleText("1970");

        // Select Gender
        ca.SelectGender_female().click();

        // Click on Sign Up button
        ca.SignUpButton().click();


    }

    public void SignUp_BlankBirthDay_Year() {

        String FN = Helper.randomString(6);
        String LN = Helper.randomString(5);
        String MN = Helper.randomNumber(9);
        System.out.println("Phone_Number-" + MN);

        ca.CreateNewAccountButton().click();
        ca.firstName_TextBox().sendKeys(FN);
        ca.LastName_TextBox().sendKeys(LN);
        ca.MobileNumber_email_TextBox().sendKeys(MN);
        ca.Password_Textbox().sendKeys("Password123!");


        // Select Month
        WebElement monthdropdpwn = ca.SelectMonth();
        Select sel = new Select(monthdropdpwn);
        List<WebElement> li = sel.getOptions();
        System.out.println(li.size());
        for (WebElement webElement : li) {
            System.out.println(webElement.getText());
        }
        sel.selectByVisibleText("Apr");


        // Select Day
        WebElement daydropdown = ca.SelectDay();
        Select sel_day = new Select(daydropdown);
        sel_day.selectByVisibleText("30");

        //Select Year
        WebElement yeardropdown = ca.SelectYear();
        Select sel_year = new Select(yeardropdown);
        //sel_year.selectByVisibleText("1970");

        // Select Gender
        ca.SelectGender_female().click();

        // Click on Sign Up button
        ca.SignUpButton().click();

    }

    public void SignUp_BlankGender() {

        String FN = Helper.randomString(6);
        String LN = Helper.randomString(5);
        String MN = Helper.randomNumber(9);
        System.out.println("Phone_Number-" + MN);

        ca.CreateNewAccountButton().click();
        ca.firstName_TextBox().sendKeys(FN);
        ca.LastName_TextBox().sendKeys(LN);
        ca.MobileNumber_email_TextBox().sendKeys(MN);
        ca.Password_Textbox().sendKeys("Password123!");


        // Select Month
        WebElement monthdropdpwn = ca.SelectMonth();
        Select sel = new Select(monthdropdpwn);
        List<WebElement> li = sel.getOptions();
        System.out.println(li.size());
        for (WebElement webElement : li) {
            System.out.println(webElement.getText());
        }
        sel.selectByVisibleText("Apr");


        // Select Day
        WebElement daydropdown = ca.SelectDay();
        Select sel_day = new Select(daydropdown);
        sel_day.selectByVisibleText("30");

        //Select Year
        WebElement yeardropdown = ca.SelectYear();
        Select sel_year = new Select(yeardropdown);
        sel_year.selectByVisibleText("1970");

        // Select Gender
        // ca.SelectGender_female().click();

        // Click on Sign Up button
        ca.SignUpButton().click();


    }

}