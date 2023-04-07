import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_060423 {
    /*
    --Utilities package'da TestBase class'i olusturuldu. Orada ki methodlar incelenip kullanilabilir. 
    --@Test ile Junit Framework'ünde  testlerimizi yapacagiz.
    
     Kurallar:
    ---Lütfen kendi branch'ınızda işiniz tamamlandığında github'a push etmeden önce methodunuz için ayrılan alanın
    taslak class'taki ile uyumlu olup olumadığını kontrol ediniz.
    Alan yeterli değilse alana uygun bir kod yazınız. Alanın artırılması talebinizi team lead'e iletiniz.
    --Methodunuzun içine en üst kısma medhodunuz fonksiyonu hakkında kısa öz bir açıklama yazınız.
    -- pull yaptiktan sonra size verilen alan dogru degilse bos satir silerek yada atlayarak ilgili satira geliniz

    ----GitHub---
    --Master brach'ini pull ediniz.
    --Kendi brach'iza gecip master brach'ini kendi branch'iniaza cekiniz.
    --Kendi branch'inizda calisip,Git add . ve git commit -m"VersiyonAdiniz " yapiniz.
    --Kendi branch'inizi push ediniz.
     */

    @Test
    public void aykutTest() { //22-60
        /*
        1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        2- Add Element butonuna basin
        3. Delete butonu’nun gorunur oldugunu test edin
        4. Delete tusuna basin
        5. “Add/Remove Elements” yazisinin gorunur oldugunu test edin
         */





























    }

    @Test
    public void MustafaTest() { //62-103
        /*
        2- https://www.amazon.com/ adresine gidin 3- Browseri tam sayfa yapin
        4.- Sayfayi “refresh” yapin
        5. Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        6. Gift Cards sekmesine basin
        7. Birthday butonuna basin
        8. Best Seller bolumunden ilk urunu tiklayin
        9. Gift card details’den 25 $’i secin
        10-Urun ucretinin 25$ oldugunu test edin 10-Sayfayi kapatin
         */





























    }

    @Test
    public void nihatTest() { //105-141
        /*
        1.) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        2.) Berlin’i 3 farkli relative locator ile locate edin
        3 ) Relative locator’larin dogru calistigini test edin
         */






























    }

    @Test
    public void gülTest() { //144-185
        /*
        1. https://www.amazon.com/ sayfasina gidelim
        2. arama kutusunu locate edelim
        3. “Samsung headphones” ile arama yapalim
        4. Bulunan sonuc sayisini yazdiralim
        5. Ilk urunu tiklayalim
        6. Sayfadaki tum basliklari yazdiralim
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
        WebElement searchBox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("Samsung headphones", Keys.ENTER);
        String a=driver.findElement(By.xpath("//span[text()='1-16 von 200 Ergebnissen oder Vorschlägen für']")).getText();
        System.out.println(a.split(" ")[2]);
        driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
        System.out.println("Title=" +driver.getTitle());// sayfa basligi
        List<WebElement> h1=driver.findElements(By.xpath("//h1"));//sayfadaki butun h1 basliklari
        // --h2,h3,h4,h5 icin de ayni islem yapilabilir
        for (WebElement webElement : h1) {
            System.out.println(webElement.getText());
        }

        driver.close();
    }
































    @Test
    public void hamitTest() { //187-230
        /*
        1.http://zero.webappsecurity.com sayfasina gidin
        2. Signin buttonuna tiklayin
        3.Loginalanine “username”yazdirin
        4. Password alanine “password” yazdirin
        5. Sign in buttonuna tiklayin
        6. Pay Bills sayfasina gidin
        7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        8. tarih kismina “2020-09-10” yazdirin
        9. Pay buttonuna tiklayin
        10.“The payment was successfully submitted.” mesajinin ciktigini control edin
         */





























    }

    @Test
    public void remziyeTest() { //232-272
        /*
        2- https://www.google.com/ adresine gidin
        3- cookies uyarisini kabul ederek kapatin
        4.Sayfa basliginin “Google” ifadesi icerdigini test edin
        5. Arama cubuguna “Nutella” yazip aratin
        6. Bulunan sonuc sayisini yazdirin
        7. sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        8. Sayfayi kapatin
         */





























    }

    @Test
    public void kübraTest() { //274-316
        /*
        1.“https://www.saucedemo.com” Adresine gidin
        2. Username kutusuna “standard_user” yazdirin
        3. Password kutusuna “secret_sauce” yazdirin
        4. Login tusuna basin
        5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        6. Add to Cart butonuna basin
        7. Alisveris sepetine tiklayin
        8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        9. Sayfayi kapatin
         */





























    }

    @Test
    public void sevilTest() { //318-356
        /*
        a. Verilen web sayfasına gidin.
        https://the-internet.herokuapp.com/checkboxes
        b. Checkbox1 ve checkbox2 elementlerini locate edin.
        c. Checkbox1 seçili değilse onay kutusunu tıklayın
        d. Checkbox2 seçili değilse onay kutusunu tıklayın
         */





























    }

    @Test
    public void ömerTest() { //358-396
        /*
        - https://www.facebook.com adresine gidin
        - Cookies’i kabul edin
        - “Create an Account” button’una basin
        - “radio buttons” elementlerini locate edin
        - Secili degilse cinsiyet butonundan size uygun olani secin
         */





























    }

}

