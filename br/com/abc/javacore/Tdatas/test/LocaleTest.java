package br.com.abc.javacore.Tdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        Locale locItaly = new Locale("it", "IT");
        Locale locBrasil = new Locale("pt", "BR");
        Locale locIndia = new Locale("hi", "IN");
        Locale locJapao = new Locale("ja", "JP");

        Calendar c = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locBrasil);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, locIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, locJapao);
        System.out.println("Italia: " + df.format(c.getTime()));
        System.out.println("Brasil: " + df2.format(c.getTime()));
        System.out.println("India: " + df3.format(c.getTime()));
        System.out.println("Japão: " + df4.format(c.getTime()));

        System.out.println(locItaly.getDisplayLanguage(locItaly));
        System.out.println(locBrasil.getDisplayLanguage(locItaly));
        System.out.println(locIndia.getDisplayLanguage(locItaly));
        System.out.println(locJapao.getDisplayLanguage(locItaly));
    }
}
