package luckywheel_oi.pageobjects;

import org.openqa.selenium.By;

public class PersonalDataPageObjects {

    public static By nameOfTheInstitutionField = By.id("ustanova");

    public static String nameOfTheInstitution = "OS Nadezda Petrovic";

    public static By emailField = By.id("email");

    public static String email = "uroskekovic@gmail.com";

    public static By firstNameField = By.id("ime");

    public static String firstName = "Uros";

    public static By lastNameField = By.id("prezime");

    public static String lastName = "Kekovic";

    public static By phoneField = By.id("telefon");

    public static String phone = "0608466622";

    public static By chooseFunctionMenu = By.id("funkcija");

    public static By userFunction = By.xpath("//body[1]/div[3]/div[1]/div[1]/div[1]/div[6]/select[1]/option[1]");

    public static By registrationButton = By.xpath("//body[1]/div[3]/div[1]/div[1]/div[1]/div[7]/button[1]");



}
