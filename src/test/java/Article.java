import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import java.time.Duration;

public class Article extends Setup{

    @Test
    public void openArticles() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(4));

        String[] articleLinks = {"/html/body/shreddit-app/div/div[1]/div/main/dsa-transparency-modal-provider/report-flow-provider/shreddit-feed/article[1]/shreddit-post/a[1]",
                "/html/body/shreddit-app/div/div[1]/div/main/dsa-transparency-modal-provider/report-flow-provider/shreddit-feed/article[2]/shreddit-post/a[1]",
                "/html/body/shreddit-app/div/div[1]/div/main/dsa-transparency-modal-provider/report-flow-provider/shreddit-feed/article[3]/shreddit-post/a[1]",
                "/html/body/shreddit-app/div/div[1]/div/main/dsa-transparency-modal-provider/report-flow-provider/shreddit-feed/article[4]/shreddit-post/a[1]"};

        Actions actions = new Actions(driver);

        for(String article: articleLinks){
            WebElement articleLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(article)));
            actions.moveToElement(articleLink).perform();
            Thread.sleep(1000);
            articleLink.click();

            // Scroll
            for(int i=0;i<2000;i++) {
                ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1)", "");
            }

            returnToHomeToPage();
        }
    }

    @Test(priority = 1)
    public void saveArticle() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(4));

        Thread.sleep(2000);

        WebElement articleLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/div/div[1]/div/main/dsa-transparency-modal-provider/report-flow-provider/shreddit-feed/article[1]/shreddit-post/a[1]")));
        Actions actions = new Actions(driver);
        actions.moveToElement(articleLink);

        WebElement dropDownMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/div/div[1]/div/main/dsa-transparency-modal-provider/report-flow-provider/shreddit-feed/article[1]/shreddit-post/span/span[2]/shreddit-async-loader/shreddit-post-overflow-menu")));
        dropDownMenu.click();

        actions.sendKeys(Keys.DOWN);
        actions.sendKeys(Keys.RETURN);
        actions.perform();
    }

    @Test(priority = 2)
    public void removeSaveArticle() throws InterruptedException {
        Thread.sleep(2000);

        WebElement articleLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/div/div[1]/div/main/dsa-transparency-modal-provider/report-flow-provider/shreddit-feed/article[1]/shreddit-post/a[1]")));
        Actions actions = new Actions(driver);
        actions.moveToElement(articleLink);

        WebElement dropDownMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/div/div[1]/div/main/dsa-transparency-modal-provider/report-flow-provider/shreddit-feed/article[1]/shreddit-post/span/span[2]/shreddit-async-loader/shreddit-post-overflow-menu")));
        dropDownMenu.click();

        actions.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN).perform();
    }

    @Test(priority = 3)
    public void hideArticle() throws InterruptedException {
        Thread.sleep(2000);

        WebElement articleLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/div/div[1]/div/main/dsa-transparency-modal-provider/report-flow-provider/shreddit-feed/article[1]/shreddit-post/a[1]")));
        Actions actions = new Actions(driver);
        actions.moveToElement(articleLink);

        WebElement dropDownMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/div/div[1]/div/main/dsa-transparency-modal-provider/report-flow-provider/shreddit-feed/article[1]/shreddit-post/span/span[2]/shreddit-async-loader/shreddit-post-overflow-menu")));
        dropDownMenu.click();

        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.RETURN).perform();

        returnToHomeToPage();
    }

}
