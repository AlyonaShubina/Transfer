import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Transfer {

    By debitCard = By.xpath("//input[@data-qa-node='numberdebitSource']");
    By expireDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
    By cvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
    By firstName = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
    By lastName = By.xpath("//input[@data-qa-node='lastNamedebitSource']");
    By numberreceiver = By.xpath("//input[@data-qa-node='numberreceiver']");
    By firstNamereceiver = By.xpath("//input[@data-qa-node='firstNamerecevier']");
    By lastNamerecevier = By.xpath("//input[@data-qa-node='lastNamerecevier']");
    By amount = By.xpath("//input[@data-qa-node='amount']");
    By currency = By.xpath("//button[@data-qa-value='USD']");
    By submitButton = By.xpath("//button[@type='submit']");


    @Test
    public void Transfer() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://next.privat24.ua/money-transfer/card");
        driver.findElement(debitCard).sendKeys("4404159115449003");
        driver.findElement(expireDate).sendKeys("1224");
        driver.findElement(cvv).sendKeys("123");
        Thread.sleep(3000);
        driver.findElement(firstName).sendKeys("Philip");
        driver.findElement(lastName).sendKeys("McCauley");
        driver.findElement(numberreceiver).sendKeys("4003085373767854");
        driver.findElement(firstNamereceiver).sendKeys("Marianne");
        driver.findElement(lastNamerecevier).sendKeys("Washington");
        driver.findElement(amount).sendKeys("10");
        driver.findElement(currency).sendKeys("USD");
        driver.findElement(submitButton).submit();


    }
}


