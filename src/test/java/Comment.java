import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Comment extends Setup {

    @Test
    public void writeAComment() throws InterruptedException {
        Thread.sleep(2000);

        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        Thread.sleep(2000);

        WebElement inputButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/dsa-transparency-modal-provider/report-flow-provider/div/main/shreddit-async-loader[2]/comment-body-header/shreddit-async-loader/comment-composer-host/faceplate-tracker[1]/button")));
        inputButton.click();
        WebElement inputBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main-content\"]/shreddit-async-loader[2]/comment-body-header/shreddit-async-loader/comment-composer-host/faceplate-form/shreddit-composer/div/p")));
        inputBox.sendKeys("Lorem ipsum dolor sit amet, dico viderer mea at, et perpetua accommodare nec. Melius diceret eum eu. Eos diceret feugait fuisset ad, id omnis movet apeirian nec. Ut vix oratio diceret. Dico copiosae hendrerit est in. Prima petentium abhorreant te sed.");

        WebElement submitCommentButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/dsa-transparency-modal-provider/report-flow-provider/div/main/shreddit-async-loader[2]/comment-body-header/shreddit-async-loader/comment-composer-host/faceplate-form/shreddit-composer/button[2]")));
        submitCommentButton.click();
    }

    @Test(priority = 1)
    public void replyToComment() throws InterruptedException {
        Thread.sleep(2000);

        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        Thread.sleep(2000);

        WebElement replyButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/dsa-transparency-modal-provider/report-flow-provider/div/main/div/shreddit-comment-tree/shreddit-comment/shreddit-comment-action-row/faceplate-tracker/button")));
        replyButton.click();
        WebElement inputBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/dsa-transparency-modal-provider/report-flow-provider/div/main/div/shreddit-comment-tree/shreddit-comment/shreddit-comment-action-row/shreddit-async-loader/comment-composer-host/faceplate-form/shreddit-composer/div/p")));
        inputBox.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Nibh sed pulvinar proin gravida hendrerit lectus. Sed egestas egestas fringilla phasellus faucibus scelerisque eleifend donec. Sed risus ultricies tristique nulla aliquet enim");

        WebElement submitCommentButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/dsa-transparency-modal-provider/report-flow-provider/div/main/div/shreddit-comment-tree/shreddit-comment/shreddit-comment-action-row/shreddit-async-loader/comment-composer-host/faceplate-form/shreddit-composer/button[2]")));
        submitCommentButton.click();
    }

    @Test(priority = 2)
    public void saveComment() throws InterruptedException {
        Thread.sleep(2000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        Thread.sleep(2000);

        WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/dsa-transparency-modal-provider/report-flow-provider/div/main/div/shreddit-comment-tree/shreddit-comment/shreddit-comment-action-row/shreddit-overflow-menu")));
        menu.click();
        Thread.sleep(2000);
        menu.sendKeys(Keys.DOWN);
        menu.sendKeys(Keys.RETURN);
    }

    @Test(priority = 3)
    public void removeSaveComment() throws InterruptedException{
        Thread.sleep(2000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        Thread.sleep(2000);

        WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/dsa-transparency-modal-provider/report-flow-provider/div/main/div/shreddit-comment-tree/shreddit-comment/shreddit-comment-action-row/shreddit-overflow-menu")));
        menu.click();
        Thread.sleep(2000);
        menu.sendKeys(Keys.RETURN);
    }

    @Test(priority = 4)
    public void editComment() throws InterruptedException{
        Thread.sleep(2000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        Thread.sleep(2000);

        WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/dsa-transparency-modal-provider/report-flow-provider/div/main/div/shreddit-comment-tree/shreddit-comment/shreddit-comment-action-row/shreddit-overflow-menu")));
        menu.click();
        Thread.sleep(2000);
        menu.sendKeys(Keys.UP);
        menu.sendKeys(Keys.RETURN);

        WebElement inputBox = driver.switchTo().activeElement();
        inputBox.sendKeys(Keys.DELETE);
        inputBox.sendKeys("Integer eget aliquet nibh praesent. Etiam dignissim diam quis enim lobortis scelerisque fermentum dui. Neque laoreet suspendisse interdum consectetur libero id. Dui ut ornare lectus sit amet est.");

        WebElement submitEditCommentButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/dsa-transparency-modal-provider/report-flow-provider/div/main/div/shreddit-comment-tree/shreddit-comment/div[4]/shreddit-async-loader/comment-composer-host/faceplate-form/shreddit-composer/button[2]")));
        submitEditCommentButton.click();
    }

    @Test(priority = 5)
    public void removeComment() throws InterruptedException{
        Thread.sleep(2000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        Thread.sleep(2000);

        WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/dsa-transparency-modal-provider/report-flow-provider/div/main/div/shreddit-comment-tree/shreddit-comment/shreddit-comment-action-row/shreddit-overflow-menu")));
        menu.click();
        Thread.sleep(2000);
        menu.sendKeys(Keys.DOWN);
        menu.sendKeys(Keys.DOWN);
        menu.sendKeys(Keys.RETURN);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB).perform();

        returnToHomeToPage();
    }
}
