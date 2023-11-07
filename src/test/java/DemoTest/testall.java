package DemoTest;

import Base_Package.base2;
import DataMethodo.apachi_POI;
import Pages.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//@Listeners(TestNg_Listeners_simple.class)

public class testall extends base2 {
    //    @Test(dataProvider = "exceldata", dataProviderClass = apachi_POI.class)
    @Test(dataProvider = "exceldata", dataProviderClass = apachi_POI.class,priority = 1)
    public void Add_site_Happy_Senario(String Email, String Password, String Location, String SiteName, String Day1, String Day2, String Addres)  {
        System.out.println("We are in Add_site_Happy_Senario >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

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

    @Test
    public void Add_site_Bad_Senario() {
        System.out.println("We are in Add_site_Bad_Senario >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

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

    @Test
    public void Add_Gate_Happy_Senario() {
        System.out.println("We are in Add_Gate_Happy_Senario >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        SoftAssert softAssert = new SoftAssert();

        Login_P_Obj.Send_email("root@wakeb.com");
        Login_P_Obj.Send_Password("123456");
        A1_Welcome_P A1_Welcome_Obj = Login_P_Obj.Enter_Botton();

        A1_Welcome_Obj.select_ListOf_location_filed("الموقع رقم اثنين");
        A2_HomePage_p HomePage_p_obj = A1_Welcome_Obj.submitSiteBotton();

        HomePage_p_obj.Hover_on_Setting();
        HomePage_p_obj.Hover_on_Enterdate();

        B2_Gate_p Gate_p_Obj = HomePage_p_obj.Click_on_Enter_Gates();
        B3_AddGate_p B3_AddGate_Obj = Gate_p_Obj.click_Add_newSiteBotton();
        B3_AddGate_Obj.SendGate_Name("AutoGate1");
        B3_AddGate_Obj.SelectLocation("site_auto_created");
        B3_AddGate_Obj.Inter_Description_Fore_Gate("GatedescriptionTxt");
        B3_AddGate_Obj.SubmitBotton();

        //Assertion
        softAssert.assertTrue(B3_AddGate_Obj.GetcurrentURL().toLowerCase().contains("gates"), "asserion save gate faild ");

        softAssert.assertAll();
    }

    @Test
    public void Add_Gate_Bad_Senario() {
        System.out.println("We are in Add_Gate_Bad_Senario >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        SoftAssert softAssert = new SoftAssert();

        Login_P_Obj.Send_email("root@wakeb.com");
        Login_P_Obj.Send_Password("123456");
        A1_Welcome_P A1_Welcome_Obj = Login_P_Obj.Enter_Botton();

        A1_Welcome_Obj.select_ListOf_location_filed("الموقع رقم اثنين");
        A2_HomePage_p HomePage_p_obj = A1_Welcome_Obj.submitSiteBotton();

        HomePage_p_obj.Hover_on_Setting();
        HomePage_p_obj.Hover_on_Enterdate();

        B2_Gate_p Gate_p_Obj = HomePage_p_obj.Click_on_Enter_Gates();
        B3_AddGate_p B3_AddGate_Obj = Gate_p_Obj.click_Add_newSiteBotton();
        B3_AddGate_Obj.SubmitBotton();
        //Assertion
        softAssert.assertTrue(B3_AddGate_Obj.GetcurrentURL().toLowerCase().contains("create"), "asserion save gate faild ");
        softAssert.assertTrue(B3_AddGate_Obj.Aleart_Messegs_name_gate().contains("حقل الاسم مطلوب"));
//        softAssert.assertTrue(B3_AddGate_Obj.Aleart_Messegs_location_OFgate().contains("حقل الموقع مطلوب"));
        softAssert.assertAll();
    }
    @Test
    public void Visiting_approval_happy_Senario() {
        System.out.println("We are in Visiting_approval_happy_Senario >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        SoftAssert softAssert = new SoftAssert();
        Login_P_Obj.Send_email("root@wakeb.com");
        Login_P_Obj.Send_Password("123456");
        A1_Welcome_P A1_Welcome_Obj = Login_P_Obj.Enter_Botton();
        A1_Welcome_Obj.select_ListOf_location_filed("Lebanon Square");
        A2_HomePage_p HomePage_p_obj = A1_Welcome_Obj.submitSiteBotton();
        HomePage_p_obj.Hover_on_Permits();
        B4_Visits_requests_ADD_p Visits_p_Obj = HomePage_p_obj.Click_on_Permits_Visitors();
        Visits_p_Obj.click_Add_newVisitor();


        Visits_p_Obj.select_ListOf_SelectGate("بوابة2");
        Visits_p_Obj.select_ListOf_SelectBilding("مبنى3");
        Visits_p_Obj.select_ListOf_SelectFloor("الدور الأرضي");
        Visits_p_Obj.select_ListOf_HostPerson2("Contact manager");
        Visits_p_Obj.select_ListOf_Selectdepartment("Wakeb testing department");
        Visits_p_Obj.select_ListOf_SelectVisitingType("Interview");
        Visits_p_Obj.select_ListOf_SelectVisiting_Reason("new new");
        Visits_p_Obj.select_ListOf_SelectVisiting_Days("زيارة اكثر من مره فى اليوم");
        Visits_p_Obj.ClickOn_outside_workingDays();
        Visits_p_Obj.SendtextNotes_outside_workingDays("hvghcgf");
        Visits_p_Obj.Visiting_startsFrome_at("9/18/2023", "05:06AM");
        Visits_p_Obj.Visiting_startsTo_at("10/18/2023", "10:06PM");
        Visits_p_Obj.Click_addVisitorBotton();
        Visits_p_Obj.SelectAddVisitor();
        Visits_p_Obj.Click_SelectVisitor("mena ahmed");
        Visits_p_Obj.Click_save_VisitorBotton();
        softAssert.assertTrue(Visits_p_Obj.Validate_Visitor_Selected_name_contains("mena ahmed"));
        softAssert.assertTrue(Visits_p_Obj.NavigateToCreated_URL("create"));
        Visits_p_Obj.submitVisitForm();
        softAssert.assertAll();
    }


}
