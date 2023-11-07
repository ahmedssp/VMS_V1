package Pages;
import Listeners.TestNg_Listeners_simple;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.log4testng.Logger;
import static Listeners.TestNg_Listeners_simple.*;

public class A2_HomePage_p {
    private WebDriver d;
    private static final Logger LOGGER = Logger.getLogger(TestNg_Listeners_simple.class);

    public A2_HomePage_p(WebDriver d) {
        this.d = d;
    }

    private By Setting_filed = By.xpath("//*[@class=\"menu-icon menu-icon flaticon-settings-1\"]");
    private By Eenter_data_filed = By.xpath("//*[text()=\"إدخال البيانات\" and @class=\"menu-text\"]");
    private By Location_filed = By.xpath("//a[@class=\"menu-link\"]//*[text()=\"المواقع\"]");
    private By Gates_filed = By.xpath("//a[@class=\"menu-link\"]//*[text()=\"البوابات\"]");
    private By Permits_filed = By.xpath("//*[@class=\"menu-icon flaticon2-calendar-6\"]");
    private By Permits_Visitors = By.xpath("//*[text()=\"تصريح الزيارات\" and @class=\"menu-text\"]");
    private By Permits_car_requests = By.xpath("//*[text()=\"تصريح السيارة\" and @class=\"menu-text\"]");
    private By Permits_material_requests = By.xpath("//*[text()=\"تصريح المواد\" and @class=\"menu-text\"]");


    public void Hover_on_Setting() {

        try {
            Actions action = new Actions(d);
            action.moveToElement(d.findElement(Setting_filed)).build().perform();
            LOGGER.debug(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }

    }

    public void Hover_on_Enterdate() {
        try {
            Actions action = new Actions(d);
            action.moveToElement(d.findElement(Eenter_data_filed)).build().perform();
            LOGGER.debug(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            ;
            throw E;
        }

    }

    public B0_Sites_p Click_on_Enter_Location() {
        try {
            Actions action = new Actions(d);
            action.moveToElement(d.findElement(Location_filed)).click().perform();
            LOGGER.debug(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            ;
            throw E;
        }


        return new B0_Sites_p(d);
    }

    public B2_Gate_p Click_on_Enter_Gates() {
        try {
            Actions action = new Actions(d);
            action.moveToElement(d.findElement(Gates_filed)).click().perform();
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
            return new B2_Gate_p(d);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            ;
            throw E;
        }

    }


    public void Hover_on_Permits() {

        try {
            Actions action = new Actions(d);
            action.moveToElement(d.findElement(Permits_filed)).build().perform();
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            ;
            throw E;
        }
    }

    public B4_Visits_requests_ADD_p Click_on_Permits_Visitors() {
        try {
            Actions action = new Actions(d);
            action.moveToElement(d.findElement(Permits_Visitors)).click().perform();
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
            return new B4_Visits_requests_ADD_p(d);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            ;
            throw E;
        }

    }

    public B4_car_requests_ADD_p Click_on_Permits_car_requests() {
        try {
            Actions action = new Actions(d);
            action.moveToElement(d.findElement(Permits_car_requests)).click().perform();
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
            return new B4_car_requests_ADD_p(d);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            ;
            throw E;
        }
    }
    public B4_material_requests_ADD_p Click_on_Permits_material_requests() {
        try {
            Actions action = new Actions(d);
            action.moveToElement(d.findElement(Permits_material_requests)).click().perform();
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
            return new B4_material_requests_ADD_p(d);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            ;
            throw E;
        }
    }
}
