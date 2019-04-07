package pl.sda.intermediate16;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ProteinsChecker {
    @Test
    void checkPro() {
        String path = "C:/projects/lancuchy_bialkowe_dane.txt";
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()){
            String firstLine = scanner.nextLine();
            String secondLine = scanner.nextLine();
            if (firstLine.length() == secondLine.length()) {
                char[] firstArray = firstLine.toCharArray();
                Arrays.sort(firstArray);
                char[] secondArray = secondLine.toCharArray();
                Arrays.sort(secondArray);
                System.out.println(Arrays.equals(firstArray, secondArray));
            }else{
                System.out.println("false");
            }
        }
    }
}
