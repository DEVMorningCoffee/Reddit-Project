import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Scroll extends Account{
    @Test
    public void navigateLinks(){
        for(int i=0;i<6000;i++) {
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1)", "");
        }
    }

}
