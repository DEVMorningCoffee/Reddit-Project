import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Account extends Setup{

    @Test
    public void EnterInvalidLoginKey(){
        String email = "Jabraham4849@eagle.fgcu.edu";
        String password = "!d5&B7t4}3mU)Tx2";

        try{
            // Open Log in Window
            driver.findElement(By.id("login-button")).click();

            /*
            When click the login button this prompt an iframe to pop
            resulting on wait for tag become available
            */

            wait = new WebDriverWait(driver, Duration.ofSeconds(2));

            // Wait Until Input become available
            WebElement usernameInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-username")));
            usernameInput.sendKeys(email);
            driver.findElement(By.id("login-password")).sendKeys(password);
            driver.findElement(By.id("login-password")).sendKeys(Keys.RETURN);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void EnterValidLoginKey() throws InterruptedException {
        try{
            String password = "!d5&B7t4}3mU)Tx";
            wait = new WebDriverWait(driver, Duration.ofSeconds(2));

            WebElement passwordInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-password")));
            passwordInput.clear();
            passwordInput.sendKeys(password);
            passwordInput.sendKeys(Keys.RETURN);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        Thread.sleep(5000);
    }

    //    @Test(priority = 2)
    public void sendMessage() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        Thread.sleep(2000);

        WebElement logo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/div/div[2]/reddit-sidebar-nav/nav/left-nav-top-section//div/faceplate-tracker[1]/li/a")));
        logo.click();

        WebElement messageButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("header-action-item-chat-button")));
        messageButton.click();

        WebElement textBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/reddit-header-large/div/div/reddit-chat-host//div/div/div/rs-app//div[2]/rs-room-overlay-manager/rs-room//main/rs-message-composer//form/div/rs-textarea-auto-size/textarea")));
        textBox.sendKeys("Hello Friend");
        textBox.sendKeys(Keys.ENTER);
    }

}
