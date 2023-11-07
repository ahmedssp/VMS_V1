package Pages;
import Listeners.TestNg_Listeners_simple;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.log4testng.Logger;
import static Handler.Wait.waitForElement;
import static Handler.alertHandling.allertH1;
import static Listeners.TestNg_Listeners_simple.*;
import static Handler.Wait.*;
public class B5_AddVisits_p {
    private WebDriver d;
    private static final Logger LOGGER = Logger.getLogger(TestNg_Listeners_simple.class);
    private By Staringdate_filed = By.cssSelector("input[name=\"start_time\"]");
    private By endingdate_filed = By.cssSelector("input[name=\"end_time\"]");
    private By Permisstion_Visitor_tap_filed = By.id("home-tab");
    private By Permisstion_Material_tap_filed = By.xpath("//a[@id=\"profile-tab\"]");
    private By Permisstion_Car_tap_filed = By.xpath("//a[@id=\"contact-tab\"]");
    private By Permisstion_Contract_tap_filed = By.xpath("//a[@id=\"contracts-tab\"]");
    private By ListofMaterial_approved = By.xpath("//div[@id=\"profile\"]//label");
    private By listofVisitor_approved = By.xpath("//div[@id=\"home\"]//label");
    private By ListofCar_approved = By.xpath("//div[@id=\"contact\"]//label");
    private By ListofContractors_approved = By.xpath("//div[@id=\"contracts\"]//label");
    private By Save_Botton_filed = By.cssSelector("button[type=\"submit\"]");
    private By Aleart_Messegs_WorkingDays_Field = By.xpath("//*[text()=\"حقل ايام العمل مطلوب.\"]");
    private By Aleart_Messegs_AcceptAproval_Field = By.xpath("//*[text()=\"يجب اعطاء صلاحية واحدة على الأقل لموافقات تصاريح العقود \"]");
    private By Aleart_Messegs_LocationNamew_Field = By.xpath("//*[text()=\"حقل الاسم مطلوب.\"]");
    private By Aleart_Messegs_StartingTime_Field = By.xpath("//*[text()=\"حقل وقت البدء مطلوب.\"]");
    private By Aleart_Messegs_EndingTime_filed = By.xpath("//*[text()=\"حقل وقت الانتهاء مطلوب.\"]");

    public B5_AddVisits_p(WebDriver d) {
        this.d = d;
    }

    private By ListWorkingdays_filed = By.xpath("//li[@role=\"option\"]");
    private By Adressoflocation_filed = By.cssSelector("textarea[class=\"form-control \"]");

    private By SiteName_filed = By.cssSelector("input[name=\"name\"]");

