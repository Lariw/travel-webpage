import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchHotelTest {


    @Test
    public void searchHotel() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://www.kurs-selenium.pl/demo/");
        driver.findElement(By.xpath("//span[text()='Search by Hotel or City Name']")).click();
        WebElement inputSearch = driver.findElement(By.cssSelector("#select2-drop > div > .select2-input"));
        inputSearch.sendKeys("Dubai");
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[@class='select2-match' and text()='Dubai']")).click();

        // testing select date by typing

        driver.findElement(By.cssSelector("input[name='checkin']")).sendKeys("25/12/2025");
        driver.findElement(By.cssSelector("input[name='checkout']")).sendKeys("30/12/2025");
        driver.findElement(By.cssSelector("input[name='travellers']")).sendKeys("2");
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-block.btn-primary.pfb0.loader")).click();


        //testing select date by choosing

        driver.get("http://www.kurs-selenium.pl/demo/");
        driver.findElement(By.cssSelector("input[name='checkin']")).click();
        driver.findElement(By.xpath("/html/body/div[9]/div[1]/table/tbody/tr[5]/td[1]")).click();
        driver.findElement(By.xpath("/html/body/div[10]/div[1]/table/tbody/tr[5]/td[3]")).click();
        driver.findElement(By.cssSelector("input[name='travellers']")).click();
        driver.findElement(By.id("adultMinusBtn")).click();
        driver.findElement(By.id("adultPlusBtn")).click();
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-block.btn-primary.pfb0.loader")).click();






    }



}
