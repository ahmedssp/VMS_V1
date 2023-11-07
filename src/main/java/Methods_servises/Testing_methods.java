package Methods_servises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import static Handler.Wait.waitForElement;

import static Listeners.TestNg_Listeners_simple.PassMessege;
import static Listeners.TestNg_Listeners_simple.failledMessege;

public class Testing_methods {
    public static void Switch_Selector(WebDriver driver, By locator, String SearchInputWord){
        try {
            waitForElement(driver, locator);

            driver.findElement(locator).click();
            for (int x = 0; x < driver.findElements(locator).size(); x++) {
                if (driver.findElements(locator).get(x).getText().toLowerCase().equals(SearchInputWord)) {
                    System.out.println(driver.findElements(locator).get(x).getText().toLowerCase());
                    driver.findElements(locator).get(x).click();
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
}
