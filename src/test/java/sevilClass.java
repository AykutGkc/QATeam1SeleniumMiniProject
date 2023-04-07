import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class sevilClass {

    @Test
    public void sevilTest() throws InterruptedException { //318-356
        /*
        a. Verilen web sayfasına gidin.
        https://the-internet.herokuapp.com/checkboxes
        b. Checkbox1 ve checkbox2 elementlerini locate edin.
        c. Checkbox1 seçili değilse onay kutusunu tıklayın
        d. Checkbox2 seçili değilse onay kutusunu tıklayın
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        Thread.sleep(3000);
        WebElement checkout1 = driver.findElement(By.xpath("// input [@type='checkbox'][1]"));
        WebElement checkout2 = driver.findElement(By.xpath("// input [@type='checkbox'][2]"));
        if (!checkout1.isSelected()) {
            checkout1.click();
        }
        if (!checkout2.isSelected()) {
            checkout2.click();
        }
    }
}