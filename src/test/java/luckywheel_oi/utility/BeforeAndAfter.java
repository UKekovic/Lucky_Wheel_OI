package luckywheel_oi.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BeforeAndAfter {
    public WebDriver driver;
    public WebDriverWait wait;

    public String baseUrl;

    @BeforeTest
    public void setUp() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        baseUrl = "https://tocaksrece.infojp.rs/nagradnaigra/";
        driver.get(baseUrl);

    }
    @AfterTest
     public void endTest() {

        driver.quit();
    }
}
