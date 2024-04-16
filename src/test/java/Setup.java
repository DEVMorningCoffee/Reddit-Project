import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Setup {
    private final String APP_URL = "https://www.reddit.com";
    public static WebDriver driver;
    public WebDriverWait wait;

    public void returnToHomeToPage(){
        driver.navigate().to("https://www.reddit.com");
    }

    @BeforeSuite
    public void launchBrowser(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");

        System.out.println("Launching Browser");
        driver = new ChromeDriver(chromeOptions);
        driver.get(APP_URL);
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void closeBrowser(){
        driver.quit();
    }
}
