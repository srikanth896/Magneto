package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Steps {
    public WebDriver driver;
    @Given("I launched the Chrome browser")
     public void i_launched_the_chrome_browser() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

}
    @Given("Navigated to Software testing url")
    public void navigated_to_software_testing_url() {
        driver.get("https://magento.softwaretestingboard.com/");

    }
    @When("I clicked on SignIn button")
    public void i_clicked_on_sign_in_button() throws InterruptedException {
       driver.findElement(By.xpath("(//li[@data-label='or']//a)[1]")).click();
       Thread.sleep(3000);

    }
    @When("I clicked on Account create")
    public void i_clicked_on_account_create() {
        driver.findElement(By.xpath("//a[contains(@class,'action create')]")).click();

    }
    @When("I Entered First Name")
    public void i_entered_first_name() {
       driver.findElement(By.xpath("(//input[@class='input-text required-entry'])[1]")).sendKeys("Srikanth");
    }
    @When("I Entered Last Name")
    public void i_entered_last_name() {
        driver.findElement(By.xpath("(//input[@class='input-text required-entry'])[2]")).sendKeys("Puli");

    }
    @When("I Entered the Email")
    public void i_entered_the_email() {
        driver.findElement(By.xpath("(//input[@class='input-text'])[2]")).sendKeys("psrikanth896@gmail.com");
    }
    @When("I Entered the Password")
    public void i_entered_the_password() {
        driver.findElement(By.xpath("(//input[@class='input-text'])[3]")).sendKeys("Sri@1234");
    }
    @When("I Entered the Confirm Password")
    public void i_entered_the_confirm_password() {
        driver.findElement(By.xpath("//input[@title='Confirm Password']")).sendKeys("Sri@1234");
    }
    @When("I click on Create an Account button")
    public void i_click_on_create_an_account_button() {
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    }
    @Then("Home Page of the  application is successfully opened")
    public void home_page_of_the_application_is_successfully_opened() {

    }
    @When("I click on Sign In button")
    public void I_click_on_Sign_button() {
        driver.findElement(By.xpath("(//button[@id='send2'])[1]")).click();
    }
    }
