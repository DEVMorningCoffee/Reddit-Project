import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Setting extends Setup{

    @Test
    public void openDropDownMenu() throws InterruptedException {
        Thread.sleep(3000);

        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement dropDownMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/reddit-header-large/reddit-header-action-items/header/nav/div[3]/div[2]/shreddit-async-loader/faceplate-dropdown-menu")));
        dropDownMenu.click();
    }

    @Test(priority = 1)
    public void openSettingPage() throws InterruptedException {
        Thread.sleep(1000);

        WebElement settingPage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/shreddit-app/reddit-header-large/reddit-header-action-items/header/nav/div[3]/div[2]/shreddit-async-loader/faceplate-dropdown-menu/div/ul[3]/faceplate-tracker/li/a")));
        settingPage.click();
    }

    @Test(priority = 2)
    public void navigateLinks() throws InterruptedException {
        WebElement accountLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[1]/div/a[1]")));
        accountLink.click();

        for(int i = 0; i < 7; i++){
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.TAB).sendKeys(Keys.RETURN).perform();
        }
        returnToHomeToPage();
    }

}
