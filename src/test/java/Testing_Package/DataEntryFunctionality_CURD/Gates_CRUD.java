package Testing_Package.DataEntryFunctionality_CURD;

import Base_Package.base;
import Pages.A1_Welcome_P;
import Pages.A2_HomePage_p;
import Pages.B2_Gate_p;
import Pages.B3_AddGate_p;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Gates_CRUD extends base {
    @Test
    public void Gates_Create_happySenario() {
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
    public void Gates_Update_happySenario() {

    }
    @Test
    public void Gates_Delete_happySenario() {

    }
    @Test
    public void Gates_Read_happySenario() {

    }

    @Test
    public void Gates_Create_BadSenario() {
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
        softAssert.assertTrue(B3_AddGate_Obj.Aleart_Messegs_location_OFgate().contains("حقل الموقع مطلوب"));
        softAssert.assertAll();
    }
    @Test
    public void Gates_Update_BadSenario() {

    }
    @Test
    public void Gates_Delete_BadSenario() {

    }
    @Test
    public void Gates_Read_BadSenario() {

    }
}
