package TestIUA;

import LoginSite.LogicTest;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

    public class TestLogic {
    public static WebDriver driver;
    public static LogicTest logicTest;

    @BeforeClass
    public static void SetUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ponycorn\\source\\repos\\MySQL\\MySQL\\bin\\Debug\\chromedriver.exe");
        driver = new ChromeDriver();
        logicTest = new LogicTest(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.i.ua");
    }


    @Test
    public void Login() {
        logicTest.Login();

            Assert.assertEquals(logicTest.UserName, logicTest.CheckUser());
        }

    }




