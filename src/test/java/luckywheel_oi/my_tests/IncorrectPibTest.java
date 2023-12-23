package luckywheel_oi.my_tests;

import luckywheel_oi.functions.PlayGameFun;
import org.testng.annotations.Test;
import luckywheel_oi.utility.BeforeAndAfter;

public class IncorrectPibTest extends BeforeAndAfter {

   @Test
    public void IncorrectPib() throws InterruptedException {

       PlayGameFun.IncorrectPib(driver,wait);
   }

}
