package pl.sda.intermediate16;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class StringCalculator {


    public static Integer adding(String text) {
        if (StringUtils.isBlank(text)) {
            return 0;
        }

        if (text.startsWith("//")) {
            char delimiter = text.charAt(2);
            String[] splitted = text.split("\n");
            return tokenizeAndSum(splitted[1], String.valueOf(delimiter));
        }
        return tokenizeAndSum(text, ",|\n");
    }

    private static Integer tokenizeAndSum(String text, String regex) {
        return Arrays.stream(text.split(regex))
                .map(e -> Integer.valueOf(e.trim()))
                .reduce((a, b) -> a + b)
                .orElseGet(()->superHardLongAndSourcesNeedingMethod());
    }

    private static Integer superHardLongAndSourcesNeedingMethod() {
        System.out.println("NIE OK");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

}
