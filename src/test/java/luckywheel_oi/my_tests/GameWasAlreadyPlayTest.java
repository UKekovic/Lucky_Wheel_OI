package luckywheel_oi.my_tests;

import luckywheel_oi.functions.PlayGameFun;
import org.testng.annotations.Test;
import luckywheel_oi.utility.BeforeAndAfter;

public class GameWasAlreadyPlayTest extends BeforeAndAfter {


    @Test
    public void GameWasAlreadyPlay() throws InterruptedException {

        PlayGameFun.TheSamePibCannotPlayAgain(driver,wait);
    }

}
