

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

public class TaslakClass {

    /*
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


    static Scanner input = new Scanner(System.in);
    static WebDriver chromeDriver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

    //static WebDriver edgeDriver =  new EdgeDriver();
    public static void main(String[] args) throws InterruptedException {

        System.out.println("QA01 SELENIM PROJE ÇALIŞMA SAYFASI");
        System.out.println("\n1- Aykut" +
                "\n2- Gül" +
                "\n3- Hamit" +
                "\n4- Kübra" +
                "\n5- Mehmet" +
                "\n6- Mustafa" +
                "\n7- Nihat" +
                "\n8- Ömer" +
                "\n9- Remziye" +
                "\n10- Sevil");
        System.out.println("Tercihiniz...");
        String tercih = input.next();

        switch (tercih) {

            case "1":
                aykutMethod(); //
                break;
            case "2":
                gulMethod(); //
                break;
            case "3":
                hamitMethod(); //
                break;
            case "4":
                kubraMethod(); //
                break;
            case "5":
                sevilMethod();
                break;
            case "6":
                mustafaMethod(); //
                break;
            case "7":
                nihatMethod(); //
                break;
            case "8":
                omerMethod(); //
                break;
            case "9":
                remziyeMethod(); //
                break;
            case "0":
                break;
            default:
                System.out.println("Hatali giris");
        }


    }


    public static void aykutMethod() {  //90-110
        System.out.println("aykut01");


















    }

    public static void gulMethod() { //112 -132

        System.out.println("gul'un kodlari");
        chromeDriver.getWindowHandles();



















    }

    public static void hamitMethod() { //134-154



















    }

    public static void kubraMethod() { //156-176
        System.out.println("Kübra");















    }

    public static void sevilMethod() { //178-198




















    }
    public static void mustafaMethod() throws InterruptedException { //200-220
    //youtube'a gider, cookies'i geçer, ana ekrana ulaşır
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        chromeDriver.get("https://youtube.com/watch?v");
        Thread.sleep(2000);
        chromeDriver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[12]")).click();













    }

    public static void nihatMethod() { //222-242
        System.out.println(" v nihat");
        System.out.println(" v2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");














    }
    public static void omerMethod() { //243-263















    }



    public static void remziyeMethod() { //265-285
        //https://www.bestbuy.com adresine gidin.
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        chromeDriver.get("https://www.bestbuy.com ");

        //sayfada kac adet buton bulundugunu yazdirin
        List<WebElement> butonListesi = chromeDriver.findElements(By.tagName("button"));
        System.out.println(butonListesi.size());//listenin size'ini aldim

        //sayfa da ki herbir buton üzerinde ki yazilari yazdirin
        for (WebElement w:butonListesi) {
            System.out.println(w.getText());
        }
        chromeDriver.quit();


















    }



}


