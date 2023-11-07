package Pages;

import Listeners.TestNg_Listeners_simple;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.log4testng.Logger;
import static Handler.Wait.*;
import static Listeners.TestNg_Listeners_simple.*;


import static Listeners.TestNg_Listeners_simple.GetmethodName;

public class B0_Sites_p {
    private WebDriver d;

    public B0_Sites_p(WebDriver d) {
        this.d = d;
    }

    private static final Logger LOGGER = Logger.getLogger(TestNg_Listeners_simple.class);

    private By Add_newSiteBotton_filed = By.cssSelector("a[class=\"btn btn-primary\"]");

    public B1_AddSite_p click_Add_newSiteBotton() {

        try {
            d.findElement(Add_newSiteBotton_filed).click();
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
            return new B1_AddSite_p(d);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            ;
            throw E;
        }
    }
}
