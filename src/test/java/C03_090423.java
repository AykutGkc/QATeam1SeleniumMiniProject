import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
        driver.get("https://www.youtube.com");
        //Sayfa başlığının “YouTube” oldugunu test edin
        String youtubeTitle=driver.getTitle();
        Assert.assertTrue(youtubeTitle.contains("YouTube"));
        //=> YouTube resminin görüntülendiğini (isDisplayed()) test edin
        waitWithThreadSleep(3);
        WebElement cookiesAccept= driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape yt-spec-touch-feedback-shape--touch-response-inverse'])[2]"));
        cookiesAccept.click();

        WebElement youtubeLogo=driver.findElement(By.xpath("(//a[@class='yt-simple-endpoint style-scope ytd-topbar-logo-renderer'])[1]"));
        Assert.assertTrue(youtubeLogo.isDisplayed());

        //○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        WebElement searchBox=driver.findElement(By.xpath("//input[@id='search']"));
        Assert.assertTrue(searchBox.isEnabled());
        //○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
        Assert.assertFalse(youtubeTitle.contains("youtube"));











    }


    @Test
   public void mustafa() { //56-86
        //automationexercise.com test 2 login true information
        //    2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        WebElement mainManuLogo = driver.findElement(By.xpath("//div[@class='logo pull-left']"));
        Assert.assertTrue(mainManuLogo.isDisplayed());
        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();

        //5. Verify 'Login to your account' is visible
        WebElement loginText = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        Assert.assertTrue(loginText.isDisplayed());
        //6. Enter correct email address and password
        driver.findElement(By.xpath("//*[@type='email']")).sendKeys("a912@gmail.com");
        waitWithThreadSleep(2);
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("12345");
      waitWithThreadSleep(2);
        //7. Click 'login' button
        driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();

        //8. Verify that 'Logged in as username' is visible
        WebElement loggedText = driver.findElement(By.xpath("(//a)[11]"));
        String StrLoggedText = loggedText.getText();
        String expectedText = "Logged in as Ali";
        Assert.assertTrue(StrLoggedText.contains(expectedText));
        Assert.assertTrue(loggedText.isDisplayed());


    }

    @Test
    public void kübra() { //89-119
        //● https://www.amazon.com/ adresine gidin.
        //- Test 1
        //Arama kutusunun yanindaki kategori menusundeki kategori sayisinin 45
        //oldugunu test edin
        driver.get("https://www.amazon.com/");
        WebElement dropDown = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
        Select select = new Select(dropDown);
        List<WebElement> kategoriList = select.getOptions();
        int actualList = kategoriList.size();
        int expectedList=45;
        Assert.assertEquals(expectedList,actualList);
























    }

    @Test
    public void gül() { //122-152
        //● https://www.amazon.com/ adresine gidin.
        //1.Kategori menusunden Books secenegini secin
        // 2. Arama kutusuna Java yazin ve aratin
        //3. Bulunan sonuc sayisini yazdirin
        //4. Sonucun Java kelimesini icerdigini test edin
        driver.get("https://www.amazon.com/ ");
        WebElement ddmlocate=driver.findElement(By.id("searchDropdownBox"));
        ddmVisibletext(ddmlocate,"Bücher");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java", Keys.ENTER);
        String sonucyazisi= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
        System.out.println(sonucyazisi);
        Assert.assertTrue(sonucyazisi.contains("Java"));











    }

    @Test
    public void nihat() throws InterruptedException { //155-205
        //1.http://zero.webappsecurity.com/ Adresine gidin 2. Sign in butonuna basin
        driver.get("http://zero.webappsecurity.com/");
        Thread.sleep(2000);

        driver.findElement(By.id("signin_button")).click();
        Thread.sleep(2000);

        //3. Login kutusuna “username” yazin
       driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("usernamee");

        //4. Password kutusuna “password.” yazin
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password..");
        Thread.sleep(2000);

        //5. Sign in tusuna basin
        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();


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
        //➢ Ana sayfadaki ‘An iframe with a thin black border:’ metninde ‘black
        // border’ yazisinin oldugunu test edelim
        //➢ Ayrica ‘Applications lists’ yazisinin sayfada oldugunu test edelim
        //➢ Son olarak footer daki ‘Povered By’ yazisini varligini test edilip


        //➢ https://testcenter.techproeducation.com/index.php?page=iframe
driver.get("https://testcenter.techproeducation.com/index.php?page=iframe");

        //➢ Ana sayfadaki ‘An iframe with a thin black border:’ metninde ‘black
        // border’ yazisinin oldugunu test edelim
String actualText=driver.findElement(By.xpath
  ("//p[text() = 'An iframe with a thin black border:']")).getText();
String expected = "black border";
Assert.assertTrue(actualText.contains(expected));

        //➢ Ayrica ‘Applications lists’ yazisinin sayfada oldugunu test edelim
driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
String actualText2=driver.findElement
        (By.cssSelector("h1[class='display-5 fw-bold']")).getText();
String expected2="Applications lists";
Assert.assertEquals(expected2,actualText2);

//➢ Son olarak footer daki ‘Povered By’ yazisini varligini test edilip
        driver.switchTo().defaultContent();
        WebElement poveredByYazisi = driver.findElement(By.xpath("//*[text()='Povered By']"));
        Assert.assertTrue(poveredByYazisi.getText().contains("Povered By"));
    }

    @Test
    public void sevil() { //274-314
        //1)https://the-internet.herokuapp.com/iframe sitesinegidiniz
        //2) sayfadaki toplam iframe sayısını bulunuz.
        //3) Sayfa basliginda ‘’ yazını içerdiğini test edelim.
        //4) Paragrafdaki yaziyi silelim
        //5) Sonrasinda paragrafa “iframein icindeyim” yazisini yazdıralım
        //6) Alt kısımdaki yazının ‘Elemental Selenium’ yazisini içerdiğini test edeli



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement element= driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(element);
        WebElement editor=driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
        String editorYazisi=editor.getText();
        System.out.println(editorYazisi);
      //  Assert.assertTrue(editorYazisi.contains("Editor"));


    //    WebElement textiSil=driver.findElement(By.xpath(("//p[text()='Your content goes here.']")));

    editor.clear();

    editor.sendKeys("iframein icindeyim");

driver.switchTo().defaultContent();









    }

    @Test
    public void hamit() { //317-350
        //● https://testcenter.techproeducation.com/index.php?page=multiple-windows ● Title in ‘Windows’ oldugunu test edin
        //● Click here a tiklayin
        //● Sonra açılan sayfadaki title in ‘New Window’ oldugunu dogrulayin





























    }
}
