import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Post extends Account {


    @Test
    public void createPost() throws InterruptedException {
        Thread.sleep(2000);

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Scroll to the "Load More" btn and make sure it's in the user view

        WebElement createPostLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("create-post")));
        createPostLink.click();

        WebElement chooseCommunity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"AppRouter-main-content\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div/div[1]/input")));
        chooseCommunity.click();
        chooseCommunity.sendKeys("u/AdditionalExercise45");
        chooseCommunity.sendKeys(Keys.ENTER);


        WebElement title = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"AppRouter-main-content\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div/textarea")));
        title.sendKeys("Testing 1");


        driver.findElement(By.xpath("//*[@id=\"AppRouter-main-content\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[2]/div/div/div[1]/div[2]/button")).click();

        WebElement textBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"AppRouter-main-content\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[2]/div/div/div[2]/textarea")));
        textBox.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Malesuada nunc vel risus commodo viverra maecenas accumsan.");

        WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[3]/div[2]/div/div/div[1]/button")));
        submit.click();

//        returnHomeToPage();
    }

//    @Test(priority = 1)
    public void createPostWithOCTag() throws InterruptedException {
        Thread.sleep(2000);

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement createPostLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("create-post")));
        createPostLink.click();

        WebElement chooseCommunity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"AppRouter-main-content\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div/div[1]/input")));
        chooseCommunity.click();
        chooseCommunity.sendKeys("u/AdditionalExercise45");
        chooseCommunity.sendKeys(Keys.ENTER);


        WebElement title = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"AppRouter-main-content\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div/textarea")));
        title.sendKeys("Testing 1");


        driver.findElement(By.xpath("//*[@id=\"AppRouter-main-content\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[2]/div/div/div[1]/div[2]/button")).click();

        WebElement textBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"AppRouter-main-content\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[2]/div/div/div[2]/textarea")));
        textBox.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Malesuada nunc vel risus commodo viverra maecenas accumsan.");

        Actions actions = new Actions(driver);

        WebElement OCTag = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[3]/div[1]/div/button[1]")));
        actions.click(OCTag).perform();

        WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[3]/div[2]/div/div/div[1]/button")));
        submit.click();

        returnHomeToPage();
    }

//    @Test(priority = 2)
    public void createPostWithSpoilerTag() throws InterruptedException {
        Thread.sleep(2000);

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement createPostLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("create-post")));
        createPostLink.click();

        WebElement chooseCommunity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"AppRouter-main-content\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div/div[1]/input")));
        chooseCommunity.click();
        chooseCommunity.sendKeys("u/AdditionalExercise45");
        chooseCommunity.sendKeys(Keys.ENTER);


        WebElement title = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"AppRouter-main-content\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div/textarea")));
        title.sendKeys("Testing 1");


        driver.findElement(By.xpath("//*[@id=\"AppRouter-main-content\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[2]/div/div/div[1]/div[2]/button")).click();

        WebElement textBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"AppRouter-main-content\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[2]/div/div/div[2]/textarea")));
        textBox.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");

        Actions actions = new Actions(driver);

        WebElement SpoilerTag = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[3]/div[1]/div[1]/button[2]")));
        actions.click(SpoilerTag).perform();

        WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[3]/div[2]/div/div/div[1]/button")));
        submit.click();

        returnHomeToPage();
    }

//    @Test(priority = 3)
    public void createPostWithNSFWTag() throws InterruptedException {
        Thread.sleep(2000);

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement createPostLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("create-post")));
        createPostLink.click();

        WebElement chooseCommunity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"AppRouter-main-content\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div/div[1]/input")));
        chooseCommunity.click();
        chooseCommunity.sendKeys("u/AdditionalExercise45");
        chooseCommunity.sendKeys(Keys.ENTER);


        WebElement title = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"AppRouter-main-content\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div/textarea")));
        title.sendKeys("Testing 1");


        driver.findElement(By.xpath("//*[@id=\"AppRouter-main-content\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[2]/div/div/div[1]/div[2]/button")).click();

        WebElement textBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"AppRouter-main-content\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[2]/div/div/div[2]/textarea")));
        textBox.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");

        Actions actions = new Actions(driver);

        WebElement NSFWTag = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[3]/div[1]/div/button[3]")));
        actions.click(NSFWTag).perform();

        WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[3]/div[2]/div/div/div[1]/button")));
        submit.click();
        returnHomeToPage();
    }

//    @Test(priority = 4)
    public void createPostWithAllTag() throws InterruptedException {
        Thread.sleep(2000);

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement createPostLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("create-post")));
        createPostLink.click();

        WebElement chooseCommunity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"AppRouter-main-content\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div/div[1]/input")));
        chooseCommunity.click();
        chooseCommunity.sendKeys("u/AdditionalExercise45");
        chooseCommunity.sendKeys(Keys.ENTER);


        WebElement title = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"AppRouter-main-content\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div/textarea")));
        title.sendKeys("Testing 1");


        driver.findElement(By.xpath("//*[@id=\"AppRouter-main-content\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[2]/div/div/div[1]/div[2]/button")).click();

        WebElement textBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"AppRouter-main-content\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[2]/div/div/div[2]/textarea")));
        textBox.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");

        Actions actions = new Actions(driver);

        WebElement OCTag = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[3]/div[1]/div/button[1]")));
        WebElement SpoilerTag = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[3]/div[1]/div[1]/button[2]")));
        WebElement NSFWTag = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[3]/div[1]/div/button[3]")));

        actions.click(OCTag).perform();
        actions.click(SpoilerTag).perform();
        actions.click(NSFWTag).perform();

        WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[3]/div[2]/div/div/div[1]/button")));
        submit.click();
    }


}
