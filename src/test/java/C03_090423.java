import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.Set;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.TestBase;

import java.time.Duration;
import java.util.List;

public class C03_090423 extends TestBase {

    @Test
    public void aykut() { //25-55
        //2) https://www.youtube.com adresine gidin
        //Sayfa başlığının “YouTube” oldugunu test edin
        //=> YouTube resminin görüntülendiğini (isDisplayed()) test edin
        //○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        //○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin






















    }

    @Test
    public void mustafa() { //56-86
        //2. http://automationpractice.com/index.php sayfasina gidelim
        //3. Sign in butonuna basalim
        //4. Email kutusuna @isareti olmayan bir mail yazip enter’a bastigimizda
        // “Invalid email address” uyarisi ciktigini test edelim

























    }

    @Test
    public void kübra() { //89-119
        //● https://www.amazon.com/ adresine gidin.
        //- Test 1
        //Arama kutusunun yanindaki kategori menusundeki kategori sayisinin 45
        //oldugunu test edin

























    }

    @Test
    public void gül() { //122-152
        //● https://www.amazon.com/ adresine gidin.
        //1.Kategori menusunden Books secenegini secin 2. Arama kutusuna Java yazin ve aratin
        //3. Bulunan sonuc sayisini yazdirin
        //4. Sonucun Java kelimesini icerdigini test edin

























    }

    @Test
    public void nihat() throws InterruptedException { //155-205
        //1.http://zero.webappsecurity.com/ Adresine gidin 2. Sign in butonuna basin
        driver.get("http://zero.webappsecurity.com/");
        Thread.sleep(2000);

        driver.findElement(By.id("signin_button")).click();
        Thread.sleep(2000);

        //3. Login kutusuna “username” yazin
       driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");

        //4. Password kutusuna “password.” yazin
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password.");
        Thread.sleep(2000);

        //5. Sign in tusuna basin
        driver.findElement(By.xpath("//*[@value='Sign in']")).click();

        //6. Pay Bills sayfasina gidin
        //7. “Purchase Foreign Currency” tusuna basin
        //8. “Currency” drop down menusunden Eurozone’u secin
        //9. “amount” kutusuna bir sayi girin
        //10.“US Dollars” in secilmedigini test edin
        //11.“Selected currency” butonunu secin
        //12.“Calculate Costs” butonuna basin sonra “purchase” butonuna basin 13.“Foreign currency cash was successfully purchased.” yazisinin ciktigini
        //kontrol edin.





































    }

    @Test
    public void ömer() { //208-238
        //● https://the-internet.herokuapp.com/iframe adresine gidin.
        //○ “An IFrame containing....” textinin erisilebilir oldugunu test edin ve yazdirin konsolda .
        //○Text Box’a “Merhaba Dunya!” yazin.
        //○TextBox’in altinda bulunan “Elemental Selenium”
        // linkini textinin gorunur oldugunu dogrulayin ve konsolda yazdirin.
























    }

    @Test
    public void remziye() { //241-271
        //➢ https://testcenter.techproeducation.com/index.php?page=iframe
        //➢ Ana sayfadaki ‘An iframe with a thin black border:’ metninde ‘black border’ yazisinin oldugunu test edelim
        //➢ Ayrica ‘Applications lists’ yazisinin sayfada oldugunu test edelim
        //➢ Son olarak footer daki ‘Povered By’ yazisini varligini test edilip

























    }

    @Test
    public void sevil() { //274-314
        //1)https://the-internet.herokuapp.com/iframe sitesinegidiniz
        //2) sayfadaki toplam iframe sayısını bulunuz.
        //3) Sayfa basliginda ‘Editor’ yazını içerdiğini test edelim.
        //4) Paragrafdaki yaziyi silelim
        //5) Sonrasinda paragrafa “iframein icindeyim” yazisini yazdıralım
        //6) Alt kısımdaki yazının ‘Elemental Selenium’ yazisini içerdiğini test edeli

































    }

    @Test
    public void hamit() { //317-350
        //● https://testcenter.techproeducation.com/index.php?page=multiple-windows ● Title in ‘Windows’ oldugunu test edin
        //● Click here a tiklayin
        //● Sonra açılan sayfadaki title in ‘New Window’ oldugunu dogrulayin





























    }
}