    public void Send_SiteName(String SiteName) {

        try {
            waitForElement(d,SiteName_filed);
            d.findElement(SiteName_filed).sendKeys(SiteName);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception e) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
        }
    }

    public void select_WorkingDays(String Day) {

        try {
            waitForElement(d,By.xpath("//span[@role=\"combobox\"]"));
            d.findElement(By.xpath("//span[@role=\"combobox\"]")).click();
            waitForElement(d, ListWorkingdays_filed);
            d.findElements(ListWorkingdays_filed).get(3).click();
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception e) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
        }
    }

    public void SendAddressOfLocation(String adress) {

        try {
            waitForElement(d,Adressoflocation_filed);
            d.findElement(Adressoflocation_filed).click();
            d.findElement(Adressoflocation_filed).sendKeys(adress);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception e) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
        }
    }

    public void Senddate(String Staringdate, String endDate) {

        try {
            waitForElement(d,Staringdate_filed);
            d.findElement(Staringdate_filed).sendKeys(Staringdate);
            d.findElement(endingdate_filed).sendKeys(endDate);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception e) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
        }
    }

    public void ClickApproval_Visitor() {

        try {
            waitForElement(d,Permisstion_Visitor_tap_filed);
            d.findElement(Permisstion_Visitor_tap_filed).click();
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception e) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
        }
    }

    public void ClickApproval_Car() {

        try {
            waitForElement(d,Permisstion_Car_tap_filed);

            d.findElement(Permisstion_Car_tap_filed).click();
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception e) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
        }
    }

    public void ClickApproval_Contract() {

        try {
            waitForElement(d,Permisstion_Contract_tap_filed);

            d.findElement(Permisstion_Contract_tap_filed).click();
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception e) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
        }
    }

    public void ClickApproval_Material() {

        try {
            waitForElement(d,Permisstion_Material_tap_filed);

            d.findElement(Permisstion_Material_tap_filed).click();
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception e) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
        }
    }

    public void Click_checkBoxVisitor_approved(String positionTitle) {

        try {
            waitForElement(d,listofVisitor_approved);

            int index = 0;
            d.findElements(listofVisitor_approved).get(Switch(positionTitle, index)).click();
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception e) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
        }
    }

    public void Click_checkBoxCar_approved(String positionTitle) {

        try {
            waitForElement(d,ListofCar_approved);

            int index = 0;
            d.findElements(ListofCar_approved).get(Switch(positionTitle, index)).click();
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception e) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
        }
    }

    public void Click_checkBoxContractors_approved(String positionTitle) {

        try {
            waitForElement(d,ListofContractors_approved);
            int index = 0;
            d.findElements(ListofContractors_approved).get(Switch(positionTitle, index)).click();
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception e) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
        }
    }

    public void Click_checkBoxMaterial_approved(String positionTitle) {

        try {
            waitForElement(d,ListofMaterial_approved);
            int index = 0;
            Switch(positionTitle, index);
            d.findElements(ListofMaterial_approved).get(Switch(positionTitle, index)).click();
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception e) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
        }
    }

    public int Switch(String positionTitle, int index) {
        switch (positionTitle) {
            case "General manage":
                index = 0;
                break;
            case "Manager":
                index = 1;
                break;
            case "Securitty Manager":
                index = 2;
                break;
            case "first":
                index = 3;
                break;
            case "QA specialist":
                index = 4;
                break;
            case "department manager":
                index = 5;
                break;
            case "Team lead":
                index = 6;
                break;
            case "New position":
                index = 7;
                break;
            case "QA automation tester":
                index = 8;
                break;
            default:
                index = 1;
        }
        return index;
    }


    public void Click_SaveBotton() {

        try {
            waitForElement(d,Save_Botton_filed);
            d.findElement(Save_Botton_filed).click();
            allertH1(d);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
        } catch (Exception e) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
        }
    }

    public String GetcurrentURL() {

        try {

            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
            return d.getCurrentUrl();
        } catch (Exception e) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
        }
        return d.getCurrentUrl();
    }

    public String Aleart_Messegs_EndingTime() {

        try {
            waitForElement(d,Aleart_Messegs_EndingTime_filed);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
            return d.findElement(Aleart_Messegs_EndingTime_filed).getText().toLowerCase();
        } catch (Exception e) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
        }
        return d.findElement(Aleart_Messegs_EndingTime_filed).getText().toLowerCase();
    }

    public String Aleart_Messegs_StartingTime() {

        try {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
            return d.findElement(Aleart_Messegs_StartingTime_Field).getText().toLowerCase();
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }

    }
    public String Aleart_Messegs_LocationNamew() {

        try {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
            return d.findElement(Aleart_Messegs_LocationNamew_Field).getText().toLowerCase();
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }
    }
    public String Aleart_Messegs_AcceptAproval() {

        try {
            waitForElement(d,Aleart_Messegs_AcceptAproval_Field);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege);
            return d.findElement(Aleart_Messegs_AcceptAproval_Field).getText().toLowerCase();
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }
    }
    public String Aleart_Messegs_WorkingDays() {
        try {
            waitForElement(d,Aleart_Messegs_WorkingDays_Field);
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + PassMessege, true);
            return d.findElement(Aleart_Messegs_WorkingDays_Field).getText().toLowerCase();
        } catch (Exception E) {
            Reporter.log(new Object() {
            }.getClass().getEnclosingMethod().getName() + failledMessege);
            throw E;
        }
    }
}
