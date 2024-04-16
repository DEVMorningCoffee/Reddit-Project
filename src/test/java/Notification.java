import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Notification extends Setup{
    @Test
    public void openNotificationWindow() throws InterruptedException {
        Thread.sleep(2000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        WebElement notificationLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/reddit-header-large/reddit-header-action-items/header/nav/div[3]/div[1]/span[4]/click-card/span/faceplate-tracker/faceplate-tooltip/button")));
        notificationLink.click();
    }

    @Test(priority = 1)
    public void seeAllNotification() throws InterruptedException {
        Thread.sleep(2000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(4));

        WebElement notificationLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/reddit-header-large/reddit-header-action-items/header/nav/div[3]/div[1]/span[4]/click-card/div/div/div[3]/faceplate-tracker/a")));
        notificationLink.click();
    }

    @Test(priority = 2)
    public void seeMessage() throws InterruptedException {
        Thread.sleep(2000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(4));

        WebElement notificationLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/div/div[1]/div/main/div/div/div[1]/a")));
        notificationLink.click();

        Thread.sleep(1000);

        returnToHomeToPage();
    }
}
