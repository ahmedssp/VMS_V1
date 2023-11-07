package Pages;

import Listeners.TestNg_Listeners_simple;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.log4testng.Logger;
import static Handler.Wait.*;
import static Handler.alertHandling.*;
import static Listeners.TestNg_Listeners_simple.*;
public class A0_login_P {
    private WebDriver d;
    private static final Logger LOGGER = Logger.getLogger(TestNg_Listeners_simple.class);
    public A0_login_P(WebDriver d) {
        this.d = d;
    }
    private By email_filed = By.id("email");
    private By Password_filed = By.id("pwd");
    private By Inter_Botton_filed = By.cssSelector("button[type=\"submit\"]");
    private By TextValidation_filed = By.xpath("//*[text()=\"تسجيل الدخول\"]");
    public void Send_email(String email) {
        try {
            waitForElement(d, email_filed);
            d.findElement(email_filed).sendKeys(email);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception e) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw e;
        }
    }
    public void Send_Password(String Password) {

        try {
            waitForElement(d, Password_filed);
            d.findElement(Password_filed).sendKeys(Password);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception e) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw e;
        }
    }
    public A1_Welcome_P Enter_Botton() {
        try {
            waitForElement(d, Inter_Botton_filed);
            d.findElement(Inter_Botton_filed).click();
            allertH1(d);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
            return new A1_Welcome_P(d);
        } catch (Exception e) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw e;
        }
    }
}
