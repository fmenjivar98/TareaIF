package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

    public void drop (WebDriver driver){
        driver.get("https://demoqa.com/droppable");
        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));

        Actions act = new Actions(driver);
        act.clickAndHold(drag)
                .moveToElement(drop)
                .release(drop)
                .build()
                .perform();


        //act.dragAndDrop(drag,drop).build().perform();

    }



}
