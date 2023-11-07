package Pages;

import Listeners.TestNg_Listeners_simple;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.log4testng.Logger;

import java.time.Duration;

import static Handler.Wait.waitForElement;
import static Listeners.TestNg_Listeners_simple.PassMessege;
import static Listeners.TestNg_Listeners_simple.failledMessege;

public class B4_car_requests_ADD_p {
    private WebDriver d;
    private static final Logger LOGGER = Logger.getLogger(TestNg_Listeners_simple.class);
    private By Add_newMaterial_Permit_filed=By.xpath("//a[@class=\"btn btn-primary mr-2\"]");

    private By SaveBotton_filed = By.id("saveVisitors");
    private By Click_filedofinput_Visitor_list = By.xpath("//ul[@class=\"select2-selection__rendered\"]");
    private By ListOfElementsOfVisitors = By.xpath("//ul//li[@role=\"option\"]");
    private By submitVisitForm_FILED = By.id("submitVisitForm");

    public B4_car_requests_ADD_p(WebDriver d) {
        this.d = d;
    }

    private By click_Add_newBoutton_filed = By.xpath("//a[@class=\"btn btn-primary mr-2\"]");
    private By select_ListOf_SelectGate_filed = By.id("gate_id");
    private By select_ListOf_SelectBuilding_filed = By.id("building_id");
    private By select_ListOf_SelectFloor_filed = By.id("floor_id");
    private By select_ListOf_HostPerson_filed = By.id("host_id");
    private By select_ListOf_Selectdepartment_filed = By.cssSelector("select[name=\"department_id\"]");
    private By select_ListOf_SelectVisitingType_filed = By.id("visit_type_id");
    private By select_ListOf_SelectReason_filed = By.cssSelector("select[name=\"reason_id\"]");

    private By select_ListOf_Selectdays_filed = By.cssSelector("select[name=\"repeat\"]");
    private By CheckBox_outside_workingDays_filed = By.xpath("//*[text()=\"خارج ايام العمل\"]");
    private By Out_of_work_filed = By.xpath("//*[text()=\"خارج الدوام\"]");
    private By Sendtext_inside_workingDays_filed = By.cssSelector("textarea[name=\"remark\"]");
    private By Start_visiting_date = By.id("from_date");
    private By Start_visiting_Time = By.id("from_fromtime");
    private By Last_visiting_date = By.id("to_date");
    private By Last_visiting_Time = By.id("to_totime");
    private By addVisitorBotton_filed = By.id("AddVisitor");
    private By select_ListOf_Select_Visitor_name_filed = By.id("selectUsers");
    private By Validate_Visitor_Selected_name_filed=By.xpath("//tbody[@id=\"visitorSelectedTable\"]//td");


    public B1_AddSite_p click_Add_newCare_Permit() {

        try {
            d.findElement(Add_newMaterial_Permit_filed).click();
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
            return new B1_AddSite_p(d);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }

    }

    public void select_ListOf_SelectGate(String GateName) {

        try {
            Select location_list = new Select(d.findElement(select_ListOf_SelectGate_filed));
            location_list.selectByVisibleText(GateName);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }
    }

    public void select_ListOf_SelectBilding(String Building) {

        try {
            waitForElement(d, select_ListOf_SelectBuilding_filed);
            Select location_list = new Select(d.findElement(select_ListOf_SelectBuilding_filed));
            location_list.selectByVisibleText(Building);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }
    }

    public void select_ListOf_SelectFloor(String Floor) {

        try {
            waitForElement(d, select_ListOf_SelectFloor_filed);
            Select location_list = new Select(d.findElement(select_ListOf_SelectFloor_filed));
            location_list.selectByVisibleText(Floor);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }
    }

    public void select_ListOf_HostPerson(String host) {
        try {
            waitForElement(d, select_ListOf_HostPerson_filed);
            Select location_list = new Select(d.findElement(select_ListOf_HostPerson_filed));
            location_list.selectByVisibleText(host);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }
    }

    public void select_ListOf_HostPerson2(String host) {
        try {
            Select location_list = new Select(d.findElement(select_ListOf_HostPerson_filed));
            location_list.selectByVisibleText(host);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }
    }


    public void select_ListOf_Selectdepartment(String department) {

        try {
            waitForElement(d, select_ListOf_Selectdepartment_filed);

            Select location_list = new Select(d.findElement(select_ListOf_Selectdepartment_filed));
            location_list.selectByVisibleText(department);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }
    }

    public void select_ListOf_SelectVisitingType(String VisitingType) {

        try {
            waitForElement(d, select_ListOf_SelectVisitingType_filed);

            Select location_list = new Select(d.findElement(select_ListOf_SelectVisitingType_filed));
            location_list.selectByVisibleText(VisitingType);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }
    }

