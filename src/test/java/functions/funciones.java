package functions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class funciones {

    public void scroll(WebDriver driver, String x, String y)
    {
        // Crear un objeto JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Hacer scroll hacia abajo
        js.executeScript("window.scrollBy("+x, y+");");
    }

}
