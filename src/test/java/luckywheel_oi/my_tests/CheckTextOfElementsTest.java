package luckywheel_oi.my_tests;

import luckywheel_oi.functions.CheckUIOfPageFun;
import luckywheel_oi.utility.BeforeAndAfter;
import org.testng.annotations.Test;

public class CheckTextOfElementsTest extends BeforeAndAfter {

    @Test
    public void CheckTextOfElements() {

        CheckUIOfPageFun.ButtonText(driver);

        CheckUIOfPageFun.RegisterPageFooterText(driver);

    }

}
