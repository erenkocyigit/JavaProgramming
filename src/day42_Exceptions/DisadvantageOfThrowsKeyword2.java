package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantageOfThrowsKeyword2 {

    public static void method1()  {

        try {
            new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static void method2() throws InterruptedException {
        method1();
        Thread.sleep(1000);
    }

}
