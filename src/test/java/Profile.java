import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Profile extends Setup{
    @Test
    public void openDropDownMenu() throws InterruptedException {
        Thread.sleep(3000);

        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement dropDownMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/reddit-header-large/reddit-header-action-items/header/nav/div[3]/div[2]/shreddit-async-loader/faceplate-dropdown-menu")));
        dropDownMenu.click();
    }

    @Test(priority = 1)
    public void openProfilePage() throws InterruptedException {
        Thread.sleep(1000);

        WebElement profilePage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/reddit-header-large/reddit-header-action-items/header/nav/div[3]/div[2]/shreddit-async-loader/faceplate-dropdown-menu/div/ul[1]/faceplate-tracker[1]/li/a")));
        profilePage.click();
    }

    @Test(priority = 2)
    public void navigateLinks() throws InterruptedException {
        WebElement overviewLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/report-flow-provider/div/div[1]/div/main/div[2]/faceplate-tabgroup/a[1]")));
        overviewLink.click();
        Thread.sleep(1000);

        WebElement postsLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/report-flow-provider/div/div[1]/div/main/div[2]/faceplate-tabgroup/a[2]")));
        postsLink.click();
        Thread.sleep(1000);

        WebElement commentsLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/report-flow-provider/div/div[1]/div/main/div[2]/faceplate-tabgroup/a[3]")));
        commentsLink.click();
        Thread.sleep(1000);

        WebElement savedLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/report-flow-provider/div/div[1]/div/main/div[2]/faceplate-tabgroup/a[4]")));
        savedLink.click();
        Thread.sleep(1000);

        WebElement hiddenLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/report-flow-provider/div/div[1]/div/main/div[2]/faceplate-tabgroup/a[5]")));
        hiddenLink.click();
        Thread.sleep(1000);

        WebElement upvotedLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/report-flow-provider/div/div[1]/div/main/div[2]/faceplate-tabgroup/a[6]")));
        upvotedLink.click();
        Thread.sleep(1000);

        WebElement downvotedLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/report-flow-provider/div/div[1]/div/main/div[2]/faceplate-tabgroup/a[7]")));
        downvotedLink.click();
        Thread.sleep(3000);

        returnToHomeToPage();
    }
}
