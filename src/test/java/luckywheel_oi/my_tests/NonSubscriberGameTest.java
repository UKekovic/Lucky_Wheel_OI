package luckywheel_oi.my_tests;

import luckywheel_oi.functions.PersonalDataFun;
import luckywheel_oi.functions.PlayGameFun;
import luckywheel_oi.functions.PlayLuckyWheelFun;
import org.testng.annotations.Test;
import luckywheel_oi.utility.BeforeAndAfter;

public class NonSubscriberGameTest extends BeforeAndAfter {

    @Test
    public void NonSubscriberGame() throws InterruptedException {

        PlayGameFun.nonSubscriberCheckIn(driver, wait);
        PersonalDataFun.PersonalData(driver, wait);
        PlayLuckyWheelFun.PlayLuckyWheel(driver,wait);

    }

}
