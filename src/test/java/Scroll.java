import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Scroll extends Setup{
    @Test
    public void scrollPage(){
        for(int i=0;i<3000;i++) {
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1)", "");
        }
        returnToHomeToPage();
    }

}
