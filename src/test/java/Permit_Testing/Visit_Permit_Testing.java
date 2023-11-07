package Permit_Testing;

import Base_Package.base;
import Pages.A1_Welcome_P;
import Pages.A2_HomePage_p;
import Pages.B4_Visits_requests_ADD_p;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Visit_Permit_Testing extends base {
    @Test
    public void Visiting_approval_happy_Senario() {
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
    @Test
    public void Visiting_approval_Bad_Senario() {
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
