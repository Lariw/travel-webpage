import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SignUpTest {


    @Test
    public void signUp() {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://www.kurs-selenium.pl/demo/");

        driver.findElements(By.cssSelector("#li_myaccount > a"))
                .stream()
                .filter(WebElement::isDisplayed)
                .findFirst()
                .ifPresent(WebElement::click);

        driver.findElements(By.cssSelector("#li_myaccount > ul > li:nth-child(2) > a"))
                .stream()
                .filter(WebElement::isDisplayed)
                .findFirst()
                .ifPresent(WebElement::click);


        //fill the register form

    driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("first");
    driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("lastname");
    driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("956345345");
    driver.findElement(By.cssSelector("input[name='email']")).sendKeys("example@mail.com");
    driver.findElement(By.cssSelector("input[name='password']")).sendKeys("examplePassword");
    driver.findElement(By.cssSelector("input[name='confirmpassword']")).sendKeys("examplePassword");
    driver.findElement(By.cssSelector(".form-group > button")).click();






    }



}
