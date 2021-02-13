package homework15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

public class Homework15WithMethodes {

    private WebDriver driver;

    private ChromeOptions options;

    @BeforeTest
    public void setup(){
        options= new ChromeOptions();
        System.setProperty("webdriver.chrome.driver","/Chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.calculator.net/percent-calculator.html");
    }

    @AfterTest
    public void closedriver(){
        driver.close();
    }

    @Test
    public void returnWorkflow1Result(){

        driver.findElement(By.xpath("//*[@id=\"cpar1\"]")).sendKeys("19");
        driver.findElement(By.xpath("//*[@id=\"cpar2\"]")).sendKeys("35000");
        driver.findElement(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr[2]/td/input[2]")).click();

        String result= driver.findElement(By.className("h2result")).getText();

        Assert.assertEquals(result,"Result: 6650");


    }

    @Test
    public void returnwWorkflow2Result(){

        driver.findElement(By.xpath("//*[@id=\"content\"]/table[5]/tbody/tr[1]/td[2]/input")).sendKeys("4500");
        driver.findElement(By.xpath("//*[@id=\"content\"]/table[5]/tbody/tr[2]/td[2]/input")).sendKeys("3825");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[5]/tbody/tr[3]/td/input[2]")).click();

        String result2= driver.findElement(By.xpath("//*[@id=\"content\"]/p[4]/font/b")).getText();
        Assert.assertEquals(result2,"15%");

    }

    @Test
    public void returnWorkflow3Result(){

        driver.findElement(By.xpath("//*[@id=\"content\"]/table[6]/tbody/tr[1]/td/input[1]")).sendKeys("9000");
        driver.findElement(By.xpath("//*[@id=\"content\"]/table[6]/tbody/tr[1]/td/input[2]")).sendKeys("35");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[6]/tbody/tr[2]/td/input[2]")).click();

        String result3= driver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/font/b")).getText();
        Assert.assertEquals(result3,"12150");
    }

    @Test
    public void returnWorkflow4Result(){
        driver.findElement(By.className("bigtext")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/table[6]/tbody/tr[1]/td/select/option[2]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[6]/tbody/tr[2]/td/input[2]")).click();

        String result4= driver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/font/b")).getText();
        Assert.assertEquals(result4,"5850");
    }

}
