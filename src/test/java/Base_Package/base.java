package Base_Package;


import Pages.A0_login_P;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

public class base {
    protected WebDriver d;
    protected A0_login_P Login_P_Obj;

    @BeforeMethod
    @Parameters("browser")
    public void start(String browserType) {
        System.out.println("We are in step >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        if (browserType.equalsIgnoreCase("Edge")) {
            WebDriverManager.edgedriver().setup();
            d = new EdgeDriver();
        } else if (browserType.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            d = new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("Firefox")) {
            WebDriverManager.chromedriver().setup();
            d = new FirefoxDriver();
        }
        d.get("https://vms-stg.wakeb.tech/login");
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
//            d.close();
            d.quit();
        }

//        if (ITestResult.FAILURE == result.getStatus()) {
//            var camera = (TakesScreenshot) d;
//            File screenshot = camera.getScreenshotAs(OutputType.FILE);
//            try {
//                Files.move(screenshot.toPath(), new File("resources/screenshots/" + result.getName() + ".png").toPath());
//                Reporter.log("screenshot Saved");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
            Reporter.log("Application closed:" + result.getName());

        }
    }

