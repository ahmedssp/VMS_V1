package Permit_Testing;

import Base_Package.base;
import Pages.*;
import Pages.A1_Welcome_P;
import Pages.A2_HomePage_p;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Material_Permit_Testing extends base {
    @Test
    public void Material_Permit_Testing_Hppy_senario() {
        SoftAssert softAssert = new SoftAssert();
        Login_P_Obj.Send_email("root@wakeb.com");
        Login_P_Obj.Send_Password("123456");

        A1_Welcome_P A1_Welcome_Obj = Login_P_Obj.Enter_Botton();
        A1_Welcome_Obj.select_ListOf_location_filed("Lebanon Square");
        A2_HomePage_p HomePage_p_obj = A1_Welcome_Obj.submitSiteBotton();
        HomePage_p_obj.Hover_on_Permits();
        B4_material_requests_ADD_p Material_p_Obj = HomePage_p_obj.Click_on_Permits_material_requests();
        Material_p_Obj.click_Add_newBoutton();

//        Material_p_Obj.select_material_request_type("طلب إخراج وغير قابل للإرجاع");
        Material_p_Obj.select_ListOf_SelectGate("بوابة2");
        Material_p_Obj.select_ListOf_Selectdepartment("Wakeb testing department");
        Material_p_Obj.select_ListOf_HostPerson2("Contact manager");






    }

}
