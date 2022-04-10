package testcases;

import pages.AmazonHomepage;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomepageTest extends BaseClass {

    @Test
    public void PurchaseItem() {

        //In order to access the object of the page ob, u create an object in your testcase
        AmazonHomepage Homepage = new AmazonHomepage(driver);
        Homepage.selectHamburger();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Homepage.selectTvAppliances();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Homepage.selectTelevisions();
        Homepage.checkItem();
        Homepage.clickDropdownmenu();
        Homepage.selectHighlow();
        Homepage.switchWindow();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Homepage.printAboutitem();



    }
}
