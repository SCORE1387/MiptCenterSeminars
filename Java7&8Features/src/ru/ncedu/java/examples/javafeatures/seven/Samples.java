package ru.ncedu.java.examples.javafeatures.seven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author kolesnikov
 */
public class Samples {

    public static void main(String[] agrs) {
        //binaryLiteralsAndUnderscores();
        //stringSwitch("Two");
        tryCatch("11.txt"); //TODO: real file
        //diamonds();
        //nio2() //TODO???
        //concurrency()
        //forkJoinFramework()
        //localeCategories();
        //concurrentRandom();
    }

    private static void localeCategories() {
        Locale.setDefault(Locale.Category.DISPLAY, Locale.CANADA);
        Locale.setDefault(Locale.Category.FORMAT, Locale.JAPAN);
        //TODO examples!!!
    }

    private static void concurrentRandom() {
        System.out.println(ThreadLocalRandom.current().nextInt());
        //BaseStream stream = ThreadLocalRandom.current().ints();
    }

    private static void binaryLiteralsAndUnderscores() {
        int binValue = 0b0111;
        int hexValue = 0x12;
        int octValue = 012;
        System.out.println("binValue = " + binValue);
        System.out.println("hexValue = " + hexValue);
        System.out.println("octValue = " + octValue);

        int underscoredValue = 1_123_690;
        System.out.println("underscoredValue = " + underscoredValue);
    }


    private static void stringSwitch(String s) {
        int result;
        switch (s) {
            case "One":
            case "Ein":
            case "Uno":
                result = 1;
                break;
            case "Two":
            case "Zwei":
            case "Dos":
                result = 2;
                break;
            default:
                result = 0;
        }
        System.out.println("Result = " + result);
    }

    private static void tryCatch(String fileName) {
        InputStream is = null;
        try {
            is = new FileInputStream(fileName);
            int content;
            while ((content = is.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File reading error", e);
        } catch (IOException e) {
            throw new RuntimeException("File reading error", e);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    throw new RuntimeException("File reading error", e);
                }
            }
        }
    }

    private static void diamonds() {
        List<String> stringList = new ArrayList<String>();
        Map<String, Map<String, BigInteger>> map = new TreeMap<String, Map<String, BigInteger>>();
    }
}
