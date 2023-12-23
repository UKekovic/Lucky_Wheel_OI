package luckywheel_oi.functions;

import luckywheel_oi.pageobjects.LogInPageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.Log;
import org.testng.Assert;

public class CheckUIOfPageFun {

    public static void HomePageColours(WebDriver driver) {

         WebElement logInButtonColor = driver.findElement(LogInPageObjects.logInButton);

         String buttonColor = logInButtonColor.getCssValue("background-color");


          String expectedColour = "rgba(117, 64, 135, 1)";


        if (buttonColor.equals(expectedColour)) {
            System.out.println("Element color is as expected.");
        } else {
            System.out.println("Element color is not as expected.");
        }


    }

    public static void ButtonText(WebDriver driver) {

        WebElement logInButton = driver.findElement(LogInPageObjects.logInButton);

        String buttonText = logInButton.getText();

        String expectedText = "Пријавите се";

        Assert.assertEquals(buttonText,expectedText);


    }
    public static void RegisterPageFooterText(WebDriver driver) {

        WebElement footer = driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]"));

        String actualFooterText = footer.getText();

        String expectedFooterText = "Copyright© Obrazovni informatior 2023. All rights reserved.";

        Assert.assertEquals(actualFooterText,expectedFooterText);

    }

    }



