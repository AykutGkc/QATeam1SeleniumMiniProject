import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_030423 {
    public static void main(String[] args) {
         /*
    Kurallar:
    ---Lütfen kendi branch'ınızda işiniz tamamlandığında github'a push etmeden önce methodunuz için ayrılan alanın
    taslak class'taki ile uyumlu olup olumadığını kontrol ediniz.
    Alan yeterli değilse alana uygun bir kod yazınız. Alanın artırılması talebinizi team lead'e iletiniz.
    --Methodunuzun içine en üst kısma medhodunuz fonksiyonu hakkında kısa öz bir açıklama yazınız.
    -- pull yaptiktan sonra size verilen alan dogru degilse bos satir silerek yada atlayarak ilgili satira geliniz
    ----
    ----
    ----
    ----
    ----GitHub---
    --Master brach'ini pull ediniz.
    --Kendi brach'iza gecip master brach'ini kendi branch'iniaza cekiniz.
    --Kendi branch'inizda calisip,Git add . ve git commit -m"VersiyonAdiniz " yapiniz.
    --Kendi branch'inizi push ediniz.
    ---
    ---

 */




remziyeMethod();

    }
    public static void aykutMethod() {  //30-60
        //Amazon.com sayfasina gidiniz. Nutella aramasi yaptiriniz. Cikan sonuc sayisini konsola yazdiriniz.
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com/");
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Nutella", Keys.ENTER);
        WebElement sonuc= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println("Nutella sonuc sayisi : "+sonuc.getText().split(" ")[2]);







    }

    public static void gulMethod() { //62 - 92
        //Amazon.com sayfasina gidiniz. bike aramasi yaptiriniz. Cikan sonuc sayisini konsola yazdiriniz.

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
        WebElement searchBox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("bike",Keys.ENTER);
        String a=driver.findElement(By.xpath("//span[text()='1-16 von mehr als 100.000 Ergebnissen oder Vorschlägen für']")).getText();
        System.out.println(a.split(" ")[4]);
        driver.close();



























    }

    public static void hamitMethod() { //94-124
        //Amazon.com sayfasina gidiniz. computer aramasi yaptiriniz. Cikan sonuc sayisini konsola yazdiriniz.




























    }


    public static void kubraMethod() throws InterruptedException { //126-156
        //Amazon.com sayfasina gidiniz. laptop aramasi yaptiriniz. Cikan sonuc sayisini konsola yazdiriniz.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
        WebElement searchBox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("laptop",Keys.ENTER);
        Thread.sleep(3000);
        String  result = driver.findElement(By.xpath("//*[text()='1-16 of over 6,000 results for']")).getText().split(" ")[3];
        System.out.println("sonuc sayisi : "+result);
        driver.close();


    }

    public static void sevilMethod() { //158-188
        //Amazon.com sayfasina gidiniz. apple aramasi yaptiriniz. Cikan sonuc sayisini konsola yazdiriniz.




























    }



    public static void mustafaMethod() { //190-220
        //Amazon.com sayfasina gidiniz. samsung aramasi yaptiriniz. Cikan sonuc sayisini konsola yazdiriniz.

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung", Keys.ENTER);
        WebElement result= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String strResutlt= result.getText().split(" ")[3];
        System.out.println("Sonuc sayisi :  " +strResutlt);
        driver.close();















    }

    public static void nihatMethod() { //222-252
        //Amazon.com sayfasina gidiniz. basketball aramasi yaptiriniz. Cikan sonuc sayisini konsola yazdiriniz.




























    }

    public static void omerMethod() { //254-284
        //Amazon.com sayfasina gidiniz. shoes aramasi yaptiriniz. Cikan sonuc sayisini konsola yazdiriniz.




























    }

    public static void remziyeMethod() { //286-316
        //Amazon.com sayfasina gidiniz. mouse aramasi yaptiriniz.
        // Cikan sonuc sayisini konsola yazdiriniz.
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com/");
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Mouse", Keys.ENTER);
        WebElement sonuc= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println("Mouse sonuc sayisi : "+sonuc.getText().split(" ")[0].split("-")[1]);






























    }



}
