import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Comment extends Post{

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

//    @Test(priority = 1)
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
    public void removeUpVoteComment() throws InterruptedException{
        Thread.sleep(2000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement upVoteButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/dsa-transparency-modal-provider/report-flow-provider/div/main/div/shreddit-comment-tree/shreddit-comment/shreddit-comment-action-row//div/div/span/button[1]")));
        upVoteButton.click();
    }

    @Test(priority = 3)
    public void downVoteComment() throws  InterruptedException{
        Thread.sleep(2000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        System.out.println(By.xpath("/html/body/shreddit-app/dsa-transparency-modal-provider/report-flow-provider/div/main/div/shreddit-comment-tree/shreddit-comment/shreddit-comment-action-row//div/div/span/button[2]"));
        WebElement downVoteButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/dsa-transparency-modal-provider/report-flow-provider/div/main/div/shreddit-comment-tree/shreddit-comment/shreddit-comment-action-row//div/div/span/button[2]")));
        downVoteButton.click();
    }


//    @Test(priority = 3)
    public void editComment() throws InterruptedException{
        Thread.sleep(2000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        Thread.sleep(2000);

        Actions actions = new Actions(driver);

        WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/dsa-transparency-modal-provider/report-flow-provider/div/main/div/shreddit-comment-tree/shreddit-comment/shreddit-comment-action-row/shreddit-overflow-menu")));
        menu.click();

        List<WebElement> menuOptions = driver.findElements(By.xpath("/html/body/shreddit-app/dsa-transparency-modal-provider/report-flow-provider/div/main/div/shreddit-comment-tree/shreddit-comment/shreddit-comment-action-row/shreddit-overflow-menu//faceplate-dropdown-menu/faceplate-menu/faceplate-tracker[1]"));
        menuOptions.get(0).click();

        WebElement editButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/faceplate-dropdown-menu/faceplate-menu/faceplate-tracker[2]/li/div")));
        actions.click(editButton).perform();



        WebElement inputBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/dsa-transparency-modal-provider/report-flow-provider/div/main/div/shreddit-comment-tree/shreddit-comment/shreddit-comment-action-row/shreddit-async-loader/comment-composer-host/faceplate-form/shreddit-composer/div/p")));
        inputBox.clear();
        inputBox.sendKeys("Integer eget aliquet nibh praesent. Etiam dignissim diam quis enim lobortis scelerisque fermentum dui. Neque laoreet suspendisse interdum consectetur libero id. Dui ut ornare lectus sit amet est.");

        WebElement submitEditCommentButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/dsa-transparency-modal-provider/report-flow-provider/div/main/div/shreddit-comment-tree/shreddit-comment/div[4]/shreddit-async-loader/comment-composer-host/faceplate-form/shreddit-composer/button[2]")));
        submitEditCommentButton.click();

        returnHomeToPage();
    }

    //    @Test(priority = 2)
    public void deleteComment() throws InterruptedException {
        Thread.sleep(2000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        Thread.sleep(2000);

        Actions actions = new Actions(driver);

        WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/dsa-transparency-modal-provider/report-flow-provider/div/main/div/shreddit-comment-tree/shreddit-comment/shreddit-comment-action-row/shreddit-overflow-menu")));
        menu.click();

        WebElement deleteCommentButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/dsa-transparency-modal-provider/report-flow-provider/div/main/div/shreddit-comment-tree/shreddit-comment/shreddit-comment/shreddit-comment-action-row/shreddit-overflow-menu//faceplate-dropdown-menu/faceplate-menu/faceplate-tracker[2]")));
        actions.click(deleteCommentButton).perform();

        WebElement submitDeleteCommentButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/shreddit-comment-deletion-modal//faceplate-modal/button[1]")));
        submitDeleteCommentButton.click();
    }

}
