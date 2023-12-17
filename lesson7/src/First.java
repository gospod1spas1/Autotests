import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class First {
    @Test
    public void testIWBM(){
        //1)открываем сайт
        open("https://www.iwbm.ru");

        //2)информация о компании
        $x("//a[@href='about-us']").click();
        Selenide.sleep(3000);

        //3)новинки
        $x("//span[@class='text-danger']").click();
        Selenide.sleep(3000);

        //4)отзывы
        $x("//a[@href='otzyvy']").click();
        Selenide.sleep(3000);

        //5)контакты
        $x("//a[@href='address']").click();
        Selenide.sleep(3000);

        //6)оплата и доставка
        $x("a[href='oplata-i-dostavka']");
        Selenide.sleep(3000);

        //7)возврат на главную страницу
        $x("//img[@class='img-fluid']").click();
        Selenide.sleep(3000);

        //8)выбираем категорию
        $x("//b[@class='text-danger']").click();
        Selenide.sleep(3000);

        //9)выбираем продкут машинка xiaomi
        open("https://iwbm.ru/igrushki/igrushechnye-mashinki/igrushka-konstruktor-xiaomi-mi-building-blocks-desert-racing-car");
        Selenide.sleep(3000);

        //10)просмотр изображения на весь экран
        open("https://iwbm.ru/image/cache/webp/catalog/Games/xiaomi/xiaomi-mi-building-blocks-desert-racing-car-2-800x800.webp");
        Selenide.sleep(3000);

        //11)закрытие изображения
        open("https://iwbm.ru/igrushki/igrushechnye-mashinki/igrushka-konstruktor-xiaomi-mi-building-blocks-desert-racing-car");
        Selenide.sleep(3000);

        //12)переход с товара на произовдителя
        open("https://iwbm.ru/xiaomi");
        Selenide.sleep(3000);

        //13)установка сортировки на мин>макс
        open("https://iwbm.ru/xiaomi?sort=p.price&order=ASC");
        Selenide.sleep(9000);

        //14)открытие формы продавцов из футера
        $x("//a[@href='https://iwbm.ru/index.php?route=product/manufacturer']").click();
        Selenide.sleep(9000);

        //15)открытие формы с сертификатом
        $x("//a[@href='https://iwbm.ru/index.php?route=account/voucher']").click();
        Selenide.sleep(9000);

        //16)заполнение сертификата
        $x("//input[@name='to_name']").setValue("Ivan");
        $x("//input[@name='from_name']").setValue("Igor");
        $x("//input[@name='to_email']").setValue("mail@mail.com");
        $x("//input[@name='from_email']").setValue("mail2@mail.com");
        $x("//input[@value='6']").click();
        $x("//input[@name='agree']").click();
        $x("//input[@value='Далее']").click();
        Selenide.sleep(3000);

        //17)переход в корзину
        $x("//div[@id='ft_cart']").click();
        Selenide.sleep(3000);

        //18)открыть корзину
        $x("//a[@href='https://iwbm.ru/index.php?route=checkout/simplecheckout']").click();
        Selenide.sleep(3000);

        //19)заказать
        $x("//input[@id='customer_firstname']").setValue("Ivan");
        $x("//input[@id='customer_email']").setValue("mail@mail.com");
        $x("//input[@id='customer_telephone']").setValue("89999999999");
        $x("//a[@id='simplecheckout_button_confirm']").click();
        //$x("//input[@id='button-confirm']").click();
        Selenide.sleep(3000);

        //20)открытие формы партнеров
        $x("//a[@href='https://iwbm.ru/index.php?route=product/special']").click();
        Selenide.sleep(3000);
     }

//     public void test1(){
//         open("https://www.iwbm.ru");
//         $x("//a[@href='about-us']").click();
//         Selenide.sleep(3000);
//    }
//
//    public void test2(){
//        open("https://www.iwbm.ru");
//        $x("//span[@class='text-danger']").click();
//        Selenide.sleep(3000);
//    }
//
//    public void test3(){
//        open("https://www.iwbm.ru");
//        $x("//a[@href='otzyvy']").click();
//        Selenide.sleep(3000);
//    }
//
//    public void test4(){
//        open("https://www.iwbm.ru");
//        $x("//a[@href='address']").click();
//        Selenide.sleep(3000);
//    }
}
