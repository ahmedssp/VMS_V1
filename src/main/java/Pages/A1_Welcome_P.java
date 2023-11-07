package Pages;

import Handler.Wait;
import Listeners.TestNg_Listeners_simple;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.log4testng.Logger;
import static Handler.Wait.*;

import static Listeners.TestNg_Listeners_simple.*;


import static Listeners.TestNg_Listeners_simple.GetmethodName;

public class A1_Welcome_P {
    private WebDriver d;
    private static final Logger LOGGER = Logger.getLogger(TestNg_Listeners_simple.class);

    public A1_Welcome_P(WebDriver d) {
        this.d = d;
    }

    private By Text_Welcome_filed = By.xpath("//*[contains(text(),\"مرحبا\")]");
    private By select_ListOf_location_filed = By.id("select_site");
    private By submitSiteBotton_filed = By.id("submitSite");
    private By logoutButton_Filed = By.id("logoutButton");

//    public void statusButton_click(int index_status) {
//        JavascriptExecutor j = (JavascriptExecutor) d;
//        j.executeScript("arguments[0].click();", d.findElement(statusButton_filed));
//    }
//    public void Select_gender(String GENDER) {
//
//        Select objSelect = new Select(d.findElement(Genderlist_filed));
//        objSelect.selectByVisibleText(GENDER);
//        try {
//            Alert alert = d.switchTo().alert();
//            String alertText = alert.getText();
//            System.out.println("Alert data: " + alertText);
//            alert.accept();
//        } catch (NoAlertPresentException e) {
//            e.printStackTrace();
//        }
//    }

    public void select_ListOf_location_filed(String Location) {

        try {
            Wait.waitForElement(d,select_ListOf_location_filed);
            Select location_list = new Select(d.findElement(select_ListOf_location_filed));
            location_list.selectByVisibleText(Location);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception e) {
            try {
                //we need to select the option by JavascriptExecutor , so we need to locate element directly
                Wait.waitForElement(d,select_ListOf_location_filed);
                ((JavascriptExecutor) d).executeScript("arguments[0].scrollIntoView(true);", d.findElement(By.id("select2-select_site-result-l1ss-8")));
                ( (JavascriptExecutor) d).executeScript("arguments[0].click();", d.findElement(By.id("select2-select_site-result-l1ss-8")));
            }catch (Exception e2){ Reporter.log(new Object() {}.getClass().getEnclosingMethod().getName() + failledMessege+"##^_^##2");;throw e2;}
            Reporter.log(new Object() {}.getClass().getEnclosingMethod().getName() + failledMessege);
            throw e;
        }
    }

    public A2_HomePage_p submitSiteBotton() {
        try {
            Wait.waitForElement(d,submitSiteBotton_filed);
            d.findElement(submitSiteBotton_filed).click();
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
            return new A2_HomePage_p(d);
        } catch (Exception e) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw e;
        }
    }

    public A0_login_P logoutButton() {

        try {
            Wait.waitForElement(d,logoutButton_Filed);
            d.findElement(logoutButton_Filed).click();
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
            return new A0_login_P(d);
        } catch (Exception e) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw e;
        }
    }


}
