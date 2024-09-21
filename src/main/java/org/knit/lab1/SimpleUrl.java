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

package org.knit.lab1;

public class SimpleUrl {
    private String protocol;
    private String address;
    private String domainZone;
    private String siteName;
    private String webpageName;
    private String webPageExtension;
    private int intParam;
    private double doubleParam;
    private String textParameter;

    public SimpleUrl(String protocol,
                     String address,
                     String domainZone,
                     String siteName,
                     String webPageExtension,
                     int intParam,
                     double doubleParam,
                     String textParameter) {
        this.protocol = protocol;
        this.address = address;
        this.domainZone = domainZone;
        this.siteName = siteName;
        this.webpageName = webpageName;
        this.webPageExtension = webPageExtension;
        this.intParam = intParam;
        this.doubleParam = doubleParam;
        this.textParameter = textParameter;
    }

    public String toString() {
        return "protocol = " + protocol + "\n" +
                "address = " + address + "\n" +
                "domainZone = " + domainZone + "\n" +
                "siteName = " + siteName + "\n" +
                "webpageName = " + webpageName + "\n" +
                "webPageExtension = " + webPageExtension;
    }

    public static void main(String[] args) {
        String url = "https://test.ru/test/1072/page.jsp?intParam=12345&doubleParam=3.14&textParameter=someText";

        // Парсинг URL
        String protocol = url.split("://")[0];
        String address = url.split("://")[1].split("/")[0];
        String[] parts = address.split("\\.");
        String siteName = parts[0];
        String domainZone = parts[1];
        String webpageName = url.split("/")[3].split("\\?")[0];
        String webPageExtension = webpageName.split("\\.")[1];

        // Получение параметров
        String queryString = url.split("\\?")[1];
        String[] params = queryString.split("&");
        int intParam = 0;
        double doubleParam = 0.0;
        String textParameter = "";
        for (String param : params) {
            String[] keyValue = param.split("=");
            switch (keyValue[0]) {
                case "intParam":
                    intParam = Integer.parseInt(keyValue[1]);
                    break;
                case "doubleParam":
                    doubleParam = Double.parseDouble(keyValue[1]);
                    break;
                case "textParameter":
                    textParameter = keyValue[1];
                    break;
            }
        }

//        // Создание экземпляра класса
//        SimpleUrl simpleUrl = new SimpleUrl(protocol, address, domainZone, siteName, webpageName, webPageExtension, intParam, doubleParam, textParameter);
//
//        // Вывод информации о полях класса
//        System.out.println(simpleUrl);
    }


}
