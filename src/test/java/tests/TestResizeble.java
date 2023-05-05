package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestResizeble {

    public void resizable_rest(WebDriver driver, String id_resizeableElement, int xOffset, int yOffset)
    {
        WebElement resizeableElement = driver.findElement(By.xpath(id_resizeableElement));
        Actions act = new Actions(driver);
        act.clickAndHold(resizeableElement).moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public void resizable(WebDriver driver, String id_resizeableElement, int xOffset, int yOffset)
    {
        WebElement resizeableElement = driver.findElement(By.xpath(id_resizeableElement));
        Actions act = new Actions(driver);
        act.clickAndHold(resizeableElement).moveByOffset(xOffset, yOffset).release().build().perform();
    }
}
