import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Community extends Account{
    @Test
    public void searchCommunity() throws InterruptedException{
        for(int i = 1; i < 10; i++){
            Thread.sleep(2000);
            wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//            WebElement post = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/shreddit-app/div/div[1]/div/main/dsa-transparency-modal-provider/report-flow-provider/shreddit-feed/article["+i+"]/shreddit-post/a[1]")));

            WebElement post = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("a")))
            post.click();

            Thread.sleep(2000);
            driver.navigate().back();

//
//            searchBox.sendKeys("TestingForTheWorld");
//            driver.navigate().to("https://www.reddit.com/r/TestingForTheWorld/");
        }

    }

}
