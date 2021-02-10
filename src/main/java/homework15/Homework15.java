package homework15;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Homework15 {

    private WebDriver driver;

    private ChromeOptions options;


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Chromedriver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.calculator.net/percent-calculator.html");

        // first workflow- need to create find methode
        driver.findElement(By.xpath("//*[@id=\"cpar1\"]")).sendKeys("19");
        driver.findElement(By.xpath("//*[@id=\"cpar2\"]")).sendKeys("35000");
        driver.findElement(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr[2]/td/input[2]")).click();

       String result= driver.findElement(By.className("h2result")).getText();

        Assert.assertEquals(result,"Result: 6650");

        // second workflow - need to create methode
        driver.findElement(By.xpath("//*[@id=\"content\"]/table[5]/tbody/tr[1]/td[2]/input")).sendKeys("4500");
        driver.findElement(By.xpath("//*[@id=\"content\"]/table[5]/tbody/tr[2]/td[2]/input")).sendKeys("3825");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[5]/tbody/tr[3]/td/input[2]")).click();

        String result2= driver.findElement(By.xpath("//*[@id=\"content\"]/p[4]/font/b")).getText();
        Assert.assertEquals(result2,"15%");

        // third workflow - need to create methode

        driver.findElement(By.xpath("//*[@id=\"content\"]/table[6]/tbody/tr[1]/td/input[1]")).sendKeys("9000");
        driver.findElement(By.xpath("//*[@id=\"content\"]/table[6]/tbody/tr[1]/td/input[2]")).sendKeys("35");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[6]/tbody/tr[2]/td/input[2]")).click();

        String result3= driver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/font/b")).getText();
        Assert.assertEquals(result3,"12150");

        // forth workflow - need to create methode

        driver.findElement(By.className("bigtext")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/table[6]/tbody/tr[1]/td/select/option[2]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[6]/tbody/tr[2]/td/input[2]")).click();

        String result4= driver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/font/b")).getText();
        Assert.assertEquals(result4,"5850");

        driver.quit();

    }


}
