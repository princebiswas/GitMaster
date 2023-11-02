package Smoke;


import org.testng.annotations.Test;
import process.CreateNewAccountProcess;

public class CreateNewAccount {

public static class CreateNewAccountTest extends SetUp {

    CreateNewAccountProcess cp;

    @Test
    public void SignUp_BlankFirstName() throws InterruptedException {
        cp = new CreateNewAccountProcess(driver);
        cp.SignUp_BlankFirstName();
    }

    @Test
        public void SignUp_BlankLastName()
    {
            cp = new CreateNewAccountProcess(driver);
            cp.SignUp_BlankLastName();
        }

    @Test
    public void SignUp_BlankMobileNumber()
    {
        cp = new CreateNewAccountProcess(driver);
        cp.SignUp_BlankMobileNumber();
    }

    @Test
    public void SignUp_BlankPasswordField()
    {
        cp = new CreateNewAccountProcess(driver);
        cp.SignUp_BlankPasswordField();

    }


    @Test
    public void SignUp_BlankBirthday_Month() {
        cp = new CreateNewAccountProcess(driver);
        cp.SignUp_BlankBirthday_Month();

    }

    @Test
    public void SignUp_BlankBirthDay_Day() {
        cp = new CreateNewAccountProcess(driver);
        cp.SignUp_BlankBirthDay_Day();

    }

    @Test
    public void SignUp_BlankBirthDay_Year() {
        cp = new CreateNewAccountProcess(driver);
        cp.SignUp_BlankBirthDay_Year();

    }

    @Test
    public void SignUp_BlankGender() {
        cp = new CreateNewAccountProcess(driver);
        cp.SignUp_BlankGender();

    }









}



}
