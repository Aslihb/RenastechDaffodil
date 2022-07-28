package students.Aslihan;

import code.base.TestBase;
import org.testng.annotations.Test;

public class lab09 extends TestBase {

    @Test
    public void TC_15(){
        driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());


    }

}