    public void select_ListOf_SelectVisiting_Reason(String reason) {

        try {
            waitForElement(d, select_ListOf_SelectReason_filed);

            Select location_list = new Select(d.findElement(select_ListOf_SelectReason_filed));
            location_list.selectByVisibleText(reason);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }
    }

    public void select_ListOf_SelectVisiting_Days(String days) {

        try {
            waitForElement(d, select_ListOf_Selectdays_filed);

            Select location_list = new Select(d.findElement(select_ListOf_Selectdays_filed));
            location_list.selectByVisibleText(days);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }
    }

    public void ClickOn_outside_workingDays() {

        try {
            waitForElement(d, CheckBox_outside_workingDays_filed);

            d.findElement(CheckBox_outside_workingDays_filed).click();
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }
    }

    public void SendtextNotes_outside_workingDays(String text) {

        try {
            waitForElement(d, Sendtext_inside_workingDays_filed);

            d.findElement(Sendtext_inside_workingDays_filed).sendKeys(text);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }
    }

    public void Visiting_startsFrome_at(String start, String time) {

        try {
            waitForElement(d, Start_visiting_date);
            d.findElement(Start_visiting_date).sendKeys(start);
            waitForElement(d, Start_visiting_Time);
            d.findElement(Start_visiting_Time).sendKeys(time);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }
    }

    public void Visiting_startsTo_at(String last, String time) {

        try {
            waitForElement(d, Last_visiting_date);
            d.findElement(Last_visiting_date).sendKeys(last);
            waitForElement(d, Last_visiting_Time);

            d.findElement(Last_visiting_Time).sendKeys(time);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }
    }

    public void Click_addVisitorBotton() {
        d.findElement(addVisitorBotton_filed).click();
    }

    public void SelectAddVisitor() {

        try {
            waitForElement(d, By.id("addNewUser"));
            d.findElement(By.id("addNewUser")).click();
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }
    }

    public void Click_SelectVisitor(String visitorname) {

        try {
            waitForElement(d, Click_filedofinput_Visitor_list);

            d.findElement(Click_filedofinput_Visitor_list).click();
            for (int x = 0; x < d.findElements(ListOfElementsOfVisitors).size(); x++) {
                if (d.findElements(ListOfElementsOfVisitors).get(x).getText().toLowerCase().equals(visitorname)) {
                    d.findElements(ListOfElementsOfVisitors).get(x).click();
                    break;
                }
            }
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }

    }

    public void Click_save_VisitorBotton() {

        try {
            waitForElement(d, SaveBotton_filed);

            d.findElement(SaveBotton_filed).click();
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }
    }


    public void submitVisitForm()  {
//        d.findElement(submitVisitForm_FILED).click();

       try {
           WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));
           WebElement element = wait.until(ExpectedConditions.elementToBeClickable(submitVisitForm_FILED));
           ((JavascriptExecutor) d).executeScript("arguments[0].click();", element);
           Reporter.log(new Object() {}.getClass().getEnclosingMethod().getName() + PassMessege);

       }catch (Exception e){
           Reporter.log(new Object() {}.getClass().getEnclosingMethod().getName() + failledMessege);
         throw  e;
       }
//        try {
//            waitForElementExtra(d, submitVisitForm_FILED);
//            d.findElement(submitVisitForm_FILED).click();
//            Reporter.log(new Object() {
//            }.getClass().getEnclosingMethod().getName() + PassMessege);
//
//        } catch (Exception e) {
//            Reporter.log(new Object() {}.getClass().getEnclosingMethod().getName() + failledMessege);
//            throw e;
//        }
//        new WebDriverWait(d, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(submitVisitForm_FILED)).click();
//        new WebDriverWait(d, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(d.findElement(submitVisitForm_FILED))).click();
//        new WebDriverWait(d, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(submitVisitForm_FILED)).click();
    }


    public boolean Validate_Visitor_Selected_name_contains(String name) {
        try {
//            Thread.sleep(3000);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
            return d.findElement(Validate_Visitor_Selected_name_filed).getText().toLowerCase().contains(name);
        } catch (Exception e) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw e;
        }
    }

    public boolean NavigateToCreated_URL(String name) {
        try {
            d.getCurrentUrl().toLowerCase().contains(name);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);

            return d.getCurrentUrl().toLowerCase().contains(name);
        } catch (Exception e) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);

            throw e;
        }
    }

    public void click_Add_newBoutton() {

        try {
            d.findElement(click_Add_newBoutton_filed).click();
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);

        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }

    }
}
