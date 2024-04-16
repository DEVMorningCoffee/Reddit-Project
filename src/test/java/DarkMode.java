import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class DarkMode extends Setup{

    @Test
    public void openDropDownMenu() throws InterruptedException {
        Thread.sleep(3000);

        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement dropDownMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/reddit-header-large/reddit-header-action-items/header/nav/div[3]/div[2]/shreddit-async-loader/faceplate-dropdown-menu")));
        dropDownMenu.click();
    }

    @Test(priority = 1)
    public void toogleDarkModeOn() throws InterruptedException{
        Thread.sleep(1000);

        WebElement darkModeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/reddit-header-large/reddit-header-action-items/header/nav/div[3]/div[2]/shreddit-async-loader/faceplate-dropdown-menu/div/ul[1]/shreddit-darkmode-setter/faceplate-tracker/li/div")));
        darkModeButton.click();
    }

    @Test(priority = 2)
    public void toogleDarkModeOff() throws InterruptedException{
        Thread.sleep(1000);

        WebElement darkModeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/reddit-header-large/reddit-header-action-items/header/nav/div[3]/div[2]/shreddit-async-loader/faceplate-dropdown-menu/div/ul[1]/shreddit-darkmode-setter/faceplate-tracker/li/div")));
        darkModeButton.click();

        returnToHomeToPage();
    }
}
