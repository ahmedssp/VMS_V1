package Pages;

import Listeners.TestNg_Listeners_simple;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.log4testng.Logger;
import static Handler.Wait.*;

import static Listeners.TestNg_Listeners_simple.*;


import static Listeners.TestNg_Listeners_simple.GetmethodName;

public class B2_Gate_p {
    private WebDriver d;
    private static final Logger LOGGER = Logger.getLogger(TestNg_Listeners_simple.class);

    public B2_Gate_p(WebDriver d) {
        this.d = d;
    }

    private By Add_newSiteBotton_filed = By.cssSelector("a[class=\"btn btn-primary\"]");

    public B3_AddGate_p click_Add_newSiteBotton() {

        try {
            d.findElement(Add_newSiteBotton_filed).click();
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
            return new B3_AddGate_p(d);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }
    }
}
