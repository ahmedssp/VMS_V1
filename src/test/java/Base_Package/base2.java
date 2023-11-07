package Base_Package;


import Pages.A0_login_P;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class base2 {
    protected WebDriver d;
    protected A0_login_P Login_P_Obj;

    @BeforeMethod
//    @Parameters("browser")
    public void start() {
//        System.out.println("We are in step >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        WebDriverManager.chromedriver().setup();
        d = new ChromeDriver();
        d.get("https://vms-stg.wakeb.tech/login");
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Reporter.log("Browser URL IS Opened ");
//        d.get("https://www.google.com/");
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Reporter.log("Browser Maximized");
        d.manage().window().maximize();
        Login_P_Obj = new A0_login_P(d);
    }
    @AfterMethod
    public void quit(ITestResult result)  {
        System.out.println("We are in end >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        if (d != null) {
            d.quit();
        }
            Reporter.log("Application closed:" + result.getName());
        }
    }

