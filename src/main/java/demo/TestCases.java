package demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import java.util.logging.Level;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");

        WebDriverManager.chromedriver().timeout(30).setup();
        ChromeOptions options = new ChromeOptions();
        LoggingPreferences logs = new LoggingPreferences();

        // Set log level and type
        logs.enable(LogType.BROWSER, Level.ALL);
        logs.enable(LogType.DRIVER, Level.ALL);
        options.setCapability("goog:loggingPrefs", logs);

        // Set path for log file
        System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "chromedriver.log");

        driver = new ChromeDriver(options);

        // Set browser to maximize and wait
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01(){
        try{
            System.out.println("Start Test case: testCase01");
            driver.get("https://leetcode.com/");
            if(driver.getCurrentUrl().contains("leetcode")){
                System.out.println("URL contains Leetcode");
            }
            else{
                System.out.println("Incorrect URL");
            }
            System.out.println("End Test case: testCase01");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void testCase02(){
        try{
            System.out.println("Start Test case: testCase02");
            // Click on the "Questions" link on the Leetcode homepage.
            WebElement problemSet = driver.findElement(By.linkText("View Questions"));
            problemSet.click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.urlContains("problemset"));
            // Verify that you are on the problem set page, by checking the URL contains "problemset"
            if(driver.getCurrentUrl().contains("problemset")){
                System.out.println("URL contains 'problemset'");
            }
            else{
                System.out.println("Incorrect URL");
            }
            // Retrieve the details of the first 5 questions and print them.
            for(int i=1;i<=5;i++){
                WebElement problem = driver.findElement(By.xpath("//a[@id='"+i+"']//div[contains(@class,'text-body')]"));
                String problemName = problem.getText().substring(3);
                problem.click();
                String title = driver.getTitle();
                if(title.contains(problemName)){
                    System.out.println("Problem "+i+" opened!");
                }
                driver.navigate().back();
                wait.until(ExpectedConditions.urlContains("problemset"));
            }
            Thread.sleep(2000);
            System.out.println("End Test case: testCase02");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }


    public void testCase03(){
        try{
            System.out.println("Start Test case: testCase03");
            WebElement problem = driver.findElement(By.xpath(
                    "//a[@id='1']"));
            problem.click();
            if(driver.getCurrentUrl().contains("two-sum")){
                System.out.println("The URL of the problem contains \"two-sum\"");
            }
            System.out.println("End Test case: testCase03");
            Thread.sleep(1500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void testCase04(){
        try{
            System.out.println("Start Test case: testCase04");
            WebElement submissions = driver.findElement(By.xpath(
                    "//div[contains(@class,'normal') and contains(text(),'Submissions')]"));
            submissions.click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//a[contains(@href,'/accounts/login/?next=" +
                            "%2Fproblems%2Ftwo-sum%2Fsubmissions%2F')]")
            ));

            String actualText = message.getText().trim();


            if (actualText.equals("Register or Login") || actualText.equals("Register or Log in")) {
                System.out.println("'Register or Login' is displayed." );
            } else {
                System.out.println("Text mismatch. Found: " + actualText);
            }
            Thread.sleep(3000);
            System.out.println("End Test case: testCase04");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
