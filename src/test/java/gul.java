import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class gul extends TestBase {
    @Test
    public void test(){
        driver.get("https://www.amazon.com/ ");
        WebElement ddmlocate=driver.findElement(By.id("searchDropdownBox"));
        ddmVisibletext(ddmlocate,"Bücher");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java", Keys.ENTER);
        String sonucyazisi= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
        System.out.println(sonucyazisi);
        Assert.assertTrue(sonucyazisi.contains("Java"));

        //● https://www.amazon.com/ adresine gidin.
        //1.Kategori menusunden Books secenegini secin
        // 2. Arama kutusuna Java yazin ve aratin
        //3. Bulunan sonuc sayisini yazdirin
        //4. Sonucun Java kelimesini icerdigini test edin

    }
}
