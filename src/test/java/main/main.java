package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import tests.*;


public class main {

    private WebDriver driver;

    public static TimeUnit time;

    String key = "webdriver.chrome.driver";
    String value = "J:\\Intellij\\TareaIF\\chromedriver\\chromedriver.exe";
    String key_url = "https://demoqa.com/resizable";

    @BeforeClass
    public void beforeClass() {
        System.setProperty(key, value);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(key_url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test (priority = 1)
    public void resizeble_Restriction() throws InterruptedException
    {
        TestResizeble resizeble = new TestResizeble();
        resizeble.resizable_rest(driver,"//div[@id='resizableBoxWithRestriction']/span",150,50);
    }

    @Test(priority = 2)
    public void drap ()
    {
        Droppable drp = new Droppable();
        drp.drop(driver);
    }

    @Test(priority = 3)
    public void click ()
    {
        Buttoms clk = new Buttoms();
        clk.clicks(driver);
    }


}


