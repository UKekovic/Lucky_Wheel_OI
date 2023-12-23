package luckywheel_oi.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import luckywheel_oi.pageobjects.LuckyWheelPageObjects;

public class PlayLuckyWheelFun {
    public static void PlayLuckyWheel(WebDriver driver, WebDriverWait wait) throws InterruptedException {

        //
        driver.findElement(LuckyWheelPageObjects.luckyWheelButton).click();
        //
        wait.until(ExpectedConditions.visibilityOfElementLocated(LuckyWheelPageObjects.giftName));
        Thread.sleep(2000);

    }
}
