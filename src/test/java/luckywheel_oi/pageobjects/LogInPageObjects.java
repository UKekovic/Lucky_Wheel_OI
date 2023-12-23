package luckywheel_oi.pageobjects;

import org.openqa.selenium.By;

public class LogInPageObjects {
    public static By insertPibField = By.id("pib");

    public static By logInButton = By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/button[1]");

    public static By errorMessage = By.id("errorPib");

    public static By notificationThatGameAlreadyPlay  = By.xpath("//body[1]/div[4]/div[2]/div[1]/div[1]/form[1]/h1[1]");

    public static String samePib = "101514832";

    public static String subscriberPib = "100413582";

}
