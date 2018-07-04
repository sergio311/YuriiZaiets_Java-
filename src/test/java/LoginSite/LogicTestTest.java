package LoginSite;

import LoginSite.LogicTest;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

 class TestIUA {
    public static WebDriver driver;
    public static LogicTest logicTest;

    @BeforeClass
    public static void SetUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        logicTest = new LogicTest(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.i.ua");
    }

    @Test
    public void Login() {
        logicTest.Login();
    }

    @Test
    public void CheckName() {
        Assert.assertEquals(logicTest.UserName, logicTest.CheckUser());
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }


}