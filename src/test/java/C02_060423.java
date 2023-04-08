import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration; import java.util.List;
import java.util.Arrays;

public class C02_060423 extends TestBase {
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

//
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        // 3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
//        4.- Sayfayi “refresh” yapin
      driver.navigate().refresh();
//        5. Sayfa basliginin “Spend less” ifadesi icerdigini test edin
      boolean title=  driver.getTitle().contains("Spend less");
        Assert.assertTrue(title);
      //        6. Gift Cards sekmesine basin
        driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]")).click();
//        7. Birthday butonuna basin
        driver.findElement(By.xpath("//img[@alt='Birthday']")).click();
//        8. Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//span[@class='a-truncate a-size-base'])[1]")).click();
//        9. Gift card details’den 25 $’i secin
        driver.findElement(By.xpath("//button[@id='gc-mini-picker-amount-1']")).click();
//        10-Urun ucretinin 25$ oldugunu test edin 10-Sayfayi kapatin
        String price=   driver.findElement(By.xpath("//*[@id='gc-live-preview-amount']")).getText();
        Assert.assertTrue(price.contains("$25"));
        driver.close();












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
    /*      1- https://www.google.com/ adresine gidin
            2- cookies uyarisini kabul ederek kapatin
            3.Sayfa basliginin “Google” ifadesi icerdigini test edin
            4. Arama cubuguna “Nutella” yazip aratin
            5. Bulunan sonuc sayisini yazdirin
            6. sonuc sayisinin 10 milyon’dan fazla oldugunu test edin

            */

            //      1- https://www.google.com/ adresine gidin
            driver.get("https://www.google.com/");
            //      2- cookies uyarisini kabul ederek kapatin
            driver.findElement(By.xpath("//*[text()='Alle ablehnen']")).click();
            //      3.Sayfa basliginin “Google” ifadesi icerdigini test edin
            String actualTitle = driver.getTitle();
            Assert.assertTrue(actualTitle.contains("Google"));
            //       4. Arama cubuguna “Nutella” yazip aratin
            WebElement aramaKutusu = driver.findElement(By.xpath("//*[@name ='q']"));
            aramaKutusu.sendKeys("nutella" + Keys.ENTER);
            //     5. Bulunan sonuc sayisini yazdirin
            String sonucYazisi = driver.
                    findElement(By.xpath("//div[@id ='result-stats']")).getText();
            System.out.println("sonucYazisi = " + sonucYazisi);

//       6. sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
            sonucYazisi = sonucYazisi.split(" ")[1];
            sonucYazisi = sonucYazisi.replaceAll("\\D", "");
            System.out.println("noktasiz String sonuc" + sonucYazisi);//noktalar sorun olusturur karsilastirmada yokettik
            int sonuc = Integer.parseInt(sonucYazisi);
            System.out.println("int'e dönusmus sonuc; " + sonuc);
            Assert.assertTrue(sonuc > 10000000);

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

