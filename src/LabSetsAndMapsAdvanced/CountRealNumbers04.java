package LabSetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] values = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> valueAndCount = new LinkedHashMap<>();

        for (double value : values) {
            if (!valueAndCount.containsKey(value)) {
                valueAndCount.put(value, 1);
            } else {
                valueAndCount.put(value, valueAndCount.get(value) + 1);
            }
        }
        for (Double key : valueAndCount.keySet()) {
            System.out.printf("%.1f -> %d%n", key, valueAndCount.get(key));
        }
    }
}
