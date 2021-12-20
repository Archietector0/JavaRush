/*
    3b. Задание можно выполнить на любом языке программирования.
    Задача: разработать программу, которая, конвертируя валюты через
    рубли по текущему курсу ЦБ, определяет стоимость одной норвежской кроны в венгерских форинтах
    (Венгерские форинты -> Российские рубли -> Норвежские кроны).
    Курс запросить с сайта http://www.cbr.ru/scripts/XML_daily.asp
*/

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Parser {
    public static void main(String[] args) {
        Currency.getMap();
        Currency currency = new Currency();
        currency.forintToCrone();
    }
}

class Currency {
    private static Map<HashMap<String, Double>, Integer>    map;
    final private static String                             URL = "http://www.cbr.ru/scripts/XML_daily.asp";
    private static Document                                 page;
    private static int                                      size;

    static {
        try {
            page = getPage();
            size = page.select("Name").size();
            map = new HashMap<>(size);
            makeMap();
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static void      getMap () {
        for (Map.Entry<HashMap<String, Double>, Integer> pair : map.entrySet())
            for (Map.Entry<String, Double> pair1 : pair.getKey().entrySet())
                System.out.println("Currency: " + pair1.getKey() + ", Value: " + pair1.getValue() + " RUB, Nominal: " + pair.getValue());
    }

    private static Document getPage () throws IOException {
        Document page = Jsoup.parse((new URL(URL)), 3000);
        System.out.println("\nData was download successfully!\n");

        return page;
    }

    private static Double   convertToDouble (String value) {
        String newStr = "0.0";

        for (int i = 0; i < value.length(); ++i)
            if (value.charAt(i) == ',') {
                newStr = value.replace(',', '.');
                break;
            }
        return Double.parseDouble(newStr);
    }

    private static void     makeMap () {
        String key, value, nominal;

        HashMap<String, Double> mapa;
        for (int i = 0; i < size; ++i) {
            nominal = page.select("Nominal").get(i).text();
            key = page.select("Name").get(i).text();
            value = page.select("Value").get(i).text();
            mapa = new HashMap<String, Double>();
            mapa.put(key,convertToDouble(value));
            map.put(mapa, Integer.parseInt(nominal));
        }
    }

    public void             forintToCrone () {
        double valueForint, nominalForint, valueCrone, nominalCrone, result;
        valueCrone = nominalCrone = valueForint = nominalForint = 0;

        for (Map.Entry<HashMap<String, Double>, Integer> pair : map.entrySet()) {
            for (Map.Entry<String, Double> pair1: pair.getKey().entrySet()) {
                if (pair1.getKey().equals("Венгерских форинтов")) {
                    valueForint = pair1.getValue();
                    nominalForint = pair.getValue();
                }
                if (pair1.getKey().equals("Норвежских крон")) {
                    valueCrone = pair1.getValue();
                    nominalCrone = pair.getValue();
                }
            }
        }
        System.out.println("\nValue Crone: " + valueCrone + "\nNominal Crone: " + nominalCrone);
        System.out.println("\nValue Forint: " + valueForint + "\nNominal Forint: " + nominalForint);
        result = (valueCrone / nominalCrone) / (valueForint / nominalForint);
        System.out.println("\nFrom Crone to Forint: " + (((int)(result * 10000))) / 10000.0);
    }
}
