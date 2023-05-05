package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Buttoms {

    public void clicks (WebDriver driver){
        driver.get("https://demoqa.com/buttons");
        WebElement double_click = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
        WebElement right_click = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
        WebElement click = driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/button"));

        Actions act = new Actions(driver);

        act.doubleClick(double_click).build().perform();
        act.contextClick(right_click).build().perform();
        click.click();



      /*  Actions act = new Actions(driver);
        act.doubleClick(double_click).perform();
        act.contextClick(right_click).perform();
        */

        //act.dragAndDrop(drag,drop).build().perform();

    }

}
