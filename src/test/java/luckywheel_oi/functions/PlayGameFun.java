package luckywheel_oi.functions;

import luckywheel_oi.pageobjects.LogInPageObjects;
import luckywheel_oi.pageobjects.LuckyWheelPageObjects;
import luckywheel_oi.pageobjects.PersonalDataPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class PlayGameFun {

    public static void SubscriberPib(WebDriver driver, WebDriverWait wait) throws InterruptedException {

        //
        driver.findElement(LogInPageObjects.insertPibField).click();
        //
        driver.findElement(LogInPageObjects.insertPibField)
                .sendKeys(LogInPageObjects.subscriberPib);
        //
        driver.findElement(LogInPageObjects.logInButton).click();
        //
        driver.findElement(LuckyWheelPageObjects.luckyWheelButton).click();
        //
        wait.until(ExpectedConditions.visibilityOfElementLocated(LuckyWheelPageObjects.subscriberGift));

        Thread.sleep(2000);

    }

    public static void TheSamePibCannotPlayAgain(WebDriver driver, WebDriverWait wait) throws InterruptedException {

        //
        driver.findElement(LogInPageObjects.insertPibField).click();
        //
        driver.findElement(LogInPageObjects.insertPibField)
                .sendKeys(LogInPageObjects.samePib);
        //
        driver.findElement(LogInPageObjects.logInButton).click();
        //
        wait.until(ExpectedConditions.visibilityOfElementLocated(LogInPageObjects.notificationThatGameAlreadyPlay));

        Thread.sleep(2000);

    }

    public static void nonSubscriberCheckIn(WebDriver driver, WebDriverWait wait) throws InterruptedException {

        //Click on "Unesite Pib" field

        driver.findElement(LogInPageObjects.insertPibField).click();

        //Insert NonSubscriber Pib
        Random random = new Random();

        Integer randomPib = random.nextInt(900_000_000) + 100_000_000;

        String randomStringPib = String.valueOf(randomPib);

        driver.findElement(LogInPageObjects.insertPibField)
                .sendKeys(randomStringPib);
        //Click on "Prijavite se" button
        driver.findElement(LogInPageObjects.logInButton).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(PersonalDataPageObjects.nameOfTheInstitutionField));

        Thread.sleep(2000);

    }

    public static void IncorrectPib(WebDriver driver, WebDriverWait wait) throws InterruptedException {

        //
        driver.findElement(LogInPageObjects.insertPibField).click();
        //
        Random random = new Random();

        // Generate a random 7-digit integer
        Integer randomIncorrectPib = random.nextInt(9000000) + 1000000;
        String randomIncorrectStringPib = String.valueOf(randomIncorrectPib);
        driver.findElement(LogInPageObjects.insertPibField)
                .sendKeys(randomIncorrectStringPib);
        //
        driver.findElement(LogInPageObjects.logInButton).click();

        //
        wait.until(ExpectedConditions.visibilityOfElementLocated(LogInPageObjects.errorMessage));

        Thread.sleep(2000);

    }

}
