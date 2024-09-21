package org.knit.lab1;

/***
 * Задача 2
 * Создайте класс SimpleUrl
 * глядя на URL ниже создайте как можно больше полей в классе SimpleUrl:
 * https://test.ru/test/1072/page.jsp?intParam=12345&doubleParam=3.14&textParameter=someText
 * добавьте геттеры и сеттеры для полей
 * Переопределите метод toString() для вывода информации о полях класса:
 * protocol = https
 * address = test.ru
 * domainZone = ru
 * siteName = test
 * webpageName = page.jsp
 * webPageExtention = jsp
 * ....
 * Распарсите данный URL на переменные, создайте экземпляр класса SimpleUrl и выведите на экран
 * Дополнительно
 * попробуйте с другими URL в сети, подумайте как можно сгруппировать значения.
 *
 */
public class Task2 {
    public void execute() {

        String url = "https://test.ru/test/1072/page.jsp?intParam=12345&doubleParam=3.14&textParameter=someText";

        // Парсинг URL
        String protocol = url.split("://")[0];
        String address = url.split("://")[1].split("/")[0];
        String siteName = url.split("/")[3];
        String domainZone = url.split("/")[2].split("\\.")[1];
        String webpageName = url.split("/")[5].split("\\?")[0];
        String webPageExtension = webpageName.split("\\.")[1];


    // Создание экземпляра класса
    SimpleUrl simpleurl = new SimpleUrl(protocol, address, domainZone, siteName, webpageName, webPageExtension, url);

    // Вывод информации о полях класса
        System.out.println(simpleurl);
        /* tips
         * urlValue.split(":");
         */

        //todo create class SimpleUrl()
        // SimpleUrl url= new SimpleUrl();
        // url.setAddress(address);
        // url.setProtocol(protocol)
        // System.out.println(url);
    }
}

