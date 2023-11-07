package Testing_Package.DataEntryFunctionality_CURD;

import Base_Package.base;
import DataMethodo.apachi_POI;
import Pages.A1_Welcome_P;
import Pages.A2_HomePage_p;
import Pages.B0_Sites_p;
import Pages.B1_AddSite_p;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Location_CRUD extends base  {
    @Test(dataProvider = "exceldata", dataProviderClass = apachi_POI.class,priority = 1)
        public void Location_Create_happySenario(String Email, String Password, String Location, String SiteName, String Day1, String Day2, String Addres)  {

        SoftAssert softAssert = new SoftAssert();
        Login_P_Obj.Send_email(Email);
        Login_P_Obj.Send_Password(Password);
        A1_Welcome_P A1_Welcome_Obj = Login_P_Obj.Enter_Botton();
        A1_Welcome_Obj.select_ListOf_location_filed(Location);
        A2_HomePage_p HomePage_p_obj = A1_Welcome_Obj.submitSiteBotton();
        HomePage_p_obj.Hover_on_Setting();
        HomePage_p_obj.Hover_on_Enterdate();

        B0_Sites_p Site_p_Obj = HomePage_p_obj.Click_on_Enter_Location();

        B1_AddSite_p B1_AddSite_Obj = Site_p_Obj.click_Add_newSiteBotton();
        B1_AddSite_Obj.Send_SiteName(SiteName);
        B1_AddSite_Obj.select_WorkingDays(Day1);
        B1_AddSite_Obj.SendAddressOfLocation(Addres);
        B1_AddSite_Obj.SendTime("05:06AM", "10:06PM");

        B1_AddSite_Obj.ClickApproval_Material();
        B1_AddSite_Obj.Click_checkBoxMaterial_approved("General manager");

        B1_AddSite_Obj.ClickApproval_Visitor();
        B1_AddSite_Obj.Click_checkBoxVisitor_approved("Manager");
        B1_AddSite_Obj.Click_checkBoxVisitor_approved("Securitty Manager");

        B1_AddSite_Obj.ClickApproval_Car();
        B1_AddSite_Obj.Click_checkBoxCar_approved("Team lead");

        B1_AddSite_Obj.ClickApproval_Contract();
        B1_AddSite_Obj.Click_checkBoxContractors_approved("QA specialist");

        B1_AddSite_Obj.Click_SaveBotton();
        softAssert.assertTrue(B1_AddSite_Obj.GetcurrentURL().toLowerCase().contains("sites"), "asserion save location faild ");
        softAssert.assertAll();
    }
    @Test(priority = 2)
    public void Location_Update_happySenario() {

    }
    @Test(priority = 3)
    public void Location_Delete_happySenario() {

    }
    @Test(priority = 4)
    public void Location_Read_happySenario() {

    }
    @Test(priority = 5)
    public void Location_Create_BadSenario() {
        SoftAssert softAssert = new SoftAssert();

        Login_P_Obj.Send_email("root@wakeb.com");
        Login_P_Obj.Send_Password("123456");
        A1_Welcome_P A1_Welcome_Obj = Login_P_Obj.Enter_Botton();

        A1_Welcome_Obj.select_ListOf_location_filed("الموقع رقم اثنين");
        A2_HomePage_p HomePage_p_obj = A1_Welcome_Obj.submitSiteBotton();

        HomePage_p_obj.Hover_on_Setting();
        HomePage_p_obj.Hover_on_Enterdate();
        B0_Sites_p Site_p_Obj = HomePage_p_obj.Click_on_Enter_Location();
        B1_AddSite_p B1_AddSite_Obj = Site_p_Obj.click_Add_newSiteBotton();
        B1_AddSite_Obj.SendAddressOfLocation("adress");

        B1_AddSite_Obj.Click_SaveBotton();
        //Assertion
        softAssert.assertTrue(B1_AddSite_Obj.GetcurrentURL().toLowerCase().contains("create"), "asserion UNsave location faild ");
        softAssert.assertTrue(B1_AddSite_Obj.Aleart_Messegs_LocationNamew().contains("حقل الاسم مطلوب"));
        softAssert.assertTrue(B1_AddSite_Obj.Aleart_Messegs_WorkingDays().contains("حقل ايام العمل مطلوب"));
        softAssert.assertTrue(B1_AddSite_Obj.Aleart_Messegs_StartingTime().contains("حقل وقت البدء مطلوب"));
        softAssert.assertTrue(B1_AddSite_Obj.Aleart_Messegs_EndingTime().contains("حقل وقت الانتهاء مطلوب"));
        softAssert.assertTrue(B1_AddSite_Obj.Aleart_Messegs_AcceptAproval().contains("يجب اعطاء صلاحية واحدة"));

        softAssert.assertAll();
    }
    @Test(priority = 6)
    public void Location_Update_BadSenario() {

    }
    @Test(priority = 7)
    public void Location_Delete_BadSenario() {

    }
    @Test(priority = 8)
    public void Location_Read_BadSenario() {

    }
}
