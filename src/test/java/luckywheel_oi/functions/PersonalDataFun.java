package luckywheel_oi.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import luckywheel_oi.pageobjects.LuckyWheelPageObjects;
import luckywheel_oi.pageobjects.PersonalDataPageObjects;

public class PersonalDataFun {

    public static void PersonalData(WebDriver driver, WebDriverWait wait) throws InterruptedException {

        //
        driver.findElement(PersonalDataPageObjects.nameOfTheInstitutionField).click();
        //
        driver.findElement(PersonalDataPageObjects.nameOfTheInstitutionField)
                .sendKeys(PersonalDataPageObjects.nameOfTheInstitution);

        driver.findElement(PersonalDataPageObjects.emailField).click();
        driver.findElement(PersonalDataPageObjects.emailField)
                .sendKeys(PersonalDataPageObjects.email);
        //
        driver.findElement(PersonalDataPageObjects.firstNameField).click();
        //
        driver.findElement(PersonalDataPageObjects.firstNameField)
                .sendKeys(PersonalDataPageObjects.firstName);
        //
        driver.findElement(PersonalDataPageObjects.lastNameField).click();
        //
        driver.findElement(PersonalDataPageObjects.lastNameField)
                .sendKeys(PersonalDataPageObjects.lastName);
        //
        driver.findElement(PersonalDataPageObjects.phoneField).click();
        //
        driver.findElement(PersonalDataPageObjects.phoneField)
                .sendKeys(PersonalDataPageObjects.phone);
        //
        driver.findElement(PersonalDataPageObjects.chooseFunctionMenu).click();
        //
        driver.findElement(PersonalDataPageObjects.userFunction).click();
        //
        driver.findElement(PersonalDataPageObjects.registrationButton).click();
        //
        wait.until(ExpectedConditions.visibilityOfElementLocated(LuckyWheelPageObjects.luckyWheelButton));

        Thread.sleep(2000);
    }

}
