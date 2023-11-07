package Pages;

import Listeners.TestNg_Listeners_simple;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.log4testng.Logger;

import static Handler.Wait.*;

import static Listeners.TestNg_Listeners_simple.*;


import static Handler.Wait.waitForElement;
import static Listeners.TestNg_Listeners_simple.GetmethodName;

public class B3_AddGate_p {
    private WebDriver d;
    private static final Logger LOGGER = Logger.getLogger(TestNg_Listeners_simple.class);
    private By Gatename_Filed = By.cssSelector("input[type=\"text\"]");
    private By ListLocation_filed = By.xpath("//li[@role=\"option\"]");
    private By Description_Fore_Gate = By.cssSelector("textarea[name=\"description\"]");
    private By Submit_filed = By.cssSelector("button[type=\"submit\"]");
    private By Aleart_Messegs_name_gate_filed = By.xpath("//*[text()=\"حقل الاسم مطلوب.\"]");
    private By Aleart_Messegs_location_OFgate_filed = By.xpath("//*[text()=\"حقل الموقع مطلوب.\"]");


    public B3_AddGate_p(WebDriver d) {
        this.d = d;
    }

    public void SendGate_Name(String GateName) {
        try {
            d.findElement(Gatename_Filed).sendKeys(GateName);
            LOGGER.debug(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }
    }

    public void SelectLocation(String LocationIndex) {

        try {
            d.findElement(By.xpath("//span[@role=\"combobox\"]")).click();
            waitForElement(d, By.xpath("//*[contains(text(),\"" + LocationIndex + "\")]"));
            d.findElement(By.xpath("//*[contains(text(),\"" + LocationIndex + "\")]")).click();
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);

        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }
    }

    public void Inter_Description_Fore_Gate(String gatedescriptionTxt) {

        try {
            d.findElement(Description_Fore_Gate).click();
            d.findElement(Description_Fore_Gate).sendKeys(gatedescriptionTxt);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }

    }

    public void SubmitBotton() {

        try {
            waitForElement(d, Submit_filed);
            d.findElement(Submit_filed).click();
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }
    }

    public String GetcurrentURL() {
        try {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
            return d.getCurrentUrl();
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }
    }
    public String Aleart_Messegs_name_gate() {

        try {
            waitForElement(d, Aleart_Messegs_name_gate_filed);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
            System.out.println(d.findElement(Aleart_Messegs_name_gate_filed).getText().toLowerCase());
            return d.findElement(Aleart_Messegs_name_gate_filed).getText().toLowerCase();
        } catch (Exception E) {

            try {
                ((JavascriptExecutor) d).executeScript("arguments[0].scrollIntoView(true);", Aleart_Messegs_name_gate_filed);
                return d.findElement(Aleart_Messegs_name_gate_filed).getText().toLowerCase();

            } catch (Exception E2) {
                Reporter.log(new Object() {
                }.getClass().getEnclosingMethod().getName() + failledMessege);
                throw E;
            }
        }
    }

    public String Aleart_Messegs_location_OFgate() {
        try {
            waitForElement(d, Aleart_Messegs_location_OFgate_filed);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
            return d.findElement(Aleart_Messegs_location_OFgate_filed).getText().toLowerCase();
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }
    }
}
