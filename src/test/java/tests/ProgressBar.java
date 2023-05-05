package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProgressBar {

    public void progess(WebDriver driver, int final_value)

    {
        driver.get("https://demoqa.com/progress-bar");

        WebElement star = driver.findElement(By.id("startStopButton"));
        star.click();

        WebElement bar = driver.findElement(By.xpath("//div[@role='progressbar']"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        boolean isFinish = wait.until(ExpectedConditions.attributeToBe(bar,"aria-valuenow","100"));
        if (isFinish == true){
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("resetButton"))).click();
        }

    }
}
